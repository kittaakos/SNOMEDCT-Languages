/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.akitta.snomed.ecl.parser.antlr;

import com.google.inject.Inject;
import org.akitta.snomed.ecl.parser.antlr.internal.InternalEclParser;
import org.akitta.snomed.ecl.services.EclGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class EclParser extends AbstractAntlrParser {

	@Inject
	private EclGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalEclParser createParser(XtextTokenStream stream) {
		return new InternalEclParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Script";
	}

	public EclGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EclGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}