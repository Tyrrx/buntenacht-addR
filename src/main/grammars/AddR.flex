package com.github.tyrrx.buntenachtaddr.language.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import static com.github.tyrrx.buntenachtaddr.language.psi.AddRTypes.*;

%%

%class AddRLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
//%eof{  return;
//%eof}

SourceCharacter = .

%%

<YYINITIAL> {
    {SourceCharacter} {
          return KEY;
      }
}