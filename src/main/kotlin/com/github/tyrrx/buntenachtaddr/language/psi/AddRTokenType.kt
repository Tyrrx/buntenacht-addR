package com.github.tyrrx.buntenachtaddr.language.psi

import com.github.tyrrx.buntenachtaddr.language.AddRLanguage
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls

class AddRTokenType(debugName: @NonNls String) : IElementType(debugName, AddRLanguage) {

    override fun toString(): String {
        return "AddRTokenType " + super.toString()
    }
}