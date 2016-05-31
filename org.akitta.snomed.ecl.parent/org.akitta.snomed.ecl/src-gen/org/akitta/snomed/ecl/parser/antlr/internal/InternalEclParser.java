package org.akitta.snomed.ecl.parser.antlr.internal;

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
import org.akitta.snomed.ecl.services.EclGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEclParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MINUS", "AND", "ExclamationMarkEqualsSign", "FullStopFullStop", "LessThanSignLessThanSign", "LessThanSignEqualsSign", "GreaterThanSignEqualsSign", "GreaterThanSignGreaterThanSign", "OR", "NumberSign", "LeftParenthesis", "RightParenthesis", "Asterisk", "Comma", "FullStop", "Colon", "LessThanSign", "EqualsSign", "GreaterThanSign", "LeftSquareBracket", "RightSquareBracket", "CircumflexAccent", "LeftCurlyBracket", "RightCurlyBracket", "RULE_TERM_STRING", "RULE_REVERSE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_REVERSE=29;
    public static final int RULE_STRING=32;
    public static final int LessThanSign=20;
    public static final int MINUS=4;
    public static final int RULE_SL_COMMENT=34;
    public static final int Comma=17;
    public static final int EqualsSign=21;
    public static final int LeftParenthesis=14;
    public static final int FullStopFullStop=7;
    public static final int LessThanSignEqualsSign=9;
    public static final int Colon=19;
    public static final int RightCurlyBracket=27;
    public static final int EOF=-1;
    public static final int Asterisk=16;
    public static final int RightSquareBracket=24;
    public static final int FullStop=18;
    public static final int GreaterThanSign=22;
    public static final int OR=12;
    public static final int RULE_ID=30;
    public static final int RULE_WS=35;
    public static final int RightParenthesis=15;
    public static final int LeftCurlyBracket=26;
    public static final int RULE_ANY_OTHER=36;
    public static final int GreaterThanSignGreaterThanSign=11;
    public static final int CircumflexAccent=25;
    public static final int GreaterThanSignEqualsSign=10;
    public static final int RULE_INT=31;
    public static final int AND=5;
    public static final int NumberSign=13;
    public static final int RULE_ML_COMMENT=33;
    public static final int LeftSquareBracket=23;
    public static final int ExclamationMarkEqualsSign=6;
    public static final int LessThanSignLessThanSign=8;
    public static final int RULE_TERM_STRING=28;

    // delegates
    // delegators


        public InternalEclParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEclParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEclParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEclParser.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private EclGrammarAccess grammarAccess;

        public InternalEclParser(TokenStream input, EclGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Script";
       	}

       	@Override
       	protected EclGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleScript"
    // InternalEclParser.g:64:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // InternalEclParser.g:64:47: (iv_ruleScript= ruleScript EOF )
            // InternalEclParser.g:65:2: iv_ruleScript= ruleScript EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScriptRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScript=ruleScript();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScript; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // InternalEclParser.g:71:1: ruleScript returns [EObject current=null] : ( (lv_constraint_0_0= ruleExpressionConstraint ) )? ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        EObject lv_constraint_0_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:77:2: ( ( (lv_constraint_0_0= ruleExpressionConstraint ) )? )
            // InternalEclParser.g:78:2: ( (lv_constraint_0_0= ruleExpressionConstraint ) )?
            {
            // InternalEclParser.g:78:2: ( (lv_constraint_0_0= ruleExpressionConstraint ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==LessThanSignLessThanSign||LA1_0==GreaterThanSignGreaterThanSign||LA1_0==LeftParenthesis||LA1_0==Asterisk||LA1_0==LessThanSign||LA1_0==GreaterThanSign||LA1_0==CircumflexAccent||LA1_0==RULE_INT) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalEclParser.g:79:3: (lv_constraint_0_0= ruleExpressionConstraint )
                    {
                    // InternalEclParser.g:79:3: (lv_constraint_0_0= ruleExpressionConstraint )
                    // InternalEclParser.g:80:4: lv_constraint_0_0= ruleExpressionConstraint
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getScriptAccess().getConstraintExpressionConstraintParserRuleCall_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_constraint_0_0=ruleExpressionConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElementForParent(grammarAccess.getScriptRule());
                      				}
                      				set(
                      					current,
                      					"constraint",
                      					lv_constraint_0_0,
                      					"org.akitta.snomed.ecl.Ecl.ExpressionConstraint");
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleExpressionConstraint"
    // InternalEclParser.g:100:1: entryRuleExpressionConstraint returns [EObject current=null] : iv_ruleExpressionConstraint= ruleExpressionConstraint EOF ;
    public final EObject entryRuleExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionConstraint = null;


        try {
            // InternalEclParser.g:100:61: (iv_ruleExpressionConstraint= ruleExpressionConstraint EOF )
            // InternalEclParser.g:101:2: iv_ruleExpressionConstraint= ruleExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpressionConstraint=ruleExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionConstraint"


    // $ANTLR start "ruleExpressionConstraint"
    // InternalEclParser.g:107:1: ruleExpressionConstraint returns [EObject current=null] : this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ;
    public final EObject ruleExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_ExclusionExpressionConstraint_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:113:2: (this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint )
            // InternalEclParser.g:114:2: this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionConstraintAccess().getExclusionExpressionConstraintParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_ExclusionExpressionConstraint_0=ruleExclusionExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ExclusionExpressionConstraint_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionConstraint"


    // $ANTLR start "entryRuleExclusionExpressionConstraint"
    // InternalEclParser.g:128:1: entryRuleExclusionExpressionConstraint returns [EObject current=null] : iv_ruleExclusionExpressionConstraint= ruleExclusionExpressionConstraint EOF ;
    public final EObject entryRuleExclusionExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclusionExpressionConstraint = null;


        try {
            // InternalEclParser.g:128:70: (iv_ruleExclusionExpressionConstraint= ruleExclusionExpressionConstraint EOF )
            // InternalEclParser.g:129:2: iv_ruleExclusionExpressionConstraint= ruleExclusionExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExclusionExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExclusionExpressionConstraint=ruleExclusionExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExclusionExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExclusionExpressionConstraint"


    // $ANTLR start "ruleExclusionExpressionConstraint"
    // InternalEclParser.g:135:1: ruleExclusionExpressionConstraint returns [EObject current=null] : (this_DisjunctionExpressionConstraint_0= ruleDisjunctionExpressionConstraint ( ( ( ( () ( ( ruleExclusionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleExclusionOperator ) ) ) ) ( (lv_right_3_0= ruleDisjunctionExpressionConstraint ) ) )* ) ;
    public final EObject ruleExclusionExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_DisjunctionExpressionConstraint_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:141:2: ( (this_DisjunctionExpressionConstraint_0= ruleDisjunctionExpressionConstraint ( ( ( ( () ( ( ruleExclusionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleExclusionOperator ) ) ) ) ( (lv_right_3_0= ruleDisjunctionExpressionConstraint ) ) )* ) )
            // InternalEclParser.g:142:2: (this_DisjunctionExpressionConstraint_0= ruleDisjunctionExpressionConstraint ( ( ( ( () ( ( ruleExclusionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleExclusionOperator ) ) ) ) ( (lv_right_3_0= ruleDisjunctionExpressionConstraint ) ) )* )
            {
            // InternalEclParser.g:142:2: (this_DisjunctionExpressionConstraint_0= ruleDisjunctionExpressionConstraint ( ( ( ( () ( ( ruleExclusionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleExclusionOperator ) ) ) ) ( (lv_right_3_0= ruleDisjunctionExpressionConstraint ) ) )* )
            // InternalEclParser.g:143:3: this_DisjunctionExpressionConstraint_0= ruleDisjunctionExpressionConstraint ( ( ( ( () ( ( ruleExclusionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleExclusionOperator ) ) ) ) ( (lv_right_3_0= ruleDisjunctionExpressionConstraint ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExclusionExpressionConstraintAccess().getDisjunctionExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_3);
            this_DisjunctionExpressionConstraint_0=ruleDisjunctionExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DisjunctionExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEclParser.g:154:3: ( ( ( ( () ( ( ruleExclusionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleExclusionOperator ) ) ) ) ( (lv_right_3_0= ruleDisjunctionExpressionConstraint ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==MINUS) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEclParser.g:155:4: ( ( ( () ( ( ruleExclusionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleExclusionOperator ) ) ) ) ( (lv_right_3_0= ruleDisjunctionExpressionConstraint ) )
            	    {
            	    // InternalEclParser.g:155:4: ( ( ( () ( ( ruleExclusionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleExclusionOperator ) ) ) )
            	    // InternalEclParser.g:156:5: ( ( () ( ( ruleExclusionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleExclusionOperator ) ) )
            	    {
            	    // InternalEclParser.g:166:5: ( () ( (lv_op_2_0= ruleExclusionOperator ) ) )
            	    // InternalEclParser.g:167:6: () ( (lv_op_2_0= ruleExclusionOperator ) )
            	    {
            	    // InternalEclParser.g:167:6: ()
            	    // InternalEclParser.g:168:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getExclusionExpressionConstraintAccess().getExclusionExpressionConstraintLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEclParser.g:177:6: ( (lv_op_2_0= ruleExclusionOperator ) )
            	    // InternalEclParser.g:178:7: (lv_op_2_0= ruleExclusionOperator )
            	    {
            	    // InternalEclParser.g:178:7: (lv_op_2_0= ruleExclusionOperator )
            	    // InternalEclParser.g:179:8: lv_op_2_0= ruleExclusionOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getExclusionExpressionConstraintAccess().getOpExclusionOperatorEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_op_2_0=ruleExclusionOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getExclusionExpressionConstraintRule());
            	      								}
            	      								set(
            	      									current,
            	      									"op",
            	      									lv_op_2_0,
            	      									"org.akitta.snomed.ecl.Ecl.ExclusionOperator");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalEclParser.g:198:4: ( (lv_right_3_0= ruleDisjunctionExpressionConstraint ) )
            	    // InternalEclParser.g:199:5: (lv_right_3_0= ruleDisjunctionExpressionConstraint )
            	    {
            	    // InternalEclParser.g:199:5: (lv_right_3_0= ruleDisjunctionExpressionConstraint )
            	    // InternalEclParser.g:200:6: lv_right_3_0= ruleDisjunctionExpressionConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExclusionExpressionConstraintAccess().getRightDisjunctionExpressionConstraintParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_right_3_0=ruleDisjunctionExpressionConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExclusionExpressionConstraintRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.akitta.snomed.ecl.Ecl.DisjunctionExpressionConstraint");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExclusionExpressionConstraint"


    // $ANTLR start "entryRuleDisjunctionExpressionConstraint"
    // InternalEclParser.g:222:1: entryRuleDisjunctionExpressionConstraint returns [EObject current=null] : iv_ruleDisjunctionExpressionConstraint= ruleDisjunctionExpressionConstraint EOF ;
    public final EObject entryRuleDisjunctionExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunctionExpressionConstraint = null;


        try {
            // InternalEclParser.g:222:72: (iv_ruleDisjunctionExpressionConstraint= ruleDisjunctionExpressionConstraint EOF )
            // InternalEclParser.g:223:2: iv_ruleDisjunctionExpressionConstraint= ruleDisjunctionExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisjunctionExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDisjunctionExpressionConstraint=ruleDisjunctionExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisjunctionExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDisjunctionExpressionConstraint"


    // $ANTLR start "ruleDisjunctionExpressionConstraint"
    // InternalEclParser.g:229:1: ruleDisjunctionExpressionConstraint returns [EObject current=null] : (this_ConjunctionExpressionConstraint_0= ruleConjunctionExpressionConstraint ( ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleConjunctionExpressionConstraint ) ) )* ) ;
    public final EObject ruleDisjunctionExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_ConjunctionExpressionConstraint_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:235:2: ( (this_ConjunctionExpressionConstraint_0= ruleConjunctionExpressionConstraint ( ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleConjunctionExpressionConstraint ) ) )* ) )
            // InternalEclParser.g:236:2: (this_ConjunctionExpressionConstraint_0= ruleConjunctionExpressionConstraint ( ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleConjunctionExpressionConstraint ) ) )* )
            {
            // InternalEclParser.g:236:2: (this_ConjunctionExpressionConstraint_0= ruleConjunctionExpressionConstraint ( ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleConjunctionExpressionConstraint ) ) )* )
            // InternalEclParser.g:237:3: this_ConjunctionExpressionConstraint_0= ruleConjunctionExpressionConstraint ( ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleConjunctionExpressionConstraint ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDisjunctionExpressionConstraintAccess().getConjunctionExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_5);
            this_ConjunctionExpressionConstraint_0=ruleConjunctionExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ConjunctionExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEclParser.g:248:3: ( ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleConjunctionExpressionConstraint ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==OR) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEclParser.g:249:4: ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleConjunctionExpressionConstraint ) )
            	    {
            	    // InternalEclParser.g:249:4: ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) )
            	    // InternalEclParser.g:250:5: ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) )
            	    {
            	    // InternalEclParser.g:260:5: ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) )
            	    // InternalEclParser.g:261:6: () ( (lv_op_2_0= ruleDisjunctionOperator ) )
            	    {
            	    // InternalEclParser.g:261:6: ()
            	    // InternalEclParser.g:262:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDisjunctionExpressionConstraintAccess().getDisjunctionExpressionConstraintLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEclParser.g:271:6: ( (lv_op_2_0= ruleDisjunctionOperator ) )
            	    // InternalEclParser.g:272:7: (lv_op_2_0= ruleDisjunctionOperator )
            	    {
            	    // InternalEclParser.g:272:7: (lv_op_2_0= ruleDisjunctionOperator )
            	    // InternalEclParser.g:273:8: lv_op_2_0= ruleDisjunctionOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDisjunctionExpressionConstraintAccess().getOpDisjunctionOperatorEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_op_2_0=ruleDisjunctionOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getDisjunctionExpressionConstraintRule());
            	      								}
            	      								set(
            	      									current,
            	      									"op",
            	      									lv_op_2_0,
            	      									"org.akitta.snomed.ecl.Ecl.DisjunctionOperator");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalEclParser.g:292:4: ( (lv_right_3_0= ruleConjunctionExpressionConstraint ) )
            	    // InternalEclParser.g:293:5: (lv_right_3_0= ruleConjunctionExpressionConstraint )
            	    {
            	    // InternalEclParser.g:293:5: (lv_right_3_0= ruleConjunctionExpressionConstraint )
            	    // InternalEclParser.g:294:6: lv_right_3_0= ruleConjunctionExpressionConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDisjunctionExpressionConstraintAccess().getRightConjunctionExpressionConstraintParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_right_3_0=ruleConjunctionExpressionConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDisjunctionExpressionConstraintRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.akitta.snomed.ecl.Ecl.ConjunctionExpressionConstraint");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDisjunctionExpressionConstraint"


    // $ANTLR start "entryRuleConjunctionExpressionConstraint"
    // InternalEclParser.g:316:1: entryRuleConjunctionExpressionConstraint returns [EObject current=null] : iv_ruleConjunctionExpressionConstraint= ruleConjunctionExpressionConstraint EOF ;
    public final EObject entryRuleConjunctionExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionExpressionConstraint = null;


        try {
            // InternalEclParser.g:316:72: (iv_ruleConjunctionExpressionConstraint= ruleConjunctionExpressionConstraint EOF )
            // InternalEclParser.g:317:2: iv_ruleConjunctionExpressionConstraint= ruleConjunctionExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConjunctionExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConjunctionExpressionConstraint=ruleConjunctionExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConjunctionExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConjunctionExpressionConstraint"


    // $ANTLR start "ruleConjunctionExpressionConstraint"
    // InternalEclParser.g:323:1: ruleConjunctionExpressionConstraint returns [EObject current=null] : (this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )* ) ;
    public final EObject ruleConjunctionExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_RefinedExpressionConstraint_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:329:2: ( (this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )* ) )
            // InternalEclParser.g:330:2: (this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )* )
            {
            // InternalEclParser.g:330:2: (this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )* )
            // InternalEclParser.g:331:3: this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConjunctionExpressionConstraintAccess().getRefinedExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_6);
            this_RefinedExpressionConstraint_0=ruleRefinedExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_RefinedExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEclParser.g:342:3: ( ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==AND||LA4_0==Comma) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEclParser.g:343:4: ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleRefinedExpressionConstraint ) )
            	    {
            	    // InternalEclParser.g:343:4: ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) )
            	    // InternalEclParser.g:344:5: ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) )
            	    {
            	    // InternalEclParser.g:354:5: ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) )
            	    // InternalEclParser.g:355:6: () ( (lv_op_2_0= ruleConjunctionOperator ) )
            	    {
            	    // InternalEclParser.g:355:6: ()
            	    // InternalEclParser.g:356:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getConjunctionExpressionConstraintAccess().getConjunctionExpressionConstraintLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEclParser.g:365:6: ( (lv_op_2_0= ruleConjunctionOperator ) )
            	    // InternalEclParser.g:366:7: (lv_op_2_0= ruleConjunctionOperator )
            	    {
            	    // InternalEclParser.g:366:7: (lv_op_2_0= ruleConjunctionOperator )
            	    // InternalEclParser.g:367:8: lv_op_2_0= ruleConjunctionOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getConjunctionExpressionConstraintAccess().getOpConjunctionOperatorEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_op_2_0=ruleConjunctionOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getConjunctionExpressionConstraintRule());
            	      								}
            	      								set(
            	      									current,
            	      									"op",
            	      									lv_op_2_0,
            	      									"org.akitta.snomed.ecl.Ecl.ConjunctionOperator");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalEclParser.g:386:4: ( (lv_right_3_0= ruleRefinedExpressionConstraint ) )
            	    // InternalEclParser.g:387:5: (lv_right_3_0= ruleRefinedExpressionConstraint )
            	    {
            	    // InternalEclParser.g:387:5: (lv_right_3_0= ruleRefinedExpressionConstraint )
            	    // InternalEclParser.g:388:6: lv_right_3_0= ruleRefinedExpressionConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConjunctionExpressionConstraintAccess().getRightRefinedExpressionConstraintParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_right_3_0=ruleRefinedExpressionConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConjunctionExpressionConstraintRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.akitta.snomed.ecl.Ecl.RefinedExpressionConstraint");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConjunctionExpressionConstraint"


    // $ANTLR start "entryRuleRefinedExpressionConstraint"
    // InternalEclParser.g:410:1: entryRuleRefinedExpressionConstraint returns [EObject current=null] : iv_ruleRefinedExpressionConstraint= ruleRefinedExpressionConstraint EOF ;
    public final EObject entryRuleRefinedExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefinedExpressionConstraint = null;


        try {
            // InternalEclParser.g:410:68: (iv_ruleRefinedExpressionConstraint= ruleRefinedExpressionConstraint EOF )
            // InternalEclParser.g:411:2: iv_ruleRefinedExpressionConstraint= ruleRefinedExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefinedExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRefinedExpressionConstraint=ruleRefinedExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefinedExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRefinedExpressionConstraint"


    // $ANTLR start "ruleRefinedExpressionConstraint"
    // InternalEclParser.g:417:1: ruleRefinedExpressionConstraint returns [EObject current=null] : (this_PrimaryExpressionConstraint_0= rulePrimaryExpressionConstraint ( () otherlv_2= Colon ( (lv_refinement_3_0= ruleRefinement ) ) )? ) ;
    public final EObject ruleRefinedExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PrimaryExpressionConstraint_0 = null;

        EObject lv_refinement_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:423:2: ( (this_PrimaryExpressionConstraint_0= rulePrimaryExpressionConstraint ( () otherlv_2= Colon ( (lv_refinement_3_0= ruleRefinement ) ) )? ) )
            // InternalEclParser.g:424:2: (this_PrimaryExpressionConstraint_0= rulePrimaryExpressionConstraint ( () otherlv_2= Colon ( (lv_refinement_3_0= ruleRefinement ) ) )? )
            {
            // InternalEclParser.g:424:2: (this_PrimaryExpressionConstraint_0= rulePrimaryExpressionConstraint ( () otherlv_2= Colon ( (lv_refinement_3_0= ruleRefinement ) ) )? )
            // InternalEclParser.g:425:3: this_PrimaryExpressionConstraint_0= rulePrimaryExpressionConstraint ( () otherlv_2= Colon ( (lv_refinement_3_0= ruleRefinement ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRefinedExpressionConstraintAccess().getPrimaryExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_7);
            this_PrimaryExpressionConstraint_0=rulePrimaryExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PrimaryExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEclParser.g:436:3: ( () otherlv_2= Colon ( (lv_refinement_3_0= ruleRefinement ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Colon) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEclParser.g:437:4: () otherlv_2= Colon ( (lv_refinement_3_0= ruleRefinement ) )
                    {
                    // InternalEclParser.g:437:4: ()
                    // InternalEclParser.g:438:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getRefinedExpressionConstraintAccess().getRefinedExpressionConstraintTargetAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getRefinedExpressionConstraintAccess().getColonKeyword_1_1());
                      			
                    }
                    // InternalEclParser.g:451:4: ( (lv_refinement_3_0= ruleRefinement ) )
                    // InternalEclParser.g:452:5: (lv_refinement_3_0= ruleRefinement )
                    {
                    // InternalEclParser.g:452:5: (lv_refinement_3_0= ruleRefinement )
                    // InternalEclParser.g:453:6: lv_refinement_3_0= ruleRefinement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementRefinementParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_refinement_3_0=ruleRefinement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRefinedExpressionConstraintRule());
                      						}
                      						set(
                      							current,
                      							"refinement",
                      							lv_refinement_3_0,
                      							"org.akitta.snomed.ecl.Ecl.Refinement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRefinedExpressionConstraint"


    // $ANTLR start "entryRuleRefinement"
    // InternalEclParser.g:475:1: entryRuleRefinement returns [EObject current=null] : iv_ruleRefinement= ruleRefinement EOF ;
    public final EObject entryRuleRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefinement = null;


        try {
            // InternalEclParser.g:475:51: (iv_ruleRefinement= ruleRefinement EOF )
            // InternalEclParser.g:476:2: iv_ruleRefinement= ruleRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRefinement=ruleRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefinement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRefinement"


    // $ANTLR start "ruleRefinement"
    // InternalEclParser.g:482:1: ruleRefinement returns [EObject current=null] : this_DisjunctionRefinementSet_0= ruleDisjunctionRefinementSet ;
    public final EObject ruleRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_DisjunctionRefinementSet_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:488:2: (this_DisjunctionRefinementSet_0= ruleDisjunctionRefinementSet )
            // InternalEclParser.g:489:2: this_DisjunctionRefinementSet_0= ruleDisjunctionRefinementSet
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getRefinementAccess().getDisjunctionRefinementSetParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_DisjunctionRefinementSet_0=ruleDisjunctionRefinementSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_DisjunctionRefinementSet_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRefinement"


    // $ANTLR start "entryRuleDisjunctionRefinementSet"
    // InternalEclParser.g:503:1: entryRuleDisjunctionRefinementSet returns [EObject current=null] : iv_ruleDisjunctionRefinementSet= ruleDisjunctionRefinementSet EOF ;
    public final EObject entryRuleDisjunctionRefinementSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunctionRefinementSet = null;


        try {
            // InternalEclParser.g:503:65: (iv_ruleDisjunctionRefinementSet= ruleDisjunctionRefinementSet EOF )
            // InternalEclParser.g:504:2: iv_ruleDisjunctionRefinementSet= ruleDisjunctionRefinementSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisjunctionRefinementSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDisjunctionRefinementSet=ruleDisjunctionRefinementSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisjunctionRefinementSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDisjunctionRefinementSet"


    // $ANTLR start "ruleDisjunctionRefinementSet"
    // InternalEclParser.g:510:1: ruleDisjunctionRefinementSet returns [EObject current=null] : (this_ConjunctionRefinementSet_0= ruleConjunctionRefinementSet ( ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleConjunctionRefinementSet ) ) )* ) ;
    public final EObject ruleDisjunctionRefinementSet() throws RecognitionException {
        EObject current = null;

        EObject this_ConjunctionRefinementSet_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:516:2: ( (this_ConjunctionRefinementSet_0= ruleConjunctionRefinementSet ( ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleConjunctionRefinementSet ) ) )* ) )
            // InternalEclParser.g:517:2: (this_ConjunctionRefinementSet_0= ruleConjunctionRefinementSet ( ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleConjunctionRefinementSet ) ) )* )
            {
            // InternalEclParser.g:517:2: (this_ConjunctionRefinementSet_0= ruleConjunctionRefinementSet ( ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleConjunctionRefinementSet ) ) )* )
            // InternalEclParser.g:518:3: this_ConjunctionRefinementSet_0= ruleConjunctionRefinementSet ( ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleConjunctionRefinementSet ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDisjunctionRefinementSetAccess().getConjunctionRefinementSetParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_5);
            this_ConjunctionRefinementSet_0=ruleConjunctionRefinementSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ConjunctionRefinementSet_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEclParser.g:529:3: ( ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleConjunctionRefinementSet ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==OR) ) {
                    int LA6_3 = input.LA(2);

                    if ( (synpred10_InternalEclParser()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalEclParser.g:530:4: ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleConjunctionRefinementSet ) )
            	    {
            	    // InternalEclParser.g:530:4: ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) )
            	    // InternalEclParser.g:531:5: ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) )
            	    {
            	    // InternalEclParser.g:541:5: ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) )
            	    // InternalEclParser.g:542:6: () ( (lv_op_2_0= ruleDisjunctionOperator ) )
            	    {
            	    // InternalEclParser.g:542:6: ()
            	    // InternalEclParser.g:543:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDisjunctionRefinementSetAccess().getDisjunctionRefinementSetLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEclParser.g:552:6: ( (lv_op_2_0= ruleDisjunctionOperator ) )
            	    // InternalEclParser.g:553:7: (lv_op_2_0= ruleDisjunctionOperator )
            	    {
            	    // InternalEclParser.g:553:7: (lv_op_2_0= ruleDisjunctionOperator )
            	    // InternalEclParser.g:554:8: lv_op_2_0= ruleDisjunctionOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDisjunctionRefinementSetAccess().getOpDisjunctionOperatorEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_op_2_0=ruleDisjunctionOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getDisjunctionRefinementSetRule());
            	      								}
            	      								set(
            	      									current,
            	      									"op",
            	      									lv_op_2_0,
            	      									"org.akitta.snomed.ecl.Ecl.DisjunctionOperator");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalEclParser.g:573:4: ( (lv_right_3_0= ruleConjunctionRefinementSet ) )
            	    // InternalEclParser.g:574:5: (lv_right_3_0= ruleConjunctionRefinementSet )
            	    {
            	    // InternalEclParser.g:574:5: (lv_right_3_0= ruleConjunctionRefinementSet )
            	    // InternalEclParser.g:575:6: lv_right_3_0= ruleConjunctionRefinementSet
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDisjunctionRefinementSetAccess().getRightConjunctionRefinementSetParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_right_3_0=ruleConjunctionRefinementSet();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDisjunctionRefinementSetRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.akitta.snomed.ecl.Ecl.ConjunctionRefinementSet");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDisjunctionRefinementSet"


    // $ANTLR start "entryRuleConjunctionRefinementSet"
    // InternalEclParser.g:597:1: entryRuleConjunctionRefinementSet returns [EObject current=null] : iv_ruleConjunctionRefinementSet= ruleConjunctionRefinementSet EOF ;
    public final EObject entryRuleConjunctionRefinementSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionRefinementSet = null;


        try {
            // InternalEclParser.g:597:65: (iv_ruleConjunctionRefinementSet= ruleConjunctionRefinementSet EOF )
            // InternalEclParser.g:598:2: iv_ruleConjunctionRefinementSet= ruleConjunctionRefinementSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConjunctionRefinementSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConjunctionRefinementSet=ruleConjunctionRefinementSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConjunctionRefinementSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConjunctionRefinementSet"


    // $ANTLR start "ruleConjunctionRefinementSet"
    // InternalEclParser.g:604:1: ruleConjunctionRefinementSet returns [EObject current=null] : (this_SubRefinement_0= ruleSubRefinement ( ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleSubRefinement ) ) )* ) ;
    public final EObject ruleConjunctionRefinementSet() throws RecognitionException {
        EObject current = null;

        EObject this_SubRefinement_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:610:2: ( (this_SubRefinement_0= ruleSubRefinement ( ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleSubRefinement ) ) )* ) )
            // InternalEclParser.g:611:2: (this_SubRefinement_0= ruleSubRefinement ( ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleSubRefinement ) ) )* )
            {
            // InternalEclParser.g:611:2: (this_SubRefinement_0= ruleSubRefinement ( ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleSubRefinement ) ) )* )
            // InternalEclParser.g:612:3: this_SubRefinement_0= ruleSubRefinement ( ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleSubRefinement ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConjunctionRefinementSetAccess().getSubRefinementParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_6);
            this_SubRefinement_0=ruleSubRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SubRefinement_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEclParser.g:623:3: ( ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleSubRefinement ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==AND) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred12_InternalEclParser()) ) {
                        alt7=1;
                    }


                }
                else if ( (LA7_0==Comma) ) {
                    int LA7_3 = input.LA(2);

                    if ( (synpred12_InternalEclParser()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalEclParser.g:624:4: ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleSubRefinement ) )
            	    {
            	    // InternalEclParser.g:624:4: ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) )
            	    // InternalEclParser.g:625:5: ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) )
            	    {
            	    // InternalEclParser.g:635:5: ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) )
            	    // InternalEclParser.g:636:6: () ( (lv_op_2_0= ruleConjunctionOperator ) )
            	    {
            	    // InternalEclParser.g:636:6: ()
            	    // InternalEclParser.g:637:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getConjunctionRefinementSetAccess().getConjunctionRefinementSetLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEclParser.g:646:6: ( (lv_op_2_0= ruleConjunctionOperator ) )
            	    // InternalEclParser.g:647:7: (lv_op_2_0= ruleConjunctionOperator )
            	    {
            	    // InternalEclParser.g:647:7: (lv_op_2_0= ruleConjunctionOperator )
            	    // InternalEclParser.g:648:8: lv_op_2_0= ruleConjunctionOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getConjunctionRefinementSetAccess().getOpConjunctionOperatorEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_op_2_0=ruleConjunctionOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getConjunctionRefinementSetRule());
            	      								}
            	      								set(
            	      									current,
            	      									"op",
            	      									lv_op_2_0,
            	      									"org.akitta.snomed.ecl.Ecl.ConjunctionOperator");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalEclParser.g:667:4: ( (lv_right_3_0= ruleSubRefinement ) )
            	    // InternalEclParser.g:668:5: (lv_right_3_0= ruleSubRefinement )
            	    {
            	    // InternalEclParser.g:668:5: (lv_right_3_0= ruleSubRefinement )
            	    // InternalEclParser.g:669:6: lv_right_3_0= ruleSubRefinement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConjunctionRefinementSetAccess().getRightSubRefinementParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_right_3_0=ruleSubRefinement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConjunctionRefinementSetRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.akitta.snomed.ecl.Ecl.SubRefinement");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConjunctionRefinementSet"


    // $ANTLR start "entryRuleSubRefinement"
    // InternalEclParser.g:691:1: entryRuleSubRefinement returns [EObject current=null] : iv_ruleSubRefinement= ruleSubRefinement EOF ;
    public final EObject entryRuleSubRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubRefinement = null;


        try {
            // InternalEclParser.g:691:54: (iv_ruleSubRefinement= ruleSubRefinement EOF )
            // InternalEclParser.g:692:2: iv_ruleSubRefinement= ruleSubRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubRefinement=ruleSubRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubRefinement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubRefinement"


    // $ANTLR start "ruleSubRefinement"
    // InternalEclParser.g:698:1: ruleSubRefinement returns [EObject current=null] : (this_AttributeSetRefinement_0= ruleAttributeSetRefinement | this_AttributeGroupRefinement_1= ruleAttributeGroupRefinement | this_ParenthesizedRefinement_2= ruleParenthesizedRefinement ) ;
    public final EObject ruleSubRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeSetRefinement_0 = null;

        EObject this_AttributeGroupRefinement_1 = null;

        EObject this_ParenthesizedRefinement_2 = null;



        	enterRule();

        try {
            // InternalEclParser.g:704:2: ( (this_AttributeSetRefinement_0= ruleAttributeSetRefinement | this_AttributeGroupRefinement_1= ruleAttributeGroupRefinement | this_ParenthesizedRefinement_2= ruleParenthesizedRefinement ) )
            // InternalEclParser.g:705:2: (this_AttributeSetRefinement_0= ruleAttributeSetRefinement | this_AttributeGroupRefinement_1= ruleAttributeGroupRefinement | this_ParenthesizedRefinement_2= ruleParenthesizedRefinement )
            {
            // InternalEclParser.g:705:2: (this_AttributeSetRefinement_0= ruleAttributeSetRefinement | this_AttributeGroupRefinement_1= ruleAttributeGroupRefinement | this_ParenthesizedRefinement_2= ruleParenthesizedRefinement )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalEclParser.g:706:3: this_AttributeSetRefinement_0= ruleAttributeSetRefinement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubRefinementAccess().getAttributeSetRefinementParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AttributeSetRefinement_0=ruleAttributeSetRefinement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AttributeSetRefinement_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEclParser.g:718:3: this_AttributeGroupRefinement_1= ruleAttributeGroupRefinement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubRefinementAccess().getAttributeGroupRefinementParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AttributeGroupRefinement_1=ruleAttributeGroupRefinement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AttributeGroupRefinement_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEclParser.g:730:3: this_ParenthesizedRefinement_2= ruleParenthesizedRefinement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubRefinementAccess().getParenthesizedRefinementParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ParenthesizedRefinement_2=ruleParenthesizedRefinement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParenthesizedRefinement_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSubRefinement"


    // $ANTLR start "entryRuleAttributeSetRefinement"
    // InternalEclParser.g:745:1: entryRuleAttributeSetRefinement returns [EObject current=null] : iv_ruleAttributeSetRefinement= ruleAttributeSetRefinement EOF ;
    public final EObject entryRuleAttributeSetRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeSetRefinement = null;


        try {
            // InternalEclParser.g:745:63: (iv_ruleAttributeSetRefinement= ruleAttributeSetRefinement EOF )
            // InternalEclParser.g:746:2: iv_ruleAttributeSetRefinement= ruleAttributeSetRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeSetRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttributeSetRefinement=ruleAttributeSetRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeSetRefinement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeSetRefinement"


    // $ANTLR start "ruleAttributeSetRefinement"
    // InternalEclParser.g:752:1: ruleAttributeSetRefinement returns [EObject current=null] : ( (lv_attributeSet_0_0= ruleDisjunctionAttributeSet ) ) ;
    public final EObject ruleAttributeSetRefinement() throws RecognitionException {
        EObject current = null;

        EObject lv_attributeSet_0_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:758:2: ( ( (lv_attributeSet_0_0= ruleDisjunctionAttributeSet ) ) )
            // InternalEclParser.g:759:2: ( (lv_attributeSet_0_0= ruleDisjunctionAttributeSet ) )
            {
            // InternalEclParser.g:759:2: ( (lv_attributeSet_0_0= ruleDisjunctionAttributeSet ) )
            // InternalEclParser.g:760:3: (lv_attributeSet_0_0= ruleDisjunctionAttributeSet )
            {
            // InternalEclParser.g:760:3: (lv_attributeSet_0_0= ruleDisjunctionAttributeSet )
            // InternalEclParser.g:761:4: lv_attributeSet_0_0= ruleDisjunctionAttributeSet
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getAttributeSetRefinementAccess().getAttributeSetDisjunctionAttributeSetParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_attributeSet_0_0=ruleDisjunctionAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getAttributeSetRefinementRule());
              				}
              				set(
              					current,
              					"attributeSet",
              					lv_attributeSet_0_0,
              					"org.akitta.snomed.ecl.Ecl.DisjunctionAttributeSet");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAttributeSetRefinement"


    // $ANTLR start "entryRuleAttributeGroupRefinement"
    // InternalEclParser.g:781:1: entryRuleAttributeGroupRefinement returns [EObject current=null] : iv_ruleAttributeGroupRefinement= ruleAttributeGroupRefinement EOF ;
    public final EObject entryRuleAttributeGroupRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeGroupRefinement = null;


        try {
            // InternalEclParser.g:781:65: (iv_ruleAttributeGroupRefinement= ruleAttributeGroupRefinement EOF )
            // InternalEclParser.g:782:2: iv_ruleAttributeGroupRefinement= ruleAttributeGroupRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeGroupRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttributeGroupRefinement=ruleAttributeGroupRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeGroupRefinement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeGroupRefinement"


    // $ANTLR start "ruleAttributeGroupRefinement"
    // InternalEclParser.g:788:1: ruleAttributeGroupRefinement returns [EObject current=null] : ( (lv_attributeGroup_0_0= ruleAttributeGroup ) ) ;
    public final EObject ruleAttributeGroupRefinement() throws RecognitionException {
        EObject current = null;

        EObject lv_attributeGroup_0_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:794:2: ( ( (lv_attributeGroup_0_0= ruleAttributeGroup ) ) )
            // InternalEclParser.g:795:2: ( (lv_attributeGroup_0_0= ruleAttributeGroup ) )
            {
            // InternalEclParser.g:795:2: ( (lv_attributeGroup_0_0= ruleAttributeGroup ) )
            // InternalEclParser.g:796:3: (lv_attributeGroup_0_0= ruleAttributeGroup )
            {
            // InternalEclParser.g:796:3: (lv_attributeGroup_0_0= ruleAttributeGroup )
            // InternalEclParser.g:797:4: lv_attributeGroup_0_0= ruleAttributeGroup
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getAttributeGroupRefinementAccess().getAttributeGroupAttributeGroupParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_attributeGroup_0_0=ruleAttributeGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getAttributeGroupRefinementRule());
              				}
              				set(
              					current,
              					"attributeGroup",
              					lv_attributeGroup_0_0,
              					"org.akitta.snomed.ecl.Ecl.AttributeGroup");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAttributeGroupRefinement"


    // $ANTLR start "entryRuleDisjunctionAttributeSet"
    // InternalEclParser.g:817:1: entryRuleDisjunctionAttributeSet returns [EObject current=null] : iv_ruleDisjunctionAttributeSet= ruleDisjunctionAttributeSet EOF ;
    public final EObject entryRuleDisjunctionAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunctionAttributeSet = null;


        try {
            // InternalEclParser.g:817:64: (iv_ruleDisjunctionAttributeSet= ruleDisjunctionAttributeSet EOF )
            // InternalEclParser.g:818:2: iv_ruleDisjunctionAttributeSet= ruleDisjunctionAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisjunctionAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDisjunctionAttributeSet=ruleDisjunctionAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisjunctionAttributeSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDisjunctionAttributeSet"


    // $ANTLR start "ruleDisjunctionAttributeSet"
    // InternalEclParser.g:824:1: ruleDisjunctionAttributeSet returns [EObject current=null] : (this_ConjunctionAttributeSet_0= ruleConjunctionAttributeSet ( ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleConjunctionAttributeSet ) ) )* ) ;
    public final EObject ruleDisjunctionAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject this_ConjunctionAttributeSet_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:830:2: ( (this_ConjunctionAttributeSet_0= ruleConjunctionAttributeSet ( ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleConjunctionAttributeSet ) ) )* ) )
            // InternalEclParser.g:831:2: (this_ConjunctionAttributeSet_0= ruleConjunctionAttributeSet ( ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleConjunctionAttributeSet ) ) )* )
            {
            // InternalEclParser.g:831:2: (this_ConjunctionAttributeSet_0= ruleConjunctionAttributeSet ( ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleConjunctionAttributeSet ) ) )* )
            // InternalEclParser.g:832:3: this_ConjunctionAttributeSet_0= ruleConjunctionAttributeSet ( ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleConjunctionAttributeSet ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDisjunctionAttributeSetAccess().getConjunctionAttributeSetParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_5);
            this_ConjunctionAttributeSet_0=ruleConjunctionAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ConjunctionAttributeSet_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEclParser.g:843:3: ( ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleConjunctionAttributeSet ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==OR) ) {
                    int LA9_3 = input.LA(2);

                    if ( (synpred16_InternalEclParser()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalEclParser.g:844:4: ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleConjunctionAttributeSet ) )
            	    {
            	    // InternalEclParser.g:844:4: ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) )
            	    // InternalEclParser.g:845:5: ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) )
            	    {
            	    // InternalEclParser.g:855:5: ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) )
            	    // InternalEclParser.g:856:6: () ( (lv_op_2_0= ruleDisjunctionOperator ) )
            	    {
            	    // InternalEclParser.g:856:6: ()
            	    // InternalEclParser.g:857:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDisjunctionAttributeSetAccess().getDisjunctionAttributeSetLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEclParser.g:866:6: ( (lv_op_2_0= ruleDisjunctionOperator ) )
            	    // InternalEclParser.g:867:7: (lv_op_2_0= ruleDisjunctionOperator )
            	    {
            	    // InternalEclParser.g:867:7: (lv_op_2_0= ruleDisjunctionOperator )
            	    // InternalEclParser.g:868:8: lv_op_2_0= ruleDisjunctionOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDisjunctionAttributeSetAccess().getOpDisjunctionOperatorEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_op_2_0=ruleDisjunctionOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getDisjunctionAttributeSetRule());
            	      								}
            	      								set(
            	      									current,
            	      									"op",
            	      									lv_op_2_0,
            	      									"org.akitta.snomed.ecl.Ecl.DisjunctionOperator");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalEclParser.g:887:4: ( (lv_right_3_0= ruleConjunctionAttributeSet ) )
            	    // InternalEclParser.g:888:5: (lv_right_3_0= ruleConjunctionAttributeSet )
            	    {
            	    // InternalEclParser.g:888:5: (lv_right_3_0= ruleConjunctionAttributeSet )
            	    // InternalEclParser.g:889:6: lv_right_3_0= ruleConjunctionAttributeSet
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDisjunctionAttributeSetAccess().getRightConjunctionAttributeSetParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_right_3_0=ruleConjunctionAttributeSet();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDisjunctionAttributeSetRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.akitta.snomed.ecl.Ecl.ConjunctionAttributeSet");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDisjunctionAttributeSet"


    // $ANTLR start "entryRuleConjunctionAttributeSet"
    // InternalEclParser.g:911:1: entryRuleConjunctionAttributeSet returns [EObject current=null] : iv_ruleConjunctionAttributeSet= ruleConjunctionAttributeSet EOF ;
    public final EObject entryRuleConjunctionAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionAttributeSet = null;


        try {
            // InternalEclParser.g:911:64: (iv_ruleConjunctionAttributeSet= ruleConjunctionAttributeSet EOF )
            // InternalEclParser.g:912:2: iv_ruleConjunctionAttributeSet= ruleConjunctionAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConjunctionAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConjunctionAttributeSet=ruleConjunctionAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConjunctionAttributeSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConjunctionAttributeSet"


    // $ANTLR start "ruleConjunctionAttributeSet"
    // InternalEclParser.g:918:1: ruleConjunctionAttributeSet returns [EObject current=null] : (this_PrimaryAttributeSet_0= rulePrimaryAttributeSet ( ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) ) ( (lv_right_3_0= rulePrimaryAttributeSet ) ) )* ) ;
    public final EObject ruleConjunctionAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryAttributeSet_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:924:2: ( (this_PrimaryAttributeSet_0= rulePrimaryAttributeSet ( ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) ) ( (lv_right_3_0= rulePrimaryAttributeSet ) ) )* ) )
            // InternalEclParser.g:925:2: (this_PrimaryAttributeSet_0= rulePrimaryAttributeSet ( ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) ) ( (lv_right_3_0= rulePrimaryAttributeSet ) ) )* )
            {
            // InternalEclParser.g:925:2: (this_PrimaryAttributeSet_0= rulePrimaryAttributeSet ( ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) ) ( (lv_right_3_0= rulePrimaryAttributeSet ) ) )* )
            // InternalEclParser.g:926:3: this_PrimaryAttributeSet_0= rulePrimaryAttributeSet ( ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) ) ( (lv_right_3_0= rulePrimaryAttributeSet ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConjunctionAttributeSetAccess().getPrimaryAttributeSetParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_6);
            this_PrimaryAttributeSet_0=rulePrimaryAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PrimaryAttributeSet_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEclParser.g:937:3: ( ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) ) ( (lv_right_3_0= rulePrimaryAttributeSet ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==AND) ) {
                    int LA10_2 = input.LA(2);

                    if ( (synpred18_InternalEclParser()) ) {
                        alt10=1;
                    }


                }
                else if ( (LA10_0==Comma) ) {
                    int LA10_3 = input.LA(2);

                    if ( (synpred18_InternalEclParser()) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalEclParser.g:938:4: ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) ) ( (lv_right_3_0= rulePrimaryAttributeSet ) )
            	    {
            	    // InternalEclParser.g:938:4: ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) )
            	    // InternalEclParser.g:939:5: ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) )
            	    {
            	    // InternalEclParser.g:949:5: ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) )
            	    // InternalEclParser.g:950:6: () ( (lv_op_2_0= ruleConjunctionOperator ) )
            	    {
            	    // InternalEclParser.g:950:6: ()
            	    // InternalEclParser.g:951:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getConjunctionAttributeSetAccess().getConjunctionAttributeSetLeftAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalEclParser.g:960:6: ( (lv_op_2_0= ruleConjunctionOperator ) )
            	    // InternalEclParser.g:961:7: (lv_op_2_0= ruleConjunctionOperator )
            	    {
            	    // InternalEclParser.g:961:7: (lv_op_2_0= ruleConjunctionOperator )
            	    // InternalEclParser.g:962:8: lv_op_2_0= ruleConjunctionOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getConjunctionAttributeSetAccess().getOpConjunctionOperatorEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_op_2_0=ruleConjunctionOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getConjunctionAttributeSetRule());
            	      								}
            	      								set(
            	      									current,
            	      									"op",
            	      									lv_op_2_0,
            	      									"org.akitta.snomed.ecl.Ecl.ConjunctionOperator");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalEclParser.g:981:4: ( (lv_right_3_0= rulePrimaryAttributeSet ) )
            	    // InternalEclParser.g:982:5: (lv_right_3_0= rulePrimaryAttributeSet )
            	    {
            	    // InternalEclParser.g:982:5: (lv_right_3_0= rulePrimaryAttributeSet )
            	    // InternalEclParser.g:983:6: lv_right_3_0= rulePrimaryAttributeSet
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConjunctionAttributeSetAccess().getRightPrimaryAttributeSetParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_right_3_0=rulePrimaryAttributeSet();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConjunctionAttributeSetRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.akitta.snomed.ecl.Ecl.PrimaryAttributeSet");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConjunctionAttributeSet"


    // $ANTLR start "entryRulePrimaryAttributeSet"
    // InternalEclParser.g:1005:1: entryRulePrimaryAttributeSet returns [EObject current=null] : iv_rulePrimaryAttributeSet= rulePrimaryAttributeSet EOF ;
    public final EObject entryRulePrimaryAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryAttributeSet = null;


        try {
            // InternalEclParser.g:1005:60: (iv_rulePrimaryAttributeSet= rulePrimaryAttributeSet EOF )
            // InternalEclParser.g:1006:2: iv_rulePrimaryAttributeSet= rulePrimaryAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimaryAttributeSet=rulePrimaryAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryAttributeSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryAttributeSet"


    // $ANTLR start "rulePrimaryAttributeSet"
    // InternalEclParser.g:1012:1: rulePrimaryAttributeSet returns [EObject current=null] : (this_ParenthesizedAttributeSet_0= ruleParenthesizedAttributeSet | this_Attribute_1= ruleAttribute ) ;
    public final EObject rulePrimaryAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject this_ParenthesizedAttributeSet_0 = null;

        EObject this_Attribute_1 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1018:2: ( (this_ParenthesizedAttributeSet_0= ruleParenthesizedAttributeSet | this_Attribute_1= ruleAttribute ) )
            // InternalEclParser.g:1019:2: (this_ParenthesizedAttributeSet_0= ruleParenthesizedAttributeSet | this_Attribute_1= ruleAttribute )
            {
            // InternalEclParser.g:1019:2: (this_ParenthesizedAttributeSet_0= ruleParenthesizedAttributeSet | this_Attribute_1= ruleAttribute )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==LeftParenthesis) ) {
                alt11=1;
            }
            else if ( (LA11_0==LessThanSignLessThanSign||LA11_0==Asterisk||LA11_0==LessThanSign||LA11_0==LeftSquareBracket||LA11_0==RULE_REVERSE||LA11_0==RULE_INT) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalEclParser.g:1020:3: this_ParenthesizedAttributeSet_0= ruleParenthesizedAttributeSet
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAttributeSetAccess().getParenthesizedAttributeSetParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ParenthesizedAttributeSet_0=ruleParenthesizedAttributeSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParenthesizedAttributeSet_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1032:3: this_Attribute_1= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAttributeSetAccess().getAttributeParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Attribute_1=ruleAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Attribute_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimaryAttributeSet"


    // $ANTLR start "entryRuleAttribute"
    // InternalEclParser.g:1047:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalEclParser.g:1047:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalEclParser.g:1048:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalEclParser.g:1054:1: ruleAttribute returns [EObject current=null] : ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSE ) )? ( (lv_op_2_0= ruleAttributeOperator ) )? ( ( (lv_conceptRef_3_0= ruleConceptReference ) ) | ( (lv_wildcard_4_0= Asterisk ) ) ) ( (lv_value_5_0= ruleAttributeValue ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_reversed_1_0=null;
        Token lv_wildcard_4_0=null;
        EObject lv_cardinality_0_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_conceptRef_3_0 = null;

        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1060:2: ( ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSE ) )? ( (lv_op_2_0= ruleAttributeOperator ) )? ( ( (lv_conceptRef_3_0= ruleConceptReference ) ) | ( (lv_wildcard_4_0= Asterisk ) ) ) ( (lv_value_5_0= ruleAttributeValue ) ) ) )
            // InternalEclParser.g:1061:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSE ) )? ( (lv_op_2_0= ruleAttributeOperator ) )? ( ( (lv_conceptRef_3_0= ruleConceptReference ) ) | ( (lv_wildcard_4_0= Asterisk ) ) ) ( (lv_value_5_0= ruleAttributeValue ) ) )
            {
            // InternalEclParser.g:1061:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSE ) )? ( (lv_op_2_0= ruleAttributeOperator ) )? ( ( (lv_conceptRef_3_0= ruleConceptReference ) ) | ( (lv_wildcard_4_0= Asterisk ) ) ) ( (lv_value_5_0= ruleAttributeValue ) ) )
            // InternalEclParser.g:1062:3: ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSE ) )? ( (lv_op_2_0= ruleAttributeOperator ) )? ( ( (lv_conceptRef_3_0= ruleConceptReference ) ) | ( (lv_wildcard_4_0= Asterisk ) ) ) ( (lv_value_5_0= ruleAttributeValue ) )
            {
            // InternalEclParser.g:1062:3: ( (lv_cardinality_0_0= ruleCardinality ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==LeftSquareBracket) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEclParser.g:1063:4: (lv_cardinality_0_0= ruleCardinality )
                    {
                    // InternalEclParser.g:1063:4: (lv_cardinality_0_0= ruleCardinality )
                    // InternalEclParser.g:1064:5: lv_cardinality_0_0= ruleCardinality
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAttributeAccess().getCardinalityCardinalityParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_10);
                    lv_cardinality_0_0=ruleCardinality();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAttributeRule());
                      					}
                      					set(
                      						current,
                      						"cardinality",
                      						lv_cardinality_0_0,
                      						"org.akitta.snomed.ecl.Ecl.Cardinality");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEclParser.g:1081:3: ( (lv_reversed_1_0= RULE_REVERSE ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_REVERSE) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEclParser.g:1082:4: (lv_reversed_1_0= RULE_REVERSE )
                    {
                    // InternalEclParser.g:1082:4: (lv_reversed_1_0= RULE_REVERSE )
                    // InternalEclParser.g:1083:5: lv_reversed_1_0= RULE_REVERSE
                    {
                    lv_reversed_1_0=(Token)match(input,RULE_REVERSE,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_reversed_1_0, grammarAccess.getAttributeAccess().getReversedREVERSETerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAttributeRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"reversed",
                      						true,
                      						"org.akitta.snomed.ecl.Ecl.REVERSE");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEclParser.g:1099:3: ( (lv_op_2_0= ruleAttributeOperator ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==LessThanSignLessThanSign||LA14_0==LessThanSign) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEclParser.g:1100:4: (lv_op_2_0= ruleAttributeOperator )
                    {
                    // InternalEclParser.g:1100:4: (lv_op_2_0= ruleAttributeOperator )
                    // InternalEclParser.g:1101:5: lv_op_2_0= ruleAttributeOperator
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAttributeAccess().getOpAttributeOperatorEnumRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    lv_op_2_0=ruleAttributeOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAttributeRule());
                      					}
                      					set(
                      						current,
                      						"op",
                      						lv_op_2_0,
                      						"org.akitta.snomed.ecl.Ecl.AttributeOperator");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEclParser.g:1118:3: ( ( (lv_conceptRef_3_0= ruleConceptReference ) ) | ( (lv_wildcard_4_0= Asterisk ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            else if ( (LA15_0==Asterisk) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalEclParser.g:1119:4: ( (lv_conceptRef_3_0= ruleConceptReference ) )
                    {
                    // InternalEclParser.g:1119:4: ( (lv_conceptRef_3_0= ruleConceptReference ) )
                    // InternalEclParser.g:1120:5: (lv_conceptRef_3_0= ruleConceptReference )
                    {
                    // InternalEclParser.g:1120:5: (lv_conceptRef_3_0= ruleConceptReference )
                    // InternalEclParser.g:1121:6: lv_conceptRef_3_0= ruleConceptReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAttributeAccess().getConceptRefConceptReferenceParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_conceptRef_3_0=ruleConceptReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAttributeRule());
                      						}
                      						set(
                      							current,
                      							"conceptRef",
                      							lv_conceptRef_3_0,
                      							"org.akitta.snomed.ecl.Ecl.ConceptReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1139:4: ( (lv_wildcard_4_0= Asterisk ) )
                    {
                    // InternalEclParser.g:1139:4: ( (lv_wildcard_4_0= Asterisk ) )
                    // InternalEclParser.g:1140:5: (lv_wildcard_4_0= Asterisk )
                    {
                    // InternalEclParser.g:1140:5: (lv_wildcard_4_0= Asterisk )
                    // InternalEclParser.g:1141:6: lv_wildcard_4_0= Asterisk
                    {
                    lv_wildcard_4_0=(Token)match(input,Asterisk,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_wildcard_4_0, grammarAccess.getAttributeAccess().getWildcardAsteriskKeyword_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAttributeRule());
                      						}
                      						setWithLastConsumed(current, "wildcard", true, "*");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalEclParser.g:1154:3: ( (lv_value_5_0= ruleAttributeValue ) )
            // InternalEclParser.g:1155:4: (lv_value_5_0= ruleAttributeValue )
            {
            // InternalEclParser.g:1155:4: (lv_value_5_0= ruleAttributeValue )
            // InternalEclParser.g:1156:5: lv_value_5_0= ruleAttributeValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeAccess().getValueAttributeValueParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_5_0=ruleAttributeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_5_0,
              						"org.akitta.snomed.ecl.Ecl.AttributeValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleCardinality"
    // InternalEclParser.g:1177:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalEclParser.g:1177:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalEclParser.g:1178:2: iv_ruleCardinality= ruleCardinality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCardinalityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCardinality; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalEclParser.g:1184:1: ruleCardinality returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_from_1_0= RULE_INT ) ) otherlv_2= FullStopFullStop ( ( (lv_to_3_0= RULE_INT ) ) | ( (lv_many_4_0= Asterisk ) ) ) otherlv_5= RightSquareBracket ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_from_1_0=null;
        Token otherlv_2=null;
        Token lv_to_3_0=null;
        Token lv_many_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalEclParser.g:1190:2: ( (otherlv_0= LeftSquareBracket ( (lv_from_1_0= RULE_INT ) ) otherlv_2= FullStopFullStop ( ( (lv_to_3_0= RULE_INT ) ) | ( (lv_many_4_0= Asterisk ) ) ) otherlv_5= RightSquareBracket ) )
            // InternalEclParser.g:1191:2: (otherlv_0= LeftSquareBracket ( (lv_from_1_0= RULE_INT ) ) otherlv_2= FullStopFullStop ( ( (lv_to_3_0= RULE_INT ) ) | ( (lv_many_4_0= Asterisk ) ) ) otherlv_5= RightSquareBracket )
            {
            // InternalEclParser.g:1191:2: (otherlv_0= LeftSquareBracket ( (lv_from_1_0= RULE_INT ) ) otherlv_2= FullStopFullStop ( ( (lv_to_3_0= RULE_INT ) ) | ( (lv_many_4_0= Asterisk ) ) ) otherlv_5= RightSquareBracket )
            // InternalEclParser.g:1192:3: otherlv_0= LeftSquareBracket ( (lv_from_1_0= RULE_INT ) ) otherlv_2= FullStopFullStop ( ( (lv_to_3_0= RULE_INT ) ) | ( (lv_many_4_0= Asterisk ) ) ) otherlv_5= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCardinalityAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalEclParser.g:1196:3: ( (lv_from_1_0= RULE_INT ) )
            // InternalEclParser.g:1197:4: (lv_from_1_0= RULE_INT )
            {
            // InternalEclParser.g:1197:4: (lv_from_1_0= RULE_INT )
            // InternalEclParser.g:1198:5: lv_from_1_0= RULE_INT
            {
            lv_from_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_from_1_0, grammarAccess.getCardinalityAccess().getFromINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCardinalityRule());
              					}
              					setWithLastConsumed(
              						current,
              						"from",
              						lv_from_1_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_2());
              		
            }
            // InternalEclParser.g:1218:3: ( ( (lv_to_3_0= RULE_INT ) ) | ( (lv_many_4_0= Asterisk ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            else if ( (LA16_0==Asterisk) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalEclParser.g:1219:4: ( (lv_to_3_0= RULE_INT ) )
                    {
                    // InternalEclParser.g:1219:4: ( (lv_to_3_0= RULE_INT ) )
                    // InternalEclParser.g:1220:5: (lv_to_3_0= RULE_INT )
                    {
                    // InternalEclParser.g:1220:5: (lv_to_3_0= RULE_INT )
                    // InternalEclParser.g:1221:6: lv_to_3_0= RULE_INT
                    {
                    lv_to_3_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_to_3_0, grammarAccess.getCardinalityAccess().getToINTTerminalRuleCall_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCardinalityRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"to",
                      							lv_to_3_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1238:4: ( (lv_many_4_0= Asterisk ) )
                    {
                    // InternalEclParser.g:1238:4: ( (lv_many_4_0= Asterisk ) )
                    // InternalEclParser.g:1239:5: (lv_many_4_0= Asterisk )
                    {
                    // InternalEclParser.g:1239:5: (lv_many_4_0= Asterisk )
                    // InternalEclParser.g:1240:6: lv_many_4_0= Asterisk
                    {
                    lv_many_4_0=(Token)match(input,Asterisk,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_many_4_0, grammarAccess.getCardinalityAccess().getManyAsteriskKeyword_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCardinalityRule());
                      						}
                      						setWithLastConsumed(current, "many", true, "*");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightSquareBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getCardinalityAccess().getRightSquareBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleAttributeValue"
    // InternalEclParser.g:1261:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // InternalEclParser.g:1261:55: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalEclParser.g:1262:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // InternalEclParser.g:1268:1: ruleAttributeValue returns [EObject current=null] : (this_ExpressionValue_0= ruleExpressionValue | this_NumericValue_1= ruleNumericValue | this_StringValue_2= ruleStringValue ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionValue_0 = null;

        EObject this_NumericValue_1 = null;

        EObject this_StringValue_2 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1274:2: ( (this_ExpressionValue_0= ruleExpressionValue | this_NumericValue_1= ruleNumericValue | this_StringValue_2= ruleStringValue ) )
            // InternalEclParser.g:1275:2: (this_ExpressionValue_0= ruleExpressionValue | this_NumericValue_1= ruleNumericValue | this_StringValue_2= ruleStringValue )
            {
            // InternalEclParser.g:1275:2: (this_ExpressionValue_0= ruleExpressionValue | this_NumericValue_1= ruleNumericValue | this_StringValue_2= ruleStringValue )
            int alt17=3;
            switch ( input.LA(1) ) {
            case EqualsSign:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    alt17=3;
                    }
                    break;
                case NumberSign:
                    {
                    alt17=2;
                    }
                    break;
                case LessThanSignLessThanSign:
                case GreaterThanSignGreaterThanSign:
                case LeftParenthesis:
                case Asterisk:
                case LessThanSign:
                case GreaterThanSign:
                case CircumflexAccent:
                case RULE_INT:
                    {
                    alt17=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }

                }
                break;
            case ExclamationMarkEqualsSign:
                {
                switch ( input.LA(2) ) {
                case LessThanSignLessThanSign:
                case GreaterThanSignGreaterThanSign:
                case LeftParenthesis:
                case Asterisk:
                case LessThanSign:
                case GreaterThanSign:
                case CircumflexAccent:
                case RULE_INT:
                    {
                    alt17=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt17=3;
                    }
                    break;
                case NumberSign:
                    {
                    alt17=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }

                }
                break;
            case LessThanSignEqualsSign:
            case GreaterThanSignEqualsSign:
            case LessThanSign:
            case GreaterThanSign:
                {
                alt17=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalEclParser.g:1276:3: this_ExpressionValue_0= ruleExpressionValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAttributeValueAccess().getExpressionValueParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ExpressionValue_0=ruleExpressionValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionValue_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1288:3: this_NumericValue_1= ruleNumericValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAttributeValueAccess().getNumericValueParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NumericValue_1=ruleNumericValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumericValue_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEclParser.g:1300:3: this_StringValue_2= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAttributeValueAccess().getStringValueParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringValue_2=ruleStringValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringValue_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalEclParser.g:1315:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalEclParser.g:1315:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalEclParser.g:1316:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalEclParser.g:1322:1: ruleStringValue returns [EObject current=null] : ( ( (lv_op_0_0= ruleStringComparisonOperator ) ) ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_op_0_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1328:2: ( ( ( (lv_op_0_0= ruleStringComparisonOperator ) ) ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalEclParser.g:1329:2: ( ( (lv_op_0_0= ruleStringComparisonOperator ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalEclParser.g:1329:2: ( ( (lv_op_0_0= ruleStringComparisonOperator ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalEclParser.g:1330:3: ( (lv_op_0_0= ruleStringComparisonOperator ) ) ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalEclParser.g:1330:3: ( (lv_op_0_0= ruleStringComparisonOperator ) )
            // InternalEclParser.g:1331:4: (lv_op_0_0= ruleStringComparisonOperator )
            {
            // InternalEclParser.g:1331:4: (lv_op_0_0= ruleStringComparisonOperator )
            // InternalEclParser.g:1332:5: lv_op_0_0= ruleStringComparisonOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStringValueAccess().getOpStringComparisonOperatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_17);
            lv_op_0_0=ruleStringComparisonOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStringValueRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_0_0,
              						"org.akitta.snomed.ecl.Ecl.StringComparisonOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEclParser.g:1349:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalEclParser.g:1350:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalEclParser.g:1350:4: (lv_value_1_0= RULE_STRING )
            // InternalEclParser.g:1351:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStringValueRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleNumericValue"
    // InternalEclParser.g:1371:1: entryRuleNumericValue returns [EObject current=null] : iv_ruleNumericValue= ruleNumericValue EOF ;
    public final EObject entryRuleNumericValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericValue = null;


        try {
            // InternalEclParser.g:1371:53: (iv_ruleNumericValue= ruleNumericValue EOF )
            // InternalEclParser.g:1372:2: iv_ruleNumericValue= ruleNumericValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNumericValue=ruleNumericValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumericValue"


    // $ANTLR start "ruleNumericValue"
    // InternalEclParser.g:1378:1: ruleNumericValue returns [EObject current=null] : ( ( (lv_op_0_0= ruleNumericComparisonOperator ) ) otherlv_1= NumberSign ( (lv_value_2_0= ruleNumber ) ) ) ;
    public final EObject ruleNumericValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_op_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1384:2: ( ( ( (lv_op_0_0= ruleNumericComparisonOperator ) ) otherlv_1= NumberSign ( (lv_value_2_0= ruleNumber ) ) ) )
            // InternalEclParser.g:1385:2: ( ( (lv_op_0_0= ruleNumericComparisonOperator ) ) otherlv_1= NumberSign ( (lv_value_2_0= ruleNumber ) ) )
            {
            // InternalEclParser.g:1385:2: ( ( (lv_op_0_0= ruleNumericComparisonOperator ) ) otherlv_1= NumberSign ( (lv_value_2_0= ruleNumber ) ) )
            // InternalEclParser.g:1386:3: ( (lv_op_0_0= ruleNumericComparisonOperator ) ) otherlv_1= NumberSign ( (lv_value_2_0= ruleNumber ) )
            {
            // InternalEclParser.g:1386:3: ( (lv_op_0_0= ruleNumericComparisonOperator ) )
            // InternalEclParser.g:1387:4: (lv_op_0_0= ruleNumericComparisonOperator )
            {
            // InternalEclParser.g:1387:4: (lv_op_0_0= ruleNumericComparisonOperator )
            // InternalEclParser.g:1388:5: lv_op_0_0= ruleNumericComparisonOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNumericValueAccess().getOpNumericComparisonOperatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_18);
            lv_op_0_0=ruleNumericComparisonOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNumericValueRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_0_0,
              						"org.akitta.snomed.ecl.Ecl.NumericComparisonOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,NumberSign,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNumericValueAccess().getNumberSignKeyword_1());
              		
            }
            // InternalEclParser.g:1409:3: ( (lv_value_2_0= ruleNumber ) )
            // InternalEclParser.g:1410:4: (lv_value_2_0= ruleNumber )
            {
            // InternalEclParser.g:1410:4: (lv_value_2_0= ruleNumber )
            // InternalEclParser.g:1411:5: lv_value_2_0= ruleNumber
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNumericValueAccess().getValueNumberParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNumericValueRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"org.akitta.snomed.ecl.Ecl.Number");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNumericValue"


    // $ANTLR start "entryRuleNumber"
    // InternalEclParser.g:1432:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalEclParser.g:1432:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalEclParser.g:1433:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalEclParser.g:1439:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= FullStop this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalEclParser.g:1445:2: ( (this_INT_0= RULE_INT (kw= FullStop this_INT_2= RULE_INT )? ) )
            // InternalEclParser.g:1446:2: (this_INT_0= RULE_INT (kw= FullStop this_INT_2= RULE_INT )? )
            {
            // InternalEclParser.g:1446:2: (this_INT_0= RULE_INT (kw= FullStop this_INT_2= RULE_INT )? )
            // InternalEclParser.g:1447:3: this_INT_0= RULE_INT (kw= FullStop this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:1454:3: (kw= FullStop this_INT_2= RULE_INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==FullStop) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEclParser.g:1455:4: kw= FullStop this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,FullStop,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_0());
                      			
                    }
                    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_2, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleExpressionValue"
    // InternalEclParser.g:1472:1: entryRuleExpressionValue returns [EObject current=null] : iv_ruleExpressionValue= ruleExpressionValue EOF ;
    public final EObject entryRuleExpressionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionValue = null;


        try {
            // InternalEclParser.g:1472:56: (iv_ruleExpressionValue= ruleExpressionValue EOF )
            // InternalEclParser.g:1473:2: iv_ruleExpressionValue= ruleExpressionValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpressionValue=ruleExpressionValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionValue"


    // $ANTLR start "ruleExpressionValue"
    // InternalEclParser.g:1479:1: ruleExpressionValue returns [EObject current=null] : ( ( (lv_op_0_0= ruleExpressionComparisonOperator ) ) ( (lv_value_1_0= rulePrimaryExpressionConstraint ) ) ) ;
    public final EObject ruleExpressionValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_op_0_0 = null;

        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1485:2: ( ( ( (lv_op_0_0= ruleExpressionComparisonOperator ) ) ( (lv_value_1_0= rulePrimaryExpressionConstraint ) ) ) )
            // InternalEclParser.g:1486:2: ( ( (lv_op_0_0= ruleExpressionComparisonOperator ) ) ( (lv_value_1_0= rulePrimaryExpressionConstraint ) ) )
            {
            // InternalEclParser.g:1486:2: ( ( (lv_op_0_0= ruleExpressionComparisonOperator ) ) ( (lv_value_1_0= rulePrimaryExpressionConstraint ) ) )
            // InternalEclParser.g:1487:3: ( (lv_op_0_0= ruleExpressionComparisonOperator ) ) ( (lv_value_1_0= rulePrimaryExpressionConstraint ) )
            {
            // InternalEclParser.g:1487:3: ( (lv_op_0_0= ruleExpressionComparisonOperator ) )
            // InternalEclParser.g:1488:4: (lv_op_0_0= ruleExpressionComparisonOperator )
            {
            // InternalEclParser.g:1488:4: (lv_op_0_0= ruleExpressionComparisonOperator )
            // InternalEclParser.g:1489:5: lv_op_0_0= ruleExpressionComparisonOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionValueAccess().getOpExpressionComparisonOperatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_op_0_0=ruleExpressionComparisonOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionValueRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_0_0,
              						"org.akitta.snomed.ecl.Ecl.ExpressionComparisonOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEclParser.g:1506:3: ( (lv_value_1_0= rulePrimaryExpressionConstraint ) )
            // InternalEclParser.g:1507:4: (lv_value_1_0= rulePrimaryExpressionConstraint )
            {
            // InternalEclParser.g:1507:4: (lv_value_1_0= rulePrimaryExpressionConstraint )
            // InternalEclParser.g:1508:5: lv_value_1_0= rulePrimaryExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionValueAccess().getValuePrimaryExpressionConstraintParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_1_0=rulePrimaryExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionValueRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.akitta.snomed.ecl.Ecl.PrimaryExpressionConstraint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionValue"


    // $ANTLR start "entryRuleParenthesizedAttributeSet"
    // InternalEclParser.g:1529:1: entryRuleParenthesizedAttributeSet returns [EObject current=null] : iv_ruleParenthesizedAttributeSet= ruleParenthesizedAttributeSet EOF ;
    public final EObject entryRuleParenthesizedAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedAttributeSet = null;


        try {
            // InternalEclParser.g:1529:66: (iv_ruleParenthesizedAttributeSet= ruleParenthesizedAttributeSet EOF )
            // InternalEclParser.g:1530:2: iv_ruleParenthesizedAttributeSet= ruleParenthesizedAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParenthesizedAttributeSet=ruleParenthesizedAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedAttributeSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParenthesizedAttributeSet"


    // $ANTLR start "ruleParenthesizedAttributeSet"
    // InternalEclParser.g:1536:1: ruleParenthesizedAttributeSet returns [EObject current=null] : (otherlv_0= LeftParenthesis this_DisjunctionAttributeSet_1= ruleDisjunctionAttributeSet otherlv_2= RightParenthesis ) ;
    public final EObject ruleParenthesizedAttributeSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_DisjunctionAttributeSet_1 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1542:2: ( (otherlv_0= LeftParenthesis this_DisjunctionAttributeSet_1= ruleDisjunctionAttributeSet otherlv_2= RightParenthesis ) )
            // InternalEclParser.g:1543:2: (otherlv_0= LeftParenthesis this_DisjunctionAttributeSet_1= ruleDisjunctionAttributeSet otherlv_2= RightParenthesis )
            {
            // InternalEclParser.g:1543:2: (otherlv_0= LeftParenthesis this_DisjunctionAttributeSet_1= ruleDisjunctionAttributeSet otherlv_2= RightParenthesis )
            // InternalEclParser.g:1544:3: otherlv_0= LeftParenthesis this_DisjunctionAttributeSet_1= ruleDisjunctionAttributeSet otherlv_2= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParenthesizedAttributeSetAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParenthesizedAttributeSetAccess().getDisjunctionAttributeSetParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_20);
            this_DisjunctionAttributeSet_1=ruleDisjunctionAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DisjunctionAttributeSet_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getParenthesizedAttributeSetAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParenthesizedAttributeSet"


    // $ANTLR start "entryRuleAttributeGroup"
    // InternalEclParser.g:1567:1: entryRuleAttributeGroup returns [EObject current=null] : iv_ruleAttributeGroup= ruleAttributeGroup EOF ;
    public final EObject entryRuleAttributeGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeGroup = null;


        try {
            // InternalEclParser.g:1567:55: (iv_ruleAttributeGroup= ruleAttributeGroup EOF )
            // InternalEclParser.g:1568:2: iv_ruleAttributeGroup= ruleAttributeGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeGroupRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttributeGroup=ruleAttributeGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeGroup; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeGroup"


    // $ANTLR start "ruleAttributeGroup"
    // InternalEclParser.g:1574:1: ruleAttributeGroup returns [EObject current=null] : ( ( (lv_cardinality_0_0= ruleCardinality ) )? otherlv_1= LeftCurlyBracket ( (lv_attributeSet_2_0= ruleDisjunctionAttributeSet ) ) otherlv_3= RightCurlyBracket ) ;
    public final EObject ruleAttributeGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_cardinality_0_0 = null;

        EObject lv_attributeSet_2_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1580:2: ( ( ( (lv_cardinality_0_0= ruleCardinality ) )? otherlv_1= LeftCurlyBracket ( (lv_attributeSet_2_0= ruleDisjunctionAttributeSet ) ) otherlv_3= RightCurlyBracket ) )
            // InternalEclParser.g:1581:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? otherlv_1= LeftCurlyBracket ( (lv_attributeSet_2_0= ruleDisjunctionAttributeSet ) ) otherlv_3= RightCurlyBracket )
            {
            // InternalEclParser.g:1581:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? otherlv_1= LeftCurlyBracket ( (lv_attributeSet_2_0= ruleDisjunctionAttributeSet ) ) otherlv_3= RightCurlyBracket )
            // InternalEclParser.g:1582:3: ( (lv_cardinality_0_0= ruleCardinality ) )? otherlv_1= LeftCurlyBracket ( (lv_attributeSet_2_0= ruleDisjunctionAttributeSet ) ) otherlv_3= RightCurlyBracket
            {
            // InternalEclParser.g:1582:3: ( (lv_cardinality_0_0= ruleCardinality ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==LeftSquareBracket) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEclParser.g:1583:4: (lv_cardinality_0_0= ruleCardinality )
                    {
                    // InternalEclParser.g:1583:4: (lv_cardinality_0_0= ruleCardinality )
                    // InternalEclParser.g:1584:5: lv_cardinality_0_0= ruleCardinality
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAttributeGroupAccess().getCardinalityCardinalityParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_21);
                    lv_cardinality_0_0=ruleCardinality();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAttributeGroupRule());
                      					}
                      					set(
                      						current,
                      						"cardinality",
                      						lv_cardinality_0_0,
                      						"org.akitta.snomed.ecl.Ecl.Cardinality");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAttributeGroupAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalEclParser.g:1605:3: ( (lv_attributeSet_2_0= ruleDisjunctionAttributeSet ) )
            // InternalEclParser.g:1606:4: (lv_attributeSet_2_0= ruleDisjunctionAttributeSet )
            {
            // InternalEclParser.g:1606:4: (lv_attributeSet_2_0= ruleDisjunctionAttributeSet )
            // InternalEclParser.g:1607:5: lv_attributeSet_2_0= ruleDisjunctionAttributeSet
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeGroupAccess().getAttributeSetDisjunctionAttributeSetParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_22);
            lv_attributeSet_2_0=ruleDisjunctionAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeGroupRule());
              					}
              					set(
              						current,
              						"attributeSet",
              						lv_attributeSet_2_0,
              						"org.akitta.snomed.ecl.Ecl.DisjunctionAttributeSet");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,RightCurlyBracket,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAttributeGroupAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAttributeGroup"


    // $ANTLR start "entryRuleParenthesizedRefinement"
    // InternalEclParser.g:1632:1: entryRuleParenthesizedRefinement returns [EObject current=null] : iv_ruleParenthesizedRefinement= ruleParenthesizedRefinement EOF ;
    public final EObject entryRuleParenthesizedRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedRefinement = null;


        try {
            // InternalEclParser.g:1632:64: (iv_ruleParenthesizedRefinement= ruleParenthesizedRefinement EOF )
            // InternalEclParser.g:1633:2: iv_ruleParenthesizedRefinement= ruleParenthesizedRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParenthesizedRefinement=ruleParenthesizedRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedRefinement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParenthesizedRefinement"


    // $ANTLR start "ruleParenthesizedRefinement"
    // InternalEclParser.g:1639:1: ruleParenthesizedRefinement returns [EObject current=null] : (otherlv_0= LeftParenthesis this_Refinement_1= ruleRefinement otherlv_2= RightParenthesis ) ;
    public final EObject ruleParenthesizedRefinement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Refinement_1 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1645:2: ( (otherlv_0= LeftParenthesis this_Refinement_1= ruleRefinement otherlv_2= RightParenthesis ) )
            // InternalEclParser.g:1646:2: (otherlv_0= LeftParenthesis this_Refinement_1= ruleRefinement otherlv_2= RightParenthesis )
            {
            // InternalEclParser.g:1646:2: (otherlv_0= LeftParenthesis this_Refinement_1= ruleRefinement otherlv_2= RightParenthesis )
            // InternalEclParser.g:1647:3: otherlv_0= LeftParenthesis this_Refinement_1= ruleRefinement otherlv_2= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParenthesizedRefinementAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParenthesizedRefinementAccess().getRefinementParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_20);
            this_Refinement_1=ruleRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Refinement_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getParenthesizedRefinementAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParenthesizedRefinement"


    // $ANTLR start "entryRulePrimaryExpressionConstraint"
    // InternalEclParser.g:1670:1: entryRulePrimaryExpressionConstraint returns [EObject current=null] : iv_rulePrimaryExpressionConstraint= rulePrimaryExpressionConstraint EOF ;
    public final EObject entryRulePrimaryExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpressionConstraint = null;


        try {
            // InternalEclParser.g:1670:68: (iv_rulePrimaryExpressionConstraint= rulePrimaryExpressionConstraint EOF )
            // InternalEclParser.g:1671:2: iv_rulePrimaryExpressionConstraint= rulePrimaryExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimaryExpressionConstraint=rulePrimaryExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpressionConstraint"


    // $ANTLR start "rulePrimaryExpressionConstraint"
    // InternalEclParser.g:1677:1: rulePrimaryExpressionConstraint returns [EObject current=null] : (this_SimpleExpressionConstraint_0= ruleSimpleExpressionConstraint | (otherlv_1= LeftParenthesis this_ExpressionConstraint_2= ruleExpressionConstraint () otherlv_4= RightParenthesis ) ) ;
    public final EObject rulePrimaryExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_SimpleExpressionConstraint_0 = null;

        EObject this_ExpressionConstraint_2 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1683:2: ( (this_SimpleExpressionConstraint_0= ruleSimpleExpressionConstraint | (otherlv_1= LeftParenthesis this_ExpressionConstraint_2= ruleExpressionConstraint () otherlv_4= RightParenthesis ) ) )
            // InternalEclParser.g:1684:2: (this_SimpleExpressionConstraint_0= ruleSimpleExpressionConstraint | (otherlv_1= LeftParenthesis this_ExpressionConstraint_2= ruleExpressionConstraint () otherlv_4= RightParenthesis ) )
            {
            // InternalEclParser.g:1684:2: (this_SimpleExpressionConstraint_0= ruleSimpleExpressionConstraint | (otherlv_1= LeftParenthesis this_ExpressionConstraint_2= ruleExpressionConstraint () otherlv_4= RightParenthesis ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==LessThanSignLessThanSign||LA20_0==GreaterThanSignGreaterThanSign||LA20_0==Asterisk||LA20_0==LessThanSign||LA20_0==GreaterThanSign||LA20_0==CircumflexAccent||LA20_0==RULE_INT) ) {
                alt20=1;
            }
            else if ( (LA20_0==LeftParenthesis) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalEclParser.g:1685:3: this_SimpleExpressionConstraint_0= ruleSimpleExpressionConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpressionConstraintAccess().getSimpleExpressionConstraintParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SimpleExpressionConstraint_0=ruleSimpleExpressionConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SimpleExpressionConstraint_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1697:3: (otherlv_1= LeftParenthesis this_ExpressionConstraint_2= ruleExpressionConstraint () otherlv_4= RightParenthesis )
                    {
                    // InternalEclParser.g:1697:3: (otherlv_1= LeftParenthesis this_ExpressionConstraint_2= ruleExpressionConstraint () otherlv_4= RightParenthesis )
                    // InternalEclParser.g:1698:4: otherlv_1= LeftParenthesis this_ExpressionConstraint_2= ruleExpressionConstraint () otherlv_4= RightParenthesis
                    {
                    otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionConstraintAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpressionConstraintAccess().getExpressionConstraintParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_20);
                    this_ExpressionConstraint_2=ruleExpressionConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ExpressionConstraint_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalEclParser.g:1713:4: ()
                    // InternalEclParser.g:1714:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getPrimaryExpressionConstraintAccess().getParenthesizedExpressionConstraintCurrentAction_1_2(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionConstraintAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimaryExpressionConstraint"


    // $ANTLR start "entryRuleSimpleExpressionConstraint"
    // InternalEclParser.g:1732:1: entryRuleSimpleExpressionConstraint returns [EObject current=null] : iv_ruleSimpleExpressionConstraint= ruleSimpleExpressionConstraint EOF ;
    public final EObject entryRuleSimpleExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpressionConstraint = null;


        try {
            // InternalEclParser.g:1732:67: (iv_ruleSimpleExpressionConstraint= ruleSimpleExpressionConstraint EOF )
            // InternalEclParser.g:1733:2: iv_ruleSimpleExpressionConstraint= ruleSimpleExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSimpleExpressionConstraint=ruleSimpleExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleExpressionConstraint"


    // $ANTLR start "ruleSimpleExpressionConstraint"
    // InternalEclParser.g:1739:1: ruleSimpleExpressionConstraint returns [EObject current=null] : ( ( (lv_op_0_0= ruleConstraintOperator ) )? ( (lv_concept_1_0= ruleFocusConcept ) ) ) ;
    public final EObject ruleSimpleExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Enumerator lv_op_0_0 = null;

        EObject lv_concept_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1745:2: ( ( ( (lv_op_0_0= ruleConstraintOperator ) )? ( (lv_concept_1_0= ruleFocusConcept ) ) ) )
            // InternalEclParser.g:1746:2: ( ( (lv_op_0_0= ruleConstraintOperator ) )? ( (lv_concept_1_0= ruleFocusConcept ) ) )
            {
            // InternalEclParser.g:1746:2: ( ( (lv_op_0_0= ruleConstraintOperator ) )? ( (lv_concept_1_0= ruleFocusConcept ) ) )
            // InternalEclParser.g:1747:3: ( (lv_op_0_0= ruleConstraintOperator ) )? ( (lv_concept_1_0= ruleFocusConcept ) )
            {
            // InternalEclParser.g:1747:3: ( (lv_op_0_0= ruleConstraintOperator ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LessThanSignLessThanSign||LA21_0==GreaterThanSignGreaterThanSign||LA21_0==LessThanSign||LA21_0==GreaterThanSign) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEclParser.g:1748:4: (lv_op_0_0= ruleConstraintOperator )
                    {
                    // InternalEclParser.g:1748:4: (lv_op_0_0= ruleConstraintOperator )
                    // InternalEclParser.g:1749:5: lv_op_0_0= ruleConstraintOperator
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimpleExpressionConstraintAccess().getOpConstraintOperatorEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_23);
                    lv_op_0_0=ruleConstraintOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSimpleExpressionConstraintRule());
                      					}
                      					set(
                      						current,
                      						"op",
                      						lv_op_0_0,
                      						"org.akitta.snomed.ecl.Ecl.ConstraintOperator");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEclParser.g:1766:3: ( (lv_concept_1_0= ruleFocusConcept ) )
            // InternalEclParser.g:1767:4: (lv_concept_1_0= ruleFocusConcept )
            {
            // InternalEclParser.g:1767:4: (lv_concept_1_0= ruleFocusConcept )
            // InternalEclParser.g:1768:5: lv_concept_1_0= ruleFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSimpleExpressionConstraintAccess().getConceptFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_concept_1_0=ruleFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSimpleExpressionConstraintRule());
              					}
              					set(
              						current,
              						"concept",
              						lv_concept_1_0,
              						"org.akitta.snomed.ecl.Ecl.FocusConcept");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSimpleExpressionConstraint"


    // $ANTLR start "entryRuleFocusConcept"
    // InternalEclParser.g:1789:1: entryRuleFocusConcept returns [EObject current=null] : iv_ruleFocusConcept= ruleFocusConcept EOF ;
    public final EObject entryRuleFocusConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFocusConcept = null;


        try {
            // InternalEclParser.g:1789:53: (iv_ruleFocusConcept= ruleFocusConcept EOF )
            // InternalEclParser.g:1790:2: iv_ruleFocusConcept= ruleFocusConcept EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFocusConceptRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFocusConcept=ruleFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFocusConcept; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFocusConcept"


    // $ANTLR start "ruleFocusConcept"
    // InternalEclParser.g:1796:1: ruleFocusConcept returns [EObject current=null] : ( ( (lv_memberOf_0_0= CircumflexAccent ) )? ( ( (lv_conceptRef_1_0= ruleConceptReference ) ) | ( (lv_wildcard_2_0= Asterisk ) ) ) ) ;
    public final EObject ruleFocusConcept() throws RecognitionException {
        EObject current = null;

        Token lv_memberOf_0_0=null;
        Token lv_wildcard_2_0=null;
        EObject lv_conceptRef_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1802:2: ( ( ( (lv_memberOf_0_0= CircumflexAccent ) )? ( ( (lv_conceptRef_1_0= ruleConceptReference ) ) | ( (lv_wildcard_2_0= Asterisk ) ) ) ) )
            // InternalEclParser.g:1803:2: ( ( (lv_memberOf_0_0= CircumflexAccent ) )? ( ( (lv_conceptRef_1_0= ruleConceptReference ) ) | ( (lv_wildcard_2_0= Asterisk ) ) ) )
            {
            // InternalEclParser.g:1803:2: ( ( (lv_memberOf_0_0= CircumflexAccent ) )? ( ( (lv_conceptRef_1_0= ruleConceptReference ) ) | ( (lv_wildcard_2_0= Asterisk ) ) ) )
            // InternalEclParser.g:1804:3: ( (lv_memberOf_0_0= CircumflexAccent ) )? ( ( (lv_conceptRef_1_0= ruleConceptReference ) ) | ( (lv_wildcard_2_0= Asterisk ) ) )
            {
            // InternalEclParser.g:1804:3: ( (lv_memberOf_0_0= CircumflexAccent ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==CircumflexAccent) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalEclParser.g:1805:4: (lv_memberOf_0_0= CircumflexAccent )
                    {
                    // InternalEclParser.g:1805:4: (lv_memberOf_0_0= CircumflexAccent )
                    // InternalEclParser.g:1806:5: lv_memberOf_0_0= CircumflexAccent
                    {
                    lv_memberOf_0_0=(Token)match(input,CircumflexAccent,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_memberOf_0_0, grammarAccess.getFocusConceptAccess().getMemberOfCircumflexAccentKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFocusConceptRule());
                      					}
                      					setWithLastConsumed(current, "memberOf", true, "^");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEclParser.g:1818:3: ( ( (lv_conceptRef_1_0= ruleConceptReference ) ) | ( (lv_wildcard_2_0= Asterisk ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                alt23=1;
            }
            else if ( (LA23_0==Asterisk) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalEclParser.g:1819:4: ( (lv_conceptRef_1_0= ruleConceptReference ) )
                    {
                    // InternalEclParser.g:1819:4: ( (lv_conceptRef_1_0= ruleConceptReference ) )
                    // InternalEclParser.g:1820:5: (lv_conceptRef_1_0= ruleConceptReference )
                    {
                    // InternalEclParser.g:1820:5: (lv_conceptRef_1_0= ruleConceptReference )
                    // InternalEclParser.g:1821:6: lv_conceptRef_1_0= ruleConceptReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFocusConceptAccess().getConceptRefConceptReferenceParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_conceptRef_1_0=ruleConceptReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFocusConceptRule());
                      						}
                      						set(
                      							current,
                      							"conceptRef",
                      							lv_conceptRef_1_0,
                      							"org.akitta.snomed.ecl.Ecl.ConceptReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1839:4: ( (lv_wildcard_2_0= Asterisk ) )
                    {
                    // InternalEclParser.g:1839:4: ( (lv_wildcard_2_0= Asterisk ) )
                    // InternalEclParser.g:1840:5: (lv_wildcard_2_0= Asterisk )
                    {
                    // InternalEclParser.g:1840:5: (lv_wildcard_2_0= Asterisk )
                    // InternalEclParser.g:1841:6: lv_wildcard_2_0= Asterisk
                    {
                    lv_wildcard_2_0=(Token)match(input,Asterisk,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_wildcard_2_0, grammarAccess.getFocusConceptAccess().getWildcardAsteriskKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFocusConceptRule());
                      						}
                      						setWithLastConsumed(current, "wildcard", true, "*");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFocusConcept"


    // $ANTLR start "entryRuleConceptReference"
    // InternalEclParser.g:1858:1: entryRuleConceptReference returns [EObject current=null] : iv_ruleConceptReference= ruleConceptReference EOF ;
    public final EObject entryRuleConceptReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptReference = null;


        try {
            // InternalEclParser.g:1858:57: (iv_ruleConceptReference= ruleConceptReference EOF )
            // InternalEclParser.g:1859:2: iv_ruleConceptReference= ruleConceptReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConceptReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConceptReference=ruleConceptReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConceptReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConceptReference"


    // $ANTLR start "ruleConceptReference"
    // InternalEclParser.g:1865:1: ruleConceptReference returns [EObject current=null] : ( ( (lv_id_0_0= ruleConceptID ) ) ( (lv_term_1_0= RULE_TERM_STRING ) )? ) ;
    public final EObject ruleConceptReference() throws RecognitionException {
        EObject current = null;

        Token lv_term_1_0=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1871:2: ( ( ( (lv_id_0_0= ruleConceptID ) ) ( (lv_term_1_0= RULE_TERM_STRING ) )? ) )
            // InternalEclParser.g:1872:2: ( ( (lv_id_0_0= ruleConceptID ) ) ( (lv_term_1_0= RULE_TERM_STRING ) )? )
            {
            // InternalEclParser.g:1872:2: ( ( (lv_id_0_0= ruleConceptID ) ) ( (lv_term_1_0= RULE_TERM_STRING ) )? )
            // InternalEclParser.g:1873:3: ( (lv_id_0_0= ruleConceptID ) ) ( (lv_term_1_0= RULE_TERM_STRING ) )?
            {
            // InternalEclParser.g:1873:3: ( (lv_id_0_0= ruleConceptID ) )
            // InternalEclParser.g:1874:4: (lv_id_0_0= ruleConceptID )
            {
            // InternalEclParser.g:1874:4: (lv_id_0_0= ruleConceptID )
            // InternalEclParser.g:1875:5: lv_id_0_0= ruleConceptID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConceptReferenceAccess().getIdConceptIDParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_24);
            lv_id_0_0=ruleConceptID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConceptReferenceRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_0_0,
              						"org.akitta.snomed.ecl.Ecl.ConceptID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEclParser.g:1892:3: ( (lv_term_1_0= RULE_TERM_STRING ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_TERM_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEclParser.g:1893:4: (lv_term_1_0= RULE_TERM_STRING )
                    {
                    // InternalEclParser.g:1893:4: (lv_term_1_0= RULE_TERM_STRING )
                    // InternalEclParser.g:1894:5: lv_term_1_0= RULE_TERM_STRING
                    {
                    lv_term_1_0=(Token)match(input,RULE_TERM_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_term_1_0, grammarAccess.getConceptReferenceAccess().getTermTERM_STRINGTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getConceptReferenceRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"term",
                      						lv_term_1_0,
                      						"org.akitta.snomed.ecl.Ecl.TERM_STRING");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConceptReference"


    // $ANTLR start "entryRuleConceptID"
    // InternalEclParser.g:1914:1: entryRuleConceptID returns [String current=null] : iv_ruleConceptID= ruleConceptID EOF ;
    public final String entryRuleConceptID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConceptID = null;


        try {
            // InternalEclParser.g:1914:49: (iv_ruleConceptID= ruleConceptID EOF )
            // InternalEclParser.g:1915:2: iv_ruleConceptID= ruleConceptID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConceptIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConceptID=ruleConceptID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConceptID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConceptID"


    // $ANTLR start "ruleConceptID"
    // InternalEclParser.g:1921:1: ruleConceptID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleConceptID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalEclParser.g:1927:2: (this_INT_0= RULE_INT )
            // InternalEclParser.g:1928:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_INT_0, grammarAccess.getConceptIDAccess().getINTTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConceptID"


    // $ANTLR start "ruleExpressionComparisonOperator"
    // InternalEclParser.g:1938:1: ruleExpressionComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) ) ;
    public final Enumerator ruleExpressionComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEclParser.g:1944:2: ( ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) ) )
            // InternalEclParser.g:1945:2: ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) )
            {
            // InternalEclParser.g:1945:2: ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==EqualsSign) ) {
                alt25=1;
            }
            else if ( (LA25_0==ExclamationMarkEqualsSign) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalEclParser.g:1946:3: (enumLiteral_0= EqualsSign )
                    {
                    // InternalEclParser.g:1946:3: (enumLiteral_0= EqualsSign )
                    // InternalEclParser.g:1947:4: enumLiteral_0= EqualsSign
                    {
                    enumLiteral_0=(Token)match(input,EqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getExpressionComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getExpressionComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1954:3: (enumLiteral_1= ExclamationMarkEqualsSign )
                    {
                    // InternalEclParser.g:1954:3: (enumLiteral_1= ExclamationMarkEqualsSign )
                    // InternalEclParser.g:1955:4: enumLiteral_1= ExclamationMarkEqualsSign
                    {
                    enumLiteral_1=(Token)match(input,ExclamationMarkEqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getExpressionComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getExpressionComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionComparisonOperator"


    // $ANTLR start "ruleStringComparisonOperator"
    // InternalEclParser.g:1965:1: ruleStringComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) ) ;
    public final Enumerator ruleStringComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEclParser.g:1971:2: ( ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) ) )
            // InternalEclParser.g:1972:2: ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) )
            {
            // InternalEclParser.g:1972:2: ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==EqualsSign) ) {
                alt26=1;
            }
            else if ( (LA26_0==ExclamationMarkEqualsSign) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalEclParser.g:1973:3: (enumLiteral_0= EqualsSign )
                    {
                    // InternalEclParser.g:1973:3: (enumLiteral_0= EqualsSign )
                    // InternalEclParser.g:1974:4: enumLiteral_0= EqualsSign
                    {
                    enumLiteral_0=(Token)match(input,EqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getStringComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getStringComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1981:3: (enumLiteral_1= ExclamationMarkEqualsSign )
                    {
                    // InternalEclParser.g:1981:3: (enumLiteral_1= ExclamationMarkEqualsSign )
                    // InternalEclParser.g:1982:4: enumLiteral_1= ExclamationMarkEqualsSign
                    {
                    enumLiteral_1=(Token)match(input,ExclamationMarkEqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getStringComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getStringComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStringComparisonOperator"


    // $ANTLR start "ruleNumericComparisonOperator"
    // InternalEclParser.g:1992:1: ruleNumericComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) | (enumLiteral_2= LessThanSign ) | (enumLiteral_3= LessThanSignEqualsSign ) | (enumLiteral_4= GreaterThanSign ) | (enumLiteral_5= GreaterThanSignEqualsSign ) ) ;
    public final Enumerator ruleNumericComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalEclParser.g:1998:2: ( ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) | (enumLiteral_2= LessThanSign ) | (enumLiteral_3= LessThanSignEqualsSign ) | (enumLiteral_4= GreaterThanSign ) | (enumLiteral_5= GreaterThanSignEqualsSign ) ) )
            // InternalEclParser.g:1999:2: ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) | (enumLiteral_2= LessThanSign ) | (enumLiteral_3= LessThanSignEqualsSign ) | (enumLiteral_4= GreaterThanSign ) | (enumLiteral_5= GreaterThanSignEqualsSign ) )
            {
            // InternalEclParser.g:1999:2: ( (enumLiteral_0= EqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) | (enumLiteral_2= LessThanSign ) | (enumLiteral_3= LessThanSignEqualsSign ) | (enumLiteral_4= GreaterThanSign ) | (enumLiteral_5= GreaterThanSignEqualsSign ) )
            int alt27=6;
            switch ( input.LA(1) ) {
            case EqualsSign:
                {
                alt27=1;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt27=2;
                }
                break;
            case LessThanSign:
                {
                alt27=3;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt27=4;
                }
                break;
            case GreaterThanSign:
                {
                alt27=5;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt27=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalEclParser.g:2000:3: (enumLiteral_0= EqualsSign )
                    {
                    // InternalEclParser.g:2000:3: (enumLiteral_0= EqualsSign )
                    // InternalEclParser.g:2001:4: enumLiteral_0= EqualsSign
                    {
                    enumLiteral_0=(Token)match(input,EqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNumericComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getNumericComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:2008:3: (enumLiteral_1= ExclamationMarkEqualsSign )
                    {
                    // InternalEclParser.g:2008:3: (enumLiteral_1= ExclamationMarkEqualsSign )
                    // InternalEclParser.g:2009:4: enumLiteral_1= ExclamationMarkEqualsSign
                    {
                    enumLiteral_1=(Token)match(input,ExclamationMarkEqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNumericComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getNumericComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEclParser.g:2016:3: (enumLiteral_2= LessThanSign )
                    {
                    // InternalEclParser.g:2016:3: (enumLiteral_2= LessThanSign )
                    // InternalEclParser.g:2017:4: enumLiteral_2= LessThanSign
                    {
                    enumLiteral_2=(Token)match(input,LessThanSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNumericComparisonOperatorAccess().getLESS_THANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getNumericComparisonOperatorAccess().getLESS_THANEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEclParser.g:2024:3: (enumLiteral_3= LessThanSignEqualsSign )
                    {
                    // InternalEclParser.g:2024:3: (enumLiteral_3= LessThanSignEqualsSign )
                    // InternalEclParser.g:2025:4: enumLiteral_3= LessThanSignEqualsSign
                    {
                    enumLiteral_3=(Token)match(input,LessThanSignEqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNumericComparisonOperatorAccess().getLESS_THAN_EQUALSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getNumericComparisonOperatorAccess().getLESS_THAN_EQUALSEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEclParser.g:2032:3: (enumLiteral_4= GreaterThanSign )
                    {
                    // InternalEclParser.g:2032:3: (enumLiteral_4= GreaterThanSign )
                    // InternalEclParser.g:2033:4: enumLiteral_4= GreaterThanSign
                    {
                    enumLiteral_4=(Token)match(input,GreaterThanSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNumericComparisonOperatorAccess().getGREATER_THANEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getNumericComparisonOperatorAccess().getGREATER_THANEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalEclParser.g:2040:3: (enumLiteral_5= GreaterThanSignEqualsSign )
                    {
                    // InternalEclParser.g:2040:3: (enumLiteral_5= GreaterThanSignEqualsSign )
                    // InternalEclParser.g:2041:4: enumLiteral_5= GreaterThanSignEqualsSign
                    {
                    enumLiteral_5=(Token)match(input,GreaterThanSignEqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNumericComparisonOperatorAccess().getGREATER_THAN_EQUALSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getNumericComparisonOperatorAccess().getGREATER_THAN_EQUALSEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNumericComparisonOperator"


    // $ANTLR start "ruleConstraintOperator"
    // InternalEclParser.g:2051:1: ruleConstraintOperator returns [Enumerator current=null] : ( (enumLiteral_0= LessThanSign ) | (enumLiteral_1= LessThanSignLessThanSign ) | (enumLiteral_2= GreaterThanSign ) | (enumLiteral_3= GreaterThanSignGreaterThanSign ) ) ;
    public final Enumerator ruleConstraintOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalEclParser.g:2057:2: ( ( (enumLiteral_0= LessThanSign ) | (enumLiteral_1= LessThanSignLessThanSign ) | (enumLiteral_2= GreaterThanSign ) | (enumLiteral_3= GreaterThanSignGreaterThanSign ) ) )
            // InternalEclParser.g:2058:2: ( (enumLiteral_0= LessThanSign ) | (enumLiteral_1= LessThanSignLessThanSign ) | (enumLiteral_2= GreaterThanSign ) | (enumLiteral_3= GreaterThanSignGreaterThanSign ) )
            {
            // InternalEclParser.g:2058:2: ( (enumLiteral_0= LessThanSign ) | (enumLiteral_1= LessThanSignLessThanSign ) | (enumLiteral_2= GreaterThanSign ) | (enumLiteral_3= GreaterThanSignGreaterThanSign ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case LessThanSign:
                {
                alt28=1;
                }
                break;
            case LessThanSignLessThanSign:
                {
                alt28=2;
                }
                break;
            case GreaterThanSign:
                {
                alt28=3;
                }
                break;
            case GreaterThanSignGreaterThanSign:
                {
                alt28=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalEclParser.g:2059:3: (enumLiteral_0= LessThanSign )
                    {
                    // InternalEclParser.g:2059:3: (enumLiteral_0= LessThanSign )
                    // InternalEclParser.g:2060:4: enumLiteral_0= LessThanSign
                    {
                    enumLiteral_0=(Token)match(input,LessThanSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getConstraintOperatorAccess().getDESCENDANTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getConstraintOperatorAccess().getDESCENDANTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:2067:3: (enumLiteral_1= LessThanSignLessThanSign )
                    {
                    // InternalEclParser.g:2067:3: (enumLiteral_1= LessThanSignLessThanSign )
                    // InternalEclParser.g:2068:4: enumLiteral_1= LessThanSignLessThanSign
                    {
                    enumLiteral_1=(Token)match(input,LessThanSignLessThanSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getConstraintOperatorAccess().getDESCENDANT_OR_SELFEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getConstraintOperatorAccess().getDESCENDANT_OR_SELFEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEclParser.g:2075:3: (enumLiteral_2= GreaterThanSign )
                    {
                    // InternalEclParser.g:2075:3: (enumLiteral_2= GreaterThanSign )
                    // InternalEclParser.g:2076:4: enumLiteral_2= GreaterThanSign
                    {
                    enumLiteral_2=(Token)match(input,GreaterThanSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getConstraintOperatorAccess().getANCESTOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getConstraintOperatorAccess().getANCESTOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEclParser.g:2083:3: (enumLiteral_3= GreaterThanSignGreaterThanSign )
                    {
                    // InternalEclParser.g:2083:3: (enumLiteral_3= GreaterThanSignGreaterThanSign )
                    // InternalEclParser.g:2084:4: enumLiteral_3= GreaterThanSignGreaterThanSign
                    {
                    enumLiteral_3=(Token)match(input,GreaterThanSignGreaterThanSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getConstraintOperatorAccess().getANCESTOR_OR_SELFEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getConstraintOperatorAccess().getANCESTOR_OR_SELFEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConstraintOperator"


    // $ANTLR start "ruleAttributeOperator"
    // InternalEclParser.g:2094:1: ruleAttributeOperator returns [Enumerator current=null] : ( (enumLiteral_0= LessThanSign ) | (enumLiteral_1= LessThanSignLessThanSign ) ) ;
    public final Enumerator ruleAttributeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEclParser.g:2100:2: ( ( (enumLiteral_0= LessThanSign ) | (enumLiteral_1= LessThanSignLessThanSign ) ) )
            // InternalEclParser.g:2101:2: ( (enumLiteral_0= LessThanSign ) | (enumLiteral_1= LessThanSignLessThanSign ) )
            {
            // InternalEclParser.g:2101:2: ( (enumLiteral_0= LessThanSign ) | (enumLiteral_1= LessThanSignLessThanSign ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==LessThanSign) ) {
                alt29=1;
            }
            else if ( (LA29_0==LessThanSignLessThanSign) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalEclParser.g:2102:3: (enumLiteral_0= LessThanSign )
                    {
                    // InternalEclParser.g:2102:3: (enumLiteral_0= LessThanSign )
                    // InternalEclParser.g:2103:4: enumLiteral_0= LessThanSign
                    {
                    enumLiteral_0=(Token)match(input,LessThanSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAttributeOperatorAccess().getDESCENDANTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAttributeOperatorAccess().getDESCENDANTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:2110:3: (enumLiteral_1= LessThanSignLessThanSign )
                    {
                    // InternalEclParser.g:2110:3: (enumLiteral_1= LessThanSignLessThanSign )
                    // InternalEclParser.g:2111:4: enumLiteral_1= LessThanSignLessThanSign
                    {
                    enumLiteral_1=(Token)match(input,LessThanSignLessThanSign,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAttributeOperatorAccess().getDESCENDANT_OR_SELFEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAttributeOperatorAccess().getDESCENDANT_OR_SELFEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAttributeOperator"


    // $ANTLR start "ruleConjunctionOperator"
    // InternalEclParser.g:2121:1: ruleConjunctionOperator returns [Enumerator current=null] : ( (enumLiteral_0= AND ) | (enumLiteral_1= Comma ) ) ;
    public final Enumerator ruleConjunctionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEclParser.g:2127:2: ( ( (enumLiteral_0= AND ) | (enumLiteral_1= Comma ) ) )
            // InternalEclParser.g:2128:2: ( (enumLiteral_0= AND ) | (enumLiteral_1= Comma ) )
            {
            // InternalEclParser.g:2128:2: ( (enumLiteral_0= AND ) | (enumLiteral_1= Comma ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==AND) ) {
                alt30=1;
            }
            else if ( (LA30_0==Comma) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalEclParser.g:2129:3: (enumLiteral_0= AND )
                    {
                    // InternalEclParser.g:2129:3: (enumLiteral_0= AND )
                    // InternalEclParser.g:2130:4: enumLiteral_0= AND
                    {
                    enumLiteral_0=(Token)match(input,AND,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getConjunctionOperatorAccess().getCONJUNCTIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getConjunctionOperatorAccess().getCONJUNCTIONEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:2137:3: (enumLiteral_1= Comma )
                    {
                    // InternalEclParser.g:2137:3: (enumLiteral_1= Comma )
                    // InternalEclParser.g:2138:4: enumLiteral_1= Comma
                    {
                    enumLiteral_1=(Token)match(input,Comma,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getConjunctionOperatorAccess().getCONJUNCTIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getConjunctionOperatorAccess().getCONJUNCTIONEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConjunctionOperator"


    // $ANTLR start "ruleDisjunctionOperator"
    // InternalEclParser.g:2148:1: ruleDisjunctionOperator returns [Enumerator current=null] : (enumLiteral_0= OR ) ;
    public final Enumerator ruleDisjunctionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalEclParser.g:2154:2: ( (enumLiteral_0= OR ) )
            // InternalEclParser.g:2155:2: (enumLiteral_0= OR )
            {
            // InternalEclParser.g:2155:2: (enumLiteral_0= OR )
            // InternalEclParser.g:2156:3: enumLiteral_0= OR
            {
            enumLiteral_0=(Token)match(input,OR,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getDisjunctionOperatorAccess().getDISJUNCTIONEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getDisjunctionOperatorAccess().getDISJUNCTIONEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDisjunctionOperator"


    // $ANTLR start "ruleExclusionOperator"
    // InternalEclParser.g:2165:1: ruleExclusionOperator returns [Enumerator current=null] : (enumLiteral_0= MINUS ) ;
    public final Enumerator ruleExclusionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalEclParser.g:2171:2: ( (enumLiteral_0= MINUS ) )
            // InternalEclParser.g:2172:2: (enumLiteral_0= MINUS )
            {
            // InternalEclParser.g:2172:2: (enumLiteral_0= MINUS )
            // InternalEclParser.g:2173:3: enumLiteral_0= MINUS
            {
            enumLiteral_0=(Token)match(input,MINUS,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getExclusionOperatorAccess().getEXCLUSIONEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getExclusionOperatorAccess().getEXCLUSIONEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExclusionOperator"

    // $ANTLR start synpred10_InternalEclParser
    public final void synpred10_InternalEclParser_fragment() throws RecognitionException {   
        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


        // InternalEclParser.g:530:4: ( ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleConjunctionRefinementSet ) ) )
        // InternalEclParser.g:530:4: ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleConjunctionRefinementSet ) )
        {
        // InternalEclParser.g:530:4: ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) )
        // InternalEclParser.g:531:5: ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) )
        {
        // InternalEclParser.g:541:5: ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) )
        // InternalEclParser.g:542:6: () ( (lv_op_2_0= ruleDisjunctionOperator ) )
        {
        // InternalEclParser.g:542:6: ()
        // InternalEclParser.g:543:7: 
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }

        }

        // InternalEclParser.g:552:6: ( (lv_op_2_0= ruleDisjunctionOperator ) )
        // InternalEclParser.g:553:7: (lv_op_2_0= ruleDisjunctionOperator )
        {
        // InternalEclParser.g:553:7: (lv_op_2_0= ruleDisjunctionOperator )
        // InternalEclParser.g:554:8: lv_op_2_0= ruleDisjunctionOperator
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDisjunctionRefinementSetAccess().getOpDisjunctionOperatorEnumRuleCall_1_0_0_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_8);
        lv_op_2_0=ruleDisjunctionOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }

        // InternalEclParser.g:573:4: ( (lv_right_3_0= ruleConjunctionRefinementSet ) )
        // InternalEclParser.g:574:5: (lv_right_3_0= ruleConjunctionRefinementSet )
        {
        // InternalEclParser.g:574:5: (lv_right_3_0= ruleConjunctionRefinementSet )
        // InternalEclParser.g:575:6: lv_right_3_0= ruleConjunctionRefinementSet
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getDisjunctionRefinementSetAccess().getRightConjunctionRefinementSetParserRuleCall_1_1_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_right_3_0=ruleConjunctionRefinementSet();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred10_InternalEclParser

    // $ANTLR start synpred12_InternalEclParser
    public final void synpred12_InternalEclParser_fragment() throws RecognitionException {   
        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


        // InternalEclParser.g:624:4: ( ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleSubRefinement ) ) )
        // InternalEclParser.g:624:4: ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleSubRefinement ) )
        {
        // InternalEclParser.g:624:4: ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) )
        // InternalEclParser.g:625:5: ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) )
        {
        // InternalEclParser.g:635:5: ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) )
        // InternalEclParser.g:636:6: () ( (lv_op_2_0= ruleConjunctionOperator ) )
        {
        // InternalEclParser.g:636:6: ()
        // InternalEclParser.g:637:7: 
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }

        }

        // InternalEclParser.g:646:6: ( (lv_op_2_0= ruleConjunctionOperator ) )
        // InternalEclParser.g:647:7: (lv_op_2_0= ruleConjunctionOperator )
        {
        // InternalEclParser.g:647:7: (lv_op_2_0= ruleConjunctionOperator )
        // InternalEclParser.g:648:8: lv_op_2_0= ruleConjunctionOperator
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getConjunctionRefinementSetAccess().getOpConjunctionOperatorEnumRuleCall_1_0_0_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_8);
        lv_op_2_0=ruleConjunctionOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }

        // InternalEclParser.g:667:4: ( (lv_right_3_0= ruleSubRefinement ) )
        // InternalEclParser.g:668:5: (lv_right_3_0= ruleSubRefinement )
        {
        // InternalEclParser.g:668:5: (lv_right_3_0= ruleSubRefinement )
        // InternalEclParser.g:669:6: lv_right_3_0= ruleSubRefinement
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getConjunctionRefinementSetAccess().getRightSubRefinementParserRuleCall_1_1_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_right_3_0=ruleSubRefinement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalEclParser

    // $ANTLR start synpred13_InternalEclParser
    public final void synpred13_InternalEclParser_fragment() throws RecognitionException {   
        EObject this_AttributeSetRefinement_0 = null;


        // InternalEclParser.g:706:3: (this_AttributeSetRefinement_0= ruleAttributeSetRefinement )
        // InternalEclParser.g:706:3: this_AttributeSetRefinement_0= ruleAttributeSetRefinement
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_AttributeSetRefinement_0=ruleAttributeSetRefinement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalEclParser

    // $ANTLR start synpred14_InternalEclParser
    public final void synpred14_InternalEclParser_fragment() throws RecognitionException {   
        EObject this_AttributeGroupRefinement_1 = null;


        // InternalEclParser.g:718:3: (this_AttributeGroupRefinement_1= ruleAttributeGroupRefinement )
        // InternalEclParser.g:718:3: this_AttributeGroupRefinement_1= ruleAttributeGroupRefinement
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_AttributeGroupRefinement_1=ruleAttributeGroupRefinement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalEclParser

    // $ANTLR start synpred16_InternalEclParser
    public final void synpred16_InternalEclParser_fragment() throws RecognitionException {   
        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


        // InternalEclParser.g:844:4: ( ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleConjunctionAttributeSet ) ) )
        // InternalEclParser.g:844:4: ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) ) ( (lv_right_3_0= ruleConjunctionAttributeSet ) )
        {
        // InternalEclParser.g:844:4: ( ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) ) )
        // InternalEclParser.g:845:5: ( ( () ( ( ruleDisjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) )
        {
        // InternalEclParser.g:855:5: ( () ( (lv_op_2_0= ruleDisjunctionOperator ) ) )
        // InternalEclParser.g:856:6: () ( (lv_op_2_0= ruleDisjunctionOperator ) )
        {
        // InternalEclParser.g:856:6: ()
        // InternalEclParser.g:857:7: 
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }

        }

        // InternalEclParser.g:866:6: ( (lv_op_2_0= ruleDisjunctionOperator ) )
        // InternalEclParser.g:867:7: (lv_op_2_0= ruleDisjunctionOperator )
        {
        // InternalEclParser.g:867:7: (lv_op_2_0= ruleDisjunctionOperator )
        // InternalEclParser.g:868:8: lv_op_2_0= ruleDisjunctionOperator
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDisjunctionAttributeSetAccess().getOpDisjunctionOperatorEnumRuleCall_1_0_0_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_9);
        lv_op_2_0=ruleDisjunctionOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }

        // InternalEclParser.g:887:4: ( (lv_right_3_0= ruleConjunctionAttributeSet ) )
        // InternalEclParser.g:888:5: (lv_right_3_0= ruleConjunctionAttributeSet )
        {
        // InternalEclParser.g:888:5: (lv_right_3_0= ruleConjunctionAttributeSet )
        // InternalEclParser.g:889:6: lv_right_3_0= ruleConjunctionAttributeSet
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getDisjunctionAttributeSetAccess().getRightConjunctionAttributeSetParserRuleCall_1_1_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_right_3_0=ruleConjunctionAttributeSet();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred16_InternalEclParser

    // $ANTLR start synpred18_InternalEclParser
    public final void synpred18_InternalEclParser_fragment() throws RecognitionException {   
        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


        // InternalEclParser.g:938:4: ( ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) ) ( (lv_right_3_0= rulePrimaryAttributeSet ) ) )
        // InternalEclParser.g:938:4: ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) ) ( (lv_right_3_0= rulePrimaryAttributeSet ) )
        {
        // InternalEclParser.g:938:4: ( ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) ) )
        // InternalEclParser.g:939:5: ( ( () ( ( ruleConjunctionOperator ) ) ) )=> ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) )
        {
        // InternalEclParser.g:949:5: ( () ( (lv_op_2_0= ruleConjunctionOperator ) ) )
        // InternalEclParser.g:950:6: () ( (lv_op_2_0= ruleConjunctionOperator ) )
        {
        // InternalEclParser.g:950:6: ()
        // InternalEclParser.g:951:7: 
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }

        }

        // InternalEclParser.g:960:6: ( (lv_op_2_0= ruleConjunctionOperator ) )
        // InternalEclParser.g:961:7: (lv_op_2_0= ruleConjunctionOperator )
        {
        // InternalEclParser.g:961:7: (lv_op_2_0= ruleConjunctionOperator )
        // InternalEclParser.g:962:8: lv_op_2_0= ruleConjunctionOperator
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getConjunctionAttributeSetAccess().getOpConjunctionOperatorEnumRuleCall_1_0_0_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_9);
        lv_op_2_0=ruleConjunctionOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }

        // InternalEclParser.g:981:4: ( (lv_right_3_0= rulePrimaryAttributeSet ) )
        // InternalEclParser.g:982:5: (lv_right_3_0= rulePrimaryAttributeSet )
        {
        // InternalEclParser.g:982:5: (lv_right_3_0= rulePrimaryAttributeSet )
        // InternalEclParser.g:983:6: lv_right_3_0= rulePrimaryAttributeSet
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getConjunctionAttributeSetAccess().getRightPrimaryAttributeSetParserRuleCall_1_1_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_right_3_0=rulePrimaryAttributeSet();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred18_InternalEclParser

    // Delegated rules

    public final boolean synpred13_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\10\2\0\7\uffff";
    static final String dfa_3s = "\1\37\2\0\7\uffff";
    static final String dfa_4s = "\3\uffff\1\1\4\uffff\1\2\1\3";
    static final String dfa_5s = "\1\uffff\1\0\1\1\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\5\uffff\1\1\1\uffff\1\3\3\uffff\1\3\2\uffff\1\2\2\uffff\1\10\2\uffff\1\3\1\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "705:2: (this_AttributeSetRefinement_0= ruleAttributeSetRefinement | this_AttributeGroupRefinement_1= ruleAttributeGroupRefinement | this_ParenthesizedRefinement_2= ruleParenthesizedRefinement )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_1 = input.LA(1);

                         
                        int index8_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalEclParser()) ) {s = 3;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index8_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_2 = input.LA(1);

                         
                        int index8_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalEclParser()) ) {s = 3;}

                        else if ( (synpred14_InternalEclParser()) ) {s = 8;}

                         
                        input.seek(index8_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000082514900L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020022L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000A4914100L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000A0914100L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000A0110100L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080110100L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080010000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000700640L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000082510900L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000002L});
    }


}