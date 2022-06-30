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
  // (statement endOfLine)*
  static boolean addRFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "addRFile")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!addRFile_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "addRFile", pos_)) break;
    }
    return true;
  }

  // statement endOfLine
  private static boolean addRFile_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "addRFile_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = statement(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // VAL IDENTIFIER EQ
  public static boolean assignment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment")) return false;
    if (!nextTokenIs(builder_, VAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, VAL, IDENTIFIER, EQ);
    exit_section_(builder_, marker_, ASSIGNMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean assignmentRef(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignmentRef")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, ASSIGNMENT_REF, result_);
    return result_;
  }

  /* ********************************************************** */
  // literal | assignmentRef
  public static boolean atom(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "atom")) return false;
    if (!nextTokenIs(builder_, "<atom>", IDENTIFIER, NUMBER_LITERAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ATOM, "<atom>");
    result_ = literal(builder_, level_ + 1);
    if (!result_) result_ = assignmentRef(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // atom (PLUS expression)+
  public static boolean binaryExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "binaryExpression")) return false;
    if (!nextTokenIs(builder_, "<binary expression>", IDENTIFIER, NUMBER_LITERAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BINARY_EXPRESSION, "<binary expression>");
    result_ = atom(builder_, level_ + 1);
    result_ = result_ && binaryExpression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (PLUS expression)+
  private static boolean binaryExpression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "binaryExpression_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = binaryExpression_1_0(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!binaryExpression_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "binaryExpression_1", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // PLUS expression
  private static boolean binaryExpression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "binaryExpression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PLUS);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // NEW_LINE+ | NEW_LINE+ <<eof>> | <<eof>>
  public static boolean endOfLine(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "endOfLine")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, END_OF_LINE, "<end of line>");
    result_ = endOfLine_0(builder_, level_ + 1);
    if (!result_) result_ = endOfLine_1(builder_, level_ + 1);
    if (!result_) result_ = eof(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // NEW_LINE+
  private static boolean endOfLine_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "endOfLine_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NEW_LINE);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!consumeToken(builder_, NEW_LINE)) break;
      if (!empty_element_parsed_guard_(builder_, "endOfLine_0", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // NEW_LINE+ <<eof>>
  private static boolean endOfLine_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "endOfLine_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = endOfLine_1_0(builder_, level_ + 1);
    result_ = result_ && eof(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // NEW_LINE+
  private static boolean endOfLine_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "endOfLine_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NEW_LINE);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!consumeToken(builder_, NEW_LINE)) break;
      if (!empty_element_parsed_guard_(builder_, "endOfLine_1_0", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // binaryExpression | atom
  public static boolean expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression")) return false;
    if (!nextTokenIs(builder_, "<expression>", IDENTIFIER, NUMBER_LITERAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION, "<expression>");
    result_ = binaryExpression(builder_, level_ + 1);
    if (!result_) result_ = atom(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
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
  // assignment expression
  public static boolean statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement")) return false;
    if (!nextTokenIs(builder_, VAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = assignment(builder_, level_ + 1);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, STATEMENT, result_);
    return result_;
  }

}
