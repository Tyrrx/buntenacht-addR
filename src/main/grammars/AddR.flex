package com.github.tyrrx.buntenachtaddr.language.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import static com.github.tyrrx.buntenachtaddr.language.psi.AddRTypes.*;

%%

%class AddRLexer
%public
%implements FlexLexer
%unicode
%function advance
%type IElementType
//%eof{ return EOF;
//%eof}

Space = (" "|\t)
WhiteSpace = {Space}+
Identifier = [a-z][a-zA-Z]*
NumberLiteral = [0-9]+
Newline = (\n|\r|\r\n)

%%

<YYINITIAL> {
    "val" { return VAL; }
    "+" { return PLUS; }
    "=" { return EQ; }
    {NumberLiteral} { return NUMBER_LITERAL; }
    {Identifier} { return IDENTIFIER;}
    {Newline} { return NEW_LINE; }
    {WhiteSpace} { return TokenType.WHITE_SPACE; }
}

. { return TokenType.BAD_CHARACTER; }