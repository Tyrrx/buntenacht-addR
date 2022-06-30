package com.github.tyrrx.buntenachtaddr.language.psi.impl

import com.github.tyrrx.buntenachtaddr.language.psi.AddRSymbolReference
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiReference

open class AddRSymbolReferenceMixin(node: ASTNode) : ASTWrapperPsiElement(node), AddRSymbolReference {
    override fun getReference(): PsiReference? {
        return super.getReference()
    }
}