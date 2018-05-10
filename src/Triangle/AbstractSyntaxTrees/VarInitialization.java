/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

/**
 *
 * @author Ignacio Cantillo
 */
import Triangle.SyntacticAnalyzer.SourcePosition;

public class VarInitialization extends Declaration {

    public VarInitialization (Identifier iAST, Expression eAST,
                         SourcePosition thePosition) {
    super (thePosition);
    I = iAST;
    E = eAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitVarInitialization(this, o);
  }

  public Identifier I;
  public Expression E;
    
}