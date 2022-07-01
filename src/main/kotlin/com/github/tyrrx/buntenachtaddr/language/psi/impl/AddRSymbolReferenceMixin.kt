package com.github.tyrrx.buntenachtaddr.language.psi.impl

import com.github.tyrrx.buntenachtaddr.language.psi.AddRIdentifier
import com.github.tyrrx.buntenachtaddr.language.psi.AddRNamedElement
import com.github.tyrrx.buntenachtaddr.language.psi.AddRTypes
import com.github.tyrrx.buntenachtaddr.language.psi.createElementFromText
import com.github.tyrrx.buntenachtaddr.language.resolve.SymbolReference
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReference

open class AddRSymbolReferenceMixin(node: ASTNode) : ASTWrapperPsiElement(node), AddRNamedElement {

    override fun getName(): String? {
        return getIdentifier()?.text
    }


    override fun getReference(): PsiReference? {
        return SymbolReference(this)
    }

    override fun setName(name: String): PsiElement {
        getIdentifier()?.setName(name)
        return this
    }

    // Find the AddRIdentifier
    private fun getIdentifier() = findChildByType<AddRIdentifier?>(AddRTypes.IDENTIFIER)
}