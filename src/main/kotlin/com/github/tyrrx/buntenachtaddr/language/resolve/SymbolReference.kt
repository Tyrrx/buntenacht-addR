package com.github.tyrrx.buntenachtaddr.language.resolve

import com.github.tyrrx.buntenachtaddr.language.psi.AddRNamedElement
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReference

class SymbolReference(private val referencingElement: AddRNamedElement) : PsiReference {
    override fun getElement(): PsiElement {
        return referencingElement
    }

    override fun getRangeInElement(): TextRange {
        return referencingElement.textRangeInParent
    }

    override fun resolve(): PsiElement? {
        val resolveSymbolVisitor = ResolveSymbolReferenceInParentVisitor(referencingElement)
        referencingElement.accept(resolveSymbolVisitor)
        return resolveSymbolVisitor.resolvedElement
    }

    override fun getCanonicalText(): String {
        return referencingElement.name ?: ""
    }

    override fun handleElementRename(newElementName: String): PsiElement {
        referencingElement.setName(newElementName)
        return referencingElement
    }

    override fun bindToElement(element: PsiElement): PsiElement {
        TODO("Not yet implemented")
    }

    override fun isReferenceTo(element: PsiElement): Boolean {
        return element == resolve()
    }

    override fun isSoft(): Boolean {
        return false
    }
}