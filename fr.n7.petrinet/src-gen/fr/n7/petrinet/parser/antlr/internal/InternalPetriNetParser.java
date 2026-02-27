package fr.n7.petrinet.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.n7.petrinet.services.PetriNetGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPetriNetParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'petrinet'", "'{'", "'}'", "'place'", "'marking'", "'transition'", "'arc'", "'from'", "'to'", "'weight'", "'-'", "'normal'", "'read_arc'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
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

        public InternalPetriNetParser(TokenStream input, PetriNetGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "PetriNet";
       	}

       	@Override
       	protected PetriNetGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePetriNet"
    // InternalPetriNet.g:65:1: entryRulePetriNet returns [EObject current=null] : iv_rulePetriNet= rulePetriNet EOF ;
    public final EObject entryRulePetriNet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePetriNet = null;


        try {
            // InternalPetriNet.g:65:49: (iv_rulePetriNet= rulePetriNet EOF )
            // InternalPetriNet.g:66:2: iv_rulePetriNet= rulePetriNet EOF
            {
             newCompositeNode(grammarAccess.getPetriNetRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePetriNet=rulePetriNet();

            state._fsp--;

             current =iv_rulePetriNet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePetriNet"


    // $ANTLR start "rulePetriNet"
    // InternalPetriNet.g:72:1: rulePetriNet returns [EObject current=null] : (otherlv_0= 'petrinet' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_petrielement_3_0= ruleNode ) ) | ( (lv_petrielement_4_0= ruleArc ) ) )* otherlv_5= '}' ) ;
    public final EObject rulePetriNet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_petrielement_3_0 = null;

        EObject lv_petrielement_4_0 = null;



        	enterRule();

        try {
            // InternalPetriNet.g:78:2: ( (otherlv_0= 'petrinet' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_petrielement_3_0= ruleNode ) ) | ( (lv_petrielement_4_0= ruleArc ) ) )* otherlv_5= '}' ) )
            // InternalPetriNet.g:79:2: (otherlv_0= 'petrinet' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_petrielement_3_0= ruleNode ) ) | ( (lv_petrielement_4_0= ruleArc ) ) )* otherlv_5= '}' )
            {
            // InternalPetriNet.g:79:2: (otherlv_0= 'petrinet' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_petrielement_3_0= ruleNode ) ) | ( (lv_petrielement_4_0= ruleArc ) ) )* otherlv_5= '}' )
            // InternalPetriNet.g:80:3: otherlv_0= 'petrinet' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_petrielement_3_0= ruleNode ) ) | ( (lv_petrielement_4_0= ruleArc ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPetriNetAccess().getPetrinetKeyword_0());
            		
            // InternalPetriNet.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPetriNet.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalPetriNet.g:85:4: (lv_name_1_0= ruleEString )
            // InternalPetriNet.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPetriNetAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPetriNetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.n7.petrinet.PetriNet.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPetriNetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPetriNet.g:107:3: ( ( (lv_petrielement_3_0= ruleNode ) ) | ( (lv_petrielement_4_0= ruleArc ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==16) ) {
                    alt1=1;
                }
                else if ( (LA1_0==17) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPetriNet.g:108:4: ( (lv_petrielement_3_0= ruleNode ) )
            	    {
            	    // InternalPetriNet.g:108:4: ( (lv_petrielement_3_0= ruleNode ) )
            	    // InternalPetriNet.g:109:5: (lv_petrielement_3_0= ruleNode )
            	    {
            	    // InternalPetriNet.g:109:5: (lv_petrielement_3_0= ruleNode )
            	    // InternalPetriNet.g:110:6: lv_petrielement_3_0= ruleNode
            	    {

            	    						newCompositeNode(grammarAccess.getPetriNetAccess().getPetrielementNodeParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_petrielement_3_0=ruleNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPetriNetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"petrielement",
            	    							lv_petrielement_3_0,
            	    							"fr.n7.petrinet.PetriNet.Node");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPetriNet.g:128:4: ( (lv_petrielement_4_0= ruleArc ) )
            	    {
            	    // InternalPetriNet.g:128:4: ( (lv_petrielement_4_0= ruleArc ) )
            	    // InternalPetriNet.g:129:5: (lv_petrielement_4_0= ruleArc )
            	    {
            	    // InternalPetriNet.g:129:5: (lv_petrielement_4_0= ruleArc )
            	    // InternalPetriNet.g:130:6: lv_petrielement_4_0= ruleArc
            	    {

            	    						newCompositeNode(grammarAccess.getPetriNetAccess().getPetrielementArcParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_petrielement_4_0=ruleArc();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPetriNetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"petrielement",
            	    							lv_petrielement_4_0,
            	    							"fr.n7.petrinet.PetriNet.Arc");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPetriNetAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePetriNet"


    // $ANTLR start "entryRuleNode"
    // InternalPetriNet.g:156:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalPetriNet.g:156:45: (iv_ruleNode= ruleNode EOF )
            // InternalPetriNet.g:157:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalPetriNet.g:163:1: ruleNode returns [EObject current=null] : (this_Place_0= rulePlace | this_Transition_1= ruleTransition ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_Place_0 = null;

        EObject this_Transition_1 = null;



        	enterRule();

        try {
            // InternalPetriNet.g:169:2: ( (this_Place_0= rulePlace | this_Transition_1= ruleTransition ) )
            // InternalPetriNet.g:170:2: (this_Place_0= rulePlace | this_Transition_1= ruleTransition )
            {
            // InternalPetriNet.g:170:2: (this_Place_0= rulePlace | this_Transition_1= ruleTransition )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPetriNet.g:171:3: this_Place_0= rulePlace
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getPlaceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Place_0=rulePlace();

                    state._fsp--;


                    			current = this_Place_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPetriNet.g:180:3: this_Transition_1= ruleTransition
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getTransitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Transition_1=ruleTransition();

                    state._fsp--;


                    			current = this_Transition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRulePlace"
    // InternalPetriNet.g:192:1: entryRulePlace returns [EObject current=null] : iv_rulePlace= rulePlace EOF ;
    public final EObject entryRulePlace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlace = null;


        try {
            // InternalPetriNet.g:192:46: (iv_rulePlace= rulePlace EOF )
            // InternalPetriNet.g:193:2: iv_rulePlace= rulePlace EOF
            {
             newCompositeNode(grammarAccess.getPlaceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlace=rulePlace();

            state._fsp--;

             current =iv_rulePlace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlace"


    // $ANTLR start "rulePlace"
    // InternalPetriNet.g:199:1: rulePlace returns [EObject current=null] : (otherlv_0= 'place' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'marking' ( (lv_marking_3_0= ruleEInt ) ) )? ) ;
    public final EObject rulePlace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_marking_3_0 = null;



        	enterRule();

        try {
            // InternalPetriNet.g:205:2: ( (otherlv_0= 'place' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'marking' ( (lv_marking_3_0= ruleEInt ) ) )? ) )
            // InternalPetriNet.g:206:2: (otherlv_0= 'place' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'marking' ( (lv_marking_3_0= ruleEInt ) ) )? )
            {
            // InternalPetriNet.g:206:2: (otherlv_0= 'place' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'marking' ( (lv_marking_3_0= ruleEInt ) ) )? )
            // InternalPetriNet.g:207:3: otherlv_0= 'place' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'marking' ( (lv_marking_3_0= ruleEInt ) ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlaceAccess().getPlaceKeyword_0());
            		
            // InternalPetriNet.g:211:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPetriNet.g:212:4: (lv_name_1_0= ruleEString )
            {
            // InternalPetriNet.g:212:4: (lv_name_1_0= ruleEString )
            // InternalPetriNet.g:213:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPlaceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.n7.petrinet.PetriNet.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPetriNet.g:230:3: (otherlv_2= 'marking' ( (lv_marking_3_0= ruleEInt ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPetriNet.g:231:4: otherlv_2= 'marking' ( (lv_marking_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getPlaceAccess().getMarkingKeyword_2_0());
                    			
                    // InternalPetriNet.g:235:4: ( (lv_marking_3_0= ruleEInt ) )
                    // InternalPetriNet.g:236:5: (lv_marking_3_0= ruleEInt )
                    {
                    // InternalPetriNet.g:236:5: (lv_marking_3_0= ruleEInt )
                    // InternalPetriNet.g:237:6: lv_marking_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPlaceAccess().getMarkingEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_marking_3_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlaceRule());
                    						}
                    						set(
                    							current,
                    							"marking",
                    							lv_marking_3_0,
                    							"fr.n7.petrinet.PetriNet.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlace"


    // $ANTLR start "entryRuleTransition"
    // InternalPetriNet.g:259:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalPetriNet.g:259:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalPetriNet.g:260:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalPetriNet.g:266:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'transition' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalPetriNet.g:272:2: ( (otherlv_0= 'transition' ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalPetriNet.g:273:2: (otherlv_0= 'transition' ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalPetriNet.g:273:2: (otherlv_0= 'transition' ( (lv_name_1_0= ruleEString ) ) )
            // InternalPetriNet.g:274:3: otherlv_0= 'transition' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            // InternalPetriNet.g:278:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPetriNet.g:279:4: (lv_name_1_0= ruleEString )
            {
            // InternalPetriNet.g:279:4: (lv_name_1_0= ruleEString )
            // InternalPetriNet.g:280:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.n7.petrinet.PetriNet.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleArc"
    // InternalPetriNet.g:301:1: entryRuleArc returns [EObject current=null] : iv_ruleArc= ruleArc EOF ;
    public final EObject entryRuleArc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArc = null;


        try {
            // InternalPetriNet.g:301:44: (iv_ruleArc= ruleArc EOF )
            // InternalPetriNet.g:302:2: iv_ruleArc= ruleArc EOF
            {
             newCompositeNode(grammarAccess.getArcRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArc=ruleArc();

            state._fsp--;

             current =iv_ruleArc; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArc"


    // $ANTLR start "ruleArc"
    // InternalPetriNet.g:308:1: ruleArc returns [EObject current=null] : (otherlv_0= 'arc' ( (lv_kind_1_0= ruleArcKind ) )? otherlv_2= 'from' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) (otherlv_6= 'weight' ( (lv_weight_7_0= ruleEInt ) ) )? ) ;
    public final EObject ruleArc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_kind_1_0 = null;

        AntlrDatatypeRuleToken lv_weight_7_0 = null;



        	enterRule();

        try {
            // InternalPetriNet.g:314:2: ( (otherlv_0= 'arc' ( (lv_kind_1_0= ruleArcKind ) )? otherlv_2= 'from' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) (otherlv_6= 'weight' ( (lv_weight_7_0= ruleEInt ) ) )? ) )
            // InternalPetriNet.g:315:2: (otherlv_0= 'arc' ( (lv_kind_1_0= ruleArcKind ) )? otherlv_2= 'from' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) (otherlv_6= 'weight' ( (lv_weight_7_0= ruleEInt ) ) )? )
            {
            // InternalPetriNet.g:315:2: (otherlv_0= 'arc' ( (lv_kind_1_0= ruleArcKind ) )? otherlv_2= 'from' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) (otherlv_6= 'weight' ( (lv_weight_7_0= ruleEInt ) ) )? )
            // InternalPetriNet.g:316:3: otherlv_0= 'arc' ( (lv_kind_1_0= ruleArcKind ) )? otherlv_2= 'from' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) (otherlv_6= 'weight' ( (lv_weight_7_0= ruleEInt ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getArcAccess().getArcKeyword_0());
            		
            // InternalPetriNet.g:320:3: ( (lv_kind_1_0= ruleArcKind ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=22 && LA4_0<=23)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPetriNet.g:321:4: (lv_kind_1_0= ruleArcKind )
                    {
                    // InternalPetriNet.g:321:4: (lv_kind_1_0= ruleArcKind )
                    // InternalPetriNet.g:322:5: lv_kind_1_0= ruleArcKind
                    {

                    					newCompositeNode(grammarAccess.getArcAccess().getKindArcKindEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_kind_1_0=ruleArcKind();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getArcRule());
                    					}
                    					set(
                    						current,
                    						"kind",
                    						lv_kind_1_0,
                    						"fr.n7.petrinet.PetriNet.ArcKind");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getArcAccess().getFromKeyword_2());
            		
            // InternalPetriNet.g:343:3: ( ( ruleEString ) )
            // InternalPetriNet.g:344:4: ( ruleEString )
            {
            // InternalPetriNet.g:344:4: ( ruleEString )
            // InternalPetriNet.g:345:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArcRule());
            					}
            				

            					newCompositeNode(grammarAccess.getArcAccess().getSourceNodeCrossReference_3_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getArcAccess().getToKeyword_4());
            		
            // InternalPetriNet.g:363:3: ( ( ruleEString ) )
            // InternalPetriNet.g:364:4: ( ruleEString )
            {
            // InternalPetriNet.g:364:4: ( ruleEString )
            // InternalPetriNet.g:365:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArcRule());
            					}
            				

            					newCompositeNode(grammarAccess.getArcAccess().getTargetNodeCrossReference_5_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPetriNet.g:379:3: (otherlv_6= 'weight' ( (lv_weight_7_0= ruleEInt ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPetriNet.g:380:4: otherlv_6= 'weight' ( (lv_weight_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getArcAccess().getWeightKeyword_6_0());
                    			
                    // InternalPetriNet.g:384:4: ( (lv_weight_7_0= ruleEInt ) )
                    // InternalPetriNet.g:385:5: (lv_weight_7_0= ruleEInt )
                    {
                    // InternalPetriNet.g:385:5: (lv_weight_7_0= ruleEInt )
                    // InternalPetriNet.g:386:6: lv_weight_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getArcAccess().getWeightEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_weight_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArcRule());
                    						}
                    						set(
                    							current,
                    							"weight",
                    							lv_weight_7_0,
                    							"fr.n7.petrinet.PetriNet.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArc"


    // $ANTLR start "entryRuleEInt"
    // InternalPetriNet.g:408:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalPetriNet.g:408:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalPetriNet.g:409:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalPetriNet.g:415:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalPetriNet.g:421:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalPetriNet.g:422:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalPetriNet.g:422:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalPetriNet.g:423:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalPetriNet.g:423:3: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPetriNet.g:424:4: kw= '-'
                    {
                    kw=(Token)match(input,21,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // InternalPetriNet.g:441:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPetriNet.g:441:47: (iv_ruleEString= ruleEString EOF )
            // InternalPetriNet.g:442:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalPetriNet.g:448:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPetriNet.g:454:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPetriNet.g:455:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPetriNet.g:455:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPetriNet.g:456:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPetriNet.g:464:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleArcKind"
    // InternalPetriNet.g:475:1: ruleArcKind returns [Enumerator current=null] : ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'read_arc' ) ) ;
    public final Enumerator ruleArcKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPetriNet.g:481:2: ( ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'read_arc' ) ) )
            // InternalPetriNet.g:482:2: ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'read_arc' ) )
            {
            // InternalPetriNet.g:482:2: ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'read_arc' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPetriNet.g:483:3: (enumLiteral_0= 'normal' )
                    {
                    // InternalPetriNet.g:483:3: (enumLiteral_0= 'normal' )
                    // InternalPetriNet.g:484:4: enumLiteral_0= 'normal'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getArcKindAccess().getNormalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getArcKindAccess().getNormalEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPetriNet.g:491:3: (enumLiteral_1= 'read_arc' )
                    {
                    // InternalPetriNet.g:491:3: (enumLiteral_1= 'read_arc' )
                    // InternalPetriNet.g:492:4: enumLiteral_1= 'read_arc'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getArcKindAccess().getRead_arcEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getArcKindAccess().getRead_arcEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArcKind"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000036000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000C40000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});

}