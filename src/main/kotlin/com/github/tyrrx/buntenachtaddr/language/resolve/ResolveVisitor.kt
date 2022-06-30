package com.github.tyrrx.buntenachtaddr.language.resolve

import com.github.tyrrx.buntenachtaddr.language.psi.*
import com.intellij.psi.PsiElement

class ResolveVisitor : AddRVisitor() {

    override fun visitAssignment(o: AddRAssignment) {
        super.visitAssignment(o)
    }

    override fun visitAssignmentRef(o: AddRAssignmentRef) {
        super.visitAssignmentRef(o)
    }

    override fun visitAtom(o: AddRAtom) {
        super.visitAtom(o)
    }

    override fun visitBinaryExpression(o: AddRBinaryExpression) {
        super.visitBinaryExpression(o)
    }

    override fun visitEndOfLine(o: AddREndOfLine) {
        super.visitEndOfLine(o)
    }

    override fun visitExpression(o: AddRExpression) {
        super.visitExpression(o)
    }

    override fun visitLiteral(o: AddRLiteral) {
        super.visitLiteral(o)
    }

    override fun visitStatement(o: AddRStatement) {
        super.visitStatement(o)
    }

    override fun visitPsiElement(o: PsiElement) {
        super.visitPsiElement(o)
    }
}