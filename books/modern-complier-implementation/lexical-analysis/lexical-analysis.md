# Lexical Analysis

The `front-end` of the compiler performs analysis while the `back-end` does the synthesis.

The lexical analyzer is an I/O program that:
1) Takes an input stream characters analyzed from the user code.
2) Produces an output stream of lexical tokens (names, keywords, punctuation marks and etc).

> Notice:
> The lexical analyzer discards both the white spaces and the comments between tokens.

## Table of contents: 
1) Lexical tokens.
2) Regular Expressions.
3) Finite Automata.
4) Implementation of a lexical analyzer.
---------------------------------------

### 1) Lexical tokens

`Lexical`: means of or relating to words or vocabulary.

`Lexical-Tokens`: is a sequence of characters that can be treated as a unit in the grammer of a programming language.

A programming language classifies the lexical tokens into a finite set of token types, as shown by the next table.

| Token-Type | Example | 
|---------------|------------|
| `ID` | foo n14 last | 
| `NUM` | 73 32 33 | 
| `REAL` | 55.1 33.3 11.1 | 
| `IF` | if | 
| `COMMA` | , | 
| `NOTEQ` | != | 
| `LPAREN` | ( | 
| `RPAREN` | ) | 

ID (Identifiers) tokens rules: 
1) The first character must be a letter whether lower or upper case or an underscore (_).
2) Upper and lowercases are different.
3) If the input-stream has been parsed into tokens up to a given character, the next token is taken to include the longest string of characters that could possibly constitute a token.
4) Blanks, tabs, newlines and comments are ignored except as they serve to separate tokens.
5) White spaces are required to separate ID tokens from one another.

Example of lexical tokens implementation: 
```c
float match0(char* s) {
    if (!strncmp(s, "0.0", 3)) 
    return 0.0;
}
```
The lexical analyzer will return this stream (ordered for readability):
```
FLOAT ID(match0) LPAREN CHAR STAR ID(s) RPAREN 
LBRACE 
IF LPAREN BANG ID(strncmp) LPAREN ID(s) COMMA NUM(3) RPAREN RPAREN 
RETURN REAL(0.0) SEMI 
RBRACE 
EOF
```
---------------------------
### 2) Regular Expressions


