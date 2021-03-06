// This is a generated file. Not intended for manual editing.
package com.phodal.datum.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.phodal.datum.lexer.CharjTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CharjParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return compilationUnit(b, l + 1);
  }

  /* ********************************************************** */
  // headers structDeclaration* structMethodDeclaration* memberDeclaration?
  static boolean compilationUnit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilationUnit")) return false;
    if (!nextTokenIs(b, "", PACKAGE_KEYWORD, PKG_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = headers(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, compilationUnit_1(b, l + 1));
    r = p && report_error_(b, compilationUnit_2(b, l + 1)) && r;
    r = p && compilationUnit_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // structDeclaration*
  private static boolean compilationUnit_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilationUnit_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!structDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "compilationUnit_1", c)) break;
    }
    return true;
  }

  // structMethodDeclaration*
  private static boolean compilationUnit_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilationUnit_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!structMethodDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "compilationUnit_2", c)) break;
    }
    return true;
  }

  // memberDeclaration?
  private static boolean compilationUnit_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilationUnit_3")) return false;
    memberDeclaration(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // functionName variableDeclaration COMMA variableDeclaration
  //   | primitive_type variableDeclaration EQUAL
  //   | method_call
  public static boolean exprDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_DECLARATION, "<expr declaration>");
    r = exprDeclaration_0(b, l + 1);
    if (!r) r = exprDeclaration_1(b, l + 1);
    if (!r) r = method_call(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // functionName variableDeclaration COMMA variableDeclaration
  private static boolean exprDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionName(b, l + 1);
    r = r && variableDeclaration(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && variableDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // primitive_type variableDeclaration EQUAL
  private static boolean exprDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primitive_type(b, l + 1);
    r = r && variableDeclaration(b, l + 1);
    r = r && consumeToken(b, EQUAL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STRING_LITERAL
  static boolean expression(PsiBuilder b, int l) {
    return consumeToken(b, STRING_LITERAL);
  }

  /* ********************************************************** */
  // expression (',' expression)*
  static boolean expressionList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && expressionList_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' expression)*
  private static boolean expressionList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expressionList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expressionList_1", c)) break;
    }
    return true;
  }

  // ',' expression
  private static boolean expressionList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // name_component
  public static boolean functionDefineName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDefineName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = name_component(b, l + 1);
    exit_section_(b, m, FUNCTION_DEFINE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // name_component
  public static boolean functionName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = name_component(b, l + 1);
    exit_section_(b, m, FUNCTION_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // LPAREN inputParameters? RPAREN outputParameters?
  //     | IN SUB GT inputParameters
  public static boolean functionParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionParameters")) return false;
    if (!nextTokenIs(b, "<function parameters>", IN, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_PARAMETERS, "<function parameters>");
    r = functionParameters_0(b, l + 1);
    if (!r) r = functionParameters_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LPAREN inputParameters? RPAREN outputParameters?
  private static boolean functionParameters_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionParameters_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && functionParameters_0_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && functionParameters_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // inputParameters?
  private static boolean functionParameters_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionParameters_0_1")) return false;
    inputParameters(b, l + 1);
    return true;
  }

  // outputParameters?
  private static boolean functionParameters_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionParameters_0_3")) return false;
    outputParameters(b, l + 1);
    return true;
  }

  // IN SUB GT inputParameters
  private static boolean functionParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionParameters_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IN, SUB, GT);
    r = r && inputParameters(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // packageDeclaration importDeclaration?
  public static boolean headers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "headers")) return false;
    if (!nextTokenIs(b, "<headers>", PACKAGE_KEYWORD, PKG_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HEADERS, "<headers>");
    r = packageDeclaration(b, l + 1);
    r = r && headers_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // importDeclaration?
  private static boolean headers_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "headers_1")) return false;
    importDeclaration(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // qualified_name
  public static boolean import_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_$")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualified_name(b, l + 1);
    exit_section_(b, m, IMPORT, r);
    return r;
  }

  /* ********************************************************** */
  // IMPORT_KEYWORD import
  //     | IMPORT_KEYWORD "(" import (COMMA import)? ")"
  public static boolean importDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importDeclaration")) return false;
    if (!nextTokenIs(b, IMPORT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = importDeclaration_0(b, l + 1);
    if (!r) r = importDeclaration_1(b, l + 1);
    exit_section_(b, m, IMPORT_DECLARATION, r);
    return r;
  }

  // IMPORT_KEYWORD import
  private static boolean importDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMPORT_KEYWORD);
    r = r && import_$(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IMPORT_KEYWORD "(" import (COMMA import)? ")"
  private static boolean importDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IMPORT_KEYWORD, LPAREN);
    r = r && import_$(b, l + 1);
    r = r && importDeclaration_1_3(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA import)?
  private static boolean importDeclaration_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importDeclaration_1_3")) return false;
    importDeclaration_1_3_0(b, l + 1);
    return true;
  }

  // COMMA import
  private static boolean importDeclaration_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importDeclaration_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && import_$(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // parameter (COMMA parameter)?
  public static boolean inputParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inputParameters")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INPUT_PARAMETERS, "<input parameters>");
    r = parameter(b, l + 1);
    r = r && inputParameters_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA parameter)?
  private static boolean inputParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inputParameters_1")) return false;
    inputParameters_1_0(b, l + 1);
    return true;
  }

  // COMMA parameter
  private static boolean inputParameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inputParameters_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DEF_KEYWORD? MEMBER_KEYWORD? structNameDeclaration COLON primitive_type
  //   | exprDeclaration
  public static boolean memberDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memberDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEMBER_DECLARATION, "<member declaration>");
    r = memberDeclaration_0(b, l + 1);
    if (!r) r = exprDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DEF_KEYWORD? MEMBER_KEYWORD? structNameDeclaration COLON primitive_type
  private static boolean memberDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memberDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = memberDeclaration_0_0(b, l + 1);
    r = r && memberDeclaration_0_1(b, l + 1);
    r = r && structNameDeclaration(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && primitive_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DEF_KEYWORD?
  private static boolean memberDeclaration_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memberDeclaration_0_0")) return false;
    consumeToken(b, DEF_KEYWORD);
    return true;
  }

  // MEMBER_KEYWORD?
  private static boolean memberDeclaration_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memberDeclaration_0_1")) return false;
    consumeToken(b, MEMBER_KEYWORD);
    return true;
  }

  /* ********************************************************** */
  // name_component "." name_component "(" expressionList ")"
  static boolean method_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_call")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = name_component(b, l + 1);
    r = r && consumeToken(b, ".");
    r = r && name_component(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && expressionList(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean name_component(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "name_component")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, NAME_COMPONENT, r);
    return r;
  }

  /* ********************************************************** */
  // OUT_KEYWORD parameter (COMMA parameter)?
  //  | SUB GT parameter (COMMA parameter)?
  public static boolean outputParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "outputParameters")) return false;
    if (!nextTokenIs(b, "<output parameters>", OUT_KEYWORD, SUB)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OUTPUT_PARAMETERS, "<output parameters>");
    r = outputParameters_0(b, l + 1);
    if (!r) r = outputParameters_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OUT_KEYWORD parameter (COMMA parameter)?
  private static boolean outputParameters_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "outputParameters_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OUT_KEYWORD);
    r = r && parameter(b, l + 1);
    r = r && outputParameters_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA parameter)?
  private static boolean outputParameters_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "outputParameters_0_2")) return false;
    outputParameters_0_2_0(b, l + 1);
    return true;
  }

  // COMMA parameter
  private static boolean outputParameters_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "outputParameters_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SUB GT parameter (COMMA parameter)?
  private static boolean outputParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "outputParameters_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SUB, GT);
    r = r && parameter(b, l + 1);
    r = r && outputParameters_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA parameter)?
  private static boolean outputParameters_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "outputParameters_1_3")) return false;
    outputParameters_1_3_0(b, l + 1);
    return true;
  }

  // COMMA parameter
  private static boolean outputParameters_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "outputParameters_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (PACKAGE_KEYWORD | PKG_KEYWORD) package_name
  public static boolean packageDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packageDeclaration")) return false;
    if (!nextTokenIs(b, "<package declaration>", PACKAGE_KEYWORD, PKG_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_DECLARATION, "<package declaration>");
    r = packageDeclaration_0(b, l + 1);
    r = r && package_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PACKAGE_KEYWORD | PKG_KEYWORD
  private static boolean packageDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packageDeclaration_0")) return false;
    boolean r;
    r = consumeToken(b, PACKAGE_KEYWORD);
    if (!r) r = consumeToken(b, PKG_KEYWORD);
    return r;
  }

  /* ********************************************************** */
  // qualified_name
  public static boolean package_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_name")) return false;
    if (!nextTokenIs(b, "<package name>", IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_NAME, "<package name>");
    r = qualified_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // parameterType IDENTIFIER
  public static boolean parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER, "<parameter>");
    r = parameterType(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // primitive_type
  //   | IDENTIFIER
  public static boolean parameterType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER_TYPE, "<parameter type>");
    r = primitive_type(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // INT_KEYWORD
  //   | FLOAT_KEYWORD
  //   | STRING_KEYWORD
  //   | name_component
  public static boolean primitive_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primitive_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMITIVE_TYPE, "<primitive type>");
    r = consumeToken(b, INT_KEYWORD);
    if (!r) r = consumeToken(b, FLOAT_KEYWORD);
    if (!r) r = consumeToken(b, STRING_KEYWORD);
    if (!r) r = name_component(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_component ("." name_component)*
  public static boolean qualified_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = name_component(b, l + 1);
    r = r && qualified_name_1(b, l + 1);
    exit_section_(b, m, QUALIFIED_NAME, r);
    return r;
  }

  // ("." name_component)*
  private static boolean qualified_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_name_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!qualified_name_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qualified_name_1", c)) break;
    }
    return true;
  }

  // "." name_component
  private static boolean qualified_name_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_name_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && name_component(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DEF_KEYWORD? STRUCT_KEYWORD structNameDeclaration OPEN_BRACE memberDeclaration* CLOSE_BRACE
  public static boolean structDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration")) return false;
    if (!nextTokenIs(b, "<struct declaration>", DEF_KEYWORD, STRUCT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_DECLARATION, "<struct declaration>");
    r = structDeclaration_0(b, l + 1);
    r = r && consumeToken(b, STRUCT_KEYWORD);
    r = r && structNameDeclaration(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACE);
    r = r && structDeclaration_4(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DEF_KEYWORD?
  private static boolean structDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration_0")) return false;
    consumeToken(b, DEF_KEYWORD);
    return true;
  }

  // memberDeclaration*
  private static boolean structDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!memberDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "structDeclaration_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // FUN_KEYWORD? structNameDeclaration DOLLAR functionDefineName functionParameters ('->' typeLiteral)? OPEN_BRACE memberDeclaration* CLOSE_BRACE
  public static boolean structMethodDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structMethodDeclaration")) return false;
    if (!nextTokenIs(b, "<struct method declaration>", FUN_KEYWORD, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_METHOD_DECLARATION, "<struct method declaration>");
    r = structMethodDeclaration_0(b, l + 1);
    r = r && structNameDeclaration(b, l + 1);
    r = r && consumeToken(b, DOLLAR);
    r = r && functionDefineName(b, l + 1);
    r = r && functionParameters(b, l + 1);
    r = r && structMethodDeclaration_5(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACE);
    r = r && structMethodDeclaration_7(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // FUN_KEYWORD?
  private static boolean structMethodDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structMethodDeclaration_0")) return false;
    consumeToken(b, FUN_KEYWORD);
    return true;
  }

  // ('->' typeLiteral)?
  private static boolean structMethodDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structMethodDeclaration_5")) return false;
    structMethodDeclaration_5_0(b, l + 1);
    return true;
  }

  // '->' typeLiteral
  private static boolean structMethodDeclaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structMethodDeclaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RARROW);
    r = r && typeLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // memberDeclaration*
  private static boolean structMethodDeclaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structMethodDeclaration_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!memberDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "structMethodDeclaration_7", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // name_component
  public static boolean structNameDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structNameDeclaration")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = name_component(b, l + 1);
    exit_section_(b, m, STRUCT_NAME_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // name_component
  public static boolean typeLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeLiteral")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = name_component(b, l + 1);
    exit_section_(b, m, TYPE_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // name_component
  public static boolean variableDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = name_component(b, l + 1);
    exit_section_(b, m, VARIABLE_DECLARATION, r);
    return r;
  }

}
