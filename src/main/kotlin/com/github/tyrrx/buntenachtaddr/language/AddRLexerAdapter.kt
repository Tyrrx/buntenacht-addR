package com.github.tyrrx.buntenachtaddr.language

import com.github.tyrrx.buntenachtaddr.language.lexer.AddRLexer
import com.intellij.lexer.FlexAdapter

class AddRLexerAdapter : FlexAdapter(AddRLexer(null))