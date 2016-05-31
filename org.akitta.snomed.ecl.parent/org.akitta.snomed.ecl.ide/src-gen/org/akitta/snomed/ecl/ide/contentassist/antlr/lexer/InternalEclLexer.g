/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
lexer grammar InternalEclLexer;

@header {
package org.akitta.snomed.ecl.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

MINUS : ('M'|'m')('I'|'i')('N'|'n')('U'|'u')('S'|'s');

AND : ('A'|'a')('N'|'n')('D'|'d');

ExclamationMarkEqualsSign : '!''=';

FullStopFullStop : '.''.';

LessThanSignLessThanSign : '<''<';

LessThanSignEqualsSign : '<''=';

GreaterThanSignEqualsSign : '>''=';

GreaterThanSignGreaterThanSign : '>''>';

OR : ('O'|'o')('R'|'r');

NumberSign : '#';

LeftParenthesis : '(';

RightParenthesis : ')';

Asterisk : '*';

Comma : ',';

FullStop : '.';

Colon : ':';

LessThanSign : '<';

EqualsSign : '=';

GreaterThanSign : '>';

LeftSquareBracket : '[';

RightSquareBracket : ']';

CircumflexAccent : '^';

LeftCurlyBracket : '{';

RightCurlyBracket : '}';

// Rules duplicated to allow inter-rule references

RULE_TERM_STRING : '|' ~('|')* '|';

RULE_REVERSE : 'R';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
