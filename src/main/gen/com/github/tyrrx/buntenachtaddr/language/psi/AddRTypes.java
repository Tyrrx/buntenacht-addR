// This is a generated file. Not intended for manual editing.
package com.github.tyrrx.buntenachtaddr.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.tyrrx.buntenachtaddr.language.psi.impl.*;

public interface AddRTypes {

  IElementType ASSIGNMENT = new AddRElementType("ASSIGNMENT");
  IElementType ASSIGNMENT_REF = new AddRElementType("ASSIGNMENT_REF");
  IElementType ATOM = new AddRElementType("ATOM");
  IElementType BINARY_EXPRESSION = new AddRElementType("BINARY_EXPRESSION");
  IElementType END_OF_LINE = new AddRElementType("END_OF_LINE");
  IElementType EXPRESSION = new AddRElementType("EXPRESSION");
  IElementType LITERAL = new AddRElementType("LITERAL");
  IElementType STATEMENT = new AddRElementType("STATEMENT");

  IElementType EQ = new AddRTokenType("EQ");
  IElementType IDENTIFIER = new AddRTokenType("IDENTIFIER");
  IElementType NEW_LINE = new AddRTokenType("NEW_LINE");
  IElementType NUMBER_LITERAL = new AddRTokenType("NUMBER_LITERAL");
  IElementType PLUS = new AddRTokenType("PLUS");
  IElementType VAL = new AddRTokenType("VAL");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ASSIGNMENT) {
        return new AddRAssignmentImpl(node);
      }
      else if (type == ASSIGNMENT_REF) {
        return new AddRAssignmentRefImpl(node);
      }
      else if (type == ATOM) {
        return new AddRAtomImpl(node);
      }
      else if (type == BINARY_EXPRESSION) {
        return new AddRBinaryExpressionImpl(node);
      }
      else if (type == END_OF_LINE) {
        return new AddREndOfLineImpl(node);
      }
      else if (type == EXPRESSION) {
        return new AddRExpressionImpl(node);
      }
      else if (type == LITERAL) {
        return new AddRLiteralImpl(node);
      }
      else if (type == STATEMENT) {
        return new AddRStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
