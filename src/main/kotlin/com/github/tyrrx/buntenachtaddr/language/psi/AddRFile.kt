package com.github.tyrrx.buntenachtaddr.language.psi

import com.github.tyrrx.buntenachtaddr.language.AddRFileType
import com.github.tyrrx.buntenachtaddr.language.AddRLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class AddRFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, AddRLanguage) {
    override fun getFileType(): FileType {
        return AddRFileType
    }

    override fun toString(): String {
        return "addR"
    }
}