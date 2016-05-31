package org.akitta.snomed.ecl.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

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
import org.akitta.snomed.ecl.services.EclGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEclParser extends AbstractInternalContentAssistParser {
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


    	private EclGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("NumberSign", "'#'");
    		tokenNameToValue.put("LeftParenthesis", "'('");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Asterisk", "'*'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("FullStop", "'.'");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LessThanSign", "'<'");
    		tokenNameToValue.put("EqualsSign", "'='");
    		tokenNameToValue.put("GreaterThanSign", "'>'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("CircumflexAccent", "'^'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("ExclamationMarkEqualsSign", "'!='");
    		tokenNameToValue.put("FullStopFullStop", "'..'");
    		tokenNameToValue.put("LessThanSignLessThanSign", "'<<'");
    		tokenNameToValue.put("LessThanSignEqualsSign", "'<='");
    		tokenNameToValue.put("GreaterThanSignEqualsSign", "'>='");
    		tokenNameToValue.put("GreaterThanSignGreaterThanSign", "'>>'");
    		tokenNameToValue.put("OR", "'OR'");
    		tokenNameToValue.put("AND", "'AND'");
    		tokenNameToValue.put("MINUS", "'MINUS'");
    	}

    	public void setGrammarAccess(EclGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleScript"
    // InternalEclParser.g:80:1: entryRuleScript : ruleScript EOF ;
    public final void entryRuleScript() throws RecognitionException {
        try {
            // InternalEclParser.g:81:1: ( ruleScript EOF )
            // InternalEclParser.g:82:1: ruleScript EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleScript();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // InternalEclParser.g:89:1: ruleScript : ( ( rule__Script__ConstraintAssignment )? ) ;
    public final void ruleScript() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:93:2: ( ( ( rule__Script__ConstraintAssignment )? ) )
            // InternalEclParser.g:94:2: ( ( rule__Script__ConstraintAssignment )? )
            {
            // InternalEclParser.g:94:2: ( ( rule__Script__ConstraintAssignment )? )
            // InternalEclParser.g:95:3: ( rule__Script__ConstraintAssignment )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getConstraintAssignment()); 
            }
            // InternalEclParser.g:96:3: ( rule__Script__ConstraintAssignment )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==LessThanSignLessThanSign||LA1_0==GreaterThanSignGreaterThanSign||LA1_0==LeftParenthesis||LA1_0==Asterisk||LA1_0==LessThanSign||LA1_0==GreaterThanSign||LA1_0==CircumflexAccent||LA1_0==RULE_INT) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalEclParser.g:96:4: rule__Script__ConstraintAssignment
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Script__ConstraintAssignment();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getConstraintAssignment()); 
            }

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
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleExpressionConstraint"
    // InternalEclParser.g:105:1: entryRuleExpressionConstraint : ruleExpressionConstraint EOF ;
    public final void entryRuleExpressionConstraint() throws RecognitionException {
        try {
            // InternalEclParser.g:106:1: ( ruleExpressionConstraint EOF )
            // InternalEclParser.g:107:1: ruleExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionConstraintRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressionConstraint"


    // $ANTLR start "ruleExpressionConstraint"
    // InternalEclParser.g:114:1: ruleExpressionConstraint : ( ruleExclusionExpressionConstraint ) ;
    public final void ruleExpressionConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:118:2: ( ( ruleExclusionExpressionConstraint ) )
            // InternalEclParser.g:119:2: ( ruleExclusionExpressionConstraint )
            {
            // InternalEclParser.g:119:2: ( ruleExclusionExpressionConstraint )
            // InternalEclParser.g:120:3: ruleExclusionExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionConstraintAccess().getExclusionExpressionConstraintParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExclusionExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionConstraintAccess().getExclusionExpressionConstraintParserRuleCall()); 
            }

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
    // $ANTLR end "ruleExpressionConstraint"


    // $ANTLR start "entryRuleExclusionExpressionConstraint"
    // InternalEclParser.g:130:1: entryRuleExclusionExpressionConstraint : ruleExclusionExpressionConstraint EOF ;
    public final void entryRuleExclusionExpressionConstraint() throws RecognitionException {
        try {
            // InternalEclParser.g:131:1: ( ruleExclusionExpressionConstraint EOF )
            // InternalEclParser.g:132:1: ruleExclusionExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExclusionExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleExclusionExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExclusionExpressionConstraintRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExclusionExpressionConstraint"


    // $ANTLR start "ruleExclusionExpressionConstraint"
    // InternalEclParser.g:139:1: ruleExclusionExpressionConstraint : ( ( rule__ExclusionExpressionConstraint__Group__0 ) ) ;
    public final void ruleExclusionExpressionConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:143:2: ( ( ( rule__ExclusionExpressionConstraint__Group__0 ) ) )
            // InternalEclParser.g:144:2: ( ( rule__ExclusionExpressionConstraint__Group__0 ) )
            {
            // InternalEclParser.g:144:2: ( ( rule__ExclusionExpressionConstraint__Group__0 ) )
            // InternalEclParser.g:145:3: ( rule__ExclusionExpressionConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExclusionExpressionConstraintAccess().getGroup()); 
            }
            // InternalEclParser.g:146:3: ( rule__ExclusionExpressionConstraint__Group__0 )
            // InternalEclParser.g:146:4: rule__ExclusionExpressionConstraint__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExclusionExpressionConstraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExclusionExpressionConstraintAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleExclusionExpressionConstraint"


    // $ANTLR start "entryRuleDisjunctionExpressionConstraint"
    // InternalEclParser.g:155:1: entryRuleDisjunctionExpressionConstraint : ruleDisjunctionExpressionConstraint EOF ;
    public final void entryRuleDisjunctionExpressionConstraint() throws RecognitionException {
        try {
            // InternalEclParser.g:156:1: ( ruleDisjunctionExpressionConstraint EOF )
            // InternalEclParser.g:157:1: ruleDisjunctionExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDisjunctionExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionExpressionConstraintRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDisjunctionExpressionConstraint"


    // $ANTLR start "ruleDisjunctionExpressionConstraint"
    // InternalEclParser.g:164:1: ruleDisjunctionExpressionConstraint : ( ( rule__DisjunctionExpressionConstraint__Group__0 ) ) ;
    public final void ruleDisjunctionExpressionConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:168:2: ( ( ( rule__DisjunctionExpressionConstraint__Group__0 ) ) )
            // InternalEclParser.g:169:2: ( ( rule__DisjunctionExpressionConstraint__Group__0 ) )
            {
            // InternalEclParser.g:169:2: ( ( rule__DisjunctionExpressionConstraint__Group__0 ) )
            // InternalEclParser.g:170:3: ( rule__DisjunctionExpressionConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionExpressionConstraintAccess().getGroup()); 
            }
            // InternalEclParser.g:171:3: ( rule__DisjunctionExpressionConstraint__Group__0 )
            // InternalEclParser.g:171:4: rule__DisjunctionExpressionConstraint__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionExpressionConstraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionExpressionConstraintAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleDisjunctionExpressionConstraint"


    // $ANTLR start "entryRuleConjunctionExpressionConstraint"
    // InternalEclParser.g:180:1: entryRuleConjunctionExpressionConstraint : ruleConjunctionExpressionConstraint EOF ;
    public final void entryRuleConjunctionExpressionConstraint() throws RecognitionException {
        try {
            // InternalEclParser.g:181:1: ( ruleConjunctionExpressionConstraint EOF )
            // InternalEclParser.g:182:1: ruleConjunctionExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleConjunctionExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionExpressionConstraintRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConjunctionExpressionConstraint"


    // $ANTLR start "ruleConjunctionExpressionConstraint"
    // InternalEclParser.g:189:1: ruleConjunctionExpressionConstraint : ( ( rule__ConjunctionExpressionConstraint__Group__0 ) ) ;
    public final void ruleConjunctionExpressionConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:193:2: ( ( ( rule__ConjunctionExpressionConstraint__Group__0 ) ) )
            // InternalEclParser.g:194:2: ( ( rule__ConjunctionExpressionConstraint__Group__0 ) )
            {
            // InternalEclParser.g:194:2: ( ( rule__ConjunctionExpressionConstraint__Group__0 ) )
            // InternalEclParser.g:195:3: ( rule__ConjunctionExpressionConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionExpressionConstraintAccess().getGroup()); 
            }
            // InternalEclParser.g:196:3: ( rule__ConjunctionExpressionConstraint__Group__0 )
            // InternalEclParser.g:196:4: rule__ConjunctionExpressionConstraint__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionExpressionConstraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionExpressionConstraintAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleConjunctionExpressionConstraint"


    // $ANTLR start "entryRuleRefinedExpressionConstraint"
    // InternalEclParser.g:205:1: entryRuleRefinedExpressionConstraint : ruleRefinedExpressionConstraint EOF ;
    public final void entryRuleRefinedExpressionConstraint() throws RecognitionException {
        try {
            // InternalEclParser.g:206:1: ( ruleRefinedExpressionConstraint EOF )
            // InternalEclParser.g:207:1: ruleRefinedExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinedExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRefinedExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinedExpressionConstraintRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRefinedExpressionConstraint"


    // $ANTLR start "ruleRefinedExpressionConstraint"
    // InternalEclParser.g:214:1: ruleRefinedExpressionConstraint : ( ( rule__RefinedExpressionConstraint__Group__0 ) ) ;
    public final void ruleRefinedExpressionConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:218:2: ( ( ( rule__RefinedExpressionConstraint__Group__0 ) ) )
            // InternalEclParser.g:219:2: ( ( rule__RefinedExpressionConstraint__Group__0 ) )
            {
            // InternalEclParser.g:219:2: ( ( rule__RefinedExpressionConstraint__Group__0 ) )
            // InternalEclParser.g:220:3: ( rule__RefinedExpressionConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinedExpressionConstraintAccess().getGroup()); 
            }
            // InternalEclParser.g:221:3: ( rule__RefinedExpressionConstraint__Group__0 )
            // InternalEclParser.g:221:4: rule__RefinedExpressionConstraint__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RefinedExpressionConstraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinedExpressionConstraintAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleRefinedExpressionConstraint"


    // $ANTLR start "entryRuleRefinement"
    // InternalEclParser.g:230:1: entryRuleRefinement : ruleRefinement EOF ;
    public final void entryRuleRefinement() throws RecognitionException {
        try {
            // InternalEclParser.g:231:1: ( ruleRefinement EOF )
            // InternalEclParser.g:232:1: ruleRefinement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRefinement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRefinement"


    // $ANTLR start "ruleRefinement"
    // InternalEclParser.g:239:1: ruleRefinement : ( ruleDisjunctionRefinementSet ) ;
    public final void ruleRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:243:2: ( ( ruleDisjunctionRefinementSet ) )
            // InternalEclParser.g:244:2: ( ruleDisjunctionRefinementSet )
            {
            // InternalEclParser.g:244:2: ( ruleDisjunctionRefinementSet )
            // InternalEclParser.g:245:3: ruleDisjunctionRefinementSet
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinementAccess().getDisjunctionRefinementSetParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDisjunctionRefinementSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinementAccess().getDisjunctionRefinementSetParserRuleCall()); 
            }

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
    // $ANTLR end "ruleRefinement"


    // $ANTLR start "entryRuleDisjunctionRefinementSet"
    // InternalEclParser.g:255:1: entryRuleDisjunctionRefinementSet : ruleDisjunctionRefinementSet EOF ;
    public final void entryRuleDisjunctionRefinementSet() throws RecognitionException {
        try {
            // InternalEclParser.g:256:1: ( ruleDisjunctionRefinementSet EOF )
            // InternalEclParser.g:257:1: ruleDisjunctionRefinementSet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionRefinementSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDisjunctionRefinementSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionRefinementSetRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDisjunctionRefinementSet"


    // $ANTLR start "ruleDisjunctionRefinementSet"
    // InternalEclParser.g:264:1: ruleDisjunctionRefinementSet : ( ( rule__DisjunctionRefinementSet__Group__0 ) ) ;
    public final void ruleDisjunctionRefinementSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:268:2: ( ( ( rule__DisjunctionRefinementSet__Group__0 ) ) )
            // InternalEclParser.g:269:2: ( ( rule__DisjunctionRefinementSet__Group__0 ) )
            {
            // InternalEclParser.g:269:2: ( ( rule__DisjunctionRefinementSet__Group__0 ) )
            // InternalEclParser.g:270:3: ( rule__DisjunctionRefinementSet__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionRefinementSetAccess().getGroup()); 
            }
            // InternalEclParser.g:271:3: ( rule__DisjunctionRefinementSet__Group__0 )
            // InternalEclParser.g:271:4: rule__DisjunctionRefinementSet__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionRefinementSet__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionRefinementSetAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleDisjunctionRefinementSet"


    // $ANTLR start "entryRuleConjunctionRefinementSet"
    // InternalEclParser.g:280:1: entryRuleConjunctionRefinementSet : ruleConjunctionRefinementSet EOF ;
    public final void entryRuleConjunctionRefinementSet() throws RecognitionException {
        try {
            // InternalEclParser.g:281:1: ( ruleConjunctionRefinementSet EOF )
            // InternalEclParser.g:282:1: ruleConjunctionRefinementSet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionRefinementSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleConjunctionRefinementSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionRefinementSetRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConjunctionRefinementSet"


    // $ANTLR start "ruleConjunctionRefinementSet"
    // InternalEclParser.g:289:1: ruleConjunctionRefinementSet : ( ( rule__ConjunctionRefinementSet__Group__0 ) ) ;
    public final void ruleConjunctionRefinementSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:293:2: ( ( ( rule__ConjunctionRefinementSet__Group__0 ) ) )
            // InternalEclParser.g:294:2: ( ( rule__ConjunctionRefinementSet__Group__0 ) )
            {
            // InternalEclParser.g:294:2: ( ( rule__ConjunctionRefinementSet__Group__0 ) )
            // InternalEclParser.g:295:3: ( rule__ConjunctionRefinementSet__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionRefinementSetAccess().getGroup()); 
            }
            // InternalEclParser.g:296:3: ( rule__ConjunctionRefinementSet__Group__0 )
            // InternalEclParser.g:296:4: rule__ConjunctionRefinementSet__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionRefinementSet__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionRefinementSetAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleConjunctionRefinementSet"


    // $ANTLR start "entryRuleSubRefinement"
    // InternalEclParser.g:305:1: entryRuleSubRefinement : ruleSubRefinement EOF ;
    public final void entryRuleSubRefinement() throws RecognitionException {
        try {
            // InternalEclParser.g:306:1: ( ruleSubRefinement EOF )
            // InternalEclParser.g:307:1: ruleSubRefinement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSubRefinement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubRefinementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSubRefinement"


    // $ANTLR start "ruleSubRefinement"
    // InternalEclParser.g:314:1: ruleSubRefinement : ( ( rule__SubRefinement__Alternatives ) ) ;
    public final void ruleSubRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:318:2: ( ( ( rule__SubRefinement__Alternatives ) ) )
            // InternalEclParser.g:319:2: ( ( rule__SubRefinement__Alternatives ) )
            {
            // InternalEclParser.g:319:2: ( ( rule__SubRefinement__Alternatives ) )
            // InternalEclParser.g:320:3: ( rule__SubRefinement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubRefinementAccess().getAlternatives()); 
            }
            // InternalEclParser.g:321:3: ( rule__SubRefinement__Alternatives )
            // InternalEclParser.g:321:4: rule__SubRefinement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubRefinement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubRefinementAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleSubRefinement"


    // $ANTLR start "entryRuleAttributeSetRefinement"
    // InternalEclParser.g:330:1: entryRuleAttributeSetRefinement : ruleAttributeSetRefinement EOF ;
    public final void entryRuleAttributeSetRefinement() throws RecognitionException {
        try {
            // InternalEclParser.g:331:1: ( ruleAttributeSetRefinement EOF )
            // InternalEclParser.g:332:1: ruleAttributeSetRefinement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSetRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAttributeSetRefinement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSetRefinementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAttributeSetRefinement"


    // $ANTLR start "ruleAttributeSetRefinement"
    // InternalEclParser.g:339:1: ruleAttributeSetRefinement : ( ( rule__AttributeSetRefinement__AttributeSetAssignment ) ) ;
    public final void ruleAttributeSetRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:343:2: ( ( ( rule__AttributeSetRefinement__AttributeSetAssignment ) ) )
            // InternalEclParser.g:344:2: ( ( rule__AttributeSetRefinement__AttributeSetAssignment ) )
            {
            // InternalEclParser.g:344:2: ( ( rule__AttributeSetRefinement__AttributeSetAssignment ) )
            // InternalEclParser.g:345:3: ( rule__AttributeSetRefinement__AttributeSetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSetRefinementAccess().getAttributeSetAssignment()); 
            }
            // InternalEclParser.g:346:3: ( rule__AttributeSetRefinement__AttributeSetAssignment )
            // InternalEclParser.g:346:4: rule__AttributeSetRefinement__AttributeSetAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeSetRefinement__AttributeSetAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSetRefinementAccess().getAttributeSetAssignment()); 
            }

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
    // $ANTLR end "ruleAttributeSetRefinement"


    // $ANTLR start "entryRuleAttributeGroupRefinement"
    // InternalEclParser.g:355:1: entryRuleAttributeGroupRefinement : ruleAttributeGroupRefinement EOF ;
    public final void entryRuleAttributeGroupRefinement() throws RecognitionException {
        try {
            // InternalEclParser.g:356:1: ( ruleAttributeGroupRefinement EOF )
            // InternalEclParser.g:357:1: ruleAttributeGroupRefinement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeGroupRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAttributeGroupRefinement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeGroupRefinementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAttributeGroupRefinement"


    // $ANTLR start "ruleAttributeGroupRefinement"
    // InternalEclParser.g:364:1: ruleAttributeGroupRefinement : ( ( rule__AttributeGroupRefinement__AttributeGroupAssignment ) ) ;
    public final void ruleAttributeGroupRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:368:2: ( ( ( rule__AttributeGroupRefinement__AttributeGroupAssignment ) ) )
            // InternalEclParser.g:369:2: ( ( rule__AttributeGroupRefinement__AttributeGroupAssignment ) )
            {
            // InternalEclParser.g:369:2: ( ( rule__AttributeGroupRefinement__AttributeGroupAssignment ) )
            // InternalEclParser.g:370:3: ( rule__AttributeGroupRefinement__AttributeGroupAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeGroupRefinementAccess().getAttributeGroupAssignment()); 
            }
            // InternalEclParser.g:371:3: ( rule__AttributeGroupRefinement__AttributeGroupAssignment )
            // InternalEclParser.g:371:4: rule__AttributeGroupRefinement__AttributeGroupAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeGroupRefinement__AttributeGroupAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeGroupRefinementAccess().getAttributeGroupAssignment()); 
            }

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
    // $ANTLR end "ruleAttributeGroupRefinement"


    // $ANTLR start "entryRuleDisjunctionAttributeSet"
    // InternalEclParser.g:380:1: entryRuleDisjunctionAttributeSet : ruleDisjunctionAttributeSet EOF ;
    public final void entryRuleDisjunctionAttributeSet() throws RecognitionException {
        try {
            // InternalEclParser.g:381:1: ( ruleDisjunctionAttributeSet EOF )
            // InternalEclParser.g:382:1: ruleDisjunctionAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDisjunctionAttributeSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAttributeSetRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDisjunctionAttributeSet"


    // $ANTLR start "ruleDisjunctionAttributeSet"
    // InternalEclParser.g:389:1: ruleDisjunctionAttributeSet : ( ( rule__DisjunctionAttributeSet__Group__0 ) ) ;
    public final void ruleDisjunctionAttributeSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:393:2: ( ( ( rule__DisjunctionAttributeSet__Group__0 ) ) )
            // InternalEclParser.g:394:2: ( ( rule__DisjunctionAttributeSet__Group__0 ) )
            {
            // InternalEclParser.g:394:2: ( ( rule__DisjunctionAttributeSet__Group__0 ) )
            // InternalEclParser.g:395:3: ( rule__DisjunctionAttributeSet__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAttributeSetAccess().getGroup()); 
            }
            // InternalEclParser.g:396:3: ( rule__DisjunctionAttributeSet__Group__0 )
            // InternalEclParser.g:396:4: rule__DisjunctionAttributeSet__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionAttributeSet__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAttributeSetAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleDisjunctionAttributeSet"


    // $ANTLR start "entryRuleConjunctionAttributeSet"
    // InternalEclParser.g:405:1: entryRuleConjunctionAttributeSet : ruleConjunctionAttributeSet EOF ;
    public final void entryRuleConjunctionAttributeSet() throws RecognitionException {
        try {
            // InternalEclParser.g:406:1: ( ruleConjunctionAttributeSet EOF )
            // InternalEclParser.g:407:1: ruleConjunctionAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleConjunctionAttributeSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAttributeSetRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConjunctionAttributeSet"


    // $ANTLR start "ruleConjunctionAttributeSet"
    // InternalEclParser.g:414:1: ruleConjunctionAttributeSet : ( ( rule__ConjunctionAttributeSet__Group__0 ) ) ;
    public final void ruleConjunctionAttributeSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:418:2: ( ( ( rule__ConjunctionAttributeSet__Group__0 ) ) )
            // InternalEclParser.g:419:2: ( ( rule__ConjunctionAttributeSet__Group__0 ) )
            {
            // InternalEclParser.g:419:2: ( ( rule__ConjunctionAttributeSet__Group__0 ) )
            // InternalEclParser.g:420:3: ( rule__ConjunctionAttributeSet__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAttributeSetAccess().getGroup()); 
            }
            // InternalEclParser.g:421:3: ( rule__ConjunctionAttributeSet__Group__0 )
            // InternalEclParser.g:421:4: rule__ConjunctionAttributeSet__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionAttributeSet__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAttributeSetAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleConjunctionAttributeSet"


    // $ANTLR start "entryRulePrimaryAttributeSet"
    // InternalEclParser.g:430:1: entryRulePrimaryAttributeSet : rulePrimaryAttributeSet EOF ;
    public final void entryRulePrimaryAttributeSet() throws RecognitionException {
        try {
            // InternalEclParser.g:431:1: ( rulePrimaryAttributeSet EOF )
            // InternalEclParser.g:432:1: rulePrimaryAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            rulePrimaryAttributeSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAttributeSetRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePrimaryAttributeSet"


    // $ANTLR start "rulePrimaryAttributeSet"
    // InternalEclParser.g:439:1: rulePrimaryAttributeSet : ( ( rule__PrimaryAttributeSet__Alternatives ) ) ;
    public final void rulePrimaryAttributeSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:443:2: ( ( ( rule__PrimaryAttributeSet__Alternatives ) ) )
            // InternalEclParser.g:444:2: ( ( rule__PrimaryAttributeSet__Alternatives ) )
            {
            // InternalEclParser.g:444:2: ( ( rule__PrimaryAttributeSet__Alternatives ) )
            // InternalEclParser.g:445:3: ( rule__PrimaryAttributeSet__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAttributeSetAccess().getAlternatives()); 
            }
            // InternalEclParser.g:446:3: ( rule__PrimaryAttributeSet__Alternatives )
            // InternalEclParser.g:446:4: rule__PrimaryAttributeSet__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PrimaryAttributeSet__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAttributeSetAccess().getAlternatives()); 
            }

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
    // $ANTLR end "rulePrimaryAttributeSet"


    // $ANTLR start "entryRuleAttribute"
    // InternalEclParser.g:455:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalEclParser.g:456:1: ( ruleAttribute EOF )
            // InternalEclParser.g:457:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalEclParser.g:464:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:468:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalEclParser.g:469:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalEclParser.g:469:2: ( ( rule__Attribute__Group__0 ) )
            // InternalEclParser.g:470:3: ( rule__Attribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // InternalEclParser.g:471:3: ( rule__Attribute__Group__0 )
            // InternalEclParser.g:471:4: rule__Attribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleCardinality"
    // InternalEclParser.g:480:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalEclParser.g:481:1: ( ruleCardinality EOF )
            // InternalEclParser.g:482:1: ruleCardinality EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCardinality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalEclParser.g:489:1: ruleCardinality : ( ( rule__Cardinality__Group__0 ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:493:2: ( ( ( rule__Cardinality__Group__0 ) ) )
            // InternalEclParser.g:494:2: ( ( rule__Cardinality__Group__0 ) )
            {
            // InternalEclParser.g:494:2: ( ( rule__Cardinality__Group__0 ) )
            // InternalEclParser.g:495:3: ( rule__Cardinality__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getGroup()); 
            }
            // InternalEclParser.g:496:3: ( rule__Cardinality__Group__0 )
            // InternalEclParser.g:496:4: rule__Cardinality__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Cardinality__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleAttributeValue"
    // InternalEclParser.g:505:1: entryRuleAttributeValue : ruleAttributeValue EOF ;
    public final void entryRuleAttributeValue() throws RecognitionException {
        try {
            // InternalEclParser.g:506:1: ( ruleAttributeValue EOF )
            // InternalEclParser.g:507:1: ruleAttributeValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAttributeValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // InternalEclParser.g:514:1: ruleAttributeValue : ( ( rule__AttributeValue__Alternatives ) ) ;
    public final void ruleAttributeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:518:2: ( ( ( rule__AttributeValue__Alternatives ) ) )
            // InternalEclParser.g:519:2: ( ( rule__AttributeValue__Alternatives ) )
            {
            // InternalEclParser.g:519:2: ( ( rule__AttributeValue__Alternatives ) )
            // InternalEclParser.g:520:3: ( rule__AttributeValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueAccess().getAlternatives()); 
            }
            // InternalEclParser.g:521:3: ( rule__AttributeValue__Alternatives )
            // InternalEclParser.g:521:4: rule__AttributeValue__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalEclParser.g:530:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalEclParser.g:531:1: ( ruleStringValue EOF )
            // InternalEclParser.g:532:1: ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleStringValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalEclParser.g:539:1: ruleStringValue : ( ( rule__StringValue__Group__0 ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:543:2: ( ( ( rule__StringValue__Group__0 ) ) )
            // InternalEclParser.g:544:2: ( ( rule__StringValue__Group__0 ) )
            {
            // InternalEclParser.g:544:2: ( ( rule__StringValue__Group__0 ) )
            // InternalEclParser.g:545:3: ( rule__StringValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getGroup()); 
            }
            // InternalEclParser.g:546:3: ( rule__StringValue__Group__0 )
            // InternalEclParser.g:546:4: rule__StringValue__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleNumericValue"
    // InternalEclParser.g:555:1: entryRuleNumericValue : ruleNumericValue EOF ;
    public final void entryRuleNumericValue() throws RecognitionException {
        try {
            // InternalEclParser.g:556:1: ( ruleNumericValue EOF )
            // InternalEclParser.g:557:1: ruleNumericValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNumericValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNumericValue"


    // $ANTLR start "ruleNumericValue"
    // InternalEclParser.g:564:1: ruleNumericValue : ( ( rule__NumericValue__Group__0 ) ) ;
    public final void ruleNumericValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:568:2: ( ( ( rule__NumericValue__Group__0 ) ) )
            // InternalEclParser.g:569:2: ( ( rule__NumericValue__Group__0 ) )
            {
            // InternalEclParser.g:569:2: ( ( rule__NumericValue__Group__0 ) )
            // InternalEclParser.g:570:3: ( rule__NumericValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericValueAccess().getGroup()); 
            }
            // InternalEclParser.g:571:3: ( rule__NumericValue__Group__0 )
            // InternalEclParser.g:571:4: rule__NumericValue__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NumericValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericValueAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleNumericValue"


    // $ANTLR start "entryRuleNumber"
    // InternalEclParser.g:580:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalEclParser.g:581:1: ( ruleNumber EOF )
            // InternalEclParser.g:582:1: ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalEclParser.g:589:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:593:2: ( ( ( rule__Number__Group__0 ) ) )
            // InternalEclParser.g:594:2: ( ( rule__Number__Group__0 ) )
            {
            // InternalEclParser.g:594:2: ( ( rule__Number__Group__0 ) )
            // InternalEclParser.g:595:3: ( rule__Number__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getGroup()); 
            }
            // InternalEclParser.g:596:3: ( rule__Number__Group__0 )
            // InternalEclParser.g:596:4: rule__Number__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Number__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleExpressionValue"
    // InternalEclParser.g:605:1: entryRuleExpressionValue : ruleExpressionValue EOF ;
    public final void entryRuleExpressionValue() throws RecognitionException {
        try {
            // InternalEclParser.g:606:1: ( ruleExpressionValue EOF )
            // InternalEclParser.g:607:1: ruleExpressionValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleExpressionValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressionValue"


    // $ANTLR start "ruleExpressionValue"
    // InternalEclParser.g:614:1: ruleExpressionValue : ( ( rule__ExpressionValue__Group__0 ) ) ;
    public final void ruleExpressionValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:618:2: ( ( ( rule__ExpressionValue__Group__0 ) ) )
            // InternalEclParser.g:619:2: ( ( rule__ExpressionValue__Group__0 ) )
            {
            // InternalEclParser.g:619:2: ( ( rule__ExpressionValue__Group__0 ) )
            // InternalEclParser.g:620:3: ( rule__ExpressionValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionValueAccess().getGroup()); 
            }
            // InternalEclParser.g:621:3: ( rule__ExpressionValue__Group__0 )
            // InternalEclParser.g:621:4: rule__ExpressionValue__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExpressionValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionValueAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleExpressionValue"


    // $ANTLR start "entryRuleParenthesizedAttributeSet"
    // InternalEclParser.g:630:1: entryRuleParenthesizedAttributeSet : ruleParenthesizedAttributeSet EOF ;
    public final void entryRuleParenthesizedAttributeSet() throws RecognitionException {
        try {
            // InternalEclParser.g:631:1: ( ruleParenthesizedAttributeSet EOF )
            // InternalEclParser.g:632:1: ruleParenthesizedAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParenthesizedAttributeSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedAttributeSetRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParenthesizedAttributeSet"


    // $ANTLR start "ruleParenthesizedAttributeSet"
    // InternalEclParser.g:639:1: ruleParenthesizedAttributeSet : ( ( rule__ParenthesizedAttributeSet__Group__0 ) ) ;
    public final void ruleParenthesizedAttributeSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:643:2: ( ( ( rule__ParenthesizedAttributeSet__Group__0 ) ) )
            // InternalEclParser.g:644:2: ( ( rule__ParenthesizedAttributeSet__Group__0 ) )
            {
            // InternalEclParser.g:644:2: ( ( rule__ParenthesizedAttributeSet__Group__0 ) )
            // InternalEclParser.g:645:3: ( rule__ParenthesizedAttributeSet__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedAttributeSetAccess().getGroup()); 
            }
            // InternalEclParser.g:646:3: ( rule__ParenthesizedAttributeSet__Group__0 )
            // InternalEclParser.g:646:4: rule__ParenthesizedAttributeSet__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedAttributeSet__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedAttributeSetAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleParenthesizedAttributeSet"


    // $ANTLR start "entryRuleAttributeGroup"
    // InternalEclParser.g:655:1: entryRuleAttributeGroup : ruleAttributeGroup EOF ;
    public final void entryRuleAttributeGroup() throws RecognitionException {
        try {
            // InternalEclParser.g:656:1: ( ruleAttributeGroup EOF )
            // InternalEclParser.g:657:1: ruleAttributeGroup EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeGroupRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAttributeGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeGroupRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAttributeGroup"


    // $ANTLR start "ruleAttributeGroup"
    // InternalEclParser.g:664:1: ruleAttributeGroup : ( ( rule__AttributeGroup__Group__0 ) ) ;
    public final void ruleAttributeGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:668:2: ( ( ( rule__AttributeGroup__Group__0 ) ) )
            // InternalEclParser.g:669:2: ( ( rule__AttributeGroup__Group__0 ) )
            {
            // InternalEclParser.g:669:2: ( ( rule__AttributeGroup__Group__0 ) )
            // InternalEclParser.g:670:3: ( rule__AttributeGroup__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeGroupAccess().getGroup()); 
            }
            // InternalEclParser.g:671:3: ( rule__AttributeGroup__Group__0 )
            // InternalEclParser.g:671:4: rule__AttributeGroup__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeGroup__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeGroupAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleAttributeGroup"


    // $ANTLR start "entryRuleParenthesizedRefinement"
    // InternalEclParser.g:680:1: entryRuleParenthesizedRefinement : ruleParenthesizedRefinement EOF ;
    public final void entryRuleParenthesizedRefinement() throws RecognitionException {
        try {
            // InternalEclParser.g:681:1: ( ruleParenthesizedRefinement EOF )
            // InternalEclParser.g:682:1: ruleParenthesizedRefinement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParenthesizedRefinement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedRefinementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParenthesizedRefinement"


    // $ANTLR start "ruleParenthesizedRefinement"
    // InternalEclParser.g:689:1: ruleParenthesizedRefinement : ( ( rule__ParenthesizedRefinement__Group__0 ) ) ;
    public final void ruleParenthesizedRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:693:2: ( ( ( rule__ParenthesizedRefinement__Group__0 ) ) )
            // InternalEclParser.g:694:2: ( ( rule__ParenthesizedRefinement__Group__0 ) )
            {
            // InternalEclParser.g:694:2: ( ( rule__ParenthesizedRefinement__Group__0 ) )
            // InternalEclParser.g:695:3: ( rule__ParenthesizedRefinement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedRefinementAccess().getGroup()); 
            }
            // InternalEclParser.g:696:3: ( rule__ParenthesizedRefinement__Group__0 )
            // InternalEclParser.g:696:4: rule__ParenthesizedRefinement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedRefinement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedRefinementAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleParenthesizedRefinement"


    // $ANTLR start "entryRulePrimaryExpressionConstraint"
    // InternalEclParser.g:705:1: entryRulePrimaryExpressionConstraint : rulePrimaryExpressionConstraint EOF ;
    public final void entryRulePrimaryExpressionConstraint() throws RecognitionException {
        try {
            // InternalEclParser.g:706:1: ( rulePrimaryExpressionConstraint EOF )
            // InternalEclParser.g:707:1: rulePrimaryExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            rulePrimaryExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionConstraintRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePrimaryExpressionConstraint"


    // $ANTLR start "rulePrimaryExpressionConstraint"
    // InternalEclParser.g:714:1: rulePrimaryExpressionConstraint : ( ( rule__PrimaryExpressionConstraint__Alternatives ) ) ;
    public final void rulePrimaryExpressionConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:718:2: ( ( ( rule__PrimaryExpressionConstraint__Alternatives ) ) )
            // InternalEclParser.g:719:2: ( ( rule__PrimaryExpressionConstraint__Alternatives ) )
            {
            // InternalEclParser.g:719:2: ( ( rule__PrimaryExpressionConstraint__Alternatives ) )
            // InternalEclParser.g:720:3: ( rule__PrimaryExpressionConstraint__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionConstraintAccess().getAlternatives()); 
            }
            // InternalEclParser.g:721:3: ( rule__PrimaryExpressionConstraint__Alternatives )
            // InternalEclParser.g:721:4: rule__PrimaryExpressionConstraint__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PrimaryExpressionConstraint__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionConstraintAccess().getAlternatives()); 
            }

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
    // $ANTLR end "rulePrimaryExpressionConstraint"


    // $ANTLR start "entryRuleSimpleExpressionConstraint"
    // InternalEclParser.g:730:1: entryRuleSimpleExpressionConstraint : ruleSimpleExpressionConstraint EOF ;
    public final void entryRuleSimpleExpressionConstraint() throws RecognitionException {
        try {
            // InternalEclParser.g:731:1: ( ruleSimpleExpressionConstraint EOF )
            // InternalEclParser.g:732:1: ruleSimpleExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSimpleExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleExpressionConstraintRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSimpleExpressionConstraint"


    // $ANTLR start "ruleSimpleExpressionConstraint"
    // InternalEclParser.g:739:1: ruleSimpleExpressionConstraint : ( ( rule__SimpleExpressionConstraint__Group__0 ) ) ;
    public final void ruleSimpleExpressionConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:743:2: ( ( ( rule__SimpleExpressionConstraint__Group__0 ) ) )
            // InternalEclParser.g:744:2: ( ( rule__SimpleExpressionConstraint__Group__0 ) )
            {
            // InternalEclParser.g:744:2: ( ( rule__SimpleExpressionConstraint__Group__0 ) )
            // InternalEclParser.g:745:3: ( rule__SimpleExpressionConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleExpressionConstraintAccess().getGroup()); 
            }
            // InternalEclParser.g:746:3: ( rule__SimpleExpressionConstraint__Group__0 )
            // InternalEclParser.g:746:4: rule__SimpleExpressionConstraint__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SimpleExpressionConstraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleExpressionConstraintAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleSimpleExpressionConstraint"


    // $ANTLR start "entryRuleFocusConcept"
    // InternalEclParser.g:755:1: entryRuleFocusConcept : ruleFocusConcept EOF ;
    public final void entryRuleFocusConcept() throws RecognitionException {
        try {
            // InternalEclParser.g:756:1: ( ruleFocusConcept EOF )
            // InternalEclParser.g:757:1: ruleFocusConcept EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFocusConceptRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFocusConcept();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFocusConceptRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFocusConcept"


    // $ANTLR start "ruleFocusConcept"
    // InternalEclParser.g:764:1: ruleFocusConcept : ( ( rule__FocusConcept__Group__0 ) ) ;
    public final void ruleFocusConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:768:2: ( ( ( rule__FocusConcept__Group__0 ) ) )
            // InternalEclParser.g:769:2: ( ( rule__FocusConcept__Group__0 ) )
            {
            // InternalEclParser.g:769:2: ( ( rule__FocusConcept__Group__0 ) )
            // InternalEclParser.g:770:3: ( rule__FocusConcept__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFocusConceptAccess().getGroup()); 
            }
            // InternalEclParser.g:771:3: ( rule__FocusConcept__Group__0 )
            // InternalEclParser.g:771:4: rule__FocusConcept__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FocusConcept__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFocusConceptAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleFocusConcept"


    // $ANTLR start "entryRuleConceptReference"
    // InternalEclParser.g:780:1: entryRuleConceptReference : ruleConceptReference EOF ;
    public final void entryRuleConceptReference() throws RecognitionException {
        try {
            // InternalEclParser.g:781:1: ( ruleConceptReference EOF )
            // InternalEclParser.g:782:1: ruleConceptReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConceptReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleConceptReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConceptReferenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConceptReference"


    // $ANTLR start "ruleConceptReference"
    // InternalEclParser.g:789:1: ruleConceptReference : ( ( rule__ConceptReference__Group__0 ) ) ;
    public final void ruleConceptReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:793:2: ( ( ( rule__ConceptReference__Group__0 ) ) )
            // InternalEclParser.g:794:2: ( ( rule__ConceptReference__Group__0 ) )
            {
            // InternalEclParser.g:794:2: ( ( rule__ConceptReference__Group__0 ) )
            // InternalEclParser.g:795:3: ( rule__ConceptReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConceptReferenceAccess().getGroup()); 
            }
            // InternalEclParser.g:796:3: ( rule__ConceptReference__Group__0 )
            // InternalEclParser.g:796:4: rule__ConceptReference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConceptReference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConceptReferenceAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleConceptReference"


    // $ANTLR start "entryRuleConceptID"
    // InternalEclParser.g:805:1: entryRuleConceptID : ruleConceptID EOF ;
    public final void entryRuleConceptID() throws RecognitionException {
        try {
            // InternalEclParser.g:806:1: ( ruleConceptID EOF )
            // InternalEclParser.g:807:1: ruleConceptID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConceptIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleConceptID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConceptIDRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConceptID"


    // $ANTLR start "ruleConceptID"
    // InternalEclParser.g:814:1: ruleConceptID : ( RULE_INT ) ;
    public final void ruleConceptID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:818:2: ( ( RULE_INT ) )
            // InternalEclParser.g:819:2: ( RULE_INT )
            {
            // InternalEclParser.g:819:2: ( RULE_INT )
            // InternalEclParser.g:820:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConceptIDAccess().getINTTerminalRuleCall()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConceptIDAccess().getINTTerminalRuleCall()); 
            }

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
    // $ANTLR end "ruleConceptID"


    // $ANTLR start "ruleExpressionComparisonOperator"
    // InternalEclParser.g:830:1: ruleExpressionComparisonOperator : ( ( rule__ExpressionComparisonOperator__Alternatives ) ) ;
    public final void ruleExpressionComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:834:1: ( ( ( rule__ExpressionComparisonOperator__Alternatives ) ) )
            // InternalEclParser.g:835:2: ( ( rule__ExpressionComparisonOperator__Alternatives ) )
            {
            // InternalEclParser.g:835:2: ( ( rule__ExpressionComparisonOperator__Alternatives ) )
            // InternalEclParser.g:836:3: ( rule__ExpressionComparisonOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionComparisonOperatorAccess().getAlternatives()); 
            }
            // InternalEclParser.g:837:3: ( rule__ExpressionComparisonOperator__Alternatives )
            // InternalEclParser.g:837:4: rule__ExpressionComparisonOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExpressionComparisonOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionComparisonOperatorAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleExpressionComparisonOperator"


    // $ANTLR start "ruleStringComparisonOperator"
    // InternalEclParser.g:846:1: ruleStringComparisonOperator : ( ( rule__StringComparisonOperator__Alternatives ) ) ;
    public final void ruleStringComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:850:1: ( ( ( rule__StringComparisonOperator__Alternatives ) ) )
            // InternalEclParser.g:851:2: ( ( rule__StringComparisonOperator__Alternatives ) )
            {
            // InternalEclParser.g:851:2: ( ( rule__StringComparisonOperator__Alternatives ) )
            // InternalEclParser.g:852:3: ( rule__StringComparisonOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringComparisonOperatorAccess().getAlternatives()); 
            }
            // InternalEclParser.g:853:3: ( rule__StringComparisonOperator__Alternatives )
            // InternalEclParser.g:853:4: rule__StringComparisonOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringComparisonOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringComparisonOperatorAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleStringComparisonOperator"


    // $ANTLR start "ruleNumericComparisonOperator"
    // InternalEclParser.g:862:1: ruleNumericComparisonOperator : ( ( rule__NumericComparisonOperator__Alternatives ) ) ;
    public final void ruleNumericComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:866:1: ( ( ( rule__NumericComparisonOperator__Alternatives ) ) )
            // InternalEclParser.g:867:2: ( ( rule__NumericComparisonOperator__Alternatives ) )
            {
            // InternalEclParser.g:867:2: ( ( rule__NumericComparisonOperator__Alternatives ) )
            // InternalEclParser.g:868:3: ( rule__NumericComparisonOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericComparisonOperatorAccess().getAlternatives()); 
            }
            // InternalEclParser.g:869:3: ( rule__NumericComparisonOperator__Alternatives )
            // InternalEclParser.g:869:4: rule__NumericComparisonOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NumericComparisonOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericComparisonOperatorAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleNumericComparisonOperator"


    // $ANTLR start "ruleConstraintOperator"
    // InternalEclParser.g:878:1: ruleConstraintOperator : ( ( rule__ConstraintOperator__Alternatives ) ) ;
    public final void ruleConstraintOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:882:1: ( ( ( rule__ConstraintOperator__Alternatives ) ) )
            // InternalEclParser.g:883:2: ( ( rule__ConstraintOperator__Alternatives ) )
            {
            // InternalEclParser.g:883:2: ( ( rule__ConstraintOperator__Alternatives ) )
            // InternalEclParser.g:884:3: ( rule__ConstraintOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintOperatorAccess().getAlternatives()); 
            }
            // InternalEclParser.g:885:3: ( rule__ConstraintOperator__Alternatives )
            // InternalEclParser.g:885:4: rule__ConstraintOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConstraintOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintOperatorAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleConstraintOperator"


    // $ANTLR start "ruleAttributeOperator"
    // InternalEclParser.g:894:1: ruleAttributeOperator : ( ( rule__AttributeOperator__Alternatives ) ) ;
    public final void ruleAttributeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:898:1: ( ( ( rule__AttributeOperator__Alternatives ) ) )
            // InternalEclParser.g:899:2: ( ( rule__AttributeOperator__Alternatives ) )
            {
            // InternalEclParser.g:899:2: ( ( rule__AttributeOperator__Alternatives ) )
            // InternalEclParser.g:900:3: ( rule__AttributeOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeOperatorAccess().getAlternatives()); 
            }
            // InternalEclParser.g:901:3: ( rule__AttributeOperator__Alternatives )
            // InternalEclParser.g:901:4: rule__AttributeOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeOperatorAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleAttributeOperator"


    // $ANTLR start "ruleConjunctionOperator"
    // InternalEclParser.g:910:1: ruleConjunctionOperator : ( ( rule__ConjunctionOperator__Alternatives ) ) ;
    public final void ruleConjunctionOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:914:1: ( ( ( rule__ConjunctionOperator__Alternatives ) ) )
            // InternalEclParser.g:915:2: ( ( rule__ConjunctionOperator__Alternatives ) )
            {
            // InternalEclParser.g:915:2: ( ( rule__ConjunctionOperator__Alternatives ) )
            // InternalEclParser.g:916:3: ( rule__ConjunctionOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionOperatorAccess().getAlternatives()); 
            }
            // InternalEclParser.g:917:3: ( rule__ConjunctionOperator__Alternatives )
            // InternalEclParser.g:917:4: rule__ConjunctionOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionOperatorAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleConjunctionOperator"


    // $ANTLR start "ruleDisjunctionOperator"
    // InternalEclParser.g:926:1: ruleDisjunctionOperator : ( ( OR ) ) ;
    public final void ruleDisjunctionOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:930:1: ( ( ( OR ) ) )
            // InternalEclParser.g:931:2: ( ( OR ) )
            {
            // InternalEclParser.g:931:2: ( ( OR ) )
            // InternalEclParser.g:932:3: ( OR )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionOperatorAccess().getDISJUNCTIONEnumLiteralDeclaration()); 
            }
            // InternalEclParser.g:933:3: ( OR )
            // InternalEclParser.g:933:4: OR
            {
            match(input,OR,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionOperatorAccess().getDISJUNCTIONEnumLiteralDeclaration()); 
            }

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
    // $ANTLR end "ruleDisjunctionOperator"


    // $ANTLR start "ruleExclusionOperator"
    // InternalEclParser.g:942:1: ruleExclusionOperator : ( ( MINUS ) ) ;
    public final void ruleExclusionOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:946:1: ( ( ( MINUS ) ) )
            // InternalEclParser.g:947:2: ( ( MINUS ) )
            {
            // InternalEclParser.g:947:2: ( ( MINUS ) )
            // InternalEclParser.g:948:3: ( MINUS )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExclusionOperatorAccess().getEXCLUSIONEnumLiteralDeclaration()); 
            }
            // InternalEclParser.g:949:3: ( MINUS )
            // InternalEclParser.g:949:4: MINUS
            {
            match(input,MINUS,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExclusionOperatorAccess().getEXCLUSIONEnumLiteralDeclaration()); 
            }

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
    // $ANTLR end "ruleExclusionOperator"


    // $ANTLR start "rule__SubRefinement__Alternatives"
    // InternalEclParser.g:957:1: rule__SubRefinement__Alternatives : ( ( ruleAttributeSetRefinement ) | ( ruleAttributeGroupRefinement ) | ( ruleParenthesizedRefinement ) );
    public final void rule__SubRefinement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:961:1: ( ( ruleAttributeSetRefinement ) | ( ruleAttributeGroupRefinement ) | ( ruleParenthesizedRefinement ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalEclParser.g:962:2: ( ruleAttributeSetRefinement )
                    {
                    // InternalEclParser.g:962:2: ( ruleAttributeSetRefinement )
                    // InternalEclParser.g:963:3: ruleAttributeSetRefinement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubRefinementAccess().getAttributeSetRefinementParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAttributeSetRefinement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubRefinementAccess().getAttributeSetRefinementParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:968:2: ( ruleAttributeGroupRefinement )
                    {
                    // InternalEclParser.g:968:2: ( ruleAttributeGroupRefinement )
                    // InternalEclParser.g:969:3: ruleAttributeGroupRefinement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubRefinementAccess().getAttributeGroupRefinementParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAttributeGroupRefinement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubRefinementAccess().getAttributeGroupRefinementParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEclParser.g:974:2: ( ruleParenthesizedRefinement )
                    {
                    // InternalEclParser.g:974:2: ( ruleParenthesizedRefinement )
                    // InternalEclParser.g:975:3: ruleParenthesizedRefinement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubRefinementAccess().getParenthesizedRefinementParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParenthesizedRefinement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubRefinementAccess().getParenthesizedRefinementParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__SubRefinement__Alternatives"


    // $ANTLR start "rule__PrimaryAttributeSet__Alternatives"
    // InternalEclParser.g:984:1: rule__PrimaryAttributeSet__Alternatives : ( ( ruleParenthesizedAttributeSet ) | ( ruleAttribute ) );
    public final void rule__PrimaryAttributeSet__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:988:1: ( ( ruleParenthesizedAttributeSet ) | ( ruleAttribute ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==LeftParenthesis) ) {
                alt3=1;
            }
            else if ( (LA3_0==LessThanSignLessThanSign||LA3_0==Asterisk||LA3_0==LessThanSign||LA3_0==LeftSquareBracket||LA3_0==RULE_REVERSE||LA3_0==RULE_INT) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEclParser.g:989:2: ( ruleParenthesizedAttributeSet )
                    {
                    // InternalEclParser.g:989:2: ( ruleParenthesizedAttributeSet )
                    // InternalEclParser.g:990:3: ruleParenthesizedAttributeSet
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAttributeSetAccess().getParenthesizedAttributeSetParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParenthesizedAttributeSet();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAttributeSetAccess().getParenthesizedAttributeSetParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:995:2: ( ruleAttribute )
                    {
                    // InternalEclParser.g:995:2: ( ruleAttribute )
                    // InternalEclParser.g:996:3: ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAttributeSetAccess().getAttributeParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAttribute();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAttributeSetAccess().getAttributeParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__PrimaryAttributeSet__Alternatives"


    // $ANTLR start "rule__Attribute__Alternatives_3"
    // InternalEclParser.g:1005:1: rule__Attribute__Alternatives_3 : ( ( ( rule__Attribute__ConceptRefAssignment_3_0 ) ) | ( ( rule__Attribute__WildcardAssignment_3_1 ) ) );
    public final void rule__Attribute__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1009:1: ( ( ( rule__Attribute__ConceptRefAssignment_3_0 ) ) | ( ( rule__Attribute__WildcardAssignment_3_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==Asterisk) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalEclParser.g:1010:2: ( ( rule__Attribute__ConceptRefAssignment_3_0 ) )
                    {
                    // InternalEclParser.g:1010:2: ( ( rule__Attribute__ConceptRefAssignment_3_0 ) )
                    // InternalEclParser.g:1011:3: ( rule__Attribute__ConceptRefAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getConceptRefAssignment_3_0()); 
                    }
                    // InternalEclParser.g:1012:3: ( rule__Attribute__ConceptRefAssignment_3_0 )
                    // InternalEclParser.g:1012:4: rule__Attribute__ConceptRefAssignment_3_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Attribute__ConceptRefAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeAccess().getConceptRefAssignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1016:2: ( ( rule__Attribute__WildcardAssignment_3_1 ) )
                    {
                    // InternalEclParser.g:1016:2: ( ( rule__Attribute__WildcardAssignment_3_1 ) )
                    // InternalEclParser.g:1017:3: ( rule__Attribute__WildcardAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getWildcardAssignment_3_1()); 
                    }
                    // InternalEclParser.g:1018:3: ( rule__Attribute__WildcardAssignment_3_1 )
                    // InternalEclParser.g:1018:4: rule__Attribute__WildcardAssignment_3_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Attribute__WildcardAssignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeAccess().getWildcardAssignment_3_1()); 
                    }

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
    // $ANTLR end "rule__Attribute__Alternatives_3"


    // $ANTLR start "rule__Cardinality__Alternatives_3"
    // InternalEclParser.g:1026:1: rule__Cardinality__Alternatives_3 : ( ( ( rule__Cardinality__ToAssignment_3_0 ) ) | ( ( rule__Cardinality__ManyAssignment_3_1 ) ) );
    public final void rule__Cardinality__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1030:1: ( ( ( rule__Cardinality__ToAssignment_3_0 ) ) | ( ( rule__Cardinality__ManyAssignment_3_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==Asterisk) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalEclParser.g:1031:2: ( ( rule__Cardinality__ToAssignment_3_0 ) )
                    {
                    // InternalEclParser.g:1031:2: ( ( rule__Cardinality__ToAssignment_3_0 ) )
                    // InternalEclParser.g:1032:3: ( rule__Cardinality__ToAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCardinalityAccess().getToAssignment_3_0()); 
                    }
                    // InternalEclParser.g:1033:3: ( rule__Cardinality__ToAssignment_3_0 )
                    // InternalEclParser.g:1033:4: rule__Cardinality__ToAssignment_3_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Cardinality__ToAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCardinalityAccess().getToAssignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1037:2: ( ( rule__Cardinality__ManyAssignment_3_1 ) )
                    {
                    // InternalEclParser.g:1037:2: ( ( rule__Cardinality__ManyAssignment_3_1 ) )
                    // InternalEclParser.g:1038:3: ( rule__Cardinality__ManyAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCardinalityAccess().getManyAssignment_3_1()); 
                    }
                    // InternalEclParser.g:1039:3: ( rule__Cardinality__ManyAssignment_3_1 )
                    // InternalEclParser.g:1039:4: rule__Cardinality__ManyAssignment_3_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Cardinality__ManyAssignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCardinalityAccess().getManyAssignment_3_1()); 
                    }

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
    // $ANTLR end "rule__Cardinality__Alternatives_3"


    // $ANTLR start "rule__AttributeValue__Alternatives"
    // InternalEclParser.g:1047:1: rule__AttributeValue__Alternatives : ( ( ruleExpressionValue ) | ( ruleNumericValue ) | ( ruleStringValue ) );
    public final void rule__AttributeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1051:1: ( ( ruleExpressionValue ) | ( ruleNumericValue ) | ( ruleStringValue ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case EqualsSign:
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
                    alt6=1;
                    }
                    break;
                case NumberSign:
                    {
                    alt6=2;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt6=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

                }
                break;
            case ExclamationMarkEqualsSign:
                {
                switch ( input.LA(2) ) {
                case NumberSign:
                    {
                    alt6=2;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt6=3;
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
                    alt6=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }

                }
                break;
            case LessThanSignEqualsSign:
            case GreaterThanSignEqualsSign:
            case LessThanSign:
            case GreaterThanSign:
                {
                alt6=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalEclParser.g:1052:2: ( ruleExpressionValue )
                    {
                    // InternalEclParser.g:1052:2: ( ruleExpressionValue )
                    // InternalEclParser.g:1053:3: ruleExpressionValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeValueAccess().getExpressionValueParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleExpressionValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeValueAccess().getExpressionValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1058:2: ( ruleNumericValue )
                    {
                    // InternalEclParser.g:1058:2: ( ruleNumericValue )
                    // InternalEclParser.g:1059:3: ruleNumericValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeValueAccess().getNumericValueParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNumericValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeValueAccess().getNumericValueParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEclParser.g:1064:2: ( ruleStringValue )
                    {
                    // InternalEclParser.g:1064:2: ( ruleStringValue )
                    // InternalEclParser.g:1065:3: ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeValueAccess().getStringValueParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeValueAccess().getStringValueParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__AttributeValue__Alternatives"


    // $ANTLR start "rule__PrimaryExpressionConstraint__Alternatives"
    // InternalEclParser.g:1074:1: rule__PrimaryExpressionConstraint__Alternatives : ( ( ruleSimpleExpressionConstraint ) | ( ( rule__PrimaryExpressionConstraint__Group_1__0 ) ) );
    public final void rule__PrimaryExpressionConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1078:1: ( ( ruleSimpleExpressionConstraint ) | ( ( rule__PrimaryExpressionConstraint__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LessThanSignLessThanSign||LA7_0==GreaterThanSignGreaterThanSign||LA7_0==Asterisk||LA7_0==LessThanSign||LA7_0==GreaterThanSign||LA7_0==CircumflexAccent||LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==LeftParenthesis) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalEclParser.g:1079:2: ( ruleSimpleExpressionConstraint )
                    {
                    // InternalEclParser.g:1079:2: ( ruleSimpleExpressionConstraint )
                    // InternalEclParser.g:1080:3: ruleSimpleExpressionConstraint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionConstraintAccess().getSimpleExpressionConstraintParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleSimpleExpressionConstraint();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionConstraintAccess().getSimpleExpressionConstraintParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1085:2: ( ( rule__PrimaryExpressionConstraint__Group_1__0 ) )
                    {
                    // InternalEclParser.g:1085:2: ( ( rule__PrimaryExpressionConstraint__Group_1__0 ) )
                    // InternalEclParser.g:1086:3: ( rule__PrimaryExpressionConstraint__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionConstraintAccess().getGroup_1()); 
                    }
                    // InternalEclParser.g:1087:3: ( rule__PrimaryExpressionConstraint__Group_1__0 )
                    // InternalEclParser.g:1087:4: rule__PrimaryExpressionConstraint__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PrimaryExpressionConstraint__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionConstraintAccess().getGroup_1()); 
                    }

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
    // $ANTLR end "rule__PrimaryExpressionConstraint__Alternatives"


    // $ANTLR start "rule__FocusConcept__Alternatives_1"
    // InternalEclParser.g:1095:1: rule__FocusConcept__Alternatives_1 : ( ( ( rule__FocusConcept__ConceptRefAssignment_1_0 ) ) | ( ( rule__FocusConcept__WildcardAssignment_1_1 ) ) );
    public final void rule__FocusConcept__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1099:1: ( ( ( rule__FocusConcept__ConceptRefAssignment_1_0 ) ) | ( ( rule__FocusConcept__WildcardAssignment_1_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==Asterisk) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalEclParser.g:1100:2: ( ( rule__FocusConcept__ConceptRefAssignment_1_0 ) )
                    {
                    // InternalEclParser.g:1100:2: ( ( rule__FocusConcept__ConceptRefAssignment_1_0 ) )
                    // InternalEclParser.g:1101:3: ( rule__FocusConcept__ConceptRefAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFocusConceptAccess().getConceptRefAssignment_1_0()); 
                    }
                    // InternalEclParser.g:1102:3: ( rule__FocusConcept__ConceptRefAssignment_1_0 )
                    // InternalEclParser.g:1102:4: rule__FocusConcept__ConceptRefAssignment_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__FocusConcept__ConceptRefAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFocusConceptAccess().getConceptRefAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1106:2: ( ( rule__FocusConcept__WildcardAssignment_1_1 ) )
                    {
                    // InternalEclParser.g:1106:2: ( ( rule__FocusConcept__WildcardAssignment_1_1 ) )
                    // InternalEclParser.g:1107:3: ( rule__FocusConcept__WildcardAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFocusConceptAccess().getWildcardAssignment_1_1()); 
                    }
                    // InternalEclParser.g:1108:3: ( rule__FocusConcept__WildcardAssignment_1_1 )
                    // InternalEclParser.g:1108:4: rule__FocusConcept__WildcardAssignment_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__FocusConcept__WildcardAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFocusConceptAccess().getWildcardAssignment_1_1()); 
                    }

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
    // $ANTLR end "rule__FocusConcept__Alternatives_1"


    // $ANTLR start "rule__ExpressionComparisonOperator__Alternatives"
    // InternalEclParser.g:1116:1: rule__ExpressionComparisonOperator__Alternatives : ( ( ( EqualsSign ) ) | ( ( ExclamationMarkEqualsSign ) ) );
    public final void rule__ExpressionComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1120:1: ( ( ( EqualsSign ) ) | ( ( ExclamationMarkEqualsSign ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==EqualsSign) ) {
                alt9=1;
            }
            else if ( (LA9_0==ExclamationMarkEqualsSign) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalEclParser.g:1121:2: ( ( EqualsSign ) )
                    {
                    // InternalEclParser.g:1121:2: ( ( EqualsSign ) )
                    // InternalEclParser.g:1122:3: ( EqualsSign )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_0()); 
                    }
                    // InternalEclParser.g:1123:3: ( EqualsSign )
                    // InternalEclParser.g:1123:4: EqualsSign
                    {
                    match(input,EqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1127:2: ( ( ExclamationMarkEqualsSign ) )
                    {
                    // InternalEclParser.g:1127:2: ( ( ExclamationMarkEqualsSign ) )
                    // InternalEclParser.g:1128:3: ( ExclamationMarkEqualsSign )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1()); 
                    }
                    // InternalEclParser.g:1129:3: ( ExclamationMarkEqualsSign )
                    // InternalEclParser.g:1129:4: ExclamationMarkEqualsSign
                    {
                    match(input,ExclamationMarkEqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1()); 
                    }

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
    // $ANTLR end "rule__ExpressionComparisonOperator__Alternatives"


    // $ANTLR start "rule__StringComparisonOperator__Alternatives"
    // InternalEclParser.g:1137:1: rule__StringComparisonOperator__Alternatives : ( ( ( EqualsSign ) ) | ( ( ExclamationMarkEqualsSign ) ) );
    public final void rule__StringComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1141:1: ( ( ( EqualsSign ) ) | ( ( ExclamationMarkEqualsSign ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==EqualsSign) ) {
                alt10=1;
            }
            else if ( (LA10_0==ExclamationMarkEqualsSign) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalEclParser.g:1142:2: ( ( EqualsSign ) )
                    {
                    // InternalEclParser.g:1142:2: ( ( EqualsSign ) )
                    // InternalEclParser.g:1143:3: ( EqualsSign )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStringComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_0()); 
                    }
                    // InternalEclParser.g:1144:3: ( EqualsSign )
                    // InternalEclParser.g:1144:4: EqualsSign
                    {
                    match(input,EqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStringComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1148:2: ( ( ExclamationMarkEqualsSign ) )
                    {
                    // InternalEclParser.g:1148:2: ( ( ExclamationMarkEqualsSign ) )
                    // InternalEclParser.g:1149:3: ( ExclamationMarkEqualsSign )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStringComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1()); 
                    }
                    // InternalEclParser.g:1150:3: ( ExclamationMarkEqualsSign )
                    // InternalEclParser.g:1150:4: ExclamationMarkEqualsSign
                    {
                    match(input,ExclamationMarkEqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStringComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1()); 
                    }

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
    // $ANTLR end "rule__StringComparisonOperator__Alternatives"


    // $ANTLR start "rule__NumericComparisonOperator__Alternatives"
    // InternalEclParser.g:1158:1: rule__NumericComparisonOperator__Alternatives : ( ( ( EqualsSign ) ) | ( ( ExclamationMarkEqualsSign ) ) | ( ( LessThanSign ) ) | ( ( LessThanSignEqualsSign ) ) | ( ( GreaterThanSign ) ) | ( ( GreaterThanSignEqualsSign ) ) );
    public final void rule__NumericComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1162:1: ( ( ( EqualsSign ) ) | ( ( ExclamationMarkEqualsSign ) ) | ( ( LessThanSign ) ) | ( ( LessThanSignEqualsSign ) ) | ( ( GreaterThanSign ) ) | ( ( GreaterThanSignEqualsSign ) ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case EqualsSign:
                {
                alt11=1;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt11=2;
                }
                break;
            case LessThanSign:
                {
                alt11=3;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt11=4;
                }
                break;
            case GreaterThanSign:
                {
                alt11=5;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt11=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalEclParser.g:1163:2: ( ( EqualsSign ) )
                    {
                    // InternalEclParser.g:1163:2: ( ( EqualsSign ) )
                    // InternalEclParser.g:1164:3: ( EqualsSign )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_0()); 
                    }
                    // InternalEclParser.g:1165:3: ( EqualsSign )
                    // InternalEclParser.g:1165:4: EqualsSign
                    {
                    match(input,EqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumericComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1169:2: ( ( ExclamationMarkEqualsSign ) )
                    {
                    // InternalEclParser.g:1169:2: ( ( ExclamationMarkEqualsSign ) )
                    // InternalEclParser.g:1170:3: ( ExclamationMarkEqualsSign )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1()); 
                    }
                    // InternalEclParser.g:1171:3: ( ExclamationMarkEqualsSign )
                    // InternalEclParser.g:1171:4: ExclamationMarkEqualsSign
                    {
                    match(input,ExclamationMarkEqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumericComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEclParser.g:1175:2: ( ( LessThanSign ) )
                    {
                    // InternalEclParser.g:1175:2: ( ( LessThanSign ) )
                    // InternalEclParser.g:1176:3: ( LessThanSign )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericComparisonOperatorAccess().getLESS_THANEnumLiteralDeclaration_2()); 
                    }
                    // InternalEclParser.g:1177:3: ( LessThanSign )
                    // InternalEclParser.g:1177:4: LessThanSign
                    {
                    match(input,LessThanSign,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumericComparisonOperatorAccess().getLESS_THANEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEclParser.g:1181:2: ( ( LessThanSignEqualsSign ) )
                    {
                    // InternalEclParser.g:1181:2: ( ( LessThanSignEqualsSign ) )
                    // InternalEclParser.g:1182:3: ( LessThanSignEqualsSign )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericComparisonOperatorAccess().getLESS_THAN_EQUALSEnumLiteralDeclaration_3()); 
                    }
                    // InternalEclParser.g:1183:3: ( LessThanSignEqualsSign )
                    // InternalEclParser.g:1183:4: LessThanSignEqualsSign
                    {
                    match(input,LessThanSignEqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumericComparisonOperatorAccess().getLESS_THAN_EQUALSEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEclParser.g:1187:2: ( ( GreaterThanSign ) )
                    {
                    // InternalEclParser.g:1187:2: ( ( GreaterThanSign ) )
                    // InternalEclParser.g:1188:3: ( GreaterThanSign )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericComparisonOperatorAccess().getGREATER_THANEnumLiteralDeclaration_4()); 
                    }
                    // InternalEclParser.g:1189:3: ( GreaterThanSign )
                    // InternalEclParser.g:1189:4: GreaterThanSign
                    {
                    match(input,GreaterThanSign,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumericComparisonOperatorAccess().getGREATER_THANEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalEclParser.g:1193:2: ( ( GreaterThanSignEqualsSign ) )
                    {
                    // InternalEclParser.g:1193:2: ( ( GreaterThanSignEqualsSign ) )
                    // InternalEclParser.g:1194:3: ( GreaterThanSignEqualsSign )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumericComparisonOperatorAccess().getGREATER_THAN_EQUALSEnumLiteralDeclaration_5()); 
                    }
                    // InternalEclParser.g:1195:3: ( GreaterThanSignEqualsSign )
                    // InternalEclParser.g:1195:4: GreaterThanSignEqualsSign
                    {
                    match(input,GreaterThanSignEqualsSign,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumericComparisonOperatorAccess().getGREATER_THAN_EQUALSEnumLiteralDeclaration_5()); 
                    }

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
    // $ANTLR end "rule__NumericComparisonOperator__Alternatives"


    // $ANTLR start "rule__ConstraintOperator__Alternatives"
    // InternalEclParser.g:1203:1: rule__ConstraintOperator__Alternatives : ( ( ( LessThanSign ) ) | ( ( LessThanSignLessThanSign ) ) | ( ( GreaterThanSign ) ) | ( ( GreaterThanSignGreaterThanSign ) ) );
    public final void rule__ConstraintOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1207:1: ( ( ( LessThanSign ) ) | ( ( LessThanSignLessThanSign ) ) | ( ( GreaterThanSign ) ) | ( ( GreaterThanSignGreaterThanSign ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case LessThanSign:
                {
                alt12=1;
                }
                break;
            case LessThanSignLessThanSign:
                {
                alt12=2;
                }
                break;
            case GreaterThanSign:
                {
                alt12=3;
                }
                break;
            case GreaterThanSignGreaterThanSign:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalEclParser.g:1208:2: ( ( LessThanSign ) )
                    {
                    // InternalEclParser.g:1208:2: ( ( LessThanSign ) )
                    // InternalEclParser.g:1209:3: ( LessThanSign )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstraintOperatorAccess().getDESCENDANTEnumLiteralDeclaration_0()); 
                    }
                    // InternalEclParser.g:1210:3: ( LessThanSign )
                    // InternalEclParser.g:1210:4: LessThanSign
                    {
                    match(input,LessThanSign,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstraintOperatorAccess().getDESCENDANTEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1214:2: ( ( LessThanSignLessThanSign ) )
                    {
                    // InternalEclParser.g:1214:2: ( ( LessThanSignLessThanSign ) )
                    // InternalEclParser.g:1215:3: ( LessThanSignLessThanSign )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstraintOperatorAccess().getDESCENDANT_OR_SELFEnumLiteralDeclaration_1()); 
                    }
                    // InternalEclParser.g:1216:3: ( LessThanSignLessThanSign )
                    // InternalEclParser.g:1216:4: LessThanSignLessThanSign
                    {
                    match(input,LessThanSignLessThanSign,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstraintOperatorAccess().getDESCENDANT_OR_SELFEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEclParser.g:1220:2: ( ( GreaterThanSign ) )
                    {
                    // InternalEclParser.g:1220:2: ( ( GreaterThanSign ) )
                    // InternalEclParser.g:1221:3: ( GreaterThanSign )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstraintOperatorAccess().getANCESTOREnumLiteralDeclaration_2()); 
                    }
                    // InternalEclParser.g:1222:3: ( GreaterThanSign )
                    // InternalEclParser.g:1222:4: GreaterThanSign
                    {
                    match(input,GreaterThanSign,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstraintOperatorAccess().getANCESTOREnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEclParser.g:1226:2: ( ( GreaterThanSignGreaterThanSign ) )
                    {
                    // InternalEclParser.g:1226:2: ( ( GreaterThanSignGreaterThanSign ) )
                    // InternalEclParser.g:1227:3: ( GreaterThanSignGreaterThanSign )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstraintOperatorAccess().getANCESTOR_OR_SELFEnumLiteralDeclaration_3()); 
                    }
                    // InternalEclParser.g:1228:3: ( GreaterThanSignGreaterThanSign )
                    // InternalEclParser.g:1228:4: GreaterThanSignGreaterThanSign
                    {
                    match(input,GreaterThanSignGreaterThanSign,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstraintOperatorAccess().getANCESTOR_OR_SELFEnumLiteralDeclaration_3()); 
                    }

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
    // $ANTLR end "rule__ConstraintOperator__Alternatives"


    // $ANTLR start "rule__AttributeOperator__Alternatives"
    // InternalEclParser.g:1236:1: rule__AttributeOperator__Alternatives : ( ( ( LessThanSign ) ) | ( ( LessThanSignLessThanSign ) ) );
    public final void rule__AttributeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1240:1: ( ( ( LessThanSign ) ) | ( ( LessThanSignLessThanSign ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LessThanSign) ) {
                alt13=1;
            }
            else if ( (LA13_0==LessThanSignLessThanSign) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalEclParser.g:1241:2: ( ( LessThanSign ) )
                    {
                    // InternalEclParser.g:1241:2: ( ( LessThanSign ) )
                    // InternalEclParser.g:1242:3: ( LessThanSign )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeOperatorAccess().getDESCENDANTEnumLiteralDeclaration_0()); 
                    }
                    // InternalEclParser.g:1243:3: ( LessThanSign )
                    // InternalEclParser.g:1243:4: LessThanSign
                    {
                    match(input,LessThanSign,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeOperatorAccess().getDESCENDANTEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1247:2: ( ( LessThanSignLessThanSign ) )
                    {
                    // InternalEclParser.g:1247:2: ( ( LessThanSignLessThanSign ) )
                    // InternalEclParser.g:1248:3: ( LessThanSignLessThanSign )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeOperatorAccess().getDESCENDANT_OR_SELFEnumLiteralDeclaration_1()); 
                    }
                    // InternalEclParser.g:1249:3: ( LessThanSignLessThanSign )
                    // InternalEclParser.g:1249:4: LessThanSignLessThanSign
                    {
                    match(input,LessThanSignLessThanSign,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeOperatorAccess().getDESCENDANT_OR_SELFEnumLiteralDeclaration_1()); 
                    }

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
    // $ANTLR end "rule__AttributeOperator__Alternatives"


    // $ANTLR start "rule__ConjunctionOperator__Alternatives"
    // InternalEclParser.g:1257:1: rule__ConjunctionOperator__Alternatives : ( ( ( AND ) ) | ( ( Comma ) ) );
    public final void rule__ConjunctionOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1261:1: ( ( ( AND ) ) | ( ( Comma ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==AND) ) {
                alt14=1;
            }
            else if ( (LA14_0==Comma) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalEclParser.g:1262:2: ( ( AND ) )
                    {
                    // InternalEclParser.g:1262:2: ( ( AND ) )
                    // InternalEclParser.g:1263:3: ( AND )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConjunctionOperatorAccess().getCONJUNCTIONEnumLiteralDeclaration_0()); 
                    }
                    // InternalEclParser.g:1264:3: ( AND )
                    // InternalEclParser.g:1264:4: AND
                    {
                    match(input,AND,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConjunctionOperatorAccess().getCONJUNCTIONEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1268:2: ( ( Comma ) )
                    {
                    // InternalEclParser.g:1268:2: ( ( Comma ) )
                    // InternalEclParser.g:1269:3: ( Comma )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConjunctionOperatorAccess().getCONJUNCTIONEnumLiteralDeclaration_1()); 
                    }
                    // InternalEclParser.g:1270:3: ( Comma )
                    // InternalEclParser.g:1270:4: Comma
                    {
                    match(input,Comma,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConjunctionOperatorAccess().getCONJUNCTIONEnumLiteralDeclaration_1()); 
                    }

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
    // $ANTLR end "rule__ConjunctionOperator__Alternatives"


    // $ANTLR start "rule__ExclusionExpressionConstraint__Group__0"
    // InternalEclParser.g:1278:1: rule__ExclusionExpressionConstraint__Group__0 : rule__ExclusionExpressionConstraint__Group__0__Impl rule__ExclusionExpressionConstraint__Group__1 ;
    public final void rule__ExclusionExpressionConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1282:1: ( rule__ExclusionExpressionConstraint__Group__0__Impl rule__ExclusionExpressionConstraint__Group__1 )
            // InternalEclParser.g:1283:2: rule__ExclusionExpressionConstraint__Group__0__Impl rule__ExclusionExpressionConstraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__ExclusionExpressionConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExclusionExpressionConstraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ExclusionExpressionConstraint__Group__0"


    // $ANTLR start "rule__ExclusionExpressionConstraint__Group__0__Impl"
    // InternalEclParser.g:1290:1: rule__ExclusionExpressionConstraint__Group__0__Impl : ( ruleDisjunctionExpressionConstraint ) ;
    public final void rule__ExclusionExpressionConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1294:1: ( ( ruleDisjunctionExpressionConstraint ) )
            // InternalEclParser.g:1295:1: ( ruleDisjunctionExpressionConstraint )
            {
            // InternalEclParser.g:1295:1: ( ruleDisjunctionExpressionConstraint )
            // InternalEclParser.g:1296:2: ruleDisjunctionExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExclusionExpressionConstraintAccess().getDisjunctionExpressionConstraintParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDisjunctionExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExclusionExpressionConstraintAccess().getDisjunctionExpressionConstraintParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__ExclusionExpressionConstraint__Group__0__Impl"


    // $ANTLR start "rule__ExclusionExpressionConstraint__Group__1"
    // InternalEclParser.g:1305:1: rule__ExclusionExpressionConstraint__Group__1 : rule__ExclusionExpressionConstraint__Group__1__Impl ;
    public final void rule__ExclusionExpressionConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1309:1: ( rule__ExclusionExpressionConstraint__Group__1__Impl )
            // InternalEclParser.g:1310:2: rule__ExclusionExpressionConstraint__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExclusionExpressionConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ExclusionExpressionConstraint__Group__1"


    // $ANTLR start "rule__ExclusionExpressionConstraint__Group__1__Impl"
    // InternalEclParser.g:1316:1: rule__ExclusionExpressionConstraint__Group__1__Impl : ( ( rule__ExclusionExpressionConstraint__Group_1__0 )* ) ;
    public final void rule__ExclusionExpressionConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1320:1: ( ( ( rule__ExclusionExpressionConstraint__Group_1__0 )* ) )
            // InternalEclParser.g:1321:1: ( ( rule__ExclusionExpressionConstraint__Group_1__0 )* )
            {
            // InternalEclParser.g:1321:1: ( ( rule__ExclusionExpressionConstraint__Group_1__0 )* )
            // InternalEclParser.g:1322:2: ( rule__ExclusionExpressionConstraint__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExclusionExpressionConstraintAccess().getGroup_1()); 
            }
            // InternalEclParser.g:1323:2: ( rule__ExclusionExpressionConstraint__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==MINUS) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalEclParser.g:1323:3: rule__ExclusionExpressionConstraint__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__ExclusionExpressionConstraint__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExclusionExpressionConstraintAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__ExclusionExpressionConstraint__Group__1__Impl"


    // $ANTLR start "rule__ExclusionExpressionConstraint__Group_1__0"
    // InternalEclParser.g:1332:1: rule__ExclusionExpressionConstraint__Group_1__0 : rule__ExclusionExpressionConstraint__Group_1__0__Impl rule__ExclusionExpressionConstraint__Group_1__1 ;
    public final void rule__ExclusionExpressionConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1336:1: ( rule__ExclusionExpressionConstraint__Group_1__0__Impl rule__ExclusionExpressionConstraint__Group_1__1 )
            // InternalEclParser.g:1337:2: rule__ExclusionExpressionConstraint__Group_1__0__Impl rule__ExclusionExpressionConstraint__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__ExclusionExpressionConstraint__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExclusionExpressionConstraint__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ExclusionExpressionConstraint__Group_1__0"


    // $ANTLR start "rule__ExclusionExpressionConstraint__Group_1__0__Impl"
    // InternalEclParser.g:1344:1: rule__ExclusionExpressionConstraint__Group_1__0__Impl : ( ( rule__ExclusionExpressionConstraint__Group_1_0__0 ) ) ;
    public final void rule__ExclusionExpressionConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1348:1: ( ( ( rule__ExclusionExpressionConstraint__Group_1_0__0 ) ) )
            // InternalEclParser.g:1349:1: ( ( rule__ExclusionExpressionConstraint__Group_1_0__0 ) )
            {
            // InternalEclParser.g:1349:1: ( ( rule__ExclusionExpressionConstraint__Group_1_0__0 ) )
            // InternalEclParser.g:1350:2: ( rule__ExclusionExpressionConstraint__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExclusionExpressionConstraintAccess().getGroup_1_0()); 
            }
            // InternalEclParser.g:1351:2: ( rule__ExclusionExpressionConstraint__Group_1_0__0 )
            // InternalEclParser.g:1351:3: rule__ExclusionExpressionConstraint__Group_1_0__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExclusionExpressionConstraint__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExclusionExpressionConstraintAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__ExclusionExpressionConstraint__Group_1__0__Impl"


    // $ANTLR start "rule__ExclusionExpressionConstraint__Group_1__1"
    // InternalEclParser.g:1359:1: rule__ExclusionExpressionConstraint__Group_1__1 : rule__ExclusionExpressionConstraint__Group_1__1__Impl ;
    public final void rule__ExclusionExpressionConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1363:1: ( rule__ExclusionExpressionConstraint__Group_1__1__Impl )
            // InternalEclParser.g:1364:2: rule__ExclusionExpressionConstraint__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExclusionExpressionConstraint__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ExclusionExpressionConstraint__Group_1__1"


    // $ANTLR start "rule__ExclusionExpressionConstraint__Group_1__1__Impl"
    // InternalEclParser.g:1370:1: rule__ExclusionExpressionConstraint__Group_1__1__Impl : ( ( rule__ExclusionExpressionConstraint__RightAssignment_1_1 ) ) ;
    public final void rule__ExclusionExpressionConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1374:1: ( ( ( rule__ExclusionExpressionConstraint__RightAssignment_1_1 ) ) )
            // InternalEclParser.g:1375:1: ( ( rule__ExclusionExpressionConstraint__RightAssignment_1_1 ) )
            {
            // InternalEclParser.g:1375:1: ( ( rule__ExclusionExpressionConstraint__RightAssignment_1_1 ) )
            // InternalEclParser.g:1376:2: ( rule__ExclusionExpressionConstraint__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExclusionExpressionConstraintAccess().getRightAssignment_1_1()); 
            }
            // InternalEclParser.g:1377:2: ( rule__ExclusionExpressionConstraint__RightAssignment_1_1 )
            // InternalEclParser.g:1377:3: rule__ExclusionExpressionConstraint__RightAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExclusionExpressionConstraint__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExclusionExpressionConstraintAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__ExclusionExpressionConstraint__Group_1__1__Impl"


    // $ANTLR start "rule__ExclusionExpressionConstraint__Group_1_0__0"
    // InternalEclParser.g:1386:1: rule__ExclusionExpressionConstraint__Group_1_0__0 : rule__ExclusionExpressionConstraint__Group_1_0__0__Impl ;
    public final void rule__ExclusionExpressionConstraint__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1390:1: ( rule__ExclusionExpressionConstraint__Group_1_0__0__Impl )
            // InternalEclParser.g:1391:2: rule__ExclusionExpressionConstraint__Group_1_0__0__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExclusionExpressionConstraint__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ExclusionExpressionConstraint__Group_1_0__0"


    // $ANTLR start "rule__ExclusionExpressionConstraint__Group_1_0__0__Impl"
    // InternalEclParser.g:1397:1: rule__ExclusionExpressionConstraint__Group_1_0__0__Impl : ( ( rule__ExclusionExpressionConstraint__Group_1_0_0__0 ) ) ;
    public final void rule__ExclusionExpressionConstraint__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1401:1: ( ( ( rule__ExclusionExpressionConstraint__Group_1_0_0__0 ) ) )
            // InternalEclParser.g:1402:1: ( ( rule__ExclusionExpressionConstraint__Group_1_0_0__0 ) )
            {
            // InternalEclParser.g:1402:1: ( ( rule__ExclusionExpressionConstraint__Group_1_0_0__0 ) )
            // InternalEclParser.g:1403:2: ( rule__ExclusionExpressionConstraint__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExclusionExpressionConstraintAccess().getGroup_1_0_0()); 
            }
            // InternalEclParser.g:1404:2: ( rule__ExclusionExpressionConstraint__Group_1_0_0__0 )
            // InternalEclParser.g:1404:3: rule__ExclusionExpressionConstraint__Group_1_0_0__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExclusionExpressionConstraint__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExclusionExpressionConstraintAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__ExclusionExpressionConstraint__Group_1_0__0__Impl"


    // $ANTLR start "rule__ExclusionExpressionConstraint__Group_1_0_0__0"
    // InternalEclParser.g:1413:1: rule__ExclusionExpressionConstraint__Group_1_0_0__0 : rule__ExclusionExpressionConstraint__Group_1_0_0__0__Impl rule__ExclusionExpressionConstraint__Group_1_0_0__1 ;
    public final void rule__ExclusionExpressionConstraint__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1417:1: ( rule__ExclusionExpressionConstraint__Group_1_0_0__0__Impl rule__ExclusionExpressionConstraint__Group_1_0_0__1 )
            // InternalEclParser.g:1418:2: rule__ExclusionExpressionConstraint__Group_1_0_0__0__Impl rule__ExclusionExpressionConstraint__Group_1_0_0__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__ExclusionExpressionConstraint__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExclusionExpressionConstraint__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ExclusionExpressionConstraint__Group_1_0_0__0"


    // $ANTLR start "rule__ExclusionExpressionConstraint__Group_1_0_0__0__Impl"
    // InternalEclParser.g:1425:1: rule__ExclusionExpressionConstraint__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__ExclusionExpressionConstraint__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1429:1: ( ( () ) )
            // InternalEclParser.g:1430:1: ( () )
            {
            // InternalEclParser.g:1430:1: ( () )
            // InternalEclParser.g:1431:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExclusionExpressionConstraintAccess().getExclusionExpressionConstraintLeftAction_1_0_0_0()); 
            }
            // InternalEclParser.g:1432:2: ()
            // InternalEclParser.g:1432:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExclusionExpressionConstraintAccess().getExclusionExpressionConstraintLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusionExpressionConstraint__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__ExclusionExpressionConstraint__Group_1_0_0__1"
    // InternalEclParser.g:1440:1: rule__ExclusionExpressionConstraint__Group_1_0_0__1 : rule__ExclusionExpressionConstraint__Group_1_0_0__1__Impl ;
    public final void rule__ExclusionExpressionConstraint__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1444:1: ( rule__ExclusionExpressionConstraint__Group_1_0_0__1__Impl )
            // InternalEclParser.g:1445:2: rule__ExclusionExpressionConstraint__Group_1_0_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExclusionExpressionConstraint__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ExclusionExpressionConstraint__Group_1_0_0__1"


    // $ANTLR start "rule__ExclusionExpressionConstraint__Group_1_0_0__1__Impl"
    // InternalEclParser.g:1451:1: rule__ExclusionExpressionConstraint__Group_1_0_0__1__Impl : ( ( rule__ExclusionExpressionConstraint__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__ExclusionExpressionConstraint__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1455:1: ( ( ( rule__ExclusionExpressionConstraint__OpAssignment_1_0_0_1 ) ) )
            // InternalEclParser.g:1456:1: ( ( rule__ExclusionExpressionConstraint__OpAssignment_1_0_0_1 ) )
            {
            // InternalEclParser.g:1456:1: ( ( rule__ExclusionExpressionConstraint__OpAssignment_1_0_0_1 ) )
            // InternalEclParser.g:1457:2: ( rule__ExclusionExpressionConstraint__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExclusionExpressionConstraintAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalEclParser.g:1458:2: ( rule__ExclusionExpressionConstraint__OpAssignment_1_0_0_1 )
            // InternalEclParser.g:1458:3: rule__ExclusionExpressionConstraint__OpAssignment_1_0_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExclusionExpressionConstraint__OpAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExclusionExpressionConstraintAccess().getOpAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__ExclusionExpressionConstraint__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__DisjunctionExpressionConstraint__Group__0"
    // InternalEclParser.g:1467:1: rule__DisjunctionExpressionConstraint__Group__0 : rule__DisjunctionExpressionConstraint__Group__0__Impl rule__DisjunctionExpressionConstraint__Group__1 ;
    public final void rule__DisjunctionExpressionConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1471:1: ( rule__DisjunctionExpressionConstraint__Group__0__Impl rule__DisjunctionExpressionConstraint__Group__1 )
            // InternalEclParser.g:1472:2: rule__DisjunctionExpressionConstraint__Group__0__Impl rule__DisjunctionExpressionConstraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__DisjunctionExpressionConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionExpressionConstraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DisjunctionExpressionConstraint__Group__0"


    // $ANTLR start "rule__DisjunctionExpressionConstraint__Group__0__Impl"
    // InternalEclParser.g:1479:1: rule__DisjunctionExpressionConstraint__Group__0__Impl : ( ruleConjunctionExpressionConstraint ) ;
    public final void rule__DisjunctionExpressionConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1483:1: ( ( ruleConjunctionExpressionConstraint ) )
            // InternalEclParser.g:1484:1: ( ruleConjunctionExpressionConstraint )
            {
            // InternalEclParser.g:1484:1: ( ruleConjunctionExpressionConstraint )
            // InternalEclParser.g:1485:2: ruleConjunctionExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionExpressionConstraintAccess().getConjunctionExpressionConstraintParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConjunctionExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionExpressionConstraintAccess().getConjunctionExpressionConstraintParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__DisjunctionExpressionConstraint__Group__0__Impl"


    // $ANTLR start "rule__DisjunctionExpressionConstraint__Group__1"
    // InternalEclParser.g:1494:1: rule__DisjunctionExpressionConstraint__Group__1 : rule__DisjunctionExpressionConstraint__Group__1__Impl ;
    public final void rule__DisjunctionExpressionConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1498:1: ( rule__DisjunctionExpressionConstraint__Group__1__Impl )
            // InternalEclParser.g:1499:2: rule__DisjunctionExpressionConstraint__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionExpressionConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DisjunctionExpressionConstraint__Group__1"


    // $ANTLR start "rule__DisjunctionExpressionConstraint__Group__1__Impl"
    // InternalEclParser.g:1505:1: rule__DisjunctionExpressionConstraint__Group__1__Impl : ( ( rule__DisjunctionExpressionConstraint__Group_1__0 )* ) ;
    public final void rule__DisjunctionExpressionConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1509:1: ( ( ( rule__DisjunctionExpressionConstraint__Group_1__0 )* ) )
            // InternalEclParser.g:1510:1: ( ( rule__DisjunctionExpressionConstraint__Group_1__0 )* )
            {
            // InternalEclParser.g:1510:1: ( ( rule__DisjunctionExpressionConstraint__Group_1__0 )* )
            // InternalEclParser.g:1511:2: ( rule__DisjunctionExpressionConstraint__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionExpressionConstraintAccess().getGroup_1()); 
            }
            // InternalEclParser.g:1512:2: ( rule__DisjunctionExpressionConstraint__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==OR) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalEclParser.g:1512:3: rule__DisjunctionExpressionConstraint__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__DisjunctionExpressionConstraint__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionExpressionConstraintAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__DisjunctionExpressionConstraint__Group__1__Impl"


    // $ANTLR start "rule__DisjunctionExpressionConstraint__Group_1__0"
    // InternalEclParser.g:1521:1: rule__DisjunctionExpressionConstraint__Group_1__0 : rule__DisjunctionExpressionConstraint__Group_1__0__Impl rule__DisjunctionExpressionConstraint__Group_1__1 ;
    public final void rule__DisjunctionExpressionConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1525:1: ( rule__DisjunctionExpressionConstraint__Group_1__0__Impl rule__DisjunctionExpressionConstraint__Group_1__1 )
            // InternalEclParser.g:1526:2: rule__DisjunctionExpressionConstraint__Group_1__0__Impl rule__DisjunctionExpressionConstraint__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__DisjunctionExpressionConstraint__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionExpressionConstraint__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DisjunctionExpressionConstraint__Group_1__0"


    // $ANTLR start "rule__DisjunctionExpressionConstraint__Group_1__0__Impl"
    // InternalEclParser.g:1533:1: rule__DisjunctionExpressionConstraint__Group_1__0__Impl : ( ( rule__DisjunctionExpressionConstraint__Group_1_0__0 ) ) ;
    public final void rule__DisjunctionExpressionConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1537:1: ( ( ( rule__DisjunctionExpressionConstraint__Group_1_0__0 ) ) )
            // InternalEclParser.g:1538:1: ( ( rule__DisjunctionExpressionConstraint__Group_1_0__0 ) )
            {
            // InternalEclParser.g:1538:1: ( ( rule__DisjunctionExpressionConstraint__Group_1_0__0 ) )
            // InternalEclParser.g:1539:2: ( rule__DisjunctionExpressionConstraint__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionExpressionConstraintAccess().getGroup_1_0()); 
            }
            // InternalEclParser.g:1540:2: ( rule__DisjunctionExpressionConstraint__Group_1_0__0 )
            // InternalEclParser.g:1540:3: rule__DisjunctionExpressionConstraint__Group_1_0__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionExpressionConstraint__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionExpressionConstraintAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__DisjunctionExpressionConstraint__Group_1__0__Impl"


    // $ANTLR start "rule__DisjunctionExpressionConstraint__Group_1__1"
    // InternalEclParser.g:1548:1: rule__DisjunctionExpressionConstraint__Group_1__1 : rule__DisjunctionExpressionConstraint__Group_1__1__Impl ;
    public final void rule__DisjunctionExpressionConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1552:1: ( rule__DisjunctionExpressionConstraint__Group_1__1__Impl )
            // InternalEclParser.g:1553:2: rule__DisjunctionExpressionConstraint__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionExpressionConstraint__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DisjunctionExpressionConstraint__Group_1__1"


    // $ANTLR start "rule__DisjunctionExpressionConstraint__Group_1__1__Impl"
    // InternalEclParser.g:1559:1: rule__DisjunctionExpressionConstraint__Group_1__1__Impl : ( ( rule__DisjunctionExpressionConstraint__RightAssignment_1_1 ) ) ;
    public final void rule__DisjunctionExpressionConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1563:1: ( ( ( rule__DisjunctionExpressionConstraint__RightAssignment_1_1 ) ) )
            // InternalEclParser.g:1564:1: ( ( rule__DisjunctionExpressionConstraint__RightAssignment_1_1 ) )
            {
            // InternalEclParser.g:1564:1: ( ( rule__DisjunctionExpressionConstraint__RightAssignment_1_1 ) )
            // InternalEclParser.g:1565:2: ( rule__DisjunctionExpressionConstraint__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionExpressionConstraintAccess().getRightAssignment_1_1()); 
            }
            // InternalEclParser.g:1566:2: ( rule__DisjunctionExpressionConstraint__RightAssignment_1_1 )
            // InternalEclParser.g:1566:3: rule__DisjunctionExpressionConstraint__RightAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionExpressionConstraint__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionExpressionConstraintAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__DisjunctionExpressionConstraint__Group_1__1__Impl"


    // $ANTLR start "rule__DisjunctionExpressionConstraint__Group_1_0__0"
    // InternalEclParser.g:1575:1: rule__DisjunctionExpressionConstraint__Group_1_0__0 : rule__DisjunctionExpressionConstraint__Group_1_0__0__Impl ;
    public final void rule__DisjunctionExpressionConstraint__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1579:1: ( rule__DisjunctionExpressionConstraint__Group_1_0__0__Impl )
            // InternalEclParser.g:1580:2: rule__DisjunctionExpressionConstraint__Group_1_0__0__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionExpressionConstraint__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DisjunctionExpressionConstraint__Group_1_0__0"


    // $ANTLR start "rule__DisjunctionExpressionConstraint__Group_1_0__0__Impl"
    // InternalEclParser.g:1586:1: rule__DisjunctionExpressionConstraint__Group_1_0__0__Impl : ( ( rule__DisjunctionExpressionConstraint__Group_1_0_0__0 ) ) ;
    public final void rule__DisjunctionExpressionConstraint__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1590:1: ( ( ( rule__DisjunctionExpressionConstraint__Group_1_0_0__0 ) ) )
            // InternalEclParser.g:1591:1: ( ( rule__DisjunctionExpressionConstraint__Group_1_0_0__0 ) )
            {
            // InternalEclParser.g:1591:1: ( ( rule__DisjunctionExpressionConstraint__Group_1_0_0__0 ) )
            // InternalEclParser.g:1592:2: ( rule__DisjunctionExpressionConstraint__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionExpressionConstraintAccess().getGroup_1_0_0()); 
            }
            // InternalEclParser.g:1593:2: ( rule__DisjunctionExpressionConstraint__Group_1_0_0__0 )
            // InternalEclParser.g:1593:3: rule__DisjunctionExpressionConstraint__Group_1_0_0__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionExpressionConstraint__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionExpressionConstraintAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__DisjunctionExpressionConstraint__Group_1_0__0__Impl"


    // $ANTLR start "rule__DisjunctionExpressionConstraint__Group_1_0_0__0"
    // InternalEclParser.g:1602:1: rule__DisjunctionExpressionConstraint__Group_1_0_0__0 : rule__DisjunctionExpressionConstraint__Group_1_0_0__0__Impl rule__DisjunctionExpressionConstraint__Group_1_0_0__1 ;
    public final void rule__DisjunctionExpressionConstraint__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1606:1: ( rule__DisjunctionExpressionConstraint__Group_1_0_0__0__Impl rule__DisjunctionExpressionConstraint__Group_1_0_0__1 )
            // InternalEclParser.g:1607:2: rule__DisjunctionExpressionConstraint__Group_1_0_0__0__Impl rule__DisjunctionExpressionConstraint__Group_1_0_0__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__DisjunctionExpressionConstraint__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionExpressionConstraint__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DisjunctionExpressionConstraint__Group_1_0_0__0"


    // $ANTLR start "rule__DisjunctionExpressionConstraint__Group_1_0_0__0__Impl"
    // InternalEclParser.g:1614:1: rule__DisjunctionExpressionConstraint__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DisjunctionExpressionConstraint__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1618:1: ( ( () ) )
            // InternalEclParser.g:1619:1: ( () )
            {
            // InternalEclParser.g:1619:1: ( () )
            // InternalEclParser.g:1620:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionExpressionConstraintAccess().getDisjunctionExpressionConstraintLeftAction_1_0_0_0()); 
            }
            // InternalEclParser.g:1621:2: ()
            // InternalEclParser.g:1621:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionExpressionConstraintAccess().getDisjunctionExpressionConstraintLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisjunctionExpressionConstraint__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__DisjunctionExpressionConstraint__Group_1_0_0__1"
    // InternalEclParser.g:1629:1: rule__DisjunctionExpressionConstraint__Group_1_0_0__1 : rule__DisjunctionExpressionConstraint__Group_1_0_0__1__Impl ;
    public final void rule__DisjunctionExpressionConstraint__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1633:1: ( rule__DisjunctionExpressionConstraint__Group_1_0_0__1__Impl )
            // InternalEclParser.g:1634:2: rule__DisjunctionExpressionConstraint__Group_1_0_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionExpressionConstraint__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DisjunctionExpressionConstraint__Group_1_0_0__1"


    // $ANTLR start "rule__DisjunctionExpressionConstraint__Group_1_0_0__1__Impl"
    // InternalEclParser.g:1640:1: rule__DisjunctionExpressionConstraint__Group_1_0_0__1__Impl : ( ( rule__DisjunctionExpressionConstraint__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__DisjunctionExpressionConstraint__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1644:1: ( ( ( rule__DisjunctionExpressionConstraint__OpAssignment_1_0_0_1 ) ) )
            // InternalEclParser.g:1645:1: ( ( rule__DisjunctionExpressionConstraint__OpAssignment_1_0_0_1 ) )
            {
            // InternalEclParser.g:1645:1: ( ( rule__DisjunctionExpressionConstraint__OpAssignment_1_0_0_1 ) )
            // InternalEclParser.g:1646:2: ( rule__DisjunctionExpressionConstraint__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionExpressionConstraintAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalEclParser.g:1647:2: ( rule__DisjunctionExpressionConstraint__OpAssignment_1_0_0_1 )
            // InternalEclParser.g:1647:3: rule__DisjunctionExpressionConstraint__OpAssignment_1_0_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionExpressionConstraint__OpAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionExpressionConstraintAccess().getOpAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__DisjunctionExpressionConstraint__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__ConjunctionExpressionConstraint__Group__0"
    // InternalEclParser.g:1656:1: rule__ConjunctionExpressionConstraint__Group__0 : rule__ConjunctionExpressionConstraint__Group__0__Impl rule__ConjunctionExpressionConstraint__Group__1 ;
    public final void rule__ConjunctionExpressionConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1660:1: ( rule__ConjunctionExpressionConstraint__Group__0__Impl rule__ConjunctionExpressionConstraint__Group__1 )
            // InternalEclParser.g:1661:2: rule__ConjunctionExpressionConstraint__Group__0__Impl rule__ConjunctionExpressionConstraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ConjunctionExpressionConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionExpressionConstraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConjunctionExpressionConstraint__Group__0"


    // $ANTLR start "rule__ConjunctionExpressionConstraint__Group__0__Impl"
    // InternalEclParser.g:1668:1: rule__ConjunctionExpressionConstraint__Group__0__Impl : ( ruleRefinedExpressionConstraint ) ;
    public final void rule__ConjunctionExpressionConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1672:1: ( ( ruleRefinedExpressionConstraint ) )
            // InternalEclParser.g:1673:1: ( ruleRefinedExpressionConstraint )
            {
            // InternalEclParser.g:1673:1: ( ruleRefinedExpressionConstraint )
            // InternalEclParser.g:1674:2: ruleRefinedExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionExpressionConstraintAccess().getRefinedExpressionConstraintParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRefinedExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionExpressionConstraintAccess().getRefinedExpressionConstraintParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__ConjunctionExpressionConstraint__Group__0__Impl"


    // $ANTLR start "rule__ConjunctionExpressionConstraint__Group__1"
    // InternalEclParser.g:1683:1: rule__ConjunctionExpressionConstraint__Group__1 : rule__ConjunctionExpressionConstraint__Group__1__Impl ;
    public final void rule__ConjunctionExpressionConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1687:1: ( rule__ConjunctionExpressionConstraint__Group__1__Impl )
            // InternalEclParser.g:1688:2: rule__ConjunctionExpressionConstraint__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionExpressionConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConjunctionExpressionConstraint__Group__1"


    // $ANTLR start "rule__ConjunctionExpressionConstraint__Group__1__Impl"
    // InternalEclParser.g:1694:1: rule__ConjunctionExpressionConstraint__Group__1__Impl : ( ( rule__ConjunctionExpressionConstraint__Group_1__0 )* ) ;
    public final void rule__ConjunctionExpressionConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1698:1: ( ( ( rule__ConjunctionExpressionConstraint__Group_1__0 )* ) )
            // InternalEclParser.g:1699:1: ( ( rule__ConjunctionExpressionConstraint__Group_1__0 )* )
            {
            // InternalEclParser.g:1699:1: ( ( rule__ConjunctionExpressionConstraint__Group_1__0 )* )
            // InternalEclParser.g:1700:2: ( rule__ConjunctionExpressionConstraint__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionExpressionConstraintAccess().getGroup_1()); 
            }
            // InternalEclParser.g:1701:2: ( rule__ConjunctionExpressionConstraint__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==AND||LA17_0==Comma) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalEclParser.g:1701:3: rule__ConjunctionExpressionConstraint__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    rule__ConjunctionExpressionConstraint__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionExpressionConstraintAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__ConjunctionExpressionConstraint__Group__1__Impl"


    // $ANTLR start "rule__ConjunctionExpressionConstraint__Group_1__0"
    // InternalEclParser.g:1710:1: rule__ConjunctionExpressionConstraint__Group_1__0 : rule__ConjunctionExpressionConstraint__Group_1__0__Impl rule__ConjunctionExpressionConstraint__Group_1__1 ;
    public final void rule__ConjunctionExpressionConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1714:1: ( rule__ConjunctionExpressionConstraint__Group_1__0__Impl rule__ConjunctionExpressionConstraint__Group_1__1 )
            // InternalEclParser.g:1715:2: rule__ConjunctionExpressionConstraint__Group_1__0__Impl rule__ConjunctionExpressionConstraint__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__ConjunctionExpressionConstraint__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionExpressionConstraint__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConjunctionExpressionConstraint__Group_1__0"


    // $ANTLR start "rule__ConjunctionExpressionConstraint__Group_1__0__Impl"
    // InternalEclParser.g:1722:1: rule__ConjunctionExpressionConstraint__Group_1__0__Impl : ( ( rule__ConjunctionExpressionConstraint__Group_1_0__0 ) ) ;
    public final void rule__ConjunctionExpressionConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1726:1: ( ( ( rule__ConjunctionExpressionConstraint__Group_1_0__0 ) ) )
            // InternalEclParser.g:1727:1: ( ( rule__ConjunctionExpressionConstraint__Group_1_0__0 ) )
            {
            // InternalEclParser.g:1727:1: ( ( rule__ConjunctionExpressionConstraint__Group_1_0__0 ) )
            // InternalEclParser.g:1728:2: ( rule__ConjunctionExpressionConstraint__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionExpressionConstraintAccess().getGroup_1_0()); 
            }
            // InternalEclParser.g:1729:2: ( rule__ConjunctionExpressionConstraint__Group_1_0__0 )
            // InternalEclParser.g:1729:3: rule__ConjunctionExpressionConstraint__Group_1_0__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionExpressionConstraint__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionExpressionConstraintAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__ConjunctionExpressionConstraint__Group_1__0__Impl"


    // $ANTLR start "rule__ConjunctionExpressionConstraint__Group_1__1"
    // InternalEclParser.g:1737:1: rule__ConjunctionExpressionConstraint__Group_1__1 : rule__ConjunctionExpressionConstraint__Group_1__1__Impl ;
    public final void rule__ConjunctionExpressionConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1741:1: ( rule__ConjunctionExpressionConstraint__Group_1__1__Impl )
            // InternalEclParser.g:1742:2: rule__ConjunctionExpressionConstraint__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionExpressionConstraint__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConjunctionExpressionConstraint__Group_1__1"


    // $ANTLR start "rule__ConjunctionExpressionConstraint__Group_1__1__Impl"
    // InternalEclParser.g:1748:1: rule__ConjunctionExpressionConstraint__Group_1__1__Impl : ( ( rule__ConjunctionExpressionConstraint__RightAssignment_1_1 ) ) ;
    public final void rule__ConjunctionExpressionConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1752:1: ( ( ( rule__ConjunctionExpressionConstraint__RightAssignment_1_1 ) ) )
            // InternalEclParser.g:1753:1: ( ( rule__ConjunctionExpressionConstraint__RightAssignment_1_1 ) )
            {
            // InternalEclParser.g:1753:1: ( ( rule__ConjunctionExpressionConstraint__RightAssignment_1_1 ) )
            // InternalEclParser.g:1754:2: ( rule__ConjunctionExpressionConstraint__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionExpressionConstraintAccess().getRightAssignment_1_1()); 
            }
            // InternalEclParser.g:1755:2: ( rule__ConjunctionExpressionConstraint__RightAssignment_1_1 )
            // InternalEclParser.g:1755:3: rule__ConjunctionExpressionConstraint__RightAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionExpressionConstraint__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionExpressionConstraintAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__ConjunctionExpressionConstraint__Group_1__1__Impl"


    // $ANTLR start "rule__ConjunctionExpressionConstraint__Group_1_0__0"
    // InternalEclParser.g:1764:1: rule__ConjunctionExpressionConstraint__Group_1_0__0 : rule__ConjunctionExpressionConstraint__Group_1_0__0__Impl ;
    public final void rule__ConjunctionExpressionConstraint__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1768:1: ( rule__ConjunctionExpressionConstraint__Group_1_0__0__Impl )
            // InternalEclParser.g:1769:2: rule__ConjunctionExpressionConstraint__Group_1_0__0__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionExpressionConstraint__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConjunctionExpressionConstraint__Group_1_0__0"


    // $ANTLR start "rule__ConjunctionExpressionConstraint__Group_1_0__0__Impl"
    // InternalEclParser.g:1775:1: rule__ConjunctionExpressionConstraint__Group_1_0__0__Impl : ( ( rule__ConjunctionExpressionConstraint__Group_1_0_0__0 ) ) ;
    public final void rule__ConjunctionExpressionConstraint__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1779:1: ( ( ( rule__ConjunctionExpressionConstraint__Group_1_0_0__0 ) ) )
            // InternalEclParser.g:1780:1: ( ( rule__ConjunctionExpressionConstraint__Group_1_0_0__0 ) )
            {
            // InternalEclParser.g:1780:1: ( ( rule__ConjunctionExpressionConstraint__Group_1_0_0__0 ) )
            // InternalEclParser.g:1781:2: ( rule__ConjunctionExpressionConstraint__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionExpressionConstraintAccess().getGroup_1_0_0()); 
            }
            // InternalEclParser.g:1782:2: ( rule__ConjunctionExpressionConstraint__Group_1_0_0__0 )
            // InternalEclParser.g:1782:3: rule__ConjunctionExpressionConstraint__Group_1_0_0__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionExpressionConstraint__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionExpressionConstraintAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__ConjunctionExpressionConstraint__Group_1_0__0__Impl"


    // $ANTLR start "rule__ConjunctionExpressionConstraint__Group_1_0_0__0"
    // InternalEclParser.g:1791:1: rule__ConjunctionExpressionConstraint__Group_1_0_0__0 : rule__ConjunctionExpressionConstraint__Group_1_0_0__0__Impl rule__ConjunctionExpressionConstraint__Group_1_0_0__1 ;
    public final void rule__ConjunctionExpressionConstraint__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1795:1: ( rule__ConjunctionExpressionConstraint__Group_1_0_0__0__Impl rule__ConjunctionExpressionConstraint__Group_1_0_0__1 )
            // InternalEclParser.g:1796:2: rule__ConjunctionExpressionConstraint__Group_1_0_0__0__Impl rule__ConjunctionExpressionConstraint__Group_1_0_0__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ConjunctionExpressionConstraint__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionExpressionConstraint__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConjunctionExpressionConstraint__Group_1_0_0__0"


    // $ANTLR start "rule__ConjunctionExpressionConstraint__Group_1_0_0__0__Impl"
    // InternalEclParser.g:1803:1: rule__ConjunctionExpressionConstraint__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__ConjunctionExpressionConstraint__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1807:1: ( ( () ) )
            // InternalEclParser.g:1808:1: ( () )
            {
            // InternalEclParser.g:1808:1: ( () )
            // InternalEclParser.g:1809:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionExpressionConstraintAccess().getConjunctionExpressionConstraintLeftAction_1_0_0_0()); 
            }
            // InternalEclParser.g:1810:2: ()
            // InternalEclParser.g:1810:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionExpressionConstraintAccess().getConjunctionExpressionConstraintLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConjunctionExpressionConstraint__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__ConjunctionExpressionConstraint__Group_1_0_0__1"
    // InternalEclParser.g:1818:1: rule__ConjunctionExpressionConstraint__Group_1_0_0__1 : rule__ConjunctionExpressionConstraint__Group_1_0_0__1__Impl ;
    public final void rule__ConjunctionExpressionConstraint__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1822:1: ( rule__ConjunctionExpressionConstraint__Group_1_0_0__1__Impl )
            // InternalEclParser.g:1823:2: rule__ConjunctionExpressionConstraint__Group_1_0_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionExpressionConstraint__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConjunctionExpressionConstraint__Group_1_0_0__1"


    // $ANTLR start "rule__ConjunctionExpressionConstraint__Group_1_0_0__1__Impl"
    // InternalEclParser.g:1829:1: rule__ConjunctionExpressionConstraint__Group_1_0_0__1__Impl : ( ( rule__ConjunctionExpressionConstraint__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__ConjunctionExpressionConstraint__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1833:1: ( ( ( rule__ConjunctionExpressionConstraint__OpAssignment_1_0_0_1 ) ) )
            // InternalEclParser.g:1834:1: ( ( rule__ConjunctionExpressionConstraint__OpAssignment_1_0_0_1 ) )
            {
            // InternalEclParser.g:1834:1: ( ( rule__ConjunctionExpressionConstraint__OpAssignment_1_0_0_1 ) )
            // InternalEclParser.g:1835:2: ( rule__ConjunctionExpressionConstraint__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionExpressionConstraintAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalEclParser.g:1836:2: ( rule__ConjunctionExpressionConstraint__OpAssignment_1_0_0_1 )
            // InternalEclParser.g:1836:3: rule__ConjunctionExpressionConstraint__OpAssignment_1_0_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionExpressionConstraint__OpAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionExpressionConstraintAccess().getOpAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__ConjunctionExpressionConstraint__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__RefinedExpressionConstraint__Group__0"
    // InternalEclParser.g:1845:1: rule__RefinedExpressionConstraint__Group__0 : rule__RefinedExpressionConstraint__Group__0__Impl rule__RefinedExpressionConstraint__Group__1 ;
    public final void rule__RefinedExpressionConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1849:1: ( rule__RefinedExpressionConstraint__Group__0__Impl rule__RefinedExpressionConstraint__Group__1 )
            // InternalEclParser.g:1850:2: rule__RefinedExpressionConstraint__Group__0__Impl rule__RefinedExpressionConstraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__RefinedExpressionConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RefinedExpressionConstraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RefinedExpressionConstraint__Group__0"


    // $ANTLR start "rule__RefinedExpressionConstraint__Group__0__Impl"
    // InternalEclParser.g:1857:1: rule__RefinedExpressionConstraint__Group__0__Impl : ( rulePrimaryExpressionConstraint ) ;
    public final void rule__RefinedExpressionConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1861:1: ( ( rulePrimaryExpressionConstraint ) )
            // InternalEclParser.g:1862:1: ( rulePrimaryExpressionConstraint )
            {
            // InternalEclParser.g:1862:1: ( rulePrimaryExpressionConstraint )
            // InternalEclParser.g:1863:2: rulePrimaryExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinedExpressionConstraintAccess().getPrimaryExpressionConstraintParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulePrimaryExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinedExpressionConstraintAccess().getPrimaryExpressionConstraintParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__RefinedExpressionConstraint__Group__0__Impl"


    // $ANTLR start "rule__RefinedExpressionConstraint__Group__1"
    // InternalEclParser.g:1872:1: rule__RefinedExpressionConstraint__Group__1 : rule__RefinedExpressionConstraint__Group__1__Impl ;
    public final void rule__RefinedExpressionConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1876:1: ( rule__RefinedExpressionConstraint__Group__1__Impl )
            // InternalEclParser.g:1877:2: rule__RefinedExpressionConstraint__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RefinedExpressionConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RefinedExpressionConstraint__Group__1"


    // $ANTLR start "rule__RefinedExpressionConstraint__Group__1__Impl"
    // InternalEclParser.g:1883:1: rule__RefinedExpressionConstraint__Group__1__Impl : ( ( rule__RefinedExpressionConstraint__Group_1__0 )? ) ;
    public final void rule__RefinedExpressionConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1887:1: ( ( ( rule__RefinedExpressionConstraint__Group_1__0 )? ) )
            // InternalEclParser.g:1888:1: ( ( rule__RefinedExpressionConstraint__Group_1__0 )? )
            {
            // InternalEclParser.g:1888:1: ( ( rule__RefinedExpressionConstraint__Group_1__0 )? )
            // InternalEclParser.g:1889:2: ( rule__RefinedExpressionConstraint__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinedExpressionConstraintAccess().getGroup_1()); 
            }
            // InternalEclParser.g:1890:2: ( rule__RefinedExpressionConstraint__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Colon) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEclParser.g:1890:3: rule__RefinedExpressionConstraint__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__RefinedExpressionConstraint__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinedExpressionConstraintAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__RefinedExpressionConstraint__Group__1__Impl"


    // $ANTLR start "rule__RefinedExpressionConstraint__Group_1__0"
    // InternalEclParser.g:1899:1: rule__RefinedExpressionConstraint__Group_1__0 : rule__RefinedExpressionConstraint__Group_1__0__Impl rule__RefinedExpressionConstraint__Group_1__1 ;
    public final void rule__RefinedExpressionConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1903:1: ( rule__RefinedExpressionConstraint__Group_1__0__Impl rule__RefinedExpressionConstraint__Group_1__1 )
            // InternalEclParser.g:1904:2: rule__RefinedExpressionConstraint__Group_1__0__Impl rule__RefinedExpressionConstraint__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__RefinedExpressionConstraint__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RefinedExpressionConstraint__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RefinedExpressionConstraint__Group_1__0"


    // $ANTLR start "rule__RefinedExpressionConstraint__Group_1__0__Impl"
    // InternalEclParser.g:1911:1: rule__RefinedExpressionConstraint__Group_1__0__Impl : ( () ) ;
    public final void rule__RefinedExpressionConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1915:1: ( ( () ) )
            // InternalEclParser.g:1916:1: ( () )
            {
            // InternalEclParser.g:1916:1: ( () )
            // InternalEclParser.g:1917:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinedExpressionConstraintAccess().getRefinedExpressionConstraintTargetAction_1_0()); 
            }
            // InternalEclParser.g:1918:2: ()
            // InternalEclParser.g:1918:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinedExpressionConstraintAccess().getRefinedExpressionConstraintTargetAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefinedExpressionConstraint__Group_1__0__Impl"


    // $ANTLR start "rule__RefinedExpressionConstraint__Group_1__1"
    // InternalEclParser.g:1926:1: rule__RefinedExpressionConstraint__Group_1__1 : rule__RefinedExpressionConstraint__Group_1__1__Impl rule__RefinedExpressionConstraint__Group_1__2 ;
    public final void rule__RefinedExpressionConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1930:1: ( rule__RefinedExpressionConstraint__Group_1__1__Impl rule__RefinedExpressionConstraint__Group_1__2 )
            // InternalEclParser.g:1931:2: rule__RefinedExpressionConstraint__Group_1__1__Impl rule__RefinedExpressionConstraint__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__RefinedExpressionConstraint__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RefinedExpressionConstraint__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RefinedExpressionConstraint__Group_1__1"


    // $ANTLR start "rule__RefinedExpressionConstraint__Group_1__1__Impl"
    // InternalEclParser.g:1938:1: rule__RefinedExpressionConstraint__Group_1__1__Impl : ( Colon ) ;
    public final void rule__RefinedExpressionConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1942:1: ( ( Colon ) )
            // InternalEclParser.g:1943:1: ( Colon )
            {
            // InternalEclParser.g:1943:1: ( Colon )
            // InternalEclParser.g:1944:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinedExpressionConstraintAccess().getColonKeyword_1_1()); 
            }
            match(input,Colon,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinedExpressionConstraintAccess().getColonKeyword_1_1()); 
            }

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
    // $ANTLR end "rule__RefinedExpressionConstraint__Group_1__1__Impl"


    // $ANTLR start "rule__RefinedExpressionConstraint__Group_1__2"
    // InternalEclParser.g:1953:1: rule__RefinedExpressionConstraint__Group_1__2 : rule__RefinedExpressionConstraint__Group_1__2__Impl ;
    public final void rule__RefinedExpressionConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1957:1: ( rule__RefinedExpressionConstraint__Group_1__2__Impl )
            // InternalEclParser.g:1958:2: rule__RefinedExpressionConstraint__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RefinedExpressionConstraint__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RefinedExpressionConstraint__Group_1__2"


    // $ANTLR start "rule__RefinedExpressionConstraint__Group_1__2__Impl"
    // InternalEclParser.g:1964:1: rule__RefinedExpressionConstraint__Group_1__2__Impl : ( ( rule__RefinedExpressionConstraint__RefinementAssignment_1_2 ) ) ;
    public final void rule__RefinedExpressionConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1968:1: ( ( ( rule__RefinedExpressionConstraint__RefinementAssignment_1_2 ) ) )
            // InternalEclParser.g:1969:1: ( ( rule__RefinedExpressionConstraint__RefinementAssignment_1_2 ) )
            {
            // InternalEclParser.g:1969:1: ( ( rule__RefinedExpressionConstraint__RefinementAssignment_1_2 ) )
            // InternalEclParser.g:1970:2: ( rule__RefinedExpressionConstraint__RefinementAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementAssignment_1_2()); 
            }
            // InternalEclParser.g:1971:2: ( rule__RefinedExpressionConstraint__RefinementAssignment_1_2 )
            // InternalEclParser.g:1971:3: rule__RefinedExpressionConstraint__RefinementAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RefinedExpressionConstraint__RefinementAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__RefinedExpressionConstraint__Group_1__2__Impl"


    // $ANTLR start "rule__DisjunctionRefinementSet__Group__0"
    // InternalEclParser.g:1980:1: rule__DisjunctionRefinementSet__Group__0 : rule__DisjunctionRefinementSet__Group__0__Impl rule__DisjunctionRefinementSet__Group__1 ;
    public final void rule__DisjunctionRefinementSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1984:1: ( rule__DisjunctionRefinementSet__Group__0__Impl rule__DisjunctionRefinementSet__Group__1 )
            // InternalEclParser.g:1985:2: rule__DisjunctionRefinementSet__Group__0__Impl rule__DisjunctionRefinementSet__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__DisjunctionRefinementSet__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionRefinementSet__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DisjunctionRefinementSet__Group__0"


    // $ANTLR start "rule__DisjunctionRefinementSet__Group__0__Impl"
    // InternalEclParser.g:1992:1: rule__DisjunctionRefinementSet__Group__0__Impl : ( ruleConjunctionRefinementSet ) ;
    public final void rule__DisjunctionRefinementSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1996:1: ( ( ruleConjunctionRefinementSet ) )
            // InternalEclParser.g:1997:1: ( ruleConjunctionRefinementSet )
            {
            // InternalEclParser.g:1997:1: ( ruleConjunctionRefinementSet )
            // InternalEclParser.g:1998:2: ruleConjunctionRefinementSet
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionRefinementSetAccess().getConjunctionRefinementSetParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConjunctionRefinementSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionRefinementSetAccess().getConjunctionRefinementSetParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__DisjunctionRefinementSet__Group__0__Impl"


    // $ANTLR start "rule__DisjunctionRefinementSet__Group__1"
    // InternalEclParser.g:2007:1: rule__DisjunctionRefinementSet__Group__1 : rule__DisjunctionRefinementSet__Group__1__Impl ;
    public final void rule__DisjunctionRefinementSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2011:1: ( rule__DisjunctionRefinementSet__Group__1__Impl )
            // InternalEclParser.g:2012:2: rule__DisjunctionRefinementSet__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionRefinementSet__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DisjunctionRefinementSet__Group__1"


    // $ANTLR start "rule__DisjunctionRefinementSet__Group__1__Impl"
    // InternalEclParser.g:2018:1: rule__DisjunctionRefinementSet__Group__1__Impl : ( ( rule__DisjunctionRefinementSet__Group_1__0 )* ) ;
    public final void rule__DisjunctionRefinementSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2022:1: ( ( ( rule__DisjunctionRefinementSet__Group_1__0 )* ) )
            // InternalEclParser.g:2023:1: ( ( rule__DisjunctionRefinementSet__Group_1__0 )* )
            {
            // InternalEclParser.g:2023:1: ( ( rule__DisjunctionRefinementSet__Group_1__0 )* )
            // InternalEclParser.g:2024:2: ( rule__DisjunctionRefinementSet__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionRefinementSetAccess().getGroup_1()); 
            }
            // InternalEclParser.g:2025:2: ( rule__DisjunctionRefinementSet__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==OR) ) {
                    int LA19_5 = input.LA(2);

                    if ( (synpred27_InternalEclParser()) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalEclParser.g:2025:3: rule__DisjunctionRefinementSet__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__DisjunctionRefinementSet__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionRefinementSetAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__DisjunctionRefinementSet__Group__1__Impl"


    // $ANTLR start "rule__DisjunctionRefinementSet__Group_1__0"
    // InternalEclParser.g:2034:1: rule__DisjunctionRefinementSet__Group_1__0 : rule__DisjunctionRefinementSet__Group_1__0__Impl rule__DisjunctionRefinementSet__Group_1__1 ;
    public final void rule__DisjunctionRefinementSet__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2038:1: ( rule__DisjunctionRefinementSet__Group_1__0__Impl rule__DisjunctionRefinementSet__Group_1__1 )
            // InternalEclParser.g:2039:2: rule__DisjunctionRefinementSet__Group_1__0__Impl rule__DisjunctionRefinementSet__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__DisjunctionRefinementSet__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionRefinementSet__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DisjunctionRefinementSet__Group_1__0"


    // $ANTLR start "rule__DisjunctionRefinementSet__Group_1__0__Impl"
    // InternalEclParser.g:2046:1: rule__DisjunctionRefinementSet__Group_1__0__Impl : ( ( rule__DisjunctionRefinementSet__Group_1_0__0 ) ) ;
    public final void rule__DisjunctionRefinementSet__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2050:1: ( ( ( rule__DisjunctionRefinementSet__Group_1_0__0 ) ) )
            // InternalEclParser.g:2051:1: ( ( rule__DisjunctionRefinementSet__Group_1_0__0 ) )
            {
            // InternalEclParser.g:2051:1: ( ( rule__DisjunctionRefinementSet__Group_1_0__0 ) )
            // InternalEclParser.g:2052:2: ( rule__DisjunctionRefinementSet__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionRefinementSetAccess().getGroup_1_0()); 
            }
            // InternalEclParser.g:2053:2: ( rule__DisjunctionRefinementSet__Group_1_0__0 )
            // InternalEclParser.g:2053:3: rule__DisjunctionRefinementSet__Group_1_0__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionRefinementSet__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionRefinementSetAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__DisjunctionRefinementSet__Group_1__0__Impl"


    // $ANTLR start "rule__DisjunctionRefinementSet__Group_1__1"
    // InternalEclParser.g:2061:1: rule__DisjunctionRefinementSet__Group_1__1 : rule__DisjunctionRefinementSet__Group_1__1__Impl ;
    public final void rule__DisjunctionRefinementSet__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2065:1: ( rule__DisjunctionRefinementSet__Group_1__1__Impl )
            // InternalEclParser.g:2066:2: rule__DisjunctionRefinementSet__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionRefinementSet__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DisjunctionRefinementSet__Group_1__1"


    // $ANTLR start "rule__DisjunctionRefinementSet__Group_1__1__Impl"
    // InternalEclParser.g:2072:1: rule__DisjunctionRefinementSet__Group_1__1__Impl : ( ( rule__DisjunctionRefinementSet__RightAssignment_1_1 ) ) ;
    public final void rule__DisjunctionRefinementSet__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2076:1: ( ( ( rule__DisjunctionRefinementSet__RightAssignment_1_1 ) ) )
            // InternalEclParser.g:2077:1: ( ( rule__DisjunctionRefinementSet__RightAssignment_1_1 ) )
            {
            // InternalEclParser.g:2077:1: ( ( rule__DisjunctionRefinementSet__RightAssignment_1_1 ) )
            // InternalEclParser.g:2078:2: ( rule__DisjunctionRefinementSet__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionRefinementSetAccess().getRightAssignment_1_1()); 
            }
            // InternalEclParser.g:2079:2: ( rule__DisjunctionRefinementSet__RightAssignment_1_1 )
            // InternalEclParser.g:2079:3: rule__DisjunctionRefinementSet__RightAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionRefinementSet__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionRefinementSetAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__DisjunctionRefinementSet__Group_1__1__Impl"


    // $ANTLR start "rule__DisjunctionRefinementSet__Group_1_0__0"
    // InternalEclParser.g:2088:1: rule__DisjunctionRefinementSet__Group_1_0__0 : rule__DisjunctionRefinementSet__Group_1_0__0__Impl ;
    public final void rule__DisjunctionRefinementSet__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2092:1: ( rule__DisjunctionRefinementSet__Group_1_0__0__Impl )
            // InternalEclParser.g:2093:2: rule__DisjunctionRefinementSet__Group_1_0__0__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionRefinementSet__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DisjunctionRefinementSet__Group_1_0__0"


    // $ANTLR start "rule__DisjunctionRefinementSet__Group_1_0__0__Impl"
    // InternalEclParser.g:2099:1: rule__DisjunctionRefinementSet__Group_1_0__0__Impl : ( ( rule__DisjunctionRefinementSet__Group_1_0_0__0 ) ) ;
    public final void rule__DisjunctionRefinementSet__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2103:1: ( ( ( rule__DisjunctionRefinementSet__Group_1_0_0__0 ) ) )
            // InternalEclParser.g:2104:1: ( ( rule__DisjunctionRefinementSet__Group_1_0_0__0 ) )
            {
            // InternalEclParser.g:2104:1: ( ( rule__DisjunctionRefinementSet__Group_1_0_0__0 ) )
            // InternalEclParser.g:2105:2: ( rule__DisjunctionRefinementSet__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionRefinementSetAccess().getGroup_1_0_0()); 
            }
            // InternalEclParser.g:2106:2: ( rule__DisjunctionRefinementSet__Group_1_0_0__0 )
            // InternalEclParser.g:2106:3: rule__DisjunctionRefinementSet__Group_1_0_0__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionRefinementSet__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionRefinementSetAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__DisjunctionRefinementSet__Group_1_0__0__Impl"


    // $ANTLR start "rule__DisjunctionRefinementSet__Group_1_0_0__0"
    // InternalEclParser.g:2115:1: rule__DisjunctionRefinementSet__Group_1_0_0__0 : rule__DisjunctionRefinementSet__Group_1_0_0__0__Impl rule__DisjunctionRefinementSet__Group_1_0_0__1 ;
    public final void rule__DisjunctionRefinementSet__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2119:1: ( rule__DisjunctionRefinementSet__Group_1_0_0__0__Impl rule__DisjunctionRefinementSet__Group_1_0_0__1 )
            // InternalEclParser.g:2120:2: rule__DisjunctionRefinementSet__Group_1_0_0__0__Impl rule__DisjunctionRefinementSet__Group_1_0_0__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__DisjunctionRefinementSet__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionRefinementSet__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DisjunctionRefinementSet__Group_1_0_0__0"


    // $ANTLR start "rule__DisjunctionRefinementSet__Group_1_0_0__0__Impl"
    // InternalEclParser.g:2127:1: rule__DisjunctionRefinementSet__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DisjunctionRefinementSet__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2131:1: ( ( () ) )
            // InternalEclParser.g:2132:1: ( () )
            {
            // InternalEclParser.g:2132:1: ( () )
            // InternalEclParser.g:2133:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionRefinementSetAccess().getDisjunctionRefinementSetLeftAction_1_0_0_0()); 
            }
            // InternalEclParser.g:2134:2: ()
            // InternalEclParser.g:2134:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionRefinementSetAccess().getDisjunctionRefinementSetLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisjunctionRefinementSet__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__DisjunctionRefinementSet__Group_1_0_0__1"
    // InternalEclParser.g:2142:1: rule__DisjunctionRefinementSet__Group_1_0_0__1 : rule__DisjunctionRefinementSet__Group_1_0_0__1__Impl ;
    public final void rule__DisjunctionRefinementSet__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2146:1: ( rule__DisjunctionRefinementSet__Group_1_0_0__1__Impl )
            // InternalEclParser.g:2147:2: rule__DisjunctionRefinementSet__Group_1_0_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionRefinementSet__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DisjunctionRefinementSet__Group_1_0_0__1"


    // $ANTLR start "rule__DisjunctionRefinementSet__Group_1_0_0__1__Impl"
    // InternalEclParser.g:2153:1: rule__DisjunctionRefinementSet__Group_1_0_0__1__Impl : ( ( rule__DisjunctionRefinementSet__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__DisjunctionRefinementSet__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2157:1: ( ( ( rule__DisjunctionRefinementSet__OpAssignment_1_0_0_1 ) ) )
            // InternalEclParser.g:2158:1: ( ( rule__DisjunctionRefinementSet__OpAssignment_1_0_0_1 ) )
            {
            // InternalEclParser.g:2158:1: ( ( rule__DisjunctionRefinementSet__OpAssignment_1_0_0_1 ) )
            // InternalEclParser.g:2159:2: ( rule__DisjunctionRefinementSet__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionRefinementSetAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalEclParser.g:2160:2: ( rule__DisjunctionRefinementSet__OpAssignment_1_0_0_1 )
            // InternalEclParser.g:2160:3: rule__DisjunctionRefinementSet__OpAssignment_1_0_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionRefinementSet__OpAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionRefinementSetAccess().getOpAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__DisjunctionRefinementSet__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__ConjunctionRefinementSet__Group__0"
    // InternalEclParser.g:2169:1: rule__ConjunctionRefinementSet__Group__0 : rule__ConjunctionRefinementSet__Group__0__Impl rule__ConjunctionRefinementSet__Group__1 ;
    public final void rule__ConjunctionRefinementSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2173:1: ( rule__ConjunctionRefinementSet__Group__0__Impl rule__ConjunctionRefinementSet__Group__1 )
            // InternalEclParser.g:2174:2: rule__ConjunctionRefinementSet__Group__0__Impl rule__ConjunctionRefinementSet__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ConjunctionRefinementSet__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionRefinementSet__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConjunctionRefinementSet__Group__0"


    // $ANTLR start "rule__ConjunctionRefinementSet__Group__0__Impl"
    // InternalEclParser.g:2181:1: rule__ConjunctionRefinementSet__Group__0__Impl : ( ruleSubRefinement ) ;
    public final void rule__ConjunctionRefinementSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2185:1: ( ( ruleSubRefinement ) )
            // InternalEclParser.g:2186:1: ( ruleSubRefinement )
            {
            // InternalEclParser.g:2186:1: ( ruleSubRefinement )
            // InternalEclParser.g:2187:2: ruleSubRefinement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionRefinementSetAccess().getSubRefinementParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSubRefinement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionRefinementSetAccess().getSubRefinementParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__ConjunctionRefinementSet__Group__0__Impl"


    // $ANTLR start "rule__ConjunctionRefinementSet__Group__1"
    // InternalEclParser.g:2196:1: rule__ConjunctionRefinementSet__Group__1 : rule__ConjunctionRefinementSet__Group__1__Impl ;
    public final void rule__ConjunctionRefinementSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2200:1: ( rule__ConjunctionRefinementSet__Group__1__Impl )
            // InternalEclParser.g:2201:2: rule__ConjunctionRefinementSet__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionRefinementSet__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConjunctionRefinementSet__Group__1"


    // $ANTLR start "rule__ConjunctionRefinementSet__Group__1__Impl"
    // InternalEclParser.g:2207:1: rule__ConjunctionRefinementSet__Group__1__Impl : ( ( rule__ConjunctionRefinementSet__Group_1__0 )* ) ;
    public final void rule__ConjunctionRefinementSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2211:1: ( ( ( rule__ConjunctionRefinementSet__Group_1__0 )* ) )
            // InternalEclParser.g:2212:1: ( ( rule__ConjunctionRefinementSet__Group_1__0 )* )
            {
            // InternalEclParser.g:2212:1: ( ( rule__ConjunctionRefinementSet__Group_1__0 )* )
            // InternalEclParser.g:2213:2: ( rule__ConjunctionRefinementSet__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionRefinementSetAccess().getGroup_1()); 
            }
            // InternalEclParser.g:2214:2: ( rule__ConjunctionRefinementSet__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==AND) ) {
                    int LA20_4 = input.LA(2);

                    if ( (synpred28_InternalEclParser()) ) {
                        alt20=1;
                    }


                }
                else if ( (LA20_0==Comma) ) {
                    int LA20_5 = input.LA(2);

                    if ( (synpred28_InternalEclParser()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // InternalEclParser.g:2214:3: rule__ConjunctionRefinementSet__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    rule__ConjunctionRefinementSet__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionRefinementSetAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__ConjunctionRefinementSet__Group__1__Impl"


    // $ANTLR start "rule__ConjunctionRefinementSet__Group_1__0"
    // InternalEclParser.g:2223:1: rule__ConjunctionRefinementSet__Group_1__0 : rule__ConjunctionRefinementSet__Group_1__0__Impl rule__ConjunctionRefinementSet__Group_1__1 ;
    public final void rule__ConjunctionRefinementSet__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2227:1: ( rule__ConjunctionRefinementSet__Group_1__0__Impl rule__ConjunctionRefinementSet__Group_1__1 )
            // InternalEclParser.g:2228:2: rule__ConjunctionRefinementSet__Group_1__0__Impl rule__ConjunctionRefinementSet__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__ConjunctionRefinementSet__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionRefinementSet__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConjunctionRefinementSet__Group_1__0"


    // $ANTLR start "rule__ConjunctionRefinementSet__Group_1__0__Impl"
    // InternalEclParser.g:2235:1: rule__ConjunctionRefinementSet__Group_1__0__Impl : ( ( rule__ConjunctionRefinementSet__Group_1_0__0 ) ) ;
    public final void rule__ConjunctionRefinementSet__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2239:1: ( ( ( rule__ConjunctionRefinementSet__Group_1_0__0 ) ) )
            // InternalEclParser.g:2240:1: ( ( rule__ConjunctionRefinementSet__Group_1_0__0 ) )
            {
            // InternalEclParser.g:2240:1: ( ( rule__ConjunctionRefinementSet__Group_1_0__0 ) )
            // InternalEclParser.g:2241:2: ( rule__ConjunctionRefinementSet__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionRefinementSetAccess().getGroup_1_0()); 
            }
            // InternalEclParser.g:2242:2: ( rule__ConjunctionRefinementSet__Group_1_0__0 )
            // InternalEclParser.g:2242:3: rule__ConjunctionRefinementSet__Group_1_0__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionRefinementSet__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionRefinementSetAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__ConjunctionRefinementSet__Group_1__0__Impl"


    // $ANTLR start "rule__ConjunctionRefinementSet__Group_1__1"
    // InternalEclParser.g:2250:1: rule__ConjunctionRefinementSet__Group_1__1 : rule__ConjunctionRefinementSet__Group_1__1__Impl ;
    public final void rule__ConjunctionRefinementSet__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2254:1: ( rule__ConjunctionRefinementSet__Group_1__1__Impl )
            // InternalEclParser.g:2255:2: rule__ConjunctionRefinementSet__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionRefinementSet__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConjunctionRefinementSet__Group_1__1"


    // $ANTLR start "rule__ConjunctionRefinementSet__Group_1__1__Impl"
    // InternalEclParser.g:2261:1: rule__ConjunctionRefinementSet__Group_1__1__Impl : ( ( rule__ConjunctionRefinementSet__RightAssignment_1_1 ) ) ;
    public final void rule__ConjunctionRefinementSet__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2265:1: ( ( ( rule__ConjunctionRefinementSet__RightAssignment_1_1 ) ) )
            // InternalEclParser.g:2266:1: ( ( rule__ConjunctionRefinementSet__RightAssignment_1_1 ) )
            {
            // InternalEclParser.g:2266:1: ( ( rule__ConjunctionRefinementSet__RightAssignment_1_1 ) )
            // InternalEclParser.g:2267:2: ( rule__ConjunctionRefinementSet__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionRefinementSetAccess().getRightAssignment_1_1()); 
            }
            // InternalEclParser.g:2268:2: ( rule__ConjunctionRefinementSet__RightAssignment_1_1 )
            // InternalEclParser.g:2268:3: rule__ConjunctionRefinementSet__RightAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionRefinementSet__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionRefinementSetAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__ConjunctionRefinementSet__Group_1__1__Impl"


    // $ANTLR start "rule__ConjunctionRefinementSet__Group_1_0__0"
    // InternalEclParser.g:2277:1: rule__ConjunctionRefinementSet__Group_1_0__0 : rule__ConjunctionRefinementSet__Group_1_0__0__Impl ;
    public final void rule__ConjunctionRefinementSet__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2281:1: ( rule__ConjunctionRefinementSet__Group_1_0__0__Impl )
            // InternalEclParser.g:2282:2: rule__ConjunctionRefinementSet__Group_1_0__0__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionRefinementSet__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConjunctionRefinementSet__Group_1_0__0"


    // $ANTLR start "rule__ConjunctionRefinementSet__Group_1_0__0__Impl"
    // InternalEclParser.g:2288:1: rule__ConjunctionRefinementSet__Group_1_0__0__Impl : ( ( rule__ConjunctionRefinementSet__Group_1_0_0__0 ) ) ;
    public final void rule__ConjunctionRefinementSet__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2292:1: ( ( ( rule__ConjunctionRefinementSet__Group_1_0_0__0 ) ) )
            // InternalEclParser.g:2293:1: ( ( rule__ConjunctionRefinementSet__Group_1_0_0__0 ) )
            {
            // InternalEclParser.g:2293:1: ( ( rule__ConjunctionRefinementSet__Group_1_0_0__0 ) )
            // InternalEclParser.g:2294:2: ( rule__ConjunctionRefinementSet__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionRefinementSetAccess().getGroup_1_0_0()); 
            }
            // InternalEclParser.g:2295:2: ( rule__ConjunctionRefinementSet__Group_1_0_0__0 )
            // InternalEclParser.g:2295:3: rule__ConjunctionRefinementSet__Group_1_0_0__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionRefinementSet__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionRefinementSetAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__ConjunctionRefinementSet__Group_1_0__0__Impl"


    // $ANTLR start "rule__ConjunctionRefinementSet__Group_1_0_0__0"
    // InternalEclParser.g:2304:1: rule__ConjunctionRefinementSet__Group_1_0_0__0 : rule__ConjunctionRefinementSet__Group_1_0_0__0__Impl rule__ConjunctionRefinementSet__Group_1_0_0__1 ;
    public final void rule__ConjunctionRefinementSet__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2308:1: ( rule__ConjunctionRefinementSet__Group_1_0_0__0__Impl rule__ConjunctionRefinementSet__Group_1_0_0__1 )
            // InternalEclParser.g:2309:2: rule__ConjunctionRefinementSet__Group_1_0_0__0__Impl rule__ConjunctionRefinementSet__Group_1_0_0__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ConjunctionRefinementSet__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionRefinementSet__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConjunctionRefinementSet__Group_1_0_0__0"


    // $ANTLR start "rule__ConjunctionRefinementSet__Group_1_0_0__0__Impl"
    // InternalEclParser.g:2316:1: rule__ConjunctionRefinementSet__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__ConjunctionRefinementSet__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2320:1: ( ( () ) )
            // InternalEclParser.g:2321:1: ( () )
            {
            // InternalEclParser.g:2321:1: ( () )
            // InternalEclParser.g:2322:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionRefinementSetAccess().getConjunctionRefinementSetLeftAction_1_0_0_0()); 
            }
            // InternalEclParser.g:2323:2: ()
            // InternalEclParser.g:2323:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionRefinementSetAccess().getConjunctionRefinementSetLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConjunctionRefinementSet__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__ConjunctionRefinementSet__Group_1_0_0__1"
    // InternalEclParser.g:2331:1: rule__ConjunctionRefinementSet__Group_1_0_0__1 : rule__ConjunctionRefinementSet__Group_1_0_0__1__Impl ;
    public final void rule__ConjunctionRefinementSet__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2335:1: ( rule__ConjunctionRefinementSet__Group_1_0_0__1__Impl )
            // InternalEclParser.g:2336:2: rule__ConjunctionRefinementSet__Group_1_0_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionRefinementSet__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConjunctionRefinementSet__Group_1_0_0__1"


    // $ANTLR start "rule__ConjunctionRefinementSet__Group_1_0_0__1__Impl"
    // InternalEclParser.g:2342:1: rule__ConjunctionRefinementSet__Group_1_0_0__1__Impl : ( ( rule__ConjunctionRefinementSet__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__ConjunctionRefinementSet__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2346:1: ( ( ( rule__ConjunctionRefinementSet__OpAssignment_1_0_0_1 ) ) )
            // InternalEclParser.g:2347:1: ( ( rule__ConjunctionRefinementSet__OpAssignment_1_0_0_1 ) )
            {
            // InternalEclParser.g:2347:1: ( ( rule__ConjunctionRefinementSet__OpAssignment_1_0_0_1 ) )
            // InternalEclParser.g:2348:2: ( rule__ConjunctionRefinementSet__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionRefinementSetAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalEclParser.g:2349:2: ( rule__ConjunctionRefinementSet__OpAssignment_1_0_0_1 )
            // InternalEclParser.g:2349:3: rule__ConjunctionRefinementSet__OpAssignment_1_0_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionRefinementSet__OpAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionRefinementSetAccess().getOpAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__ConjunctionRefinementSet__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__DisjunctionAttributeSet__Group__0"
    // InternalEclParser.g:2358:1: rule__DisjunctionAttributeSet__Group__0 : rule__DisjunctionAttributeSet__Group__0__Impl rule__DisjunctionAttributeSet__Group__1 ;
    public final void rule__DisjunctionAttributeSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2362:1: ( rule__DisjunctionAttributeSet__Group__0__Impl rule__DisjunctionAttributeSet__Group__1 )
            // InternalEclParser.g:2363:2: rule__DisjunctionAttributeSet__Group__0__Impl rule__DisjunctionAttributeSet__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__DisjunctionAttributeSet__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionAttributeSet__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DisjunctionAttributeSet__Group__0"


    // $ANTLR start "rule__DisjunctionAttributeSet__Group__0__Impl"
    // InternalEclParser.g:2370:1: rule__DisjunctionAttributeSet__Group__0__Impl : ( ruleConjunctionAttributeSet ) ;
    public final void rule__DisjunctionAttributeSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2374:1: ( ( ruleConjunctionAttributeSet ) )
            // InternalEclParser.g:2375:1: ( ruleConjunctionAttributeSet )
            {
            // InternalEclParser.g:2375:1: ( ruleConjunctionAttributeSet )
            // InternalEclParser.g:2376:2: ruleConjunctionAttributeSet
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAttributeSetAccess().getConjunctionAttributeSetParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConjunctionAttributeSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAttributeSetAccess().getConjunctionAttributeSetParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__DisjunctionAttributeSet__Group__0__Impl"


    // $ANTLR start "rule__DisjunctionAttributeSet__Group__1"
    // InternalEclParser.g:2385:1: rule__DisjunctionAttributeSet__Group__1 : rule__DisjunctionAttributeSet__Group__1__Impl ;
    public final void rule__DisjunctionAttributeSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2389:1: ( rule__DisjunctionAttributeSet__Group__1__Impl )
            // InternalEclParser.g:2390:2: rule__DisjunctionAttributeSet__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionAttributeSet__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DisjunctionAttributeSet__Group__1"


    // $ANTLR start "rule__DisjunctionAttributeSet__Group__1__Impl"
    // InternalEclParser.g:2396:1: rule__DisjunctionAttributeSet__Group__1__Impl : ( ( rule__DisjunctionAttributeSet__Group_1__0 )* ) ;
    public final void rule__DisjunctionAttributeSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2400:1: ( ( ( rule__DisjunctionAttributeSet__Group_1__0 )* ) )
            // InternalEclParser.g:2401:1: ( ( rule__DisjunctionAttributeSet__Group_1__0 )* )
            {
            // InternalEclParser.g:2401:1: ( ( rule__DisjunctionAttributeSet__Group_1__0 )* )
            // InternalEclParser.g:2402:2: ( rule__DisjunctionAttributeSet__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAttributeSetAccess().getGroup_1()); 
            }
            // InternalEclParser.g:2403:2: ( rule__DisjunctionAttributeSet__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==OR) ) {
                    int LA21_5 = input.LA(2);

                    if ( (synpred29_InternalEclParser()) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // InternalEclParser.g:2403:3: rule__DisjunctionAttributeSet__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__DisjunctionAttributeSet__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAttributeSetAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__DisjunctionAttributeSet__Group__1__Impl"


    // $ANTLR start "rule__DisjunctionAttributeSet__Group_1__0"
    // InternalEclParser.g:2412:1: rule__DisjunctionAttributeSet__Group_1__0 : rule__DisjunctionAttributeSet__Group_1__0__Impl rule__DisjunctionAttributeSet__Group_1__1 ;
    public final void rule__DisjunctionAttributeSet__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2416:1: ( rule__DisjunctionAttributeSet__Group_1__0__Impl rule__DisjunctionAttributeSet__Group_1__1 )
            // InternalEclParser.g:2417:2: rule__DisjunctionAttributeSet__Group_1__0__Impl rule__DisjunctionAttributeSet__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__DisjunctionAttributeSet__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionAttributeSet__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DisjunctionAttributeSet__Group_1__0"


    // $ANTLR start "rule__DisjunctionAttributeSet__Group_1__0__Impl"
    // InternalEclParser.g:2424:1: rule__DisjunctionAttributeSet__Group_1__0__Impl : ( ( rule__DisjunctionAttributeSet__Group_1_0__0 ) ) ;
    public final void rule__DisjunctionAttributeSet__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2428:1: ( ( ( rule__DisjunctionAttributeSet__Group_1_0__0 ) ) )
            // InternalEclParser.g:2429:1: ( ( rule__DisjunctionAttributeSet__Group_1_0__0 ) )
            {
            // InternalEclParser.g:2429:1: ( ( rule__DisjunctionAttributeSet__Group_1_0__0 ) )
            // InternalEclParser.g:2430:2: ( rule__DisjunctionAttributeSet__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAttributeSetAccess().getGroup_1_0()); 
            }
            // InternalEclParser.g:2431:2: ( rule__DisjunctionAttributeSet__Group_1_0__0 )
            // InternalEclParser.g:2431:3: rule__DisjunctionAttributeSet__Group_1_0__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionAttributeSet__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAttributeSetAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__DisjunctionAttributeSet__Group_1__0__Impl"


    // $ANTLR start "rule__DisjunctionAttributeSet__Group_1__1"
    // InternalEclParser.g:2439:1: rule__DisjunctionAttributeSet__Group_1__1 : rule__DisjunctionAttributeSet__Group_1__1__Impl ;
    public final void rule__DisjunctionAttributeSet__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2443:1: ( rule__DisjunctionAttributeSet__Group_1__1__Impl )
            // InternalEclParser.g:2444:2: rule__DisjunctionAttributeSet__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionAttributeSet__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DisjunctionAttributeSet__Group_1__1"


    // $ANTLR start "rule__DisjunctionAttributeSet__Group_1__1__Impl"
    // InternalEclParser.g:2450:1: rule__DisjunctionAttributeSet__Group_1__1__Impl : ( ( rule__DisjunctionAttributeSet__RightAssignment_1_1 ) ) ;
    public final void rule__DisjunctionAttributeSet__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2454:1: ( ( ( rule__DisjunctionAttributeSet__RightAssignment_1_1 ) ) )
            // InternalEclParser.g:2455:1: ( ( rule__DisjunctionAttributeSet__RightAssignment_1_1 ) )
            {
            // InternalEclParser.g:2455:1: ( ( rule__DisjunctionAttributeSet__RightAssignment_1_1 ) )
            // InternalEclParser.g:2456:2: ( rule__DisjunctionAttributeSet__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAttributeSetAccess().getRightAssignment_1_1()); 
            }
            // InternalEclParser.g:2457:2: ( rule__DisjunctionAttributeSet__RightAssignment_1_1 )
            // InternalEclParser.g:2457:3: rule__DisjunctionAttributeSet__RightAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionAttributeSet__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAttributeSetAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__DisjunctionAttributeSet__Group_1__1__Impl"


    // $ANTLR start "rule__DisjunctionAttributeSet__Group_1_0__0"
    // InternalEclParser.g:2466:1: rule__DisjunctionAttributeSet__Group_1_0__0 : rule__DisjunctionAttributeSet__Group_1_0__0__Impl ;
    public final void rule__DisjunctionAttributeSet__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2470:1: ( rule__DisjunctionAttributeSet__Group_1_0__0__Impl )
            // InternalEclParser.g:2471:2: rule__DisjunctionAttributeSet__Group_1_0__0__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionAttributeSet__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DisjunctionAttributeSet__Group_1_0__0"


    // $ANTLR start "rule__DisjunctionAttributeSet__Group_1_0__0__Impl"
    // InternalEclParser.g:2477:1: rule__DisjunctionAttributeSet__Group_1_0__0__Impl : ( ( rule__DisjunctionAttributeSet__Group_1_0_0__0 ) ) ;
    public final void rule__DisjunctionAttributeSet__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2481:1: ( ( ( rule__DisjunctionAttributeSet__Group_1_0_0__0 ) ) )
            // InternalEclParser.g:2482:1: ( ( rule__DisjunctionAttributeSet__Group_1_0_0__0 ) )
            {
            // InternalEclParser.g:2482:1: ( ( rule__DisjunctionAttributeSet__Group_1_0_0__0 ) )
            // InternalEclParser.g:2483:2: ( rule__DisjunctionAttributeSet__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAttributeSetAccess().getGroup_1_0_0()); 
            }
            // InternalEclParser.g:2484:2: ( rule__DisjunctionAttributeSet__Group_1_0_0__0 )
            // InternalEclParser.g:2484:3: rule__DisjunctionAttributeSet__Group_1_0_0__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionAttributeSet__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAttributeSetAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__DisjunctionAttributeSet__Group_1_0__0__Impl"


    // $ANTLR start "rule__DisjunctionAttributeSet__Group_1_0_0__0"
    // InternalEclParser.g:2493:1: rule__DisjunctionAttributeSet__Group_1_0_0__0 : rule__DisjunctionAttributeSet__Group_1_0_0__0__Impl rule__DisjunctionAttributeSet__Group_1_0_0__1 ;
    public final void rule__DisjunctionAttributeSet__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2497:1: ( rule__DisjunctionAttributeSet__Group_1_0_0__0__Impl rule__DisjunctionAttributeSet__Group_1_0_0__1 )
            // InternalEclParser.g:2498:2: rule__DisjunctionAttributeSet__Group_1_0_0__0__Impl rule__DisjunctionAttributeSet__Group_1_0_0__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__DisjunctionAttributeSet__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionAttributeSet__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DisjunctionAttributeSet__Group_1_0_0__0"


    // $ANTLR start "rule__DisjunctionAttributeSet__Group_1_0_0__0__Impl"
    // InternalEclParser.g:2505:1: rule__DisjunctionAttributeSet__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DisjunctionAttributeSet__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2509:1: ( ( () ) )
            // InternalEclParser.g:2510:1: ( () )
            {
            // InternalEclParser.g:2510:1: ( () )
            // InternalEclParser.g:2511:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAttributeSetAccess().getDisjunctionAttributeSetLeftAction_1_0_0_0()); 
            }
            // InternalEclParser.g:2512:2: ()
            // InternalEclParser.g:2512:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAttributeSetAccess().getDisjunctionAttributeSetLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisjunctionAttributeSet__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__DisjunctionAttributeSet__Group_1_0_0__1"
    // InternalEclParser.g:2520:1: rule__DisjunctionAttributeSet__Group_1_0_0__1 : rule__DisjunctionAttributeSet__Group_1_0_0__1__Impl ;
    public final void rule__DisjunctionAttributeSet__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2524:1: ( rule__DisjunctionAttributeSet__Group_1_0_0__1__Impl )
            // InternalEclParser.g:2525:2: rule__DisjunctionAttributeSet__Group_1_0_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionAttributeSet__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DisjunctionAttributeSet__Group_1_0_0__1"


    // $ANTLR start "rule__DisjunctionAttributeSet__Group_1_0_0__1__Impl"
    // InternalEclParser.g:2531:1: rule__DisjunctionAttributeSet__Group_1_0_0__1__Impl : ( ( rule__DisjunctionAttributeSet__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__DisjunctionAttributeSet__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2535:1: ( ( ( rule__DisjunctionAttributeSet__OpAssignment_1_0_0_1 ) ) )
            // InternalEclParser.g:2536:1: ( ( rule__DisjunctionAttributeSet__OpAssignment_1_0_0_1 ) )
            {
            // InternalEclParser.g:2536:1: ( ( rule__DisjunctionAttributeSet__OpAssignment_1_0_0_1 ) )
            // InternalEclParser.g:2537:2: ( rule__DisjunctionAttributeSet__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAttributeSetAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalEclParser.g:2538:2: ( rule__DisjunctionAttributeSet__OpAssignment_1_0_0_1 )
            // InternalEclParser.g:2538:3: rule__DisjunctionAttributeSet__OpAssignment_1_0_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DisjunctionAttributeSet__OpAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAttributeSetAccess().getOpAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__DisjunctionAttributeSet__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__ConjunctionAttributeSet__Group__0"
    // InternalEclParser.g:2547:1: rule__ConjunctionAttributeSet__Group__0 : rule__ConjunctionAttributeSet__Group__0__Impl rule__ConjunctionAttributeSet__Group__1 ;
    public final void rule__ConjunctionAttributeSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2551:1: ( rule__ConjunctionAttributeSet__Group__0__Impl rule__ConjunctionAttributeSet__Group__1 )
            // InternalEclParser.g:2552:2: rule__ConjunctionAttributeSet__Group__0__Impl rule__ConjunctionAttributeSet__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ConjunctionAttributeSet__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionAttributeSet__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConjunctionAttributeSet__Group__0"


    // $ANTLR start "rule__ConjunctionAttributeSet__Group__0__Impl"
    // InternalEclParser.g:2559:1: rule__ConjunctionAttributeSet__Group__0__Impl : ( rulePrimaryAttributeSet ) ;
    public final void rule__ConjunctionAttributeSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2563:1: ( ( rulePrimaryAttributeSet ) )
            // InternalEclParser.g:2564:1: ( rulePrimaryAttributeSet )
            {
            // InternalEclParser.g:2564:1: ( rulePrimaryAttributeSet )
            // InternalEclParser.g:2565:2: rulePrimaryAttributeSet
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAttributeSetAccess().getPrimaryAttributeSetParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulePrimaryAttributeSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAttributeSetAccess().getPrimaryAttributeSetParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__ConjunctionAttributeSet__Group__0__Impl"


    // $ANTLR start "rule__ConjunctionAttributeSet__Group__1"
    // InternalEclParser.g:2574:1: rule__ConjunctionAttributeSet__Group__1 : rule__ConjunctionAttributeSet__Group__1__Impl ;
    public final void rule__ConjunctionAttributeSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2578:1: ( rule__ConjunctionAttributeSet__Group__1__Impl )
            // InternalEclParser.g:2579:2: rule__ConjunctionAttributeSet__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionAttributeSet__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConjunctionAttributeSet__Group__1"


    // $ANTLR start "rule__ConjunctionAttributeSet__Group__1__Impl"
    // InternalEclParser.g:2585:1: rule__ConjunctionAttributeSet__Group__1__Impl : ( ( rule__ConjunctionAttributeSet__Group_1__0 )* ) ;
    public final void rule__ConjunctionAttributeSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2589:1: ( ( ( rule__ConjunctionAttributeSet__Group_1__0 )* ) )
            // InternalEclParser.g:2590:1: ( ( rule__ConjunctionAttributeSet__Group_1__0 )* )
            {
            // InternalEclParser.g:2590:1: ( ( rule__ConjunctionAttributeSet__Group_1__0 )* )
            // InternalEclParser.g:2591:2: ( rule__ConjunctionAttributeSet__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAttributeSetAccess().getGroup_1()); 
            }
            // InternalEclParser.g:2592:2: ( rule__ConjunctionAttributeSet__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==AND) ) {
                    int LA22_4 = input.LA(2);

                    if ( (synpred30_InternalEclParser()) ) {
                        alt22=1;
                    }


                }
                else if ( (LA22_0==Comma) ) {
                    int LA22_5 = input.LA(2);

                    if ( (synpred30_InternalEclParser()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // InternalEclParser.g:2592:3: rule__ConjunctionAttributeSet__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    rule__ConjunctionAttributeSet__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAttributeSetAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__ConjunctionAttributeSet__Group__1__Impl"


    // $ANTLR start "rule__ConjunctionAttributeSet__Group_1__0"
    // InternalEclParser.g:2601:1: rule__ConjunctionAttributeSet__Group_1__0 : rule__ConjunctionAttributeSet__Group_1__0__Impl rule__ConjunctionAttributeSet__Group_1__1 ;
    public final void rule__ConjunctionAttributeSet__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2605:1: ( rule__ConjunctionAttributeSet__Group_1__0__Impl rule__ConjunctionAttributeSet__Group_1__1 )
            // InternalEclParser.g:2606:2: rule__ConjunctionAttributeSet__Group_1__0__Impl rule__ConjunctionAttributeSet__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__ConjunctionAttributeSet__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionAttributeSet__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConjunctionAttributeSet__Group_1__0"


    // $ANTLR start "rule__ConjunctionAttributeSet__Group_1__0__Impl"
    // InternalEclParser.g:2613:1: rule__ConjunctionAttributeSet__Group_1__0__Impl : ( ( rule__ConjunctionAttributeSet__Group_1_0__0 ) ) ;
    public final void rule__ConjunctionAttributeSet__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2617:1: ( ( ( rule__ConjunctionAttributeSet__Group_1_0__0 ) ) )
            // InternalEclParser.g:2618:1: ( ( rule__ConjunctionAttributeSet__Group_1_0__0 ) )
            {
            // InternalEclParser.g:2618:1: ( ( rule__ConjunctionAttributeSet__Group_1_0__0 ) )
            // InternalEclParser.g:2619:2: ( rule__ConjunctionAttributeSet__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAttributeSetAccess().getGroup_1_0()); 
            }
            // InternalEclParser.g:2620:2: ( rule__ConjunctionAttributeSet__Group_1_0__0 )
            // InternalEclParser.g:2620:3: rule__ConjunctionAttributeSet__Group_1_0__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionAttributeSet__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAttributeSetAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__ConjunctionAttributeSet__Group_1__0__Impl"


    // $ANTLR start "rule__ConjunctionAttributeSet__Group_1__1"
    // InternalEclParser.g:2628:1: rule__ConjunctionAttributeSet__Group_1__1 : rule__ConjunctionAttributeSet__Group_1__1__Impl ;
    public final void rule__ConjunctionAttributeSet__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2632:1: ( rule__ConjunctionAttributeSet__Group_1__1__Impl )
            // InternalEclParser.g:2633:2: rule__ConjunctionAttributeSet__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionAttributeSet__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConjunctionAttributeSet__Group_1__1"


    // $ANTLR start "rule__ConjunctionAttributeSet__Group_1__1__Impl"
    // InternalEclParser.g:2639:1: rule__ConjunctionAttributeSet__Group_1__1__Impl : ( ( rule__ConjunctionAttributeSet__RightAssignment_1_1 ) ) ;
    public final void rule__ConjunctionAttributeSet__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2643:1: ( ( ( rule__ConjunctionAttributeSet__RightAssignment_1_1 ) ) )
            // InternalEclParser.g:2644:1: ( ( rule__ConjunctionAttributeSet__RightAssignment_1_1 ) )
            {
            // InternalEclParser.g:2644:1: ( ( rule__ConjunctionAttributeSet__RightAssignment_1_1 ) )
            // InternalEclParser.g:2645:2: ( rule__ConjunctionAttributeSet__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAttributeSetAccess().getRightAssignment_1_1()); 
            }
            // InternalEclParser.g:2646:2: ( rule__ConjunctionAttributeSet__RightAssignment_1_1 )
            // InternalEclParser.g:2646:3: rule__ConjunctionAttributeSet__RightAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionAttributeSet__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAttributeSetAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__ConjunctionAttributeSet__Group_1__1__Impl"


    // $ANTLR start "rule__ConjunctionAttributeSet__Group_1_0__0"
    // InternalEclParser.g:2655:1: rule__ConjunctionAttributeSet__Group_1_0__0 : rule__ConjunctionAttributeSet__Group_1_0__0__Impl ;
    public final void rule__ConjunctionAttributeSet__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2659:1: ( rule__ConjunctionAttributeSet__Group_1_0__0__Impl )
            // InternalEclParser.g:2660:2: rule__ConjunctionAttributeSet__Group_1_0__0__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionAttributeSet__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConjunctionAttributeSet__Group_1_0__0"


    // $ANTLR start "rule__ConjunctionAttributeSet__Group_1_0__0__Impl"
    // InternalEclParser.g:2666:1: rule__ConjunctionAttributeSet__Group_1_0__0__Impl : ( ( rule__ConjunctionAttributeSet__Group_1_0_0__0 ) ) ;
    public final void rule__ConjunctionAttributeSet__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2670:1: ( ( ( rule__ConjunctionAttributeSet__Group_1_0_0__0 ) ) )
            // InternalEclParser.g:2671:1: ( ( rule__ConjunctionAttributeSet__Group_1_0_0__0 ) )
            {
            // InternalEclParser.g:2671:1: ( ( rule__ConjunctionAttributeSet__Group_1_0_0__0 ) )
            // InternalEclParser.g:2672:2: ( rule__ConjunctionAttributeSet__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAttributeSetAccess().getGroup_1_0_0()); 
            }
            // InternalEclParser.g:2673:2: ( rule__ConjunctionAttributeSet__Group_1_0_0__0 )
            // InternalEclParser.g:2673:3: rule__ConjunctionAttributeSet__Group_1_0_0__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionAttributeSet__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAttributeSetAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__ConjunctionAttributeSet__Group_1_0__0__Impl"


    // $ANTLR start "rule__ConjunctionAttributeSet__Group_1_0_0__0"
    // InternalEclParser.g:2682:1: rule__ConjunctionAttributeSet__Group_1_0_0__0 : rule__ConjunctionAttributeSet__Group_1_0_0__0__Impl rule__ConjunctionAttributeSet__Group_1_0_0__1 ;
    public final void rule__ConjunctionAttributeSet__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2686:1: ( rule__ConjunctionAttributeSet__Group_1_0_0__0__Impl rule__ConjunctionAttributeSet__Group_1_0_0__1 )
            // InternalEclParser.g:2687:2: rule__ConjunctionAttributeSet__Group_1_0_0__0__Impl rule__ConjunctionAttributeSet__Group_1_0_0__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ConjunctionAttributeSet__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionAttributeSet__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConjunctionAttributeSet__Group_1_0_0__0"


    // $ANTLR start "rule__ConjunctionAttributeSet__Group_1_0_0__0__Impl"
    // InternalEclParser.g:2694:1: rule__ConjunctionAttributeSet__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__ConjunctionAttributeSet__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2698:1: ( ( () ) )
            // InternalEclParser.g:2699:1: ( () )
            {
            // InternalEclParser.g:2699:1: ( () )
            // InternalEclParser.g:2700:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAttributeSetAccess().getConjunctionAttributeSetLeftAction_1_0_0_0()); 
            }
            // InternalEclParser.g:2701:2: ()
            // InternalEclParser.g:2701:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAttributeSetAccess().getConjunctionAttributeSetLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConjunctionAttributeSet__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__ConjunctionAttributeSet__Group_1_0_0__1"
    // InternalEclParser.g:2709:1: rule__ConjunctionAttributeSet__Group_1_0_0__1 : rule__ConjunctionAttributeSet__Group_1_0_0__1__Impl ;
    public final void rule__ConjunctionAttributeSet__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2713:1: ( rule__ConjunctionAttributeSet__Group_1_0_0__1__Impl )
            // InternalEclParser.g:2714:2: rule__ConjunctionAttributeSet__Group_1_0_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionAttributeSet__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConjunctionAttributeSet__Group_1_0_0__1"


    // $ANTLR start "rule__ConjunctionAttributeSet__Group_1_0_0__1__Impl"
    // InternalEclParser.g:2720:1: rule__ConjunctionAttributeSet__Group_1_0_0__1__Impl : ( ( rule__ConjunctionAttributeSet__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__ConjunctionAttributeSet__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2724:1: ( ( ( rule__ConjunctionAttributeSet__OpAssignment_1_0_0_1 ) ) )
            // InternalEclParser.g:2725:1: ( ( rule__ConjunctionAttributeSet__OpAssignment_1_0_0_1 ) )
            {
            // InternalEclParser.g:2725:1: ( ( rule__ConjunctionAttributeSet__OpAssignment_1_0_0_1 ) )
            // InternalEclParser.g:2726:2: ( rule__ConjunctionAttributeSet__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAttributeSetAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalEclParser.g:2727:2: ( rule__ConjunctionAttributeSet__OpAssignment_1_0_0_1 )
            // InternalEclParser.g:2727:3: rule__ConjunctionAttributeSet__OpAssignment_1_0_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConjunctionAttributeSet__OpAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAttributeSetAccess().getOpAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__ConjunctionAttributeSet__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalEclParser.g:2736:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2740:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalEclParser.g:2741:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalEclParser.g:2748:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__CardinalityAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2752:1: ( ( ( rule__Attribute__CardinalityAssignment_0 )? ) )
            // InternalEclParser.g:2753:1: ( ( rule__Attribute__CardinalityAssignment_0 )? )
            {
            // InternalEclParser.g:2753:1: ( ( rule__Attribute__CardinalityAssignment_0 )? )
            // InternalEclParser.g:2754:2: ( rule__Attribute__CardinalityAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getCardinalityAssignment_0()); 
            }
            // InternalEclParser.g:2755:2: ( rule__Attribute__CardinalityAssignment_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==LeftSquareBracket) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalEclParser.g:2755:3: rule__Attribute__CardinalityAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Attribute__CardinalityAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getCardinalityAssignment_0()); 
            }

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalEclParser.g:2763:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2767:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalEclParser.g:2768:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalEclParser.g:2775:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__ReversedAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2779:1: ( ( ( rule__Attribute__ReversedAssignment_1 )? ) )
            // InternalEclParser.g:2780:1: ( ( rule__Attribute__ReversedAssignment_1 )? )
            {
            // InternalEclParser.g:2780:1: ( ( rule__Attribute__ReversedAssignment_1 )? )
            // InternalEclParser.g:2781:2: ( rule__Attribute__ReversedAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getReversedAssignment_1()); 
            }
            // InternalEclParser.g:2782:2: ( rule__Attribute__ReversedAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_REVERSE) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEclParser.g:2782:3: rule__Attribute__ReversedAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Attribute__ReversedAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getReversedAssignment_1()); 
            }

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalEclParser.g:2790:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2794:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalEclParser.g:2795:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalEclParser.g:2802:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__OpAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2806:1: ( ( ( rule__Attribute__OpAssignment_2 )? ) )
            // InternalEclParser.g:2807:1: ( ( rule__Attribute__OpAssignment_2 )? )
            {
            // InternalEclParser.g:2807:1: ( ( rule__Attribute__OpAssignment_2 )? )
            // InternalEclParser.g:2808:2: ( rule__Attribute__OpAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getOpAssignment_2()); 
            }
            // InternalEclParser.g:2809:2: ( rule__Attribute__OpAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==LessThanSignLessThanSign||LA25_0==LessThanSign) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalEclParser.g:2809:3: rule__Attribute__OpAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Attribute__OpAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getOpAssignment_2()); 
            }

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalEclParser.g:2817:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2821:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalEclParser.g:2822:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__Attribute__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalEclParser.g:2829:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__Alternatives_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2833:1: ( ( ( rule__Attribute__Alternatives_3 ) ) )
            // InternalEclParser.g:2834:1: ( ( rule__Attribute__Alternatives_3 ) )
            {
            // InternalEclParser.g:2834:1: ( ( rule__Attribute__Alternatives_3 ) )
            // InternalEclParser.g:2835:2: ( rule__Attribute__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAlternatives_3()); 
            }
            // InternalEclParser.g:2836:2: ( rule__Attribute__Alternatives_3 )
            // InternalEclParser.g:2836:3: rule__Attribute__Alternatives_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getAlternatives_3()); 
            }

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
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalEclParser.g:2844:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2848:1: ( rule__Attribute__Group__4__Impl )
            // InternalEclParser.g:2849:2: rule__Attribute__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalEclParser.g:2855:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__ValueAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2859:1: ( ( ( rule__Attribute__ValueAssignment_4 ) ) )
            // InternalEclParser.g:2860:1: ( ( rule__Attribute__ValueAssignment_4 ) )
            {
            // InternalEclParser.g:2860:1: ( ( rule__Attribute__ValueAssignment_4 ) )
            // InternalEclParser.g:2861:2: ( rule__Attribute__ValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueAssignment_4()); 
            }
            // InternalEclParser.g:2862:2: ( rule__Attribute__ValueAssignment_4 )
            // InternalEclParser.g:2862:3: rule__Attribute__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__ValueAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getValueAssignment_4()); 
            }

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
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Cardinality__Group__0"
    // InternalEclParser.g:2871:1: rule__Cardinality__Group__0 : rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 ;
    public final void rule__Cardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2875:1: ( rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 )
            // InternalEclParser.g:2876:2: rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__Cardinality__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Cardinality__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Cardinality__Group__0"


    // $ANTLR start "rule__Cardinality__Group__0__Impl"
    // InternalEclParser.g:2883:1: rule__Cardinality__Group__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__Cardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2887:1: ( ( LeftSquareBracket ) )
            // InternalEclParser.g:2888:1: ( LeftSquareBracket )
            {
            // InternalEclParser.g:2888:1: ( LeftSquareBracket )
            // InternalEclParser.g:2889:2: LeftSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,LeftSquareBracket,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityAccess().getLeftSquareBracketKeyword_0()); 
            }

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
    // $ANTLR end "rule__Cardinality__Group__0__Impl"


    // $ANTLR start "rule__Cardinality__Group__1"
    // InternalEclParser.g:2898:1: rule__Cardinality__Group__1 : rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2 ;
    public final void rule__Cardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2902:1: ( rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2 )
            // InternalEclParser.g:2903:2: rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__Cardinality__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Cardinality__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Cardinality__Group__1"


    // $ANTLR start "rule__Cardinality__Group__1__Impl"
    // InternalEclParser.g:2910:1: rule__Cardinality__Group__1__Impl : ( ( rule__Cardinality__FromAssignment_1 ) ) ;
    public final void rule__Cardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2914:1: ( ( ( rule__Cardinality__FromAssignment_1 ) ) )
            // InternalEclParser.g:2915:1: ( ( rule__Cardinality__FromAssignment_1 ) )
            {
            // InternalEclParser.g:2915:1: ( ( rule__Cardinality__FromAssignment_1 ) )
            // InternalEclParser.g:2916:2: ( rule__Cardinality__FromAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getFromAssignment_1()); 
            }
            // InternalEclParser.g:2917:2: ( rule__Cardinality__FromAssignment_1 )
            // InternalEclParser.g:2917:3: rule__Cardinality__FromAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Cardinality__FromAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityAccess().getFromAssignment_1()); 
            }

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
    // $ANTLR end "rule__Cardinality__Group__1__Impl"


    // $ANTLR start "rule__Cardinality__Group__2"
    // InternalEclParser.g:2925:1: rule__Cardinality__Group__2 : rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3 ;
    public final void rule__Cardinality__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2929:1: ( rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3 )
            // InternalEclParser.g:2930:2: rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__Cardinality__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Cardinality__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Cardinality__Group__2"


    // $ANTLR start "rule__Cardinality__Group__2__Impl"
    // InternalEclParser.g:2937:1: rule__Cardinality__Group__2__Impl : ( FullStopFullStop ) ;
    public final void rule__Cardinality__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2941:1: ( ( FullStopFullStop ) )
            // InternalEclParser.g:2942:1: ( FullStopFullStop )
            {
            // InternalEclParser.g:2942:1: ( FullStopFullStop )
            // InternalEclParser.g:2943:2: FullStopFullStop
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_2()); 
            }
            match(input,FullStopFullStop,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_2()); 
            }

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
    // $ANTLR end "rule__Cardinality__Group__2__Impl"


    // $ANTLR start "rule__Cardinality__Group__3"
    // InternalEclParser.g:2952:1: rule__Cardinality__Group__3 : rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4 ;
    public final void rule__Cardinality__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2956:1: ( rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4 )
            // InternalEclParser.g:2957:2: rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__Cardinality__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Cardinality__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Cardinality__Group__3"


    // $ANTLR start "rule__Cardinality__Group__3__Impl"
    // InternalEclParser.g:2964:1: rule__Cardinality__Group__3__Impl : ( ( rule__Cardinality__Alternatives_3 ) ) ;
    public final void rule__Cardinality__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2968:1: ( ( ( rule__Cardinality__Alternatives_3 ) ) )
            // InternalEclParser.g:2969:1: ( ( rule__Cardinality__Alternatives_3 ) )
            {
            // InternalEclParser.g:2969:1: ( ( rule__Cardinality__Alternatives_3 ) )
            // InternalEclParser.g:2970:2: ( rule__Cardinality__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getAlternatives_3()); 
            }
            // InternalEclParser.g:2971:2: ( rule__Cardinality__Alternatives_3 )
            // InternalEclParser.g:2971:3: rule__Cardinality__Alternatives_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Cardinality__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityAccess().getAlternatives_3()); 
            }

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
    // $ANTLR end "rule__Cardinality__Group__3__Impl"


    // $ANTLR start "rule__Cardinality__Group__4"
    // InternalEclParser.g:2979:1: rule__Cardinality__Group__4 : rule__Cardinality__Group__4__Impl ;
    public final void rule__Cardinality__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2983:1: ( rule__Cardinality__Group__4__Impl )
            // InternalEclParser.g:2984:2: rule__Cardinality__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Cardinality__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Cardinality__Group__4"


    // $ANTLR start "rule__Cardinality__Group__4__Impl"
    // InternalEclParser.g:2990:1: rule__Cardinality__Group__4__Impl : ( RightSquareBracket ) ;
    public final void rule__Cardinality__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2994:1: ( ( RightSquareBracket ) )
            // InternalEclParser.g:2995:1: ( RightSquareBracket )
            {
            // InternalEclParser.g:2995:1: ( RightSquareBracket )
            // InternalEclParser.g:2996:2: RightSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,RightSquareBracket,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityAccess().getRightSquareBracketKeyword_4()); 
            }

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
    // $ANTLR end "rule__Cardinality__Group__4__Impl"


    // $ANTLR start "rule__StringValue__Group__0"
    // InternalEclParser.g:3006:1: rule__StringValue__Group__0 : rule__StringValue__Group__0__Impl rule__StringValue__Group__1 ;
    public final void rule__StringValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3010:1: ( rule__StringValue__Group__0__Impl rule__StringValue__Group__1 )
            // InternalEclParser.g:3011:2: rule__StringValue__Group__0__Impl rule__StringValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__StringValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__StringValue__Group__0"


    // $ANTLR start "rule__StringValue__Group__0__Impl"
    // InternalEclParser.g:3018:1: rule__StringValue__Group__0__Impl : ( ( rule__StringValue__OpAssignment_0 ) ) ;
    public final void rule__StringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3022:1: ( ( ( rule__StringValue__OpAssignment_0 ) ) )
            // InternalEclParser.g:3023:1: ( ( rule__StringValue__OpAssignment_0 ) )
            {
            // InternalEclParser.g:3023:1: ( ( rule__StringValue__OpAssignment_0 ) )
            // InternalEclParser.g:3024:2: ( rule__StringValue__OpAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getOpAssignment_0()); 
            }
            // InternalEclParser.g:3025:2: ( rule__StringValue__OpAssignment_0 )
            // InternalEclParser.g:3025:3: rule__StringValue__OpAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringValue__OpAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getOpAssignment_0()); 
            }

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
    // $ANTLR end "rule__StringValue__Group__0__Impl"


    // $ANTLR start "rule__StringValue__Group__1"
    // InternalEclParser.g:3033:1: rule__StringValue__Group__1 : rule__StringValue__Group__1__Impl ;
    public final void rule__StringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3037:1: ( rule__StringValue__Group__1__Impl )
            // InternalEclParser.g:3038:2: rule__StringValue__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__StringValue__Group__1"


    // $ANTLR start "rule__StringValue__Group__1__Impl"
    // InternalEclParser.g:3044:1: rule__StringValue__Group__1__Impl : ( ( rule__StringValue__ValueAssignment_1 ) ) ;
    public final void rule__StringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3048:1: ( ( ( rule__StringValue__ValueAssignment_1 ) ) )
            // InternalEclParser.g:3049:1: ( ( rule__StringValue__ValueAssignment_1 ) )
            {
            // InternalEclParser.g:3049:1: ( ( rule__StringValue__ValueAssignment_1 ) )
            // InternalEclParser.g:3050:2: ( rule__StringValue__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueAssignment_1()); 
            }
            // InternalEclParser.g:3051:2: ( rule__StringValue__ValueAssignment_1 )
            // InternalEclParser.g:3051:3: rule__StringValue__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringValue__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getValueAssignment_1()); 
            }

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
    // $ANTLR end "rule__StringValue__Group__1__Impl"


    // $ANTLR start "rule__NumericValue__Group__0"
    // InternalEclParser.g:3060:1: rule__NumericValue__Group__0 : rule__NumericValue__Group__0__Impl rule__NumericValue__Group__1 ;
    public final void rule__NumericValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3064:1: ( rule__NumericValue__Group__0__Impl rule__NumericValue__Group__1 )
            // InternalEclParser.g:3065:2: rule__NumericValue__Group__0__Impl rule__NumericValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__NumericValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NumericValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NumericValue__Group__0"


    // $ANTLR start "rule__NumericValue__Group__0__Impl"
    // InternalEclParser.g:3072:1: rule__NumericValue__Group__0__Impl : ( ( rule__NumericValue__OpAssignment_0 ) ) ;
    public final void rule__NumericValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3076:1: ( ( ( rule__NumericValue__OpAssignment_0 ) ) )
            // InternalEclParser.g:3077:1: ( ( rule__NumericValue__OpAssignment_0 ) )
            {
            // InternalEclParser.g:3077:1: ( ( rule__NumericValue__OpAssignment_0 ) )
            // InternalEclParser.g:3078:2: ( rule__NumericValue__OpAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericValueAccess().getOpAssignment_0()); 
            }
            // InternalEclParser.g:3079:2: ( rule__NumericValue__OpAssignment_0 )
            // InternalEclParser.g:3079:3: rule__NumericValue__OpAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NumericValue__OpAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericValueAccess().getOpAssignment_0()); 
            }

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
    // $ANTLR end "rule__NumericValue__Group__0__Impl"


    // $ANTLR start "rule__NumericValue__Group__1"
    // InternalEclParser.g:3087:1: rule__NumericValue__Group__1 : rule__NumericValue__Group__1__Impl rule__NumericValue__Group__2 ;
    public final void rule__NumericValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3091:1: ( rule__NumericValue__Group__1__Impl rule__NumericValue__Group__2 )
            // InternalEclParser.g:3092:2: rule__NumericValue__Group__1__Impl rule__NumericValue__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__NumericValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NumericValue__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NumericValue__Group__1"


    // $ANTLR start "rule__NumericValue__Group__1__Impl"
    // InternalEclParser.g:3099:1: rule__NumericValue__Group__1__Impl : ( NumberSign ) ;
    public final void rule__NumericValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3103:1: ( ( NumberSign ) )
            // InternalEclParser.g:3104:1: ( NumberSign )
            {
            // InternalEclParser.g:3104:1: ( NumberSign )
            // InternalEclParser.g:3105:2: NumberSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericValueAccess().getNumberSignKeyword_1()); 
            }
            match(input,NumberSign,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericValueAccess().getNumberSignKeyword_1()); 
            }

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
    // $ANTLR end "rule__NumericValue__Group__1__Impl"


    // $ANTLR start "rule__NumericValue__Group__2"
    // InternalEclParser.g:3114:1: rule__NumericValue__Group__2 : rule__NumericValue__Group__2__Impl ;
    public final void rule__NumericValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3118:1: ( rule__NumericValue__Group__2__Impl )
            // InternalEclParser.g:3119:2: rule__NumericValue__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NumericValue__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NumericValue__Group__2"


    // $ANTLR start "rule__NumericValue__Group__2__Impl"
    // InternalEclParser.g:3125:1: rule__NumericValue__Group__2__Impl : ( ( rule__NumericValue__ValueAssignment_2 ) ) ;
    public final void rule__NumericValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3129:1: ( ( ( rule__NumericValue__ValueAssignment_2 ) ) )
            // InternalEclParser.g:3130:1: ( ( rule__NumericValue__ValueAssignment_2 ) )
            {
            // InternalEclParser.g:3130:1: ( ( rule__NumericValue__ValueAssignment_2 ) )
            // InternalEclParser.g:3131:2: ( rule__NumericValue__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericValueAccess().getValueAssignment_2()); 
            }
            // InternalEclParser.g:3132:2: ( rule__NumericValue__ValueAssignment_2 )
            // InternalEclParser.g:3132:3: rule__NumericValue__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NumericValue__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericValueAccess().getValueAssignment_2()); 
            }

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
    // $ANTLR end "rule__NumericValue__Group__2__Impl"


    // $ANTLR start "rule__Number__Group__0"
    // InternalEclParser.g:3141:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3145:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalEclParser.g:3146:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__Number__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Number__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Number__Group__0"


    // $ANTLR start "rule__Number__Group__0__Impl"
    // InternalEclParser.g:3153:1: rule__Number__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3157:1: ( ( RULE_INT ) )
            // InternalEclParser.g:3158:1: ( RULE_INT )
            {
            // InternalEclParser.g:3158:1: ( RULE_INT )
            // InternalEclParser.g:3159:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Number__Group__0__Impl"


    // $ANTLR start "rule__Number__Group__1"
    // InternalEclParser.g:3168:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3172:1: ( rule__Number__Group__1__Impl )
            // InternalEclParser.g:3173:2: rule__Number__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Number__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Number__Group__1"


    // $ANTLR start "rule__Number__Group__1__Impl"
    // InternalEclParser.g:3179:1: rule__Number__Group__1__Impl : ( ( rule__Number__Group_1__0 )? ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3183:1: ( ( ( rule__Number__Group_1__0 )? ) )
            // InternalEclParser.g:3184:1: ( ( rule__Number__Group_1__0 )? )
            {
            // InternalEclParser.g:3184:1: ( ( rule__Number__Group_1__0 )? )
            // InternalEclParser.g:3185:2: ( rule__Number__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getGroup_1()); 
            }
            // InternalEclParser.g:3186:2: ( rule__Number__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==FullStop) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalEclParser.g:3186:3: rule__Number__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Number__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Number__Group__1__Impl"


    // $ANTLR start "rule__Number__Group_1__0"
    // InternalEclParser.g:3195:1: rule__Number__Group_1__0 : rule__Number__Group_1__0__Impl rule__Number__Group_1__1 ;
    public final void rule__Number__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3199:1: ( rule__Number__Group_1__0__Impl rule__Number__Group_1__1 )
            // InternalEclParser.g:3200:2: rule__Number__Group_1__0__Impl rule__Number__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__Number__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Number__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Number__Group_1__0"


    // $ANTLR start "rule__Number__Group_1__0__Impl"
    // InternalEclParser.g:3207:1: rule__Number__Group_1__0__Impl : ( FullStop ) ;
    public final void rule__Number__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3211:1: ( ( FullStop ) )
            // InternalEclParser.g:3212:1: ( FullStop )
            {
            // InternalEclParser.g:3212:1: ( FullStop )
            // InternalEclParser.g:3213:2: FullStop
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getFullStopKeyword_1_0()); 
            }
            match(input,FullStop,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberAccess().getFullStopKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__Number__Group_1__0__Impl"


    // $ANTLR start "rule__Number__Group_1__1"
    // InternalEclParser.g:3222:1: rule__Number__Group_1__1 : rule__Number__Group_1__1__Impl ;
    public final void rule__Number__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3226:1: ( rule__Number__Group_1__1__Impl )
            // InternalEclParser.g:3227:2: rule__Number__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Number__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Number__Group_1__1"


    // $ANTLR start "rule__Number__Group_1__1__Impl"
    // InternalEclParser.g:3233:1: rule__Number__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Number__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3237:1: ( ( RULE_INT ) )
            // InternalEclParser.g:3238:1: ( RULE_INT )
            {
            // InternalEclParser.g:3238:1: ( RULE_INT )
            // InternalEclParser.g:3239:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1()); 
            }

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
    // $ANTLR end "rule__Number__Group_1__1__Impl"


    // $ANTLR start "rule__ExpressionValue__Group__0"
    // InternalEclParser.g:3249:1: rule__ExpressionValue__Group__0 : rule__ExpressionValue__Group__0__Impl rule__ExpressionValue__Group__1 ;
    public final void rule__ExpressionValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3253:1: ( rule__ExpressionValue__Group__0__Impl rule__ExpressionValue__Group__1 )
            // InternalEclParser.g:3254:2: rule__ExpressionValue__Group__0__Impl rule__ExpressionValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__ExpressionValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExpressionValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ExpressionValue__Group__0"


    // $ANTLR start "rule__ExpressionValue__Group__0__Impl"
    // InternalEclParser.g:3261:1: rule__ExpressionValue__Group__0__Impl : ( ( rule__ExpressionValue__OpAssignment_0 ) ) ;
    public final void rule__ExpressionValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3265:1: ( ( ( rule__ExpressionValue__OpAssignment_0 ) ) )
            // InternalEclParser.g:3266:1: ( ( rule__ExpressionValue__OpAssignment_0 ) )
            {
            // InternalEclParser.g:3266:1: ( ( rule__ExpressionValue__OpAssignment_0 ) )
            // InternalEclParser.g:3267:2: ( rule__ExpressionValue__OpAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionValueAccess().getOpAssignment_0()); 
            }
            // InternalEclParser.g:3268:2: ( rule__ExpressionValue__OpAssignment_0 )
            // InternalEclParser.g:3268:3: rule__ExpressionValue__OpAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExpressionValue__OpAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionValueAccess().getOpAssignment_0()); 
            }

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
    // $ANTLR end "rule__ExpressionValue__Group__0__Impl"


    // $ANTLR start "rule__ExpressionValue__Group__1"
    // InternalEclParser.g:3276:1: rule__ExpressionValue__Group__1 : rule__ExpressionValue__Group__1__Impl ;
    public final void rule__ExpressionValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3280:1: ( rule__ExpressionValue__Group__1__Impl )
            // InternalEclParser.g:3281:2: rule__ExpressionValue__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExpressionValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ExpressionValue__Group__1"


    // $ANTLR start "rule__ExpressionValue__Group__1__Impl"
    // InternalEclParser.g:3287:1: rule__ExpressionValue__Group__1__Impl : ( ( rule__ExpressionValue__ValueAssignment_1 ) ) ;
    public final void rule__ExpressionValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3291:1: ( ( ( rule__ExpressionValue__ValueAssignment_1 ) ) )
            // InternalEclParser.g:3292:1: ( ( rule__ExpressionValue__ValueAssignment_1 ) )
            {
            // InternalEclParser.g:3292:1: ( ( rule__ExpressionValue__ValueAssignment_1 ) )
            // InternalEclParser.g:3293:2: ( rule__ExpressionValue__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionValueAccess().getValueAssignment_1()); 
            }
            // InternalEclParser.g:3294:2: ( rule__ExpressionValue__ValueAssignment_1 )
            // InternalEclParser.g:3294:3: rule__ExpressionValue__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExpressionValue__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionValueAccess().getValueAssignment_1()); 
            }

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
    // $ANTLR end "rule__ExpressionValue__Group__1__Impl"


    // $ANTLR start "rule__ParenthesizedAttributeSet__Group__0"
    // InternalEclParser.g:3303:1: rule__ParenthesizedAttributeSet__Group__0 : rule__ParenthesizedAttributeSet__Group__0__Impl rule__ParenthesizedAttributeSet__Group__1 ;
    public final void rule__ParenthesizedAttributeSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3307:1: ( rule__ParenthesizedAttributeSet__Group__0__Impl rule__ParenthesizedAttributeSet__Group__1 )
            // InternalEclParser.g:3308:2: rule__ParenthesizedAttributeSet__Group__0__Impl rule__ParenthesizedAttributeSet__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__ParenthesizedAttributeSet__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedAttributeSet__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParenthesizedAttributeSet__Group__0"


    // $ANTLR start "rule__ParenthesizedAttributeSet__Group__0__Impl"
    // InternalEclParser.g:3315:1: rule__ParenthesizedAttributeSet__Group__0__Impl : ( LeftParenthesis ) ;
    public final void rule__ParenthesizedAttributeSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3319:1: ( ( LeftParenthesis ) )
            // InternalEclParser.g:3320:1: ( LeftParenthesis )
            {
            // InternalEclParser.g:3320:1: ( LeftParenthesis )
            // InternalEclParser.g:3321:2: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedAttributeSetAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,LeftParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedAttributeSetAccess().getLeftParenthesisKeyword_0()); 
            }

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
    // $ANTLR end "rule__ParenthesizedAttributeSet__Group__0__Impl"


    // $ANTLR start "rule__ParenthesizedAttributeSet__Group__1"
    // InternalEclParser.g:3330:1: rule__ParenthesizedAttributeSet__Group__1 : rule__ParenthesizedAttributeSet__Group__1__Impl rule__ParenthesizedAttributeSet__Group__2 ;
    public final void rule__ParenthesizedAttributeSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3334:1: ( rule__ParenthesizedAttributeSet__Group__1__Impl rule__ParenthesizedAttributeSet__Group__2 )
            // InternalEclParser.g:3335:2: rule__ParenthesizedAttributeSet__Group__1__Impl rule__ParenthesizedAttributeSet__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__ParenthesizedAttributeSet__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedAttributeSet__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParenthesizedAttributeSet__Group__1"


    // $ANTLR start "rule__ParenthesizedAttributeSet__Group__1__Impl"
    // InternalEclParser.g:3342:1: rule__ParenthesizedAttributeSet__Group__1__Impl : ( ruleDisjunctionAttributeSet ) ;
    public final void rule__ParenthesizedAttributeSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3346:1: ( ( ruleDisjunctionAttributeSet ) )
            // InternalEclParser.g:3347:1: ( ruleDisjunctionAttributeSet )
            {
            // InternalEclParser.g:3347:1: ( ruleDisjunctionAttributeSet )
            // InternalEclParser.g:3348:2: ruleDisjunctionAttributeSet
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedAttributeSetAccess().getDisjunctionAttributeSetParserRuleCall_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDisjunctionAttributeSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedAttributeSetAccess().getDisjunctionAttributeSetParserRuleCall_1()); 
            }

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
    // $ANTLR end "rule__ParenthesizedAttributeSet__Group__1__Impl"


    // $ANTLR start "rule__ParenthesizedAttributeSet__Group__2"
    // InternalEclParser.g:3357:1: rule__ParenthesizedAttributeSet__Group__2 : rule__ParenthesizedAttributeSet__Group__2__Impl ;
    public final void rule__ParenthesizedAttributeSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3361:1: ( rule__ParenthesizedAttributeSet__Group__2__Impl )
            // InternalEclParser.g:3362:2: rule__ParenthesizedAttributeSet__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedAttributeSet__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParenthesizedAttributeSet__Group__2"


    // $ANTLR start "rule__ParenthesizedAttributeSet__Group__2__Impl"
    // InternalEclParser.g:3368:1: rule__ParenthesizedAttributeSet__Group__2__Impl : ( RightParenthesis ) ;
    public final void rule__ParenthesizedAttributeSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3372:1: ( ( RightParenthesis ) )
            // InternalEclParser.g:3373:1: ( RightParenthesis )
            {
            // InternalEclParser.g:3373:1: ( RightParenthesis )
            // InternalEclParser.g:3374:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedAttributeSetAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedAttributeSetAccess().getRightParenthesisKeyword_2()); 
            }

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
    // $ANTLR end "rule__ParenthesizedAttributeSet__Group__2__Impl"


    // $ANTLR start "rule__AttributeGroup__Group__0"
    // InternalEclParser.g:3384:1: rule__AttributeGroup__Group__0 : rule__AttributeGroup__Group__0__Impl rule__AttributeGroup__Group__1 ;
    public final void rule__AttributeGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3388:1: ( rule__AttributeGroup__Group__0__Impl rule__AttributeGroup__Group__1 )
            // InternalEclParser.g:3389:2: rule__AttributeGroup__Group__0__Impl rule__AttributeGroup__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__AttributeGroup__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeGroup__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AttributeGroup__Group__0"


    // $ANTLR start "rule__AttributeGroup__Group__0__Impl"
    // InternalEclParser.g:3396:1: rule__AttributeGroup__Group__0__Impl : ( ( rule__AttributeGroup__CardinalityAssignment_0 )? ) ;
    public final void rule__AttributeGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3400:1: ( ( ( rule__AttributeGroup__CardinalityAssignment_0 )? ) )
            // InternalEclParser.g:3401:1: ( ( rule__AttributeGroup__CardinalityAssignment_0 )? )
            {
            // InternalEclParser.g:3401:1: ( ( rule__AttributeGroup__CardinalityAssignment_0 )? )
            // InternalEclParser.g:3402:2: ( rule__AttributeGroup__CardinalityAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeGroupAccess().getCardinalityAssignment_0()); 
            }
            // InternalEclParser.g:3403:2: ( rule__AttributeGroup__CardinalityAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==LeftSquareBracket) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalEclParser.g:3403:3: rule__AttributeGroup__CardinalityAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__AttributeGroup__CardinalityAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeGroupAccess().getCardinalityAssignment_0()); 
            }

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
    // $ANTLR end "rule__AttributeGroup__Group__0__Impl"


    // $ANTLR start "rule__AttributeGroup__Group__1"
    // InternalEclParser.g:3411:1: rule__AttributeGroup__Group__1 : rule__AttributeGroup__Group__1__Impl rule__AttributeGroup__Group__2 ;
    public final void rule__AttributeGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3415:1: ( rule__AttributeGroup__Group__1__Impl rule__AttributeGroup__Group__2 )
            // InternalEclParser.g:3416:2: rule__AttributeGroup__Group__1__Impl rule__AttributeGroup__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__AttributeGroup__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeGroup__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AttributeGroup__Group__1"


    // $ANTLR start "rule__AttributeGroup__Group__1__Impl"
    // InternalEclParser.g:3423:1: rule__AttributeGroup__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__AttributeGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3427:1: ( ( LeftCurlyBracket ) )
            // InternalEclParser.g:3428:1: ( LeftCurlyBracket )
            {
            // InternalEclParser.g:3428:1: ( LeftCurlyBracket )
            // InternalEclParser.g:3429:2: LeftCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeGroupAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,LeftCurlyBracket,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeGroupAccess().getLeftCurlyBracketKeyword_1()); 
            }

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
    // $ANTLR end "rule__AttributeGroup__Group__1__Impl"


    // $ANTLR start "rule__AttributeGroup__Group__2"
    // InternalEclParser.g:3438:1: rule__AttributeGroup__Group__2 : rule__AttributeGroup__Group__2__Impl rule__AttributeGroup__Group__3 ;
    public final void rule__AttributeGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3442:1: ( rule__AttributeGroup__Group__2__Impl rule__AttributeGroup__Group__3 )
            // InternalEclParser.g:3443:2: rule__AttributeGroup__Group__2__Impl rule__AttributeGroup__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__AttributeGroup__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeGroup__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AttributeGroup__Group__2"


    // $ANTLR start "rule__AttributeGroup__Group__2__Impl"
    // InternalEclParser.g:3450:1: rule__AttributeGroup__Group__2__Impl : ( ( rule__AttributeGroup__AttributeSetAssignment_2 ) ) ;
    public final void rule__AttributeGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3454:1: ( ( ( rule__AttributeGroup__AttributeSetAssignment_2 ) ) )
            // InternalEclParser.g:3455:1: ( ( rule__AttributeGroup__AttributeSetAssignment_2 ) )
            {
            // InternalEclParser.g:3455:1: ( ( rule__AttributeGroup__AttributeSetAssignment_2 ) )
            // InternalEclParser.g:3456:2: ( rule__AttributeGroup__AttributeSetAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeGroupAccess().getAttributeSetAssignment_2()); 
            }
            // InternalEclParser.g:3457:2: ( rule__AttributeGroup__AttributeSetAssignment_2 )
            // InternalEclParser.g:3457:3: rule__AttributeGroup__AttributeSetAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeGroup__AttributeSetAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeGroupAccess().getAttributeSetAssignment_2()); 
            }

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
    // $ANTLR end "rule__AttributeGroup__Group__2__Impl"


    // $ANTLR start "rule__AttributeGroup__Group__3"
    // InternalEclParser.g:3465:1: rule__AttributeGroup__Group__3 : rule__AttributeGroup__Group__3__Impl ;
    public final void rule__AttributeGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3469:1: ( rule__AttributeGroup__Group__3__Impl )
            // InternalEclParser.g:3470:2: rule__AttributeGroup__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeGroup__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AttributeGroup__Group__3"


    // $ANTLR start "rule__AttributeGroup__Group__3__Impl"
    // InternalEclParser.g:3476:1: rule__AttributeGroup__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__AttributeGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3480:1: ( ( RightCurlyBracket ) )
            // InternalEclParser.g:3481:1: ( RightCurlyBracket )
            {
            // InternalEclParser.g:3481:1: ( RightCurlyBracket )
            // InternalEclParser.g:3482:2: RightCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeGroupAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,RightCurlyBracket,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeGroupAccess().getRightCurlyBracketKeyword_3()); 
            }

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
    // $ANTLR end "rule__AttributeGroup__Group__3__Impl"


    // $ANTLR start "rule__ParenthesizedRefinement__Group__0"
    // InternalEclParser.g:3492:1: rule__ParenthesizedRefinement__Group__0 : rule__ParenthesizedRefinement__Group__0__Impl rule__ParenthesizedRefinement__Group__1 ;
    public final void rule__ParenthesizedRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3496:1: ( rule__ParenthesizedRefinement__Group__0__Impl rule__ParenthesizedRefinement__Group__1 )
            // InternalEclParser.g:3497:2: rule__ParenthesizedRefinement__Group__0__Impl rule__ParenthesizedRefinement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__ParenthesizedRefinement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedRefinement__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParenthesizedRefinement__Group__0"


    // $ANTLR start "rule__ParenthesizedRefinement__Group__0__Impl"
    // InternalEclParser.g:3504:1: rule__ParenthesizedRefinement__Group__0__Impl : ( LeftParenthesis ) ;
    public final void rule__ParenthesizedRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3508:1: ( ( LeftParenthesis ) )
            // InternalEclParser.g:3509:1: ( LeftParenthesis )
            {
            // InternalEclParser.g:3509:1: ( LeftParenthesis )
            // InternalEclParser.g:3510:2: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedRefinementAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,LeftParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedRefinementAccess().getLeftParenthesisKeyword_0()); 
            }

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
    // $ANTLR end "rule__ParenthesizedRefinement__Group__0__Impl"


    // $ANTLR start "rule__ParenthesizedRefinement__Group__1"
    // InternalEclParser.g:3519:1: rule__ParenthesizedRefinement__Group__1 : rule__ParenthesizedRefinement__Group__1__Impl rule__ParenthesizedRefinement__Group__2 ;
    public final void rule__ParenthesizedRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3523:1: ( rule__ParenthesizedRefinement__Group__1__Impl rule__ParenthesizedRefinement__Group__2 )
            // InternalEclParser.g:3524:2: rule__ParenthesizedRefinement__Group__1__Impl rule__ParenthesizedRefinement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__ParenthesizedRefinement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedRefinement__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParenthesizedRefinement__Group__1"


    // $ANTLR start "rule__ParenthesizedRefinement__Group__1__Impl"
    // InternalEclParser.g:3531:1: rule__ParenthesizedRefinement__Group__1__Impl : ( ruleRefinement ) ;
    public final void rule__ParenthesizedRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3535:1: ( ( ruleRefinement ) )
            // InternalEclParser.g:3536:1: ( ruleRefinement )
            {
            // InternalEclParser.g:3536:1: ( ruleRefinement )
            // InternalEclParser.g:3537:2: ruleRefinement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedRefinementAccess().getRefinementParserRuleCall_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRefinement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedRefinementAccess().getRefinementParserRuleCall_1()); 
            }

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
    // $ANTLR end "rule__ParenthesizedRefinement__Group__1__Impl"


    // $ANTLR start "rule__ParenthesizedRefinement__Group__2"
    // InternalEclParser.g:3546:1: rule__ParenthesizedRefinement__Group__2 : rule__ParenthesizedRefinement__Group__2__Impl ;
    public final void rule__ParenthesizedRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3550:1: ( rule__ParenthesizedRefinement__Group__2__Impl )
            // InternalEclParser.g:3551:2: rule__ParenthesizedRefinement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedRefinement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParenthesizedRefinement__Group__2"


    // $ANTLR start "rule__ParenthesizedRefinement__Group__2__Impl"
    // InternalEclParser.g:3557:1: rule__ParenthesizedRefinement__Group__2__Impl : ( RightParenthesis ) ;
    public final void rule__ParenthesizedRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3561:1: ( ( RightParenthesis ) )
            // InternalEclParser.g:3562:1: ( RightParenthesis )
            {
            // InternalEclParser.g:3562:1: ( RightParenthesis )
            // InternalEclParser.g:3563:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedRefinementAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedRefinementAccess().getRightParenthesisKeyword_2()); 
            }

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
    // $ANTLR end "rule__ParenthesizedRefinement__Group__2__Impl"


    // $ANTLR start "rule__PrimaryExpressionConstraint__Group_1__0"
    // InternalEclParser.g:3573:1: rule__PrimaryExpressionConstraint__Group_1__0 : rule__PrimaryExpressionConstraint__Group_1__0__Impl rule__PrimaryExpressionConstraint__Group_1__1 ;
    public final void rule__PrimaryExpressionConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3577:1: ( rule__PrimaryExpressionConstraint__Group_1__0__Impl rule__PrimaryExpressionConstraint__Group_1__1 )
            // InternalEclParser.g:3578:2: rule__PrimaryExpressionConstraint__Group_1__0__Impl rule__PrimaryExpressionConstraint__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__PrimaryExpressionConstraint__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PrimaryExpressionConstraint__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimaryExpressionConstraint__Group_1__0"


    // $ANTLR start "rule__PrimaryExpressionConstraint__Group_1__0__Impl"
    // InternalEclParser.g:3585:1: rule__PrimaryExpressionConstraint__Group_1__0__Impl : ( LeftParenthesis ) ;
    public final void rule__PrimaryExpressionConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3589:1: ( ( LeftParenthesis ) )
            // InternalEclParser.g:3590:1: ( LeftParenthesis )
            {
            // InternalEclParser.g:3590:1: ( LeftParenthesis )
            // InternalEclParser.g:3591:2: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionConstraintAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,LeftParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionConstraintAccess().getLeftParenthesisKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__PrimaryExpressionConstraint__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpressionConstraint__Group_1__1"
    // InternalEclParser.g:3600:1: rule__PrimaryExpressionConstraint__Group_1__1 : rule__PrimaryExpressionConstraint__Group_1__1__Impl rule__PrimaryExpressionConstraint__Group_1__2 ;
    public final void rule__PrimaryExpressionConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3604:1: ( rule__PrimaryExpressionConstraint__Group_1__1__Impl rule__PrimaryExpressionConstraint__Group_1__2 )
            // InternalEclParser.g:3605:2: rule__PrimaryExpressionConstraint__Group_1__1__Impl rule__PrimaryExpressionConstraint__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__PrimaryExpressionConstraint__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PrimaryExpressionConstraint__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimaryExpressionConstraint__Group_1__1"


    // $ANTLR start "rule__PrimaryExpressionConstraint__Group_1__1__Impl"
    // InternalEclParser.g:3612:1: rule__PrimaryExpressionConstraint__Group_1__1__Impl : ( ruleExpressionConstraint ) ;
    public final void rule__PrimaryExpressionConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3616:1: ( ( ruleExpressionConstraint ) )
            // InternalEclParser.g:3617:1: ( ruleExpressionConstraint )
            {
            // InternalEclParser.g:3617:1: ( ruleExpressionConstraint )
            // InternalEclParser.g:3618:2: ruleExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionConstraintAccess().getExpressionConstraintParserRuleCall_1_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionConstraintAccess().getExpressionConstraintParserRuleCall_1_1()); 
            }

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
    // $ANTLR end "rule__PrimaryExpressionConstraint__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpressionConstraint__Group_1__2"
    // InternalEclParser.g:3627:1: rule__PrimaryExpressionConstraint__Group_1__2 : rule__PrimaryExpressionConstraint__Group_1__2__Impl rule__PrimaryExpressionConstraint__Group_1__3 ;
    public final void rule__PrimaryExpressionConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3631:1: ( rule__PrimaryExpressionConstraint__Group_1__2__Impl rule__PrimaryExpressionConstraint__Group_1__3 )
            // InternalEclParser.g:3632:2: rule__PrimaryExpressionConstraint__Group_1__2__Impl rule__PrimaryExpressionConstraint__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__PrimaryExpressionConstraint__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PrimaryExpressionConstraint__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimaryExpressionConstraint__Group_1__2"


    // $ANTLR start "rule__PrimaryExpressionConstraint__Group_1__2__Impl"
    // InternalEclParser.g:3639:1: rule__PrimaryExpressionConstraint__Group_1__2__Impl : ( () ) ;
    public final void rule__PrimaryExpressionConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3643:1: ( ( () ) )
            // InternalEclParser.g:3644:1: ( () )
            {
            // InternalEclParser.g:3644:1: ( () )
            // InternalEclParser.g:3645:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionConstraintAccess().getParenthesizedExpressionConstraintCurrentAction_1_2()); 
            }
            // InternalEclParser.g:3646:2: ()
            // InternalEclParser.g:3646:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionConstraintAccess().getParenthesizedExpressionConstraintCurrentAction_1_2()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpressionConstraint__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryExpressionConstraint__Group_1__3"
    // InternalEclParser.g:3654:1: rule__PrimaryExpressionConstraint__Group_1__3 : rule__PrimaryExpressionConstraint__Group_1__3__Impl ;
    public final void rule__PrimaryExpressionConstraint__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3658:1: ( rule__PrimaryExpressionConstraint__Group_1__3__Impl )
            // InternalEclParser.g:3659:2: rule__PrimaryExpressionConstraint__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PrimaryExpressionConstraint__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimaryExpressionConstraint__Group_1__3"


    // $ANTLR start "rule__PrimaryExpressionConstraint__Group_1__3__Impl"
    // InternalEclParser.g:3665:1: rule__PrimaryExpressionConstraint__Group_1__3__Impl : ( RightParenthesis ) ;
    public final void rule__PrimaryExpressionConstraint__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3669:1: ( ( RightParenthesis ) )
            // InternalEclParser.g:3670:1: ( RightParenthesis )
            {
            // InternalEclParser.g:3670:1: ( RightParenthesis )
            // InternalEclParser.g:3671:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionConstraintAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,RightParenthesis,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionConstraintAccess().getRightParenthesisKeyword_1_3()); 
            }

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
    // $ANTLR end "rule__PrimaryExpressionConstraint__Group_1__3__Impl"


    // $ANTLR start "rule__SimpleExpressionConstraint__Group__0"
    // InternalEclParser.g:3681:1: rule__SimpleExpressionConstraint__Group__0 : rule__SimpleExpressionConstraint__Group__0__Impl rule__SimpleExpressionConstraint__Group__1 ;
    public final void rule__SimpleExpressionConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3685:1: ( rule__SimpleExpressionConstraint__Group__0__Impl rule__SimpleExpressionConstraint__Group__1 )
            // InternalEclParser.g:3686:2: rule__SimpleExpressionConstraint__Group__0__Impl rule__SimpleExpressionConstraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__SimpleExpressionConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SimpleExpressionConstraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SimpleExpressionConstraint__Group__0"


    // $ANTLR start "rule__SimpleExpressionConstraint__Group__0__Impl"
    // InternalEclParser.g:3693:1: rule__SimpleExpressionConstraint__Group__0__Impl : ( ( rule__SimpleExpressionConstraint__OpAssignment_0 )? ) ;
    public final void rule__SimpleExpressionConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3697:1: ( ( ( rule__SimpleExpressionConstraint__OpAssignment_0 )? ) )
            // InternalEclParser.g:3698:1: ( ( rule__SimpleExpressionConstraint__OpAssignment_0 )? )
            {
            // InternalEclParser.g:3698:1: ( ( rule__SimpleExpressionConstraint__OpAssignment_0 )? )
            // InternalEclParser.g:3699:2: ( rule__SimpleExpressionConstraint__OpAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleExpressionConstraintAccess().getOpAssignment_0()); 
            }
            // InternalEclParser.g:3700:2: ( rule__SimpleExpressionConstraint__OpAssignment_0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==LessThanSignLessThanSign||LA28_0==GreaterThanSignGreaterThanSign||LA28_0==LessThanSign||LA28_0==GreaterThanSign) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalEclParser.g:3700:3: rule__SimpleExpressionConstraint__OpAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__SimpleExpressionConstraint__OpAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleExpressionConstraintAccess().getOpAssignment_0()); 
            }

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
    // $ANTLR end "rule__SimpleExpressionConstraint__Group__0__Impl"


    // $ANTLR start "rule__SimpleExpressionConstraint__Group__1"
    // InternalEclParser.g:3708:1: rule__SimpleExpressionConstraint__Group__1 : rule__SimpleExpressionConstraint__Group__1__Impl ;
    public final void rule__SimpleExpressionConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3712:1: ( rule__SimpleExpressionConstraint__Group__1__Impl )
            // InternalEclParser.g:3713:2: rule__SimpleExpressionConstraint__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SimpleExpressionConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SimpleExpressionConstraint__Group__1"


    // $ANTLR start "rule__SimpleExpressionConstraint__Group__1__Impl"
    // InternalEclParser.g:3719:1: rule__SimpleExpressionConstraint__Group__1__Impl : ( ( rule__SimpleExpressionConstraint__ConceptAssignment_1 ) ) ;
    public final void rule__SimpleExpressionConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3723:1: ( ( ( rule__SimpleExpressionConstraint__ConceptAssignment_1 ) ) )
            // InternalEclParser.g:3724:1: ( ( rule__SimpleExpressionConstraint__ConceptAssignment_1 ) )
            {
            // InternalEclParser.g:3724:1: ( ( rule__SimpleExpressionConstraint__ConceptAssignment_1 ) )
            // InternalEclParser.g:3725:2: ( rule__SimpleExpressionConstraint__ConceptAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleExpressionConstraintAccess().getConceptAssignment_1()); 
            }
            // InternalEclParser.g:3726:2: ( rule__SimpleExpressionConstraint__ConceptAssignment_1 )
            // InternalEclParser.g:3726:3: rule__SimpleExpressionConstraint__ConceptAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SimpleExpressionConstraint__ConceptAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleExpressionConstraintAccess().getConceptAssignment_1()); 
            }

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
    // $ANTLR end "rule__SimpleExpressionConstraint__Group__1__Impl"


    // $ANTLR start "rule__FocusConcept__Group__0"
    // InternalEclParser.g:3735:1: rule__FocusConcept__Group__0 : rule__FocusConcept__Group__0__Impl rule__FocusConcept__Group__1 ;
    public final void rule__FocusConcept__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3739:1: ( rule__FocusConcept__Group__0__Impl rule__FocusConcept__Group__1 )
            // InternalEclParser.g:3740:2: rule__FocusConcept__Group__0__Impl rule__FocusConcept__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__FocusConcept__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FocusConcept__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FocusConcept__Group__0"


    // $ANTLR start "rule__FocusConcept__Group__0__Impl"
    // InternalEclParser.g:3747:1: rule__FocusConcept__Group__0__Impl : ( ( rule__FocusConcept__MemberOfAssignment_0 )? ) ;
    public final void rule__FocusConcept__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3751:1: ( ( ( rule__FocusConcept__MemberOfAssignment_0 )? ) )
            // InternalEclParser.g:3752:1: ( ( rule__FocusConcept__MemberOfAssignment_0 )? )
            {
            // InternalEclParser.g:3752:1: ( ( rule__FocusConcept__MemberOfAssignment_0 )? )
            // InternalEclParser.g:3753:2: ( rule__FocusConcept__MemberOfAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFocusConceptAccess().getMemberOfAssignment_0()); 
            }
            // InternalEclParser.g:3754:2: ( rule__FocusConcept__MemberOfAssignment_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==CircumflexAccent) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalEclParser.g:3754:3: rule__FocusConcept__MemberOfAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__FocusConcept__MemberOfAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFocusConceptAccess().getMemberOfAssignment_0()); 
            }

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
    // $ANTLR end "rule__FocusConcept__Group__0__Impl"


    // $ANTLR start "rule__FocusConcept__Group__1"
    // InternalEclParser.g:3762:1: rule__FocusConcept__Group__1 : rule__FocusConcept__Group__1__Impl ;
    public final void rule__FocusConcept__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3766:1: ( rule__FocusConcept__Group__1__Impl )
            // InternalEclParser.g:3767:2: rule__FocusConcept__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FocusConcept__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FocusConcept__Group__1"


    // $ANTLR start "rule__FocusConcept__Group__1__Impl"
    // InternalEclParser.g:3773:1: rule__FocusConcept__Group__1__Impl : ( ( rule__FocusConcept__Alternatives_1 ) ) ;
    public final void rule__FocusConcept__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3777:1: ( ( ( rule__FocusConcept__Alternatives_1 ) ) )
            // InternalEclParser.g:3778:1: ( ( rule__FocusConcept__Alternatives_1 ) )
            {
            // InternalEclParser.g:3778:1: ( ( rule__FocusConcept__Alternatives_1 ) )
            // InternalEclParser.g:3779:2: ( rule__FocusConcept__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFocusConceptAccess().getAlternatives_1()); 
            }
            // InternalEclParser.g:3780:2: ( rule__FocusConcept__Alternatives_1 )
            // InternalEclParser.g:3780:3: rule__FocusConcept__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FocusConcept__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFocusConceptAccess().getAlternatives_1()); 
            }

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
    // $ANTLR end "rule__FocusConcept__Group__1__Impl"


    // $ANTLR start "rule__ConceptReference__Group__0"
    // InternalEclParser.g:3789:1: rule__ConceptReference__Group__0 : rule__ConceptReference__Group__0__Impl rule__ConceptReference__Group__1 ;
    public final void rule__ConceptReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3793:1: ( rule__ConceptReference__Group__0__Impl rule__ConceptReference__Group__1 )
            // InternalEclParser.g:3794:2: rule__ConceptReference__Group__0__Impl rule__ConceptReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__ConceptReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConceptReference__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConceptReference__Group__0"


    // $ANTLR start "rule__ConceptReference__Group__0__Impl"
    // InternalEclParser.g:3801:1: rule__ConceptReference__Group__0__Impl : ( ( rule__ConceptReference__IdAssignment_0 ) ) ;
    public final void rule__ConceptReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3805:1: ( ( ( rule__ConceptReference__IdAssignment_0 ) ) )
            // InternalEclParser.g:3806:1: ( ( rule__ConceptReference__IdAssignment_0 ) )
            {
            // InternalEclParser.g:3806:1: ( ( rule__ConceptReference__IdAssignment_0 ) )
            // InternalEclParser.g:3807:2: ( rule__ConceptReference__IdAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConceptReferenceAccess().getIdAssignment_0()); 
            }
            // InternalEclParser.g:3808:2: ( rule__ConceptReference__IdAssignment_0 )
            // InternalEclParser.g:3808:3: rule__ConceptReference__IdAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConceptReference__IdAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConceptReferenceAccess().getIdAssignment_0()); 
            }

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
    // $ANTLR end "rule__ConceptReference__Group__0__Impl"


    // $ANTLR start "rule__ConceptReference__Group__1"
    // InternalEclParser.g:3816:1: rule__ConceptReference__Group__1 : rule__ConceptReference__Group__1__Impl ;
    public final void rule__ConceptReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3820:1: ( rule__ConceptReference__Group__1__Impl )
            // InternalEclParser.g:3821:2: rule__ConceptReference__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConceptReference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConceptReference__Group__1"


    // $ANTLR start "rule__ConceptReference__Group__1__Impl"
    // InternalEclParser.g:3827:1: rule__ConceptReference__Group__1__Impl : ( ( rule__ConceptReference__TermAssignment_1 )? ) ;
    public final void rule__ConceptReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3831:1: ( ( ( rule__ConceptReference__TermAssignment_1 )? ) )
            // InternalEclParser.g:3832:1: ( ( rule__ConceptReference__TermAssignment_1 )? )
            {
            // InternalEclParser.g:3832:1: ( ( rule__ConceptReference__TermAssignment_1 )? )
            // InternalEclParser.g:3833:2: ( rule__ConceptReference__TermAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConceptReferenceAccess().getTermAssignment_1()); 
            }
            // InternalEclParser.g:3834:2: ( rule__ConceptReference__TermAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_TERM_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalEclParser.g:3834:3: rule__ConceptReference__TermAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ConceptReference__TermAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConceptReferenceAccess().getTermAssignment_1()); 
            }

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
    // $ANTLR end "rule__ConceptReference__Group__1__Impl"


    // $ANTLR start "rule__Script__ConstraintAssignment"
    // InternalEclParser.g:3843:1: rule__Script__ConstraintAssignment : ( ruleExpressionConstraint ) ;
    public final void rule__Script__ConstraintAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3847:1: ( ( ruleExpressionConstraint ) )
            // InternalEclParser.g:3848:2: ( ruleExpressionConstraint )
            {
            // InternalEclParser.g:3848:2: ( ruleExpressionConstraint )
            // InternalEclParser.g:3849:3: ruleExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getConstraintExpressionConstraintParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getConstraintExpressionConstraintParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Script__ConstraintAssignment"


    // $ANTLR start "rule__ExclusionExpressionConstraint__OpAssignment_1_0_0_1"
    // InternalEclParser.g:3858:1: rule__ExclusionExpressionConstraint__OpAssignment_1_0_0_1 : ( ruleExclusionOperator ) ;
    public final void rule__ExclusionExpressionConstraint__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3862:1: ( ( ruleExclusionOperator ) )
            // InternalEclParser.g:3863:2: ( ruleExclusionOperator )
            {
            // InternalEclParser.g:3863:2: ( ruleExclusionOperator )
            // InternalEclParser.g:3864:3: ruleExclusionOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExclusionExpressionConstraintAccess().getOpExclusionOperatorEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExclusionOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExclusionExpressionConstraintAccess().getOpExclusionOperatorEnumRuleCall_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__ExclusionExpressionConstraint__OpAssignment_1_0_0_1"


    // $ANTLR start "rule__ExclusionExpressionConstraint__RightAssignment_1_1"
    // InternalEclParser.g:3873:1: rule__ExclusionExpressionConstraint__RightAssignment_1_1 : ( ruleDisjunctionExpressionConstraint ) ;
    public final void rule__ExclusionExpressionConstraint__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3877:1: ( ( ruleDisjunctionExpressionConstraint ) )
            // InternalEclParser.g:3878:2: ( ruleDisjunctionExpressionConstraint )
            {
            // InternalEclParser.g:3878:2: ( ruleDisjunctionExpressionConstraint )
            // InternalEclParser.g:3879:3: ruleDisjunctionExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExclusionExpressionConstraintAccess().getRightDisjunctionExpressionConstraintParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDisjunctionExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExclusionExpressionConstraintAccess().getRightDisjunctionExpressionConstraintParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__ExclusionExpressionConstraint__RightAssignment_1_1"


    // $ANTLR start "rule__DisjunctionExpressionConstraint__OpAssignment_1_0_0_1"
    // InternalEclParser.g:3888:1: rule__DisjunctionExpressionConstraint__OpAssignment_1_0_0_1 : ( ruleDisjunctionOperator ) ;
    public final void rule__DisjunctionExpressionConstraint__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3892:1: ( ( ruleDisjunctionOperator ) )
            // InternalEclParser.g:3893:2: ( ruleDisjunctionOperator )
            {
            // InternalEclParser.g:3893:2: ( ruleDisjunctionOperator )
            // InternalEclParser.g:3894:3: ruleDisjunctionOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionExpressionConstraintAccess().getOpDisjunctionOperatorEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDisjunctionOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionExpressionConstraintAccess().getOpDisjunctionOperatorEnumRuleCall_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__DisjunctionExpressionConstraint__OpAssignment_1_0_0_1"


    // $ANTLR start "rule__DisjunctionExpressionConstraint__RightAssignment_1_1"
    // InternalEclParser.g:3903:1: rule__DisjunctionExpressionConstraint__RightAssignment_1_1 : ( ruleConjunctionExpressionConstraint ) ;
    public final void rule__DisjunctionExpressionConstraint__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3907:1: ( ( ruleConjunctionExpressionConstraint ) )
            // InternalEclParser.g:3908:2: ( ruleConjunctionExpressionConstraint )
            {
            // InternalEclParser.g:3908:2: ( ruleConjunctionExpressionConstraint )
            // InternalEclParser.g:3909:3: ruleConjunctionExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionExpressionConstraintAccess().getRightConjunctionExpressionConstraintParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConjunctionExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionExpressionConstraintAccess().getRightConjunctionExpressionConstraintParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__DisjunctionExpressionConstraint__RightAssignment_1_1"


    // $ANTLR start "rule__ConjunctionExpressionConstraint__OpAssignment_1_0_0_1"
    // InternalEclParser.g:3918:1: rule__ConjunctionExpressionConstraint__OpAssignment_1_0_0_1 : ( ruleConjunctionOperator ) ;
    public final void rule__ConjunctionExpressionConstraint__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3922:1: ( ( ruleConjunctionOperator ) )
            // InternalEclParser.g:3923:2: ( ruleConjunctionOperator )
            {
            // InternalEclParser.g:3923:2: ( ruleConjunctionOperator )
            // InternalEclParser.g:3924:3: ruleConjunctionOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionExpressionConstraintAccess().getOpConjunctionOperatorEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConjunctionOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionExpressionConstraintAccess().getOpConjunctionOperatorEnumRuleCall_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__ConjunctionExpressionConstraint__OpAssignment_1_0_0_1"


    // $ANTLR start "rule__ConjunctionExpressionConstraint__RightAssignment_1_1"
    // InternalEclParser.g:3933:1: rule__ConjunctionExpressionConstraint__RightAssignment_1_1 : ( ruleRefinedExpressionConstraint ) ;
    public final void rule__ConjunctionExpressionConstraint__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3937:1: ( ( ruleRefinedExpressionConstraint ) )
            // InternalEclParser.g:3938:2: ( ruleRefinedExpressionConstraint )
            {
            // InternalEclParser.g:3938:2: ( ruleRefinedExpressionConstraint )
            // InternalEclParser.g:3939:3: ruleRefinedExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionExpressionConstraintAccess().getRightRefinedExpressionConstraintParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRefinedExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionExpressionConstraintAccess().getRightRefinedExpressionConstraintParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__ConjunctionExpressionConstraint__RightAssignment_1_1"


    // $ANTLR start "rule__RefinedExpressionConstraint__RefinementAssignment_1_2"
    // InternalEclParser.g:3948:1: rule__RefinedExpressionConstraint__RefinementAssignment_1_2 : ( ruleRefinement ) ;
    public final void rule__RefinedExpressionConstraint__RefinementAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3952:1: ( ( ruleRefinement ) )
            // InternalEclParser.g:3953:2: ( ruleRefinement )
            {
            // InternalEclParser.g:3953:2: ( ruleRefinement )
            // InternalEclParser.g:3954:3: ruleRefinement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementRefinementParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRefinement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementRefinementParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__RefinedExpressionConstraint__RefinementAssignment_1_2"


    // $ANTLR start "rule__DisjunctionRefinementSet__OpAssignment_1_0_0_1"
    // InternalEclParser.g:3963:1: rule__DisjunctionRefinementSet__OpAssignment_1_0_0_1 : ( ruleDisjunctionOperator ) ;
    public final void rule__DisjunctionRefinementSet__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3967:1: ( ( ruleDisjunctionOperator ) )
            // InternalEclParser.g:3968:2: ( ruleDisjunctionOperator )
            {
            // InternalEclParser.g:3968:2: ( ruleDisjunctionOperator )
            // InternalEclParser.g:3969:3: ruleDisjunctionOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionRefinementSetAccess().getOpDisjunctionOperatorEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDisjunctionOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionRefinementSetAccess().getOpDisjunctionOperatorEnumRuleCall_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__DisjunctionRefinementSet__OpAssignment_1_0_0_1"


    // $ANTLR start "rule__DisjunctionRefinementSet__RightAssignment_1_1"
    // InternalEclParser.g:3978:1: rule__DisjunctionRefinementSet__RightAssignment_1_1 : ( ruleConjunctionRefinementSet ) ;
    public final void rule__DisjunctionRefinementSet__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3982:1: ( ( ruleConjunctionRefinementSet ) )
            // InternalEclParser.g:3983:2: ( ruleConjunctionRefinementSet )
            {
            // InternalEclParser.g:3983:2: ( ruleConjunctionRefinementSet )
            // InternalEclParser.g:3984:3: ruleConjunctionRefinementSet
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionRefinementSetAccess().getRightConjunctionRefinementSetParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConjunctionRefinementSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionRefinementSetAccess().getRightConjunctionRefinementSetParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__DisjunctionRefinementSet__RightAssignment_1_1"


    // $ANTLR start "rule__ConjunctionRefinementSet__OpAssignment_1_0_0_1"
    // InternalEclParser.g:3993:1: rule__ConjunctionRefinementSet__OpAssignment_1_0_0_1 : ( ruleConjunctionOperator ) ;
    public final void rule__ConjunctionRefinementSet__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3997:1: ( ( ruleConjunctionOperator ) )
            // InternalEclParser.g:3998:2: ( ruleConjunctionOperator )
            {
            // InternalEclParser.g:3998:2: ( ruleConjunctionOperator )
            // InternalEclParser.g:3999:3: ruleConjunctionOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionRefinementSetAccess().getOpConjunctionOperatorEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConjunctionOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionRefinementSetAccess().getOpConjunctionOperatorEnumRuleCall_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__ConjunctionRefinementSet__OpAssignment_1_0_0_1"


    // $ANTLR start "rule__ConjunctionRefinementSet__RightAssignment_1_1"
    // InternalEclParser.g:4008:1: rule__ConjunctionRefinementSet__RightAssignment_1_1 : ( ruleSubRefinement ) ;
    public final void rule__ConjunctionRefinementSet__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4012:1: ( ( ruleSubRefinement ) )
            // InternalEclParser.g:4013:2: ( ruleSubRefinement )
            {
            // InternalEclParser.g:4013:2: ( ruleSubRefinement )
            // InternalEclParser.g:4014:3: ruleSubRefinement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionRefinementSetAccess().getRightSubRefinementParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSubRefinement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionRefinementSetAccess().getRightSubRefinementParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__ConjunctionRefinementSet__RightAssignment_1_1"


    // $ANTLR start "rule__AttributeSetRefinement__AttributeSetAssignment"
    // InternalEclParser.g:4023:1: rule__AttributeSetRefinement__AttributeSetAssignment : ( ruleDisjunctionAttributeSet ) ;
    public final void rule__AttributeSetRefinement__AttributeSetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4027:1: ( ( ruleDisjunctionAttributeSet ) )
            // InternalEclParser.g:4028:2: ( ruleDisjunctionAttributeSet )
            {
            // InternalEclParser.g:4028:2: ( ruleDisjunctionAttributeSet )
            // InternalEclParser.g:4029:3: ruleDisjunctionAttributeSet
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSetRefinementAccess().getAttributeSetDisjunctionAttributeSetParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDisjunctionAttributeSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSetRefinementAccess().getAttributeSetDisjunctionAttributeSetParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__AttributeSetRefinement__AttributeSetAssignment"


    // $ANTLR start "rule__AttributeGroupRefinement__AttributeGroupAssignment"
    // InternalEclParser.g:4038:1: rule__AttributeGroupRefinement__AttributeGroupAssignment : ( ruleAttributeGroup ) ;
    public final void rule__AttributeGroupRefinement__AttributeGroupAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4042:1: ( ( ruleAttributeGroup ) )
            // InternalEclParser.g:4043:2: ( ruleAttributeGroup )
            {
            // InternalEclParser.g:4043:2: ( ruleAttributeGroup )
            // InternalEclParser.g:4044:3: ruleAttributeGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeGroupRefinementAccess().getAttributeGroupAttributeGroupParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAttributeGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeGroupRefinementAccess().getAttributeGroupAttributeGroupParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__AttributeGroupRefinement__AttributeGroupAssignment"


    // $ANTLR start "rule__DisjunctionAttributeSet__OpAssignment_1_0_0_1"
    // InternalEclParser.g:4053:1: rule__DisjunctionAttributeSet__OpAssignment_1_0_0_1 : ( ruleDisjunctionOperator ) ;
    public final void rule__DisjunctionAttributeSet__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4057:1: ( ( ruleDisjunctionOperator ) )
            // InternalEclParser.g:4058:2: ( ruleDisjunctionOperator )
            {
            // InternalEclParser.g:4058:2: ( ruleDisjunctionOperator )
            // InternalEclParser.g:4059:3: ruleDisjunctionOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAttributeSetAccess().getOpDisjunctionOperatorEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDisjunctionOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAttributeSetAccess().getOpDisjunctionOperatorEnumRuleCall_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__DisjunctionAttributeSet__OpAssignment_1_0_0_1"


    // $ANTLR start "rule__DisjunctionAttributeSet__RightAssignment_1_1"
    // InternalEclParser.g:4068:1: rule__DisjunctionAttributeSet__RightAssignment_1_1 : ( ruleConjunctionAttributeSet ) ;
    public final void rule__DisjunctionAttributeSet__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4072:1: ( ( ruleConjunctionAttributeSet ) )
            // InternalEclParser.g:4073:2: ( ruleConjunctionAttributeSet )
            {
            // InternalEclParser.g:4073:2: ( ruleConjunctionAttributeSet )
            // InternalEclParser.g:4074:3: ruleConjunctionAttributeSet
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAttributeSetAccess().getRightConjunctionAttributeSetParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConjunctionAttributeSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAttributeSetAccess().getRightConjunctionAttributeSetParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__DisjunctionAttributeSet__RightAssignment_1_1"


    // $ANTLR start "rule__ConjunctionAttributeSet__OpAssignment_1_0_0_1"
    // InternalEclParser.g:4083:1: rule__ConjunctionAttributeSet__OpAssignment_1_0_0_1 : ( ruleConjunctionOperator ) ;
    public final void rule__ConjunctionAttributeSet__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4087:1: ( ( ruleConjunctionOperator ) )
            // InternalEclParser.g:4088:2: ( ruleConjunctionOperator )
            {
            // InternalEclParser.g:4088:2: ( ruleConjunctionOperator )
            // InternalEclParser.g:4089:3: ruleConjunctionOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAttributeSetAccess().getOpConjunctionOperatorEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConjunctionOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAttributeSetAccess().getOpConjunctionOperatorEnumRuleCall_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__ConjunctionAttributeSet__OpAssignment_1_0_0_1"


    // $ANTLR start "rule__ConjunctionAttributeSet__RightAssignment_1_1"
    // InternalEclParser.g:4098:1: rule__ConjunctionAttributeSet__RightAssignment_1_1 : ( rulePrimaryAttributeSet ) ;
    public final void rule__ConjunctionAttributeSet__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4102:1: ( ( rulePrimaryAttributeSet ) )
            // InternalEclParser.g:4103:2: ( rulePrimaryAttributeSet )
            {
            // InternalEclParser.g:4103:2: ( rulePrimaryAttributeSet )
            // InternalEclParser.g:4104:3: rulePrimaryAttributeSet
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAttributeSetAccess().getRightPrimaryAttributeSetParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulePrimaryAttributeSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAttributeSetAccess().getRightPrimaryAttributeSetParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__ConjunctionAttributeSet__RightAssignment_1_1"


    // $ANTLR start "rule__Attribute__CardinalityAssignment_0"
    // InternalEclParser.g:4113:1: rule__Attribute__CardinalityAssignment_0 : ( ruleCardinality ) ;
    public final void rule__Attribute__CardinalityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4117:1: ( ( ruleCardinality ) )
            // InternalEclParser.g:4118:2: ( ruleCardinality )
            {
            // InternalEclParser.g:4118:2: ( ruleCardinality )
            // InternalEclParser.g:4119:3: ruleCardinality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getCardinalityCardinalityParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCardinality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getCardinalityCardinalityParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__Attribute__CardinalityAssignment_0"


    // $ANTLR start "rule__Attribute__ReversedAssignment_1"
    // InternalEclParser.g:4128:1: rule__Attribute__ReversedAssignment_1 : ( RULE_REVERSE ) ;
    public final void rule__Attribute__ReversedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4132:1: ( ( RULE_REVERSE ) )
            // InternalEclParser.g:4133:2: ( RULE_REVERSE )
            {
            // InternalEclParser.g:4133:2: ( RULE_REVERSE )
            // InternalEclParser.g:4134:3: RULE_REVERSE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getReversedREVERSETerminalRuleCall_1_0()); 
            }
            match(input,RULE_REVERSE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getReversedREVERSETerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__Attribute__ReversedAssignment_1"


    // $ANTLR start "rule__Attribute__OpAssignment_2"
    // InternalEclParser.g:4143:1: rule__Attribute__OpAssignment_2 : ( ruleAttributeOperator ) ;
    public final void rule__Attribute__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4147:1: ( ( ruleAttributeOperator ) )
            // InternalEclParser.g:4148:2: ( ruleAttributeOperator )
            {
            // InternalEclParser.g:4148:2: ( ruleAttributeOperator )
            // InternalEclParser.g:4149:3: ruleAttributeOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getOpAttributeOperatorEnumRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAttributeOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getOpAttributeOperatorEnumRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__Attribute__OpAssignment_2"


    // $ANTLR start "rule__Attribute__ConceptRefAssignment_3_0"
    // InternalEclParser.g:4158:1: rule__Attribute__ConceptRefAssignment_3_0 : ( ruleConceptReference ) ;
    public final void rule__Attribute__ConceptRefAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4162:1: ( ( ruleConceptReference ) )
            // InternalEclParser.g:4163:2: ( ruleConceptReference )
            {
            // InternalEclParser.g:4163:2: ( ruleConceptReference )
            // InternalEclParser.g:4164:3: ruleConceptReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getConceptRefConceptReferenceParserRuleCall_3_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConceptReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getConceptRefConceptReferenceParserRuleCall_3_0_0()); 
            }

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
    // $ANTLR end "rule__Attribute__ConceptRefAssignment_3_0"


    // $ANTLR start "rule__Attribute__WildcardAssignment_3_1"
    // InternalEclParser.g:4173:1: rule__Attribute__WildcardAssignment_3_1 : ( ( Asterisk ) ) ;
    public final void rule__Attribute__WildcardAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4177:1: ( ( ( Asterisk ) ) )
            // InternalEclParser.g:4178:2: ( ( Asterisk ) )
            {
            // InternalEclParser.g:4178:2: ( ( Asterisk ) )
            // InternalEclParser.g:4179:3: ( Asterisk )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getWildcardAsteriskKeyword_3_1_0()); 
            }
            // InternalEclParser.g:4180:3: ( Asterisk )
            // InternalEclParser.g:4181:4: Asterisk
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getWildcardAsteriskKeyword_3_1_0()); 
            }
            match(input,Asterisk,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getWildcardAsteriskKeyword_3_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getWildcardAsteriskKeyword_3_1_0()); 
            }

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
    // $ANTLR end "rule__Attribute__WildcardAssignment_3_1"


    // $ANTLR start "rule__Attribute__ValueAssignment_4"
    // InternalEclParser.g:4192:1: rule__Attribute__ValueAssignment_4 : ( ruleAttributeValue ) ;
    public final void rule__Attribute__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4196:1: ( ( ruleAttributeValue ) )
            // InternalEclParser.g:4197:2: ( ruleAttributeValue )
            {
            // InternalEclParser.g:4197:2: ( ruleAttributeValue )
            // InternalEclParser.g:4198:3: ruleAttributeValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueAttributeValueParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAttributeValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getValueAttributeValueParserRuleCall_4_0()); 
            }

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
    // $ANTLR end "rule__Attribute__ValueAssignment_4"


    // $ANTLR start "rule__Cardinality__FromAssignment_1"
    // InternalEclParser.g:4207:1: rule__Cardinality__FromAssignment_1 : ( RULE_INT ) ;
    public final void rule__Cardinality__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4211:1: ( ( RULE_INT ) )
            // InternalEclParser.g:4212:2: ( RULE_INT )
            {
            // InternalEclParser.g:4212:2: ( RULE_INT )
            // InternalEclParser.g:4213:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getFromINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityAccess().getFromINTTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__Cardinality__FromAssignment_1"


    // $ANTLR start "rule__Cardinality__ToAssignment_3_0"
    // InternalEclParser.g:4222:1: rule__Cardinality__ToAssignment_3_0 : ( RULE_INT ) ;
    public final void rule__Cardinality__ToAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4226:1: ( ( RULE_INT ) )
            // InternalEclParser.g:4227:2: ( RULE_INT )
            {
            // InternalEclParser.g:4227:2: ( RULE_INT )
            // InternalEclParser.g:4228:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getToINTTerminalRuleCall_3_0_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityAccess().getToINTTerminalRuleCall_3_0_0()); 
            }

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
    // $ANTLR end "rule__Cardinality__ToAssignment_3_0"


    // $ANTLR start "rule__Cardinality__ManyAssignment_3_1"
    // InternalEclParser.g:4237:1: rule__Cardinality__ManyAssignment_3_1 : ( ( Asterisk ) ) ;
    public final void rule__Cardinality__ManyAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4241:1: ( ( ( Asterisk ) ) )
            // InternalEclParser.g:4242:2: ( ( Asterisk ) )
            {
            // InternalEclParser.g:4242:2: ( ( Asterisk ) )
            // InternalEclParser.g:4243:3: ( Asterisk )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getManyAsteriskKeyword_3_1_0()); 
            }
            // InternalEclParser.g:4244:3: ( Asterisk )
            // InternalEclParser.g:4245:4: Asterisk
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getManyAsteriskKeyword_3_1_0()); 
            }
            match(input,Asterisk,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityAccess().getManyAsteriskKeyword_3_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityAccess().getManyAsteriskKeyword_3_1_0()); 
            }

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
    // $ANTLR end "rule__Cardinality__ManyAssignment_3_1"


    // $ANTLR start "rule__StringValue__OpAssignment_0"
    // InternalEclParser.g:4256:1: rule__StringValue__OpAssignment_0 : ( ruleStringComparisonOperator ) ;
    public final void rule__StringValue__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4260:1: ( ( ruleStringComparisonOperator ) )
            // InternalEclParser.g:4261:2: ( ruleStringComparisonOperator )
            {
            // InternalEclParser.g:4261:2: ( ruleStringComparisonOperator )
            // InternalEclParser.g:4262:3: ruleStringComparisonOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getOpStringComparisonOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleStringComparisonOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getOpStringComparisonOperatorEnumRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__StringValue__OpAssignment_0"


    // $ANTLR start "rule__StringValue__ValueAssignment_1"
    // InternalEclParser.g:4271:1: rule__StringValue__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4275:1: ( ( RULE_STRING ) )
            // InternalEclParser.g:4276:2: ( RULE_STRING )
            {
            // InternalEclParser.g:4276:2: ( RULE_STRING )
            // InternalEclParser.g:4277:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__StringValue__ValueAssignment_1"


    // $ANTLR start "rule__NumericValue__OpAssignment_0"
    // InternalEclParser.g:4286:1: rule__NumericValue__OpAssignment_0 : ( ruleNumericComparisonOperator ) ;
    public final void rule__NumericValue__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4290:1: ( ( ruleNumericComparisonOperator ) )
            // InternalEclParser.g:4291:2: ( ruleNumericComparisonOperator )
            {
            // InternalEclParser.g:4291:2: ( ruleNumericComparisonOperator )
            // InternalEclParser.g:4292:3: ruleNumericComparisonOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericValueAccess().getOpNumericComparisonOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNumericComparisonOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericValueAccess().getOpNumericComparisonOperatorEnumRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__NumericValue__OpAssignment_0"


    // $ANTLR start "rule__NumericValue__ValueAssignment_2"
    // InternalEclParser.g:4301:1: rule__NumericValue__ValueAssignment_2 : ( ruleNumber ) ;
    public final void rule__NumericValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4305:1: ( ( ruleNumber ) )
            // InternalEclParser.g:4306:2: ( ruleNumber )
            {
            // InternalEclParser.g:4306:2: ( ruleNumber )
            // InternalEclParser.g:4307:3: ruleNumber
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericValueAccess().getValueNumberParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericValueAccess().getValueNumberParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__NumericValue__ValueAssignment_2"


    // $ANTLR start "rule__ExpressionValue__OpAssignment_0"
    // InternalEclParser.g:4316:1: rule__ExpressionValue__OpAssignment_0 : ( ruleExpressionComparisonOperator ) ;
    public final void rule__ExpressionValue__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4320:1: ( ( ruleExpressionComparisonOperator ) )
            // InternalEclParser.g:4321:2: ( ruleExpressionComparisonOperator )
            {
            // InternalEclParser.g:4321:2: ( ruleExpressionComparisonOperator )
            // InternalEclParser.g:4322:3: ruleExpressionComparisonOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionValueAccess().getOpExpressionComparisonOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpressionComparisonOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionValueAccess().getOpExpressionComparisonOperatorEnumRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__ExpressionValue__OpAssignment_0"


    // $ANTLR start "rule__ExpressionValue__ValueAssignment_1"
    // InternalEclParser.g:4331:1: rule__ExpressionValue__ValueAssignment_1 : ( rulePrimaryExpressionConstraint ) ;
    public final void rule__ExpressionValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4335:1: ( ( rulePrimaryExpressionConstraint ) )
            // InternalEclParser.g:4336:2: ( rulePrimaryExpressionConstraint )
            {
            // InternalEclParser.g:4336:2: ( rulePrimaryExpressionConstraint )
            // InternalEclParser.g:4337:3: rulePrimaryExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionValueAccess().getValuePrimaryExpressionConstraintParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulePrimaryExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionValueAccess().getValuePrimaryExpressionConstraintParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__ExpressionValue__ValueAssignment_1"


    // $ANTLR start "rule__AttributeGroup__CardinalityAssignment_0"
    // InternalEclParser.g:4346:1: rule__AttributeGroup__CardinalityAssignment_0 : ( ruleCardinality ) ;
    public final void rule__AttributeGroup__CardinalityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4350:1: ( ( ruleCardinality ) )
            // InternalEclParser.g:4351:2: ( ruleCardinality )
            {
            // InternalEclParser.g:4351:2: ( ruleCardinality )
            // InternalEclParser.g:4352:3: ruleCardinality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeGroupAccess().getCardinalityCardinalityParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCardinality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeGroupAccess().getCardinalityCardinalityParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__AttributeGroup__CardinalityAssignment_0"


    // $ANTLR start "rule__AttributeGroup__AttributeSetAssignment_2"
    // InternalEclParser.g:4361:1: rule__AttributeGroup__AttributeSetAssignment_2 : ( ruleDisjunctionAttributeSet ) ;
    public final void rule__AttributeGroup__AttributeSetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4365:1: ( ( ruleDisjunctionAttributeSet ) )
            // InternalEclParser.g:4366:2: ( ruleDisjunctionAttributeSet )
            {
            // InternalEclParser.g:4366:2: ( ruleDisjunctionAttributeSet )
            // InternalEclParser.g:4367:3: ruleDisjunctionAttributeSet
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeGroupAccess().getAttributeSetDisjunctionAttributeSetParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDisjunctionAttributeSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeGroupAccess().getAttributeSetDisjunctionAttributeSetParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__AttributeGroup__AttributeSetAssignment_2"


    // $ANTLR start "rule__SimpleExpressionConstraint__OpAssignment_0"
    // InternalEclParser.g:4376:1: rule__SimpleExpressionConstraint__OpAssignment_0 : ( ruleConstraintOperator ) ;
    public final void rule__SimpleExpressionConstraint__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4380:1: ( ( ruleConstraintOperator ) )
            // InternalEclParser.g:4381:2: ( ruleConstraintOperator )
            {
            // InternalEclParser.g:4381:2: ( ruleConstraintOperator )
            // InternalEclParser.g:4382:3: ruleConstraintOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleExpressionConstraintAccess().getOpConstraintOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConstraintOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleExpressionConstraintAccess().getOpConstraintOperatorEnumRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__SimpleExpressionConstraint__OpAssignment_0"


    // $ANTLR start "rule__SimpleExpressionConstraint__ConceptAssignment_1"
    // InternalEclParser.g:4391:1: rule__SimpleExpressionConstraint__ConceptAssignment_1 : ( ruleFocusConcept ) ;
    public final void rule__SimpleExpressionConstraint__ConceptAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4395:1: ( ( ruleFocusConcept ) )
            // InternalEclParser.g:4396:2: ( ruleFocusConcept )
            {
            // InternalEclParser.g:4396:2: ( ruleFocusConcept )
            // InternalEclParser.g:4397:3: ruleFocusConcept
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleExpressionConstraintAccess().getConceptFocusConceptParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFocusConcept();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleExpressionConstraintAccess().getConceptFocusConceptParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__SimpleExpressionConstraint__ConceptAssignment_1"


    // $ANTLR start "rule__FocusConcept__MemberOfAssignment_0"
    // InternalEclParser.g:4406:1: rule__FocusConcept__MemberOfAssignment_0 : ( ( CircumflexAccent ) ) ;
    public final void rule__FocusConcept__MemberOfAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4410:1: ( ( ( CircumflexAccent ) ) )
            // InternalEclParser.g:4411:2: ( ( CircumflexAccent ) )
            {
            // InternalEclParser.g:4411:2: ( ( CircumflexAccent ) )
            // InternalEclParser.g:4412:3: ( CircumflexAccent )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFocusConceptAccess().getMemberOfCircumflexAccentKeyword_0_0()); 
            }
            // InternalEclParser.g:4413:3: ( CircumflexAccent )
            // InternalEclParser.g:4414:4: CircumflexAccent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFocusConceptAccess().getMemberOfCircumflexAccentKeyword_0_0()); 
            }
            match(input,CircumflexAccent,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFocusConceptAccess().getMemberOfCircumflexAccentKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFocusConceptAccess().getMemberOfCircumflexAccentKeyword_0_0()); 
            }

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
    // $ANTLR end "rule__FocusConcept__MemberOfAssignment_0"


    // $ANTLR start "rule__FocusConcept__ConceptRefAssignment_1_0"
    // InternalEclParser.g:4425:1: rule__FocusConcept__ConceptRefAssignment_1_0 : ( ruleConceptReference ) ;
    public final void rule__FocusConcept__ConceptRefAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4429:1: ( ( ruleConceptReference ) )
            // InternalEclParser.g:4430:2: ( ruleConceptReference )
            {
            // InternalEclParser.g:4430:2: ( ruleConceptReference )
            // InternalEclParser.g:4431:3: ruleConceptReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFocusConceptAccess().getConceptRefConceptReferenceParserRuleCall_1_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConceptReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFocusConceptAccess().getConceptRefConceptReferenceParserRuleCall_1_0_0()); 
            }

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
    // $ANTLR end "rule__FocusConcept__ConceptRefAssignment_1_0"


    // $ANTLR start "rule__FocusConcept__WildcardAssignment_1_1"
    // InternalEclParser.g:4440:1: rule__FocusConcept__WildcardAssignment_1_1 : ( ( Asterisk ) ) ;
    public final void rule__FocusConcept__WildcardAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4444:1: ( ( ( Asterisk ) ) )
            // InternalEclParser.g:4445:2: ( ( Asterisk ) )
            {
            // InternalEclParser.g:4445:2: ( ( Asterisk ) )
            // InternalEclParser.g:4446:3: ( Asterisk )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFocusConceptAccess().getWildcardAsteriskKeyword_1_1_0()); 
            }
            // InternalEclParser.g:4447:3: ( Asterisk )
            // InternalEclParser.g:4448:4: Asterisk
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFocusConceptAccess().getWildcardAsteriskKeyword_1_1_0()); 
            }
            match(input,Asterisk,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFocusConceptAccess().getWildcardAsteriskKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFocusConceptAccess().getWildcardAsteriskKeyword_1_1_0()); 
            }

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
    // $ANTLR end "rule__FocusConcept__WildcardAssignment_1_1"


    // $ANTLR start "rule__ConceptReference__IdAssignment_0"
    // InternalEclParser.g:4459:1: rule__ConceptReference__IdAssignment_0 : ( ruleConceptID ) ;
    public final void rule__ConceptReference__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4463:1: ( ( ruleConceptID ) )
            // InternalEclParser.g:4464:2: ( ruleConceptID )
            {
            // InternalEclParser.g:4464:2: ( ruleConceptID )
            // InternalEclParser.g:4465:3: ruleConceptID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConceptReferenceAccess().getIdConceptIDParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConceptID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConceptReferenceAccess().getIdConceptIDParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__ConceptReference__IdAssignment_0"


    // $ANTLR start "rule__ConceptReference__TermAssignment_1"
    // InternalEclParser.g:4474:1: rule__ConceptReference__TermAssignment_1 : ( RULE_TERM_STRING ) ;
    public final void rule__ConceptReference__TermAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4478:1: ( ( RULE_TERM_STRING ) )
            // InternalEclParser.g:4479:2: ( RULE_TERM_STRING )
            {
            // InternalEclParser.g:4479:2: ( RULE_TERM_STRING )
            // InternalEclParser.g:4480:3: RULE_TERM_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConceptReferenceAccess().getTermTERM_STRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_TERM_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConceptReferenceAccess().getTermTERM_STRINGTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__ConceptReference__TermAssignment_1"

    // $ANTLR start synpred2_InternalEclParser
    public final void synpred2_InternalEclParser_fragment() throws RecognitionException {   
        // InternalEclParser.g:962:2: ( ( ruleAttributeSetRefinement ) )
        // InternalEclParser.g:962:2: ( ruleAttributeSetRefinement )
        {
        // InternalEclParser.g:962:2: ( ruleAttributeSetRefinement )
        // InternalEclParser.g:963:3: ruleAttributeSetRefinement
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSubRefinementAccess().getAttributeSetRefinementParserRuleCall_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleAttributeSetRefinement();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalEclParser

    // $ANTLR start synpred3_InternalEclParser
    public final void synpred3_InternalEclParser_fragment() throws RecognitionException {   
        // InternalEclParser.g:968:2: ( ( ruleAttributeGroupRefinement ) )
        // InternalEclParser.g:968:2: ( ruleAttributeGroupRefinement )
        {
        // InternalEclParser.g:968:2: ( ruleAttributeGroupRefinement )
        // InternalEclParser.g:969:3: ruleAttributeGroupRefinement
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSubRefinementAccess().getAttributeGroupRefinementParserRuleCall_1()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleAttributeGroupRefinement();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalEclParser

    // $ANTLR start synpred27_InternalEclParser
    public final void synpred27_InternalEclParser_fragment() throws RecognitionException {   
        // InternalEclParser.g:2025:3: ( rule__DisjunctionRefinementSet__Group_1__0 )
        // InternalEclParser.g:2025:3: rule__DisjunctionRefinementSet__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__DisjunctionRefinementSet__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalEclParser

    // $ANTLR start synpred28_InternalEclParser
    public final void synpred28_InternalEclParser_fragment() throws RecognitionException {   
        // InternalEclParser.g:2214:3: ( rule__ConjunctionRefinementSet__Group_1__0 )
        // InternalEclParser.g:2214:3: rule__ConjunctionRefinementSet__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__ConjunctionRefinementSet__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalEclParser

    // $ANTLR start synpred29_InternalEclParser
    public final void synpred29_InternalEclParser_fragment() throws RecognitionException {   
        // InternalEclParser.g:2403:3: ( rule__DisjunctionAttributeSet__Group_1__0 )
        // InternalEclParser.g:2403:3: rule__DisjunctionAttributeSet__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__DisjunctionAttributeSet__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalEclParser

    // $ANTLR start synpred30_InternalEclParser
    public final void synpred30_InternalEclParser_fragment() throws RecognitionException {   
        // InternalEclParser.g:2592:3: ( rule__ConjunctionAttributeSet__Group_1__0 )
        // InternalEclParser.g:2592:3: rule__ConjunctionAttributeSet__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__ConjunctionAttributeSet__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalEclParser

    // Delegated rules

    public final boolean synpred28_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
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

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "957:1: rule__SubRefinement__Alternatives : ( ( ruleAttributeSetRefinement ) | ( ruleAttributeGroupRefinement ) | ( ruleParenthesizedRefinement ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_1 = input.LA(1);

                         
                        int index2_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalEclParser()) ) {s = 3;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index2_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_2 = input.LA(1);

                         
                        int index2_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalEclParser()) ) {s = 3;}

                        else if ( (synpred3_InternalEclParser()) ) {s = 8;}

                         
                        input.seek(index2_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000082514900L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020020L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020022L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000A4914100L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000A0914100L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000700640L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080010000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004800000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000082510900L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    }


}