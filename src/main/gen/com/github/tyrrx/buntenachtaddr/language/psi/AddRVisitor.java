// This is a generated file. Not intended for manual editing.
package com.github.tyrrx.buntenachtaddr.language.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class AddRVisitor extends PsiElementVisitor {

  public void visitAtom(@NotNull AddRAtom o) {
    visitPsiElement(o);
  }

  public void visitEndOfStatement(@NotNull AddREndOfStatement o) {
    visitPsiElement(o);
  }

  public void visitExpression(@NotNull AddRExpression o) {
    visitPsiElement(o);
  }

  public void visitIdentifier(@NotNull AddRIdentifier o) {
    visitNamedElement(o);
  }

  public void visitLiteral(@NotNull AddRLiteral o) {
    visitPsiElement(o);
  }

  public void visitModule(@NotNull AddRModule o) {
    visitPsiElement(o);
  }

  public void visitStatement(@NotNull AddRStatement o) {
    visitPsiElement(o);
  }

  public void visitSymbolReference(@NotNull AddRSymbolReference o) {
    visitNamedElement(o);
  }

  public void visitValueAssignment(@NotNull AddRValueAssignment o) {
    visitNamedIdentifierOwner(o);
  }

  public void visitNamedElement(@NotNull AddRNamedElement o) {
    visitPsiElement(o);
  }

  public void visitNamedIdentifierOwner(@NotNull AddRNamedIdentifierOwner o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
