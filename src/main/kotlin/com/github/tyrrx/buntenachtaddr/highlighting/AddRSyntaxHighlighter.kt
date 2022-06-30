package com.github.tyrrx.buntenachtaddr.highlighting

import com.github.tyrrx.buntenachtaddr.language.AddRLexerAdapter
import com.github.tyrrx.buntenachtaddr.language.psi.AddRTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType


class AddRSyntaxHighlighter : SyntaxHighlighterBase() {

    private val keyword = createTextAttributesKey("ADDR_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
    private val number = createTextAttributesKey("ADDR_NUMBER", DefaultLanguageHighlighterColors.NUMBER)
    private val identifier = createTextAttributesKey("ADDR_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER)

    override fun getHighlightingLexer(): Lexer {
        return AddRLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        return when (tokenType) {
            AddRTypes.VAL -> arrayOf(keyword)
            AddRTypes.NUMBER_LITERAL -> arrayOf(number)
            AddRTypes.IDENTIFIER -> arrayOf(identifier)
            else -> emptyArray()
        }
    }

}