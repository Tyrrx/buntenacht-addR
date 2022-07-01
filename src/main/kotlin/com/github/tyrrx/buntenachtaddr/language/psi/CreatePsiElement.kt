package com.github.tyrrx.buntenachtaddr.language.psi

import com.github.tyrrx.buntenachtaddr.language.AddRLanguage
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFileFactory
import com.intellij.psi.impl.PsiFileFactoryImpl
import com.intellij.psi.tree.IElementType

fun createElementFromText(
    project: Project,
    context: PsiElement?,
    text: String,
    type: IElementType
): PsiElement? {
    val factory = PsiFileFactory.getInstance(project) as PsiFileFactoryImpl
    return factory.createElementFromText(text, AddRLanguage, type, context)
}