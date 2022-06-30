package com.github.tyrrx.buntenachtaddr.language

import com.github.tyrrx.buntenachtaddr.language.parser.AddRParser
import com.github.tyrrx.buntenachtaddr.language.psi.AddRFile
import com.github.tyrrx.buntenachtaddr.language.psi.AddRTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class AddRParserDefinition: ParserDefinition {

    private val FILE = IFileElementType(AddRLanguage)
    private val WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE)
//    private val COMMENTS = TokenSet.create(SimpleTypes.COMMENT)

    override fun createLexer(project: Project?): Lexer {
        return AddRLexerAdapter()
    }

    override fun createParser(project: Project?): PsiParser {
        return AddRParser()
    }

    override fun getFileNodeType(): IFileElementType {
       return FILE
    }

    override fun getCommentTokens(): TokenSet {
        return TokenSet.EMPTY
    }

    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.EMPTY
    }

    override fun createElement(node: ASTNode?): PsiElement {
        return AddRTypes.Factory.createElement(node)
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return AddRFile(viewProvider)
    }

    override fun getWhitespaceTokens(): TokenSet {
        return WHITE_SPACES
    }
}