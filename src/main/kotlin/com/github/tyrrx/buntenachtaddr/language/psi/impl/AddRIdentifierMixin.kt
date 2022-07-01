package com.github.tyrrx.buntenachtaddr.language.psi.impl

import com.github.tyrrx.buntenachtaddr.language.AddRLanguage
import com.github.tyrrx.buntenachtaddr.language.psi.AddRIdentifier
import com.github.tyrrx.buntenachtaddr.language.psi.AddRNamedElement
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFileFactory
import com.intellij.psi.impl.PsiFileFactoryImpl
import com.intellij.psi.util.PsiTreeUtil

open class AddRIdentifierMixin(node: ASTNode) : ASTWrapperPsiElement(node), AddRNamedElement {

    override fun getName(): String? {
        return this.text
    }

    override fun setName(name: String): PsiElement {

        // Get the factory
        val factory = PsiFileFactory.getInstance(project) as PsiFileFactoryImpl

        // Create a dummy file
        val dummyFile = factory.createFileFromText(AddRLanguage, "val $name = 1;")

        // Find the AddRIdentifier
        val newIdentifier = PsiTreeUtil.findChildOfType(dummyFile, AddRIdentifier::class.java)

        // Replace the current identifier with the new one
        return newIdentifier?.let { this.replace(it) } ?: this
    }
}