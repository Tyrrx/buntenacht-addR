package com.github.tyrrx.buntenachtaddr.language

import com.intellij.openapi.fileTypes.FileType
import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

object AddRFileType: FileType {
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
        return IconLoader.findIcon("/assets/vb6icon16x16.png", Thread.currentThread().contextClassLoader)
    }

    override fun isBinary(): Boolean {
        return false
    }
}