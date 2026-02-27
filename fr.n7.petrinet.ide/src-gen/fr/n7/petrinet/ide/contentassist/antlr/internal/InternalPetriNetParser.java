package fr.n7.petrinet.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.n7.petrinet.services.PetriNetGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPetriNetParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'normal'", "'read_arc'", "'petrinet'", "'{'", "'}'", "'place'", "'marking'", "'transition'", "'arc'", "'from'", "'to'", "'weight'", "'-'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPetriNetParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPetriNetParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPetriNetParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPetriNet.g"; }


    	private PetriNetGrammarAccess grammarAccess;

    	public void setGrammarAccess(PetriNetGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePetriNet"
    // InternalPetriNet.g:53:1: entryRulePetriNet : rulePetriNet EOF ;
    public final void entryRulePetriNet() throws RecognitionException {
        try {
            // InternalPetriNet.g:54:1: ( rulePetriNet EOF )
            // InternalPetriNet.g:55:1: rulePetriNet EOF
            {
             before(grammarAccess.getPetriNetRule()); 
            pushFollow(FOLLOW_1);
            rulePetriNet();

            state._fsp--;

             after(grammarAccess.getPetriNetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePetriNet"


    // $ANTLR start "rulePetriNet"
    // InternalPetriNet.g:62:1: rulePetriNet : ( ( rule__PetriNet__Group__0 ) ) ;
    public final void rulePetriNet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:66:2: ( ( ( rule__PetriNet__Group__0 ) ) )
            // InternalPetriNet.g:67:2: ( ( rule__PetriNet__Group__0 ) )
            {
            // InternalPetriNet.g:67:2: ( ( rule__PetriNet__Group__0 ) )
            // InternalPetriNet.g:68:3: ( rule__PetriNet__Group__0 )
            {
             before(grammarAccess.getPetriNetAccess().getGroup()); 
            // InternalPetriNet.g:69:3: ( rule__PetriNet__Group__0 )
            // InternalPetriNet.g:69:4: rule__PetriNet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PetriNet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPetriNetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePetriNet"


    // $ANTLR start "entryRuleNode"
    // InternalPetriNet.g:78:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalPetriNet.g:79:1: ( ruleNode EOF )
            // InternalPetriNet.g:80:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalPetriNet.g:87:1: ruleNode : ( ( rule__Node__Alternatives ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:91:2: ( ( ( rule__Node__Alternatives ) ) )
            // InternalPetriNet.g:92:2: ( ( rule__Node__Alternatives ) )
            {
            // InternalPetriNet.g:92:2: ( ( rule__Node__Alternatives ) )
            // InternalPetriNet.g:93:3: ( rule__Node__Alternatives )
            {
             before(grammarAccess.getNodeAccess().getAlternatives()); 
            // InternalPetriNet.g:94:3: ( rule__Node__Alternatives )
            // InternalPetriNet.g:94:4: rule__Node__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Node__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRulePlace"
    // InternalPetriNet.g:103:1: entryRulePlace : rulePlace EOF ;
    public final void entryRulePlace() throws RecognitionException {
        try {
            // InternalPetriNet.g:104:1: ( rulePlace EOF )
            // InternalPetriNet.g:105:1: rulePlace EOF
            {
             before(grammarAccess.getPlaceRule()); 
            pushFollow(FOLLOW_1);
            rulePlace();

            state._fsp--;

             after(grammarAccess.getPlaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlace"


    // $ANTLR start "rulePlace"
    // InternalPetriNet.g:112:1: rulePlace : ( ( rule__Place__Group__0 ) ) ;
    public final void rulePlace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:116:2: ( ( ( rule__Place__Group__0 ) ) )
            // InternalPetriNet.g:117:2: ( ( rule__Place__Group__0 ) )
            {
            // InternalPetriNet.g:117:2: ( ( rule__Place__Group__0 ) )
            // InternalPetriNet.g:118:3: ( rule__Place__Group__0 )
            {
             before(grammarAccess.getPlaceAccess().getGroup()); 
            // InternalPetriNet.g:119:3: ( rule__Place__Group__0 )
            // InternalPetriNet.g:119:4: rule__Place__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlace"


    // $ANTLR start "entryRuleTransition"
    // InternalPetriNet.g:128:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalPetriNet.g:129:1: ( ruleTransition EOF )
            // InternalPetriNet.g:130:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalPetriNet.g:137:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:141:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalPetriNet.g:142:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalPetriNet.g:142:2: ( ( rule__Transition__Group__0 ) )
            // InternalPetriNet.g:143:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalPetriNet.g:144:3: ( rule__Transition__Group__0 )
            // InternalPetriNet.g:144:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleArc"
    // InternalPetriNet.g:153:1: entryRuleArc : ruleArc EOF ;
    public final void entryRuleArc() throws RecognitionException {
        try {
            // InternalPetriNet.g:154:1: ( ruleArc EOF )
            // InternalPetriNet.g:155:1: ruleArc EOF
            {
             before(grammarAccess.getArcRule()); 
            pushFollow(FOLLOW_1);
            ruleArc();

            state._fsp--;

             after(grammarAccess.getArcRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArc"


    // $ANTLR start "ruleArc"
    // InternalPetriNet.g:162:1: ruleArc : ( ( rule__Arc__Group__0 ) ) ;
    public final void ruleArc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:166:2: ( ( ( rule__Arc__Group__0 ) ) )
            // InternalPetriNet.g:167:2: ( ( rule__Arc__Group__0 ) )
            {
            // InternalPetriNet.g:167:2: ( ( rule__Arc__Group__0 ) )
            // InternalPetriNet.g:168:3: ( rule__Arc__Group__0 )
            {
             before(grammarAccess.getArcAccess().getGroup()); 
            // InternalPetriNet.g:169:3: ( rule__Arc__Group__0 )
            // InternalPetriNet.g:169:4: rule__Arc__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Arc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArcAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArc"


    // $ANTLR start "entryRuleEInt"
    // InternalPetriNet.g:178:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalPetriNet.g:179:1: ( ruleEInt EOF )
            // InternalPetriNet.g:180:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalPetriNet.g:187:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:191:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalPetriNet.g:192:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalPetriNet.g:192:2: ( ( rule__EInt__Group__0 ) )
            // InternalPetriNet.g:193:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalPetriNet.g:194:3: ( rule__EInt__Group__0 )
            // InternalPetriNet.g:194:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // InternalPetriNet.g:203:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalPetriNet.g:204:1: ( ruleEString EOF )
            // InternalPetriNet.g:205:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalPetriNet.g:212:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:216:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalPetriNet.g:217:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalPetriNet.g:217:2: ( ( rule__EString__Alternatives ) )
            // InternalPetriNet.g:218:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalPetriNet.g:219:3: ( rule__EString__Alternatives )
            // InternalPetriNet.g:219:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleArcKind"
    // InternalPetriNet.g:228:1: ruleArcKind : ( ( rule__ArcKind__Alternatives ) ) ;
    public final void ruleArcKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:232:1: ( ( ( rule__ArcKind__Alternatives ) ) )
            // InternalPetriNet.g:233:2: ( ( rule__ArcKind__Alternatives ) )
            {
            // InternalPetriNet.g:233:2: ( ( rule__ArcKind__Alternatives ) )
            // InternalPetriNet.g:234:3: ( rule__ArcKind__Alternatives )
            {
             before(grammarAccess.getArcKindAccess().getAlternatives()); 
            // InternalPetriNet.g:235:3: ( rule__ArcKind__Alternatives )
            // InternalPetriNet.g:235:4: rule__ArcKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArcKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArcKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArcKind"


    // $ANTLR start "rule__PetriNet__Alternatives_3"
    // InternalPetriNet.g:243:1: rule__PetriNet__Alternatives_3 : ( ( ( rule__PetriNet__PetrielementAssignment_3_0 ) ) | ( ( rule__PetriNet__PetrielementAssignment_3_1 ) ) );
    public final void rule__PetriNet__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:247:1: ( ( ( rule__PetriNet__PetrielementAssignment_3_0 ) ) | ( ( rule__PetriNet__PetrielementAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16||LA1_0==18) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPetriNet.g:248:2: ( ( rule__PetriNet__PetrielementAssignment_3_0 ) )
                    {
                    // InternalPetriNet.g:248:2: ( ( rule__PetriNet__PetrielementAssignment_3_0 ) )
                    // InternalPetriNet.g:249:3: ( rule__PetriNet__PetrielementAssignment_3_0 )
                    {
                     before(grammarAccess.getPetriNetAccess().getPetrielementAssignment_3_0()); 
                    // InternalPetriNet.g:250:3: ( rule__PetriNet__PetrielementAssignment_3_0 )
                    // InternalPetriNet.g:250:4: rule__PetriNet__PetrielementAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PetriNet__PetrielementAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPetriNetAccess().getPetrielementAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPetriNet.g:254:2: ( ( rule__PetriNet__PetrielementAssignment_3_1 ) )
                    {
                    // InternalPetriNet.g:254:2: ( ( rule__PetriNet__PetrielementAssignment_3_1 ) )
                    // InternalPetriNet.g:255:3: ( rule__PetriNet__PetrielementAssignment_3_1 )
                    {
                     before(grammarAccess.getPetriNetAccess().getPetrielementAssignment_3_1()); 
                    // InternalPetriNet.g:256:3: ( rule__PetriNet__PetrielementAssignment_3_1 )
                    // InternalPetriNet.g:256:4: rule__PetriNet__PetrielementAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PetriNet__PetrielementAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPetriNetAccess().getPetrielementAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Alternatives_3"


    // $ANTLR start "rule__Node__Alternatives"
    // InternalPetriNet.g:264:1: rule__Node__Alternatives : ( ( rulePlace ) | ( ruleTransition ) );
    public final void rule__Node__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:268:1: ( ( rulePlace ) | ( ruleTransition ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPetriNet.g:269:2: ( rulePlace )
                    {
                    // InternalPetriNet.g:269:2: ( rulePlace )
                    // InternalPetriNet.g:270:3: rulePlace
                    {
                     before(grammarAccess.getNodeAccess().getPlaceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePlace();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getPlaceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPetriNet.g:275:2: ( ruleTransition )
                    {
                    // InternalPetriNet.g:275:2: ( ruleTransition )
                    // InternalPetriNet.g:276:3: ruleTransition
                    {
                     before(grammarAccess.getNodeAccess().getTransitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTransition();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getTransitionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalPetriNet.g:285:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:289:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPetriNet.g:290:2: ( RULE_STRING )
                    {
                    // InternalPetriNet.g:290:2: ( RULE_STRING )
                    // InternalPetriNet.g:291:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPetriNet.g:296:2: ( RULE_ID )
                    {
                    // InternalPetriNet.g:296:2: ( RULE_ID )
                    // InternalPetriNet.g:297:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__ArcKind__Alternatives"
    // InternalPetriNet.g:306:1: rule__ArcKind__Alternatives : ( ( ( 'normal' ) ) | ( ( 'read_arc' ) ) );
    public final void rule__ArcKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:310:1: ( ( ( 'normal' ) ) | ( ( 'read_arc' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPetriNet.g:311:2: ( ( 'normal' ) )
                    {
                    // InternalPetriNet.g:311:2: ( ( 'normal' ) )
                    // InternalPetriNet.g:312:3: ( 'normal' )
                    {
                     before(grammarAccess.getArcKindAccess().getNormalEnumLiteralDeclaration_0()); 
                    // InternalPetriNet.g:313:3: ( 'normal' )
                    // InternalPetriNet.g:313:4: 'normal'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getArcKindAccess().getNormalEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPetriNet.g:317:2: ( ( 'read_arc' ) )
                    {
                    // InternalPetriNet.g:317:2: ( ( 'read_arc' ) )
                    // InternalPetriNet.g:318:3: ( 'read_arc' )
                    {
                     before(grammarAccess.getArcKindAccess().getRead_arcEnumLiteralDeclaration_1()); 
                    // InternalPetriNet.g:319:3: ( 'read_arc' )
                    // InternalPetriNet.g:319:4: 'read_arc'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getArcKindAccess().getRead_arcEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcKind__Alternatives"


    // $ANTLR start "rule__PetriNet__Group__0"
    // InternalPetriNet.g:327:1: rule__PetriNet__Group__0 : rule__PetriNet__Group__0__Impl rule__PetriNet__Group__1 ;
    public final void rule__PetriNet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:331:1: ( rule__PetriNet__Group__0__Impl rule__PetriNet__Group__1 )
            // InternalPetriNet.g:332:2: rule__PetriNet__Group__0__Impl rule__PetriNet__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PetriNet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PetriNet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__0"


    // $ANTLR start "rule__PetriNet__Group__0__Impl"
    // InternalPetriNet.g:339:1: rule__PetriNet__Group__0__Impl : ( 'petrinet' ) ;
    public final void rule__PetriNet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:343:1: ( ( 'petrinet' ) )
            // InternalPetriNet.g:344:1: ( 'petrinet' )
            {
            // InternalPetriNet.g:344:1: ( 'petrinet' )
            // InternalPetriNet.g:345:2: 'petrinet'
            {
             before(grammarAccess.getPetriNetAccess().getPetrinetKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPetriNetAccess().getPetrinetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__0__Impl"


    // $ANTLR start "rule__PetriNet__Group__1"
    // InternalPetriNet.g:354:1: rule__PetriNet__Group__1 : rule__PetriNet__Group__1__Impl rule__PetriNet__Group__2 ;
    public final void rule__PetriNet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:358:1: ( rule__PetriNet__Group__1__Impl rule__PetriNet__Group__2 )
            // InternalPetriNet.g:359:2: rule__PetriNet__Group__1__Impl rule__PetriNet__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__PetriNet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PetriNet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__1"


    // $ANTLR start "rule__PetriNet__Group__1__Impl"
    // InternalPetriNet.g:366:1: rule__PetriNet__Group__1__Impl : ( ( rule__PetriNet__NameAssignment_1 ) ) ;
    public final void rule__PetriNet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:370:1: ( ( ( rule__PetriNet__NameAssignment_1 ) ) )
            // InternalPetriNet.g:371:1: ( ( rule__PetriNet__NameAssignment_1 ) )
            {
            // InternalPetriNet.g:371:1: ( ( rule__PetriNet__NameAssignment_1 ) )
            // InternalPetriNet.g:372:2: ( rule__PetriNet__NameAssignment_1 )
            {
             before(grammarAccess.getPetriNetAccess().getNameAssignment_1()); 
            // InternalPetriNet.g:373:2: ( rule__PetriNet__NameAssignment_1 )
            // InternalPetriNet.g:373:3: rule__PetriNet__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PetriNet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPetriNetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__1__Impl"


    // $ANTLR start "rule__PetriNet__Group__2"
    // InternalPetriNet.g:381:1: rule__PetriNet__Group__2 : rule__PetriNet__Group__2__Impl rule__PetriNet__Group__3 ;
    public final void rule__PetriNet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:385:1: ( rule__PetriNet__Group__2__Impl rule__PetriNet__Group__3 )
            // InternalPetriNet.g:386:2: rule__PetriNet__Group__2__Impl rule__PetriNet__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__PetriNet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PetriNet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__2"


    // $ANTLR start "rule__PetriNet__Group__2__Impl"
    // InternalPetriNet.g:393:1: rule__PetriNet__Group__2__Impl : ( '{' ) ;
    public final void rule__PetriNet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:397:1: ( ( '{' ) )
            // InternalPetriNet.g:398:1: ( '{' )
            {
            // InternalPetriNet.g:398:1: ( '{' )
            // InternalPetriNet.g:399:2: '{'
            {
             before(grammarAccess.getPetriNetAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPetriNetAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__2__Impl"


    // $ANTLR start "rule__PetriNet__Group__3"
    // InternalPetriNet.g:408:1: rule__PetriNet__Group__3 : rule__PetriNet__Group__3__Impl rule__PetriNet__Group__4 ;
    public final void rule__PetriNet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:412:1: ( rule__PetriNet__Group__3__Impl rule__PetriNet__Group__4 )
            // InternalPetriNet.g:413:2: rule__PetriNet__Group__3__Impl rule__PetriNet__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__PetriNet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PetriNet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__3"


    // $ANTLR start "rule__PetriNet__Group__3__Impl"
    // InternalPetriNet.g:420:1: rule__PetriNet__Group__3__Impl : ( ( rule__PetriNet__Alternatives_3 )* ) ;
    public final void rule__PetriNet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:424:1: ( ( ( rule__PetriNet__Alternatives_3 )* ) )
            // InternalPetriNet.g:425:1: ( ( rule__PetriNet__Alternatives_3 )* )
            {
            // InternalPetriNet.g:425:1: ( ( rule__PetriNet__Alternatives_3 )* )
            // InternalPetriNet.g:426:2: ( rule__PetriNet__Alternatives_3 )*
            {
             before(grammarAccess.getPetriNetAccess().getAlternatives_3()); 
            // InternalPetriNet.g:427:2: ( rule__PetriNet__Alternatives_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16||(LA5_0>=18 && LA5_0<=19)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPetriNet.g:427:3: rule__PetriNet__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__PetriNet__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPetriNetAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__3__Impl"


    // $ANTLR start "rule__PetriNet__Group__4"
    // InternalPetriNet.g:435:1: rule__PetriNet__Group__4 : rule__PetriNet__Group__4__Impl ;
    public final void rule__PetriNet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:439:1: ( rule__PetriNet__Group__4__Impl )
            // InternalPetriNet.g:440:2: rule__PetriNet__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PetriNet__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__4"


    // $ANTLR start "rule__PetriNet__Group__4__Impl"
    // InternalPetriNet.g:446:1: rule__PetriNet__Group__4__Impl : ( '}' ) ;
    public final void rule__PetriNet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:450:1: ( ( '}' ) )
            // InternalPetriNet.g:451:1: ( '}' )
            {
            // InternalPetriNet.g:451:1: ( '}' )
            // InternalPetriNet.g:452:2: '}'
            {
             before(grammarAccess.getPetriNetAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPetriNetAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__4__Impl"


    // $ANTLR start "rule__Place__Group__0"
    // InternalPetriNet.g:462:1: rule__Place__Group__0 : rule__Place__Group__0__Impl rule__Place__Group__1 ;
    public final void rule__Place__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:466:1: ( rule__Place__Group__0__Impl rule__Place__Group__1 )
            // InternalPetriNet.g:467:2: rule__Place__Group__0__Impl rule__Place__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Place__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__0"


    // $ANTLR start "rule__Place__Group__0__Impl"
    // InternalPetriNet.g:474:1: rule__Place__Group__0__Impl : ( 'place' ) ;
    public final void rule__Place__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:478:1: ( ( 'place' ) )
            // InternalPetriNet.g:479:1: ( 'place' )
            {
            // InternalPetriNet.g:479:1: ( 'place' )
            // InternalPetriNet.g:480:2: 'place'
            {
             before(grammarAccess.getPlaceAccess().getPlaceKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getPlaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__0__Impl"


    // $ANTLR start "rule__Place__Group__1"
    // InternalPetriNet.g:489:1: rule__Place__Group__1 : rule__Place__Group__1__Impl rule__Place__Group__2 ;
    public final void rule__Place__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:493:1: ( rule__Place__Group__1__Impl rule__Place__Group__2 )
            // InternalPetriNet.g:494:2: rule__Place__Group__1__Impl rule__Place__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Place__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__1"


    // $ANTLR start "rule__Place__Group__1__Impl"
    // InternalPetriNet.g:501:1: rule__Place__Group__1__Impl : ( ( rule__Place__NameAssignment_1 ) ) ;
    public final void rule__Place__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:505:1: ( ( ( rule__Place__NameAssignment_1 ) ) )
            // InternalPetriNet.g:506:1: ( ( rule__Place__NameAssignment_1 ) )
            {
            // InternalPetriNet.g:506:1: ( ( rule__Place__NameAssignment_1 ) )
            // InternalPetriNet.g:507:2: ( rule__Place__NameAssignment_1 )
            {
             before(grammarAccess.getPlaceAccess().getNameAssignment_1()); 
            // InternalPetriNet.g:508:2: ( rule__Place__NameAssignment_1 )
            // InternalPetriNet.g:508:3: rule__Place__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Place__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__1__Impl"


    // $ANTLR start "rule__Place__Group__2"
    // InternalPetriNet.g:516:1: rule__Place__Group__2 : rule__Place__Group__2__Impl ;
    public final void rule__Place__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:520:1: ( rule__Place__Group__2__Impl )
            // InternalPetriNet.g:521:2: rule__Place__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__2"


    // $ANTLR start "rule__Place__Group__2__Impl"
    // InternalPetriNet.g:527:1: rule__Place__Group__2__Impl : ( ( rule__Place__Group_2__0 )? ) ;
    public final void rule__Place__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:531:1: ( ( ( rule__Place__Group_2__0 )? ) )
            // InternalPetriNet.g:532:1: ( ( rule__Place__Group_2__0 )? )
            {
            // InternalPetriNet.g:532:1: ( ( rule__Place__Group_2__0 )? )
            // InternalPetriNet.g:533:2: ( rule__Place__Group_2__0 )?
            {
             before(grammarAccess.getPlaceAccess().getGroup_2()); 
            // InternalPetriNet.g:534:2: ( rule__Place__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPetriNet.g:534:3: rule__Place__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Place__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlaceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__2__Impl"


    // $ANTLR start "rule__Place__Group_2__0"
    // InternalPetriNet.g:543:1: rule__Place__Group_2__0 : rule__Place__Group_2__0__Impl rule__Place__Group_2__1 ;
    public final void rule__Place__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:547:1: ( rule__Place__Group_2__0__Impl rule__Place__Group_2__1 )
            // InternalPetriNet.g:548:2: rule__Place__Group_2__0__Impl rule__Place__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Place__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_2__0"


    // $ANTLR start "rule__Place__Group_2__0__Impl"
    // InternalPetriNet.g:555:1: rule__Place__Group_2__0__Impl : ( 'marking' ) ;
    public final void rule__Place__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:559:1: ( ( 'marking' ) )
            // InternalPetriNet.g:560:1: ( 'marking' )
            {
            // InternalPetriNet.g:560:1: ( 'marking' )
            // InternalPetriNet.g:561:2: 'marking'
            {
             before(grammarAccess.getPlaceAccess().getMarkingKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getMarkingKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_2__0__Impl"


    // $ANTLR start "rule__Place__Group_2__1"
    // InternalPetriNet.g:570:1: rule__Place__Group_2__1 : rule__Place__Group_2__1__Impl ;
    public final void rule__Place__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:574:1: ( rule__Place__Group_2__1__Impl )
            // InternalPetriNet.g:575:2: rule__Place__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_2__1"


    // $ANTLR start "rule__Place__Group_2__1__Impl"
    // InternalPetriNet.g:581:1: rule__Place__Group_2__1__Impl : ( ( rule__Place__MarkingAssignment_2_1 ) ) ;
    public final void rule__Place__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:585:1: ( ( ( rule__Place__MarkingAssignment_2_1 ) ) )
            // InternalPetriNet.g:586:1: ( ( rule__Place__MarkingAssignment_2_1 ) )
            {
            // InternalPetriNet.g:586:1: ( ( rule__Place__MarkingAssignment_2_1 ) )
            // InternalPetriNet.g:587:2: ( rule__Place__MarkingAssignment_2_1 )
            {
             before(grammarAccess.getPlaceAccess().getMarkingAssignment_2_1()); 
            // InternalPetriNet.g:588:2: ( rule__Place__MarkingAssignment_2_1 )
            // InternalPetriNet.g:588:3: rule__Place__MarkingAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Place__MarkingAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getMarkingAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group_2__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalPetriNet.g:597:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:601:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalPetriNet.g:602:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalPetriNet.g:609:1: rule__Transition__Group__0__Impl : ( 'transition' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:613:1: ( ( 'transition' ) )
            // InternalPetriNet.g:614:1: ( 'transition' )
            {
            // InternalPetriNet.g:614:1: ( 'transition' )
            // InternalPetriNet.g:615:2: 'transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalPetriNet.g:624:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:628:1: ( rule__Transition__Group__1__Impl )
            // InternalPetriNet.g:629:2: rule__Transition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalPetriNet.g:635:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__NameAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:639:1: ( ( ( rule__Transition__NameAssignment_1 ) ) )
            // InternalPetriNet.g:640:1: ( ( rule__Transition__NameAssignment_1 ) )
            {
            // InternalPetriNet.g:640:1: ( ( rule__Transition__NameAssignment_1 ) )
            // InternalPetriNet.g:641:2: ( rule__Transition__NameAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_1()); 
            // InternalPetriNet.g:642:2: ( rule__Transition__NameAssignment_1 )
            // InternalPetriNet.g:642:3: rule__Transition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Arc__Group__0"
    // InternalPetriNet.g:651:1: rule__Arc__Group__0 : rule__Arc__Group__0__Impl rule__Arc__Group__1 ;
    public final void rule__Arc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:655:1: ( rule__Arc__Group__0__Impl rule__Arc__Group__1 )
            // InternalPetriNet.g:656:2: rule__Arc__Group__0__Impl rule__Arc__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Arc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arc__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__0"


    // $ANTLR start "rule__Arc__Group__0__Impl"
    // InternalPetriNet.g:663:1: rule__Arc__Group__0__Impl : ( 'arc' ) ;
    public final void rule__Arc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:667:1: ( ( 'arc' ) )
            // InternalPetriNet.g:668:1: ( 'arc' )
            {
            // InternalPetriNet.g:668:1: ( 'arc' )
            // InternalPetriNet.g:669:2: 'arc'
            {
             before(grammarAccess.getArcAccess().getArcKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getArcAccess().getArcKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__0__Impl"


    // $ANTLR start "rule__Arc__Group__1"
    // InternalPetriNet.g:678:1: rule__Arc__Group__1 : rule__Arc__Group__1__Impl rule__Arc__Group__2 ;
    public final void rule__Arc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:682:1: ( rule__Arc__Group__1__Impl rule__Arc__Group__2 )
            // InternalPetriNet.g:683:2: rule__Arc__Group__1__Impl rule__Arc__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Arc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arc__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__1"


    // $ANTLR start "rule__Arc__Group__1__Impl"
    // InternalPetriNet.g:690:1: rule__Arc__Group__1__Impl : ( ( rule__Arc__KindAssignment_1 )? ) ;
    public final void rule__Arc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:694:1: ( ( ( rule__Arc__KindAssignment_1 )? ) )
            // InternalPetriNet.g:695:1: ( ( rule__Arc__KindAssignment_1 )? )
            {
            // InternalPetriNet.g:695:1: ( ( rule__Arc__KindAssignment_1 )? )
            // InternalPetriNet.g:696:2: ( rule__Arc__KindAssignment_1 )?
            {
             before(grammarAccess.getArcAccess().getKindAssignment_1()); 
            // InternalPetriNet.g:697:2: ( rule__Arc__KindAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=11 && LA7_0<=12)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPetriNet.g:697:3: rule__Arc__KindAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Arc__KindAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArcAccess().getKindAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__1__Impl"


    // $ANTLR start "rule__Arc__Group__2"
    // InternalPetriNet.g:705:1: rule__Arc__Group__2 : rule__Arc__Group__2__Impl rule__Arc__Group__3 ;
    public final void rule__Arc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:709:1: ( rule__Arc__Group__2__Impl rule__Arc__Group__3 )
            // InternalPetriNet.g:710:2: rule__Arc__Group__2__Impl rule__Arc__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Arc__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arc__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__2"


    // $ANTLR start "rule__Arc__Group__2__Impl"
    // InternalPetriNet.g:717:1: rule__Arc__Group__2__Impl : ( 'from' ) ;
    public final void rule__Arc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:721:1: ( ( 'from' ) )
            // InternalPetriNet.g:722:1: ( 'from' )
            {
            // InternalPetriNet.g:722:1: ( 'from' )
            // InternalPetriNet.g:723:2: 'from'
            {
             before(grammarAccess.getArcAccess().getFromKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getArcAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__2__Impl"


    // $ANTLR start "rule__Arc__Group__3"
    // InternalPetriNet.g:732:1: rule__Arc__Group__3 : rule__Arc__Group__3__Impl rule__Arc__Group__4 ;
    public final void rule__Arc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:736:1: ( rule__Arc__Group__3__Impl rule__Arc__Group__4 )
            // InternalPetriNet.g:737:2: rule__Arc__Group__3__Impl rule__Arc__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Arc__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arc__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__3"


    // $ANTLR start "rule__Arc__Group__3__Impl"
    // InternalPetriNet.g:744:1: rule__Arc__Group__3__Impl : ( ( rule__Arc__SourceAssignment_3 ) ) ;
    public final void rule__Arc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:748:1: ( ( ( rule__Arc__SourceAssignment_3 ) ) )
            // InternalPetriNet.g:749:1: ( ( rule__Arc__SourceAssignment_3 ) )
            {
            // InternalPetriNet.g:749:1: ( ( rule__Arc__SourceAssignment_3 ) )
            // InternalPetriNet.g:750:2: ( rule__Arc__SourceAssignment_3 )
            {
             before(grammarAccess.getArcAccess().getSourceAssignment_3()); 
            // InternalPetriNet.g:751:2: ( rule__Arc__SourceAssignment_3 )
            // InternalPetriNet.g:751:3: rule__Arc__SourceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Arc__SourceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getArcAccess().getSourceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__3__Impl"


    // $ANTLR start "rule__Arc__Group__4"
    // InternalPetriNet.g:759:1: rule__Arc__Group__4 : rule__Arc__Group__4__Impl rule__Arc__Group__5 ;
    public final void rule__Arc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:763:1: ( rule__Arc__Group__4__Impl rule__Arc__Group__5 )
            // InternalPetriNet.g:764:2: rule__Arc__Group__4__Impl rule__Arc__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Arc__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arc__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__4"


    // $ANTLR start "rule__Arc__Group__4__Impl"
    // InternalPetriNet.g:771:1: rule__Arc__Group__4__Impl : ( 'to' ) ;
    public final void rule__Arc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:775:1: ( ( 'to' ) )
            // InternalPetriNet.g:776:1: ( 'to' )
            {
            // InternalPetriNet.g:776:1: ( 'to' )
            // InternalPetriNet.g:777:2: 'to'
            {
             before(grammarAccess.getArcAccess().getToKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getArcAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__4__Impl"


    // $ANTLR start "rule__Arc__Group__5"
    // InternalPetriNet.g:786:1: rule__Arc__Group__5 : rule__Arc__Group__5__Impl rule__Arc__Group__6 ;
    public final void rule__Arc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:790:1: ( rule__Arc__Group__5__Impl rule__Arc__Group__6 )
            // InternalPetriNet.g:791:2: rule__Arc__Group__5__Impl rule__Arc__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Arc__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arc__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__5"


    // $ANTLR start "rule__Arc__Group__5__Impl"
    // InternalPetriNet.g:798:1: rule__Arc__Group__5__Impl : ( ( rule__Arc__TargetAssignment_5 ) ) ;
    public final void rule__Arc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:802:1: ( ( ( rule__Arc__TargetAssignment_5 ) ) )
            // InternalPetriNet.g:803:1: ( ( rule__Arc__TargetAssignment_5 ) )
            {
            // InternalPetriNet.g:803:1: ( ( rule__Arc__TargetAssignment_5 ) )
            // InternalPetriNet.g:804:2: ( rule__Arc__TargetAssignment_5 )
            {
             before(grammarAccess.getArcAccess().getTargetAssignment_5()); 
            // InternalPetriNet.g:805:2: ( rule__Arc__TargetAssignment_5 )
            // InternalPetriNet.g:805:3: rule__Arc__TargetAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Arc__TargetAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getArcAccess().getTargetAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__5__Impl"


    // $ANTLR start "rule__Arc__Group__6"
    // InternalPetriNet.g:813:1: rule__Arc__Group__6 : rule__Arc__Group__6__Impl ;
    public final void rule__Arc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:817:1: ( rule__Arc__Group__6__Impl )
            // InternalPetriNet.g:818:2: rule__Arc__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arc__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__6"


    // $ANTLR start "rule__Arc__Group__6__Impl"
    // InternalPetriNet.g:824:1: rule__Arc__Group__6__Impl : ( ( rule__Arc__Group_6__0 )? ) ;
    public final void rule__Arc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:828:1: ( ( ( rule__Arc__Group_6__0 )? ) )
            // InternalPetriNet.g:829:1: ( ( rule__Arc__Group_6__0 )? )
            {
            // InternalPetriNet.g:829:1: ( ( rule__Arc__Group_6__0 )? )
            // InternalPetriNet.g:830:2: ( rule__Arc__Group_6__0 )?
            {
             before(grammarAccess.getArcAccess().getGroup_6()); 
            // InternalPetriNet.g:831:2: ( rule__Arc__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPetriNet.g:831:3: rule__Arc__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Arc__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArcAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__6__Impl"


    // $ANTLR start "rule__Arc__Group_6__0"
    // InternalPetriNet.g:840:1: rule__Arc__Group_6__0 : rule__Arc__Group_6__0__Impl rule__Arc__Group_6__1 ;
    public final void rule__Arc__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:844:1: ( rule__Arc__Group_6__0__Impl rule__Arc__Group_6__1 )
            // InternalPetriNet.g:845:2: rule__Arc__Group_6__0__Impl rule__Arc__Group_6__1
            {
            pushFollow(FOLLOW_8);
            rule__Arc__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arc__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group_6__0"


    // $ANTLR start "rule__Arc__Group_6__0__Impl"
    // InternalPetriNet.g:852:1: rule__Arc__Group_6__0__Impl : ( 'weight' ) ;
    public final void rule__Arc__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:856:1: ( ( 'weight' ) )
            // InternalPetriNet.g:857:1: ( 'weight' )
            {
            // InternalPetriNet.g:857:1: ( 'weight' )
            // InternalPetriNet.g:858:2: 'weight'
            {
             before(grammarAccess.getArcAccess().getWeightKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getArcAccess().getWeightKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group_6__0__Impl"


    // $ANTLR start "rule__Arc__Group_6__1"
    // InternalPetriNet.g:867:1: rule__Arc__Group_6__1 : rule__Arc__Group_6__1__Impl ;
    public final void rule__Arc__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:871:1: ( rule__Arc__Group_6__1__Impl )
            // InternalPetriNet.g:872:2: rule__Arc__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arc__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group_6__1"


    // $ANTLR start "rule__Arc__Group_6__1__Impl"
    // InternalPetriNet.g:878:1: rule__Arc__Group_6__1__Impl : ( ( rule__Arc__WeightAssignment_6_1 ) ) ;
    public final void rule__Arc__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:882:1: ( ( ( rule__Arc__WeightAssignment_6_1 ) ) )
            // InternalPetriNet.g:883:1: ( ( rule__Arc__WeightAssignment_6_1 ) )
            {
            // InternalPetriNet.g:883:1: ( ( rule__Arc__WeightAssignment_6_1 ) )
            // InternalPetriNet.g:884:2: ( rule__Arc__WeightAssignment_6_1 )
            {
             before(grammarAccess.getArcAccess().getWeightAssignment_6_1()); 
            // InternalPetriNet.g:885:2: ( rule__Arc__WeightAssignment_6_1 )
            // InternalPetriNet.g:885:3: rule__Arc__WeightAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Arc__WeightAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getArcAccess().getWeightAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group_6__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalPetriNet.g:894:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:898:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalPetriNet.g:899:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalPetriNet.g:906:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:910:1: ( ( ( '-' )? ) )
            // InternalPetriNet.g:911:1: ( ( '-' )? )
            {
            // InternalPetriNet.g:911:1: ( ( '-' )? )
            // InternalPetriNet.g:912:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalPetriNet.g:913:2: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPetriNet.g:913:3: '-'
                    {
                    match(input,23,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalPetriNet.g:921:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:925:1: ( rule__EInt__Group__1__Impl )
            // InternalPetriNet.g:926:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalPetriNet.g:932:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:936:1: ( ( RULE_INT ) )
            // InternalPetriNet.g:937:1: ( RULE_INT )
            {
            // InternalPetriNet.g:937:1: ( RULE_INT )
            // InternalPetriNet.g:938:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__PetriNet__NameAssignment_1"
    // InternalPetriNet.g:948:1: rule__PetriNet__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PetriNet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:952:1: ( ( ruleEString ) )
            // InternalPetriNet.g:953:2: ( ruleEString )
            {
            // InternalPetriNet.g:953:2: ( ruleEString )
            // InternalPetriNet.g:954:3: ruleEString
            {
             before(grammarAccess.getPetriNetAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPetriNetAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__NameAssignment_1"


    // $ANTLR start "rule__PetriNet__PetrielementAssignment_3_0"
    // InternalPetriNet.g:963:1: rule__PetriNet__PetrielementAssignment_3_0 : ( ruleNode ) ;
    public final void rule__PetriNet__PetrielementAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:967:1: ( ( ruleNode ) )
            // InternalPetriNet.g:968:2: ( ruleNode )
            {
            // InternalPetriNet.g:968:2: ( ruleNode )
            // InternalPetriNet.g:969:3: ruleNode
            {
             before(grammarAccess.getPetriNetAccess().getPetrielementNodeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getPetriNetAccess().getPetrielementNodeParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__PetrielementAssignment_3_0"


    // $ANTLR start "rule__PetriNet__PetrielementAssignment_3_1"
    // InternalPetriNet.g:978:1: rule__PetriNet__PetrielementAssignment_3_1 : ( ruleArc ) ;
    public final void rule__PetriNet__PetrielementAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:982:1: ( ( ruleArc ) )
            // InternalPetriNet.g:983:2: ( ruleArc )
            {
            // InternalPetriNet.g:983:2: ( ruleArc )
            // InternalPetriNet.g:984:3: ruleArc
            {
             before(grammarAccess.getPetriNetAccess().getPetrielementArcParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArc();

            state._fsp--;

             after(grammarAccess.getPetriNetAccess().getPetrielementArcParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__PetrielementAssignment_3_1"


    // $ANTLR start "rule__Place__NameAssignment_1"
    // InternalPetriNet.g:993:1: rule__Place__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Place__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:997:1: ( ( ruleEString ) )
            // InternalPetriNet.g:998:2: ( ruleEString )
            {
            // InternalPetriNet.g:998:2: ( ruleEString )
            // InternalPetriNet.g:999:3: ruleEString
            {
             before(grammarAccess.getPlaceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPlaceAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__NameAssignment_1"


    // $ANTLR start "rule__Place__MarkingAssignment_2_1"
    // InternalPetriNet.g:1008:1: rule__Place__MarkingAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__Place__MarkingAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:1012:1: ( ( ruleEInt ) )
            // InternalPetriNet.g:1013:2: ( ruleEInt )
            {
            // InternalPetriNet.g:1013:2: ( ruleEInt )
            // InternalPetriNet.g:1014:3: ruleEInt
            {
             before(grammarAccess.getPlaceAccess().getMarkingEIntParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPlaceAccess().getMarkingEIntParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__MarkingAssignment_2_1"


    // $ANTLR start "rule__Transition__NameAssignment_1"
    // InternalPetriNet.g:1023:1: rule__Transition__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Transition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:1027:1: ( ( ruleEString ) )
            // InternalPetriNet.g:1028:2: ( ruleEString )
            {
            // InternalPetriNet.g:1028:2: ( ruleEString )
            // InternalPetriNet.g:1029:3: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__NameAssignment_1"


    // $ANTLR start "rule__Arc__KindAssignment_1"
    // InternalPetriNet.g:1038:1: rule__Arc__KindAssignment_1 : ( ruleArcKind ) ;
    public final void rule__Arc__KindAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:1042:1: ( ( ruleArcKind ) )
            // InternalPetriNet.g:1043:2: ( ruleArcKind )
            {
            // InternalPetriNet.g:1043:2: ( ruleArcKind )
            // InternalPetriNet.g:1044:3: ruleArcKind
            {
             before(grammarAccess.getArcAccess().getKindArcKindEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArcKind();

            state._fsp--;

             after(grammarAccess.getArcAccess().getKindArcKindEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__KindAssignment_1"


    // $ANTLR start "rule__Arc__SourceAssignment_3"
    // InternalPetriNet.g:1053:1: rule__Arc__SourceAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Arc__SourceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:1057:1: ( ( ( ruleEString ) ) )
            // InternalPetriNet.g:1058:2: ( ( ruleEString ) )
            {
            // InternalPetriNet.g:1058:2: ( ( ruleEString ) )
            // InternalPetriNet.g:1059:3: ( ruleEString )
            {
             before(grammarAccess.getArcAccess().getSourceNodeCrossReference_3_0()); 
            // InternalPetriNet.g:1060:3: ( ruleEString )
            // InternalPetriNet.g:1061:4: ruleEString
            {
             before(grammarAccess.getArcAccess().getSourceNodeEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArcAccess().getSourceNodeEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getArcAccess().getSourceNodeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__SourceAssignment_3"


    // $ANTLR start "rule__Arc__TargetAssignment_5"
    // InternalPetriNet.g:1072:1: rule__Arc__TargetAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Arc__TargetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:1076:1: ( ( ( ruleEString ) ) )
            // InternalPetriNet.g:1077:2: ( ( ruleEString ) )
            {
            // InternalPetriNet.g:1077:2: ( ( ruleEString ) )
            // InternalPetriNet.g:1078:3: ( ruleEString )
            {
             before(grammarAccess.getArcAccess().getTargetNodeCrossReference_5_0()); 
            // InternalPetriNet.g:1079:3: ( ruleEString )
            // InternalPetriNet.g:1080:4: ruleEString
            {
             before(grammarAccess.getArcAccess().getTargetNodeEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArcAccess().getTargetNodeEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getArcAccess().getTargetNodeCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__TargetAssignment_5"


    // $ANTLR start "rule__Arc__WeightAssignment_6_1"
    // InternalPetriNet.g:1091:1: rule__Arc__WeightAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Arc__WeightAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPetriNet.g:1095:1: ( ( ruleEInt ) )
            // InternalPetriNet.g:1096:2: ( ruleEInt )
            {
            // InternalPetriNet.g:1096:2: ( ruleEInt )
            // InternalPetriNet.g:1097:3: ruleEInt
            {
             before(grammarAccess.getArcAccess().getWeightEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getArcAccess().getWeightEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__WeightAssignment_6_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000D8000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000D0002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000101800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});

}