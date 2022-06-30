package com.github.tyrrx.buntenachtaddr.language

import com.intellij.openapi.fileTypes.FileType
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.IconLoader
import com.intellij.util.PlatformIcons
import javax.swing.Icon

object AddRFileType: LanguageFileType(AddRLanguage) {
    override fun getName(): String {
        return "addR"
    }

    override fun getDescription(): String {
        return "addR file"
    }

    override fun getDefaultExtension(): String {
        return "addr"
    }

    override fun getIcon(): Icon? {
        return IconLoader.findIcon("/icon/addr.png")
    }

}