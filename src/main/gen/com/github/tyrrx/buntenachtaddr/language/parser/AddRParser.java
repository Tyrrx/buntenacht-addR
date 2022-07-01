// This is a generated file. Not intended for manual editing.
package com.github.tyrrx.buntenachtaddr.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.tyrrx.buntenachtaddr.language.psi.AddRTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class AddRParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    result_ = parse_root_(root_, builder_);
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_) {
    return parse_root_(root_, builder_, 0);
  }

  static boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return addRFile(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // module
  static boolean addRFile(PsiBuilder builder_, int level_) {
    return module(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // literal | symbolReference
  public static boolean atom(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "atom")) return false;
    if (!nextTokenIs(builder_, "<atom>", ID, NUMBER_LITERAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ATOM, "<atom>");
    result_ = literal(builder_, level_ + 1);
    if (!result_) result_ = symbolReference(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // SEMICOLON | SEMICOLON <<eof>>
  public static boolean endOfStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "endOfStatement")) return false;
    if (!nextTokenIs(builder_, SEMICOLON)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SEMICOLON);
    if (!result_) result_ = endOfStatement_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, END_OF_STATEMENT, result_);
    return result_;
  }

  // SEMICOLON <<eof>>
  private static boolean endOfStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "endOfStatement_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SEMICOLON);
    result_ = result_ && eof(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // atom (PLUS expression)+ | atom
  public static boolean expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression")) return false;
    if (!nextTokenIs(builder_, "<expression>", ID, NUMBER_LITERAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION, "<expression>");
    result_ = expression_0(builder_, level_ + 1);
    if (!result_) result_ = atom(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // atom (PLUS expression)+
  private static boolean expression_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = atom(builder_, level_ + 1);
    result_ = result_ && expression_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (PLUS expression)+
  private static boolean expression_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression_0_1_0(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!expression_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "expression_0_1", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // PLUS expression
  private static boolean expression_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PLUS);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ID
  public static boolean identifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ID);
    exit_section_(builder_, marker_, IDENTIFIER, result_);
    return result_;
  }

  /* ********************************************************** */
  // NUMBER_LITERAL
  public static boolean literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal")) return false;
    if (!nextTokenIs(builder_, NUMBER_LITERAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NUMBER_LITERAL);
    exit_section_(builder_, marker_, LITERAL, result_);
    return result_;
  }

  /* ********************************************************** */
  // (statement endOfStatement)*
  public static boolean module(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MODULE, "<module>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!module_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "module", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // statement endOfStatement
  private static boolean module_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = statement(builder_, level_ + 1);
    result_ = result_ && endOfStatement(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // valueAssignment
  public static boolean statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement")) return false;
    if (!nextTokenIs(builder_, VAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = valueAssignment(builder_, level_ + 1);
    exit_section_(builder_, marker_, STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // identifier
  public static boolean symbolReference(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbolReference")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, SYMBOL_REFERENCE, result_);
    return result_;
  }

  /* ********************************************************** */
  // VAL identifier EQ expression
  public static boolean valueAssignment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "valueAssignment")) return false;
    if (!nextTokenIs(builder_, VAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, VAL);
    result_ = result_ && identifier(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQ);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, VALUE_ASSIGNMENT, result_);
    return result_;
  }

}
