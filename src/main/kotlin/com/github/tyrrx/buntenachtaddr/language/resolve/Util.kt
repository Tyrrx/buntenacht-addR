package com.github.tyrrx.buntenachtaddr.language.resolve

import com.intellij.psi.PsiElement
import com.intellij.psi.util.PsiTreeUtil


inline fun <reified TResult : PsiElement> getPreviousSiblingOfType(startSibling: PsiElement): TResult? {
    return PsiTreeUtil.getPrevSiblingOfType(startSibling, TResult::class.java)
}