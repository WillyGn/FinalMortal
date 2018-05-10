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

public class LoopUntilCommand extends Command {
    
    public LoopUntilCommand (Expression eAST, Command cAST, SourcePosition thePosition) {
    super (thePosition);
    E = eAST;
    C = cAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitLoopUntilCommand(this, o);
  }

  public Expression E;
  public Command C;
  
}
