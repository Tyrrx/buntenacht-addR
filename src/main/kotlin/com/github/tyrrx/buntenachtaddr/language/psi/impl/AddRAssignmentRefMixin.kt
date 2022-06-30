package com.github.tyrrx.buntenachtaddr.language.psi.impl

import com.github.tyrrx.buntenachtaddr.language.psi.AddRAssignmentRef
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode

open class AddRAssignmentRefMixin(node: ASTNode) : ASTWrapperPsiElement(node), AddRAssignmentRef {

}