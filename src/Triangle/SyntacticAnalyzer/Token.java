/*
 * @(#)Token.java                        2.1 2003/10/07
 *
 * Copyright (C) 1999, 2003 D.A. Watt and D.F. Brown
 * Dept. of Computing Science, University of Glasgow, Glasgow G12 8QQ Scotland
 * and School of Computer and Math Sciences, The Robert Gordon University,
 * St. Andrew Street, Aberdeen AB25 1HG, Scotland.
 * All rights reserved.
 *
 * This software is provided free for educational use only. It may
 * not be used for commercial purposes without the prior written permission
 * of the authors.
 */

package Triangle.SyntacticAnalyzer;


final class Token extends Object {

  protected int kind;
  protected String spelling;
  protected SourcePosition position;

  public Token(int kind, String spelling, SourcePosition position) {

    if (kind == Token.IDENTIFIER) {
      int currentKind = firstReservedWord;
      boolean searching = true;

      while (searching) {
        int comparison = tokenTable[currentKind].compareTo(spelling);
        if (comparison == 0) {
          this.kind = currentKind;
          searching = false;
        } else if (comparison > 0 || currentKind == lastReservedWord) {
          this.kind = Token.IDENTIFIER;
          searching = false;
        } else {
          currentKind ++;
        }
      }
    } else
      this.kind = kind;

    this.spelling = spelling;
    this.position = position;

  }

  public static String spell (int kind) {
    return tokenTable[kind];
  }

  public String toString() {
    return "Kind=" + kind + ", spelling=" + spelling +
      ", position=" + position;
  }

  // Token classes...

  public static final int

    // literals, identifiers, operators...
    INTLITERAL	= 0,
    CHARLITERAL	= 1,
    IDENTIFIER	= 2,
    OPERATOR	= 3,

    // reserved words - must be in alphabetical order...
    // SE AGREGARON LOS NUEVOS TOKENS
    AND                 = 4, //NUEVA
    ARRAY		= 5, //BORRE EL BEGIN
    CONST		= 6,
    DO			= 7,
    ELSE		= 8,
    ELSIF               = 9, //NUEVA
    END			= 10,
    FOR                 = 11, //NUEVA
    FUNC		= 12,
    IF			= 13,
    IN			= 14,
    LET			= 15,
    LOOP                = 16, //NUEVA
    NOTHING             = 17, //NUEVA
    OF			= 18,
    PRIVATE             = 19, //NUEVA
    PROC		= 20,
    REC                 = 21, //NUEVA
    RECORD		= 22,
    THEN		= 23,
    TO                  = 24, //NUEVA
    TYPE		= 25,
    UNTIL               = 26, //NUEVA
    VAR			= 27,
    WHILE		= 28,

    // punctuation...
    DOUBLEDOT           = 29, //NUEVA
    DOT			= 30,
    COLON		= 31,
    SEMICOLON           = 32,
    COMMA		= 33,
    BECOMES		= 34,
    IS			= 35,

    // brackets...
    LPAREN		= 36,
    RPAREN		= 37,
    LBRACKET            = 38,
    RBRACKET            = 39,
    LCURLY		= 40,
    RCURLY		= 41,

    // special tokens...
    EOT			= 42,
    ERROR		= 43;

  //SE ACTUALIZO LA TABLA DE TOKENS CON LOS NUEVOS
  private static String[] tokenTable = new String[] {
    "<int>",
    "<char>",
    "<identifier>",
    "<operator>",
    "and",
    "array",
    "const",
    "do",
    "else",
    "elsif",
    "end",
    "for",
    "func",
    "if",
    "in",
    "let",
    "loop",
    "nothing",
    "of",
    "private",
    "proc",
    "rec",
    "record",
    "then",
    "to",
    "type",
    "until",
    "var",
    "while",
    "..", //NUEVO
    ".",
    ":",
    ";",
    ",",
    ":=",
    "~",
    "(",
    ")",
    "[",
    "]",
    "{",
    "}",
    "",
    "<error>"
  };

  private final static int	firstReservedWord = Token.AND, //ACTIALIZADO
  				lastReservedWord  = Token.WHILE;

}
