package simplepdl.manip;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import petrinet.Node;

import petrinet.Arc;
import petrinet.ArcKind;
import petrinet.PetriNet;
import petrinet.PetriNetFactory;
import petrinet.PetriNetPackage;
import petrinet.Place;
import petrinet.Transition;
import simplepdl.Process;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;

public class SimplePDL2PetriNet {

	public static void main(String[] args) {
		
		// 1. Chargement des packages (Indispensable !)
		SimplepdlPackage.eINSTANCE.eClass();
		PetriNetPackage.eINSTANCE.eClass();
		
		// 2. Configuration pour lire les fichiers XMI
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("simplepdl", new XMIResourceFactoryImpl());
		
		// 3. Charger le modèle d'entrée (SimplePDL)
		// Remplacez "Process.xmi" par le nom exact de votre fichier modèle créé plus tôt
		//URI modelURI = URI.createURI("models/Process.xmi"); 
		URI modelURI = URI.createURI("Process.xmi");
		Resource resource = resSet.getResource(modelURI, true);
		
		// Récupérer la racine du modèle (le Processus)
		Process process = (Process) resource.getContents().get(0);
		
		// 4. Créer le modèle de sortie (PetriNet)
		Resource petriResource = resSet.createResource(URI.createURI("models/Resultat_Petri.xmi"));
		
		// Utilisation de la Factory pour créer les éléments
		PetriNetFactory factory = PetriNetFactory.eINSTANCE;
		PetriNet petriNet = factory.createPetriNet();
		petriNet.setName(process.getName());
		petriResource.getContents().add(petriNet);

		// --- Début de la Transformation ---
		
		// On crée des Maps pour retrouver les Places/Transitions correspondant à chaque activité
		Map<WorkDefinition, Place> placesStarted = new HashMap<>();
		Map<WorkDefinition, Place> placesFinished = new HashMap<>();
		Map<WorkDefinition, Transition> transitionsStart = new HashMap<>();
		Map<WorkDefinition, Transition> transitionsFinish = new HashMap<>();

		// Étape A : Transformer les Activités en sous-réseaux
		for (Object o : process.getProcessElements()) {
			if (o instanceof WorkDefinition) {
				WorkDefinition wd = (WorkDefinition) o;
				
				// Création des 4 Places
				Place p_ready = createPlace(factory, petriNet, wd.getName() + "_ready", 1);
				Place p_started = createPlace(factory, petriNet, wd.getName() + "_started", 0);
				Place p_running = createPlace(factory, petriNet, wd.getName() + "_running", 0);
				Place p_finished = createPlace(factory, petriNet, wd.getName() + "_finished", 0);
				
				// Création des 2 Transitions
				Transition t_start = createTransition(factory, petriNet, wd.getName() + "_start");
				Transition t_finish = createTransition(factory, petriNet, wd.getName() + "_finish");
				
				// Création des Arcs internes (Logique séquentielle)
				// Ready -> Start -> Started/Running -> Finish -> Finished
				createArc(factory, petriNet, p_ready, t_start, ArcKind.NORMAL);
				createArc(factory, petriNet, t_start, p_started, ArcKind.NORMAL);
				createArc(factory, petriNet, t_start, p_running, ArcKind.NORMAL);
				createArc(factory, petriNet, p_running, t_finish, ArcKind.NORMAL);
				createArc(factory, petriNet, t_finish, p_finished, ArcKind.NORMAL);
				
				// Stockage pour les liens futurs
				placesStarted.put(wd, p_started);
				placesFinished.put(wd, p_finished);
				transitionsStart.put(wd, t_start);
				transitionsFinish.put(wd, t_finish);
			}
		}

		// Étape B : Transformer les WorkSequences en Arcs (Read-Arcs)
		for (Object o : process.getProcessElements()) {
			if (o instanceof WorkSequence) {
				WorkSequence ws = (WorkSequence) o;
				WorkDefinition pred = ws.getPredecessor();
				WorkDefinition succ = ws.getSuccessor();
				
				Node source = null;
				Node target = null;
				
				// Logique : On relie une Place (état du prédecesseur) à une Transition (action du successeur)
				switch (ws.getLinkType()) {
				case START_TO_START:
					source = placesStarted.get(pred);
					target = transitionsStart.get(succ);
					break;
				case FINISH_TO_START:
					source = placesFinished.get(pred);
					target = transitionsStart.get(succ);
					break;
				case START_TO_FINISH:
					source = placesStarted.get(pred);
					target = transitionsFinish.get(succ);
					break;
				case FINISH_TO_FINISH:
					source = placesFinished.get(pred);
					target = transitionsFinish.get(succ);
					break;
				}
				
				// Création de l'arc (Read-Arc pour ne pas consommer le jeton)
				if (source != null && target != null) {
					createArc(factory, petriNet, source, target, ArcKind.READ_ARC);
				}
			}
		}

		// 5. Sauvegarde du fichier généré
		try {
			petriResource.save(Collections.EMPTY_MAP);
			System.out.println("Transformation terminée ! Fichier généré : models/Resultat_Petri.xmi");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// --- Méthodes utilitaires pour alléger le code ---

	private static Place createPlace(PetriNetFactory factory, PetriNet net, String name, int marking) {
		Place p = factory.createPlace();
		p.setName(name);
		p.setMarking(marking);
		net.getPetrielement().add(p); // Attention à bien utiliser le bon nom de référence (petrielement ou nodes ?)
		return p;
	}

	private static Transition createTransition(PetriNetFactory factory, PetriNet net, String name) {
		Transition t = factory.createTransition();
		t.setName(name);
		net.getPetrielement().add(t);
		return t;
	}

	private static void createArc(PetriNetFactory factory, PetriNet net, Node source, Node target, ArcKind kind) {
		Arc arc = factory.createArc();
		arc.setSource(source);
		arc.setTarget(target);
		arc.setKind(kind);
//		arc.setWeight(1);
		net.getPetrielement().add(arc);
	}
}