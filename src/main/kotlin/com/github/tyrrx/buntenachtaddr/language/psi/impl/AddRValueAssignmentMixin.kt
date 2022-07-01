package com.github.tyrrx.buntenachtaddr.language.psi.impl

import com.github.tyrrx.buntenachtaddr.language.psi.AddRIdentifier
import com.github.tyrrx.buntenachtaddr.language.psi.AddRNamedIdentifierOwner
import com.github.tyrrx.buntenachtaddr.language.psi.AddRTypes
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement

open class AddRValueAssignmentMixin(node: ASTNode) : ASTWrapperPsiElement(node), AddRNamedIdentifierOwner {

    override fun getName(): String? {
        return nameIdentifier?.text
    }

    override fun setName(name: String): PsiElement {
        nameIdentifier?.setName(name)
        return this
    }

    override fun getNameIdentifier(): AddRIdentifier? {
        return findChildByType(AddRTypes.IDENTIFIER)
    }

    override fun getTextOffset(): Int {
        val textOffset = nameIdentifier?.textOffset
        return textOffset ?: super.getTextOffset()
    }
}