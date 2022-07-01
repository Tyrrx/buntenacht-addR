package com.github.tyrrx.buntenachtaddr.language.resolve

import com.github.tyrrx.buntenachtaddr.language.psi.*
import com.intellij.psi.PsiElement

class ResolveSymbolReferenceInParentVisitor(private val referencingElement: AddRNamedElement) : AddRVisitor() {

    val resolvedElement get() = result

    private var result: PsiElement? = null


    override fun visitAtom(o: AddRAtom) {
        super.visitAtom(o)
        o.parent.accept(this)
    }

    override fun visitExpression(o: AddRExpression) {
        super.visitExpression(o)
        o.parent.accept(this)
    }

    override fun visitLiteral(o: AddRLiteral) {
        super.visitLiteral(o)
        o.parent.accept(this)
    }

    override fun visitStatement(o: AddRStatement) {
        super.visitStatement(o)
        val prevStatement = getPreviousSiblingOfType<AddRStatement>(o)
        if (prevStatement?.valueAssignment?.name == referencingElement.name) {
            result = prevStatement?.valueAssignment
        } else {
            prevStatement?.let { visitStatement(it) }
        }
    }


    override fun visitSymbolReference(o: AddRSymbolReference) {
        super.visitSymbolReference(o)
        o.parent.accept(this)
    }

    override fun visitValueAssignment(o: AddRValueAssignment) {
        super.visitValueAssignment(o)
        o.parent.accept(this)
    }

    override fun visitModule(o: AddRModule) {
        super.visitModule(o)

    }
}