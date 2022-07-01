// This is a generated file. Not intended for manual editing.
package com.github.tyrrx.buntenachtaddr.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.tyrrx.buntenachtaddr.language.psi.AddRTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.tyrrx.buntenachtaddr.language.psi.*;

public class AddRModuleImpl extends ASTWrapperPsiElement implements AddRModule {

  public AddRModuleImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AddRVisitor visitor) {
    visitor.visitModule(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AddRVisitor) accept((AddRVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AddREndOfStatement> getEndOfStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AddREndOfStatement.class);
  }

  @Override
  @NotNull
  public List<AddRStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AddRStatement.class);
  }

}
