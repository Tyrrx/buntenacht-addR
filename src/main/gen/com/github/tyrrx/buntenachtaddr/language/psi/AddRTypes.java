// This is a generated file. Not intended for manual editing.
package com.github.tyrrx.buntenachtaddr.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.tyrrx.buntenachtaddr.language.psi.impl.*;

public interface AddRTypes {

  IElementType ATOM = new AddRElementType("ATOM");
  IElementType END_OF_STATEMENT = new AddRElementType("END_OF_STATEMENT");
  IElementType EXPRESSION = new AddRElementType("EXPRESSION");
  IElementType IDENTIFIER = new AddRElementType("IDENTIFIER");
  IElementType LITERAL = new AddRElementType("LITERAL");
  IElementType MODULE = new AddRElementType("MODULE");
  IElementType STATEMENT = new AddRElementType("STATEMENT");
  IElementType SYMBOL_REFERENCE = new AddRElementType("SYMBOL_REFERENCE");
  IElementType VALUE_ASSIGNMENT = new AddRElementType("VALUE_ASSIGNMENT");

  IElementType EQ = new AddRTokenType("EQ");
  IElementType ID = new AddRTokenType("ID");
  IElementType NUMBER_LITERAL = new AddRTokenType("NUMBER_LITERAL");
  IElementType PLUS = new AddRTokenType("PLUS");
  IElementType SEMICOLON = new AddRTokenType("SEMICOLON");
  IElementType VAL = new AddRTokenType("VAL");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ATOM) {
        return new AddRAtomImpl(node);
      }
      else if (type == END_OF_STATEMENT) {
        return new AddREndOfStatementImpl(node);
      }
      else if (type == EXPRESSION) {
        return new AddRExpressionImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new AddRIdentifierImpl(node);
      }
      else if (type == LITERAL) {
        return new AddRLiteralImpl(node);
      }
      else if (type == MODULE) {
        return new AddRModuleImpl(node);
      }
      else if (type == STATEMENT) {
        return new AddRStatementImpl(node);
      }
      else if (type == SYMBOL_REFERENCE) {
        return new AddRSymbolReferenceImpl(node);
      }
      else if (type == VALUE_ASSIGNMENT) {
        return new AddRValueAssignmentImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
