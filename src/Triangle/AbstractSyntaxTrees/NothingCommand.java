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

public class NothingCommand extends Command {
    public NothingCommand (SourcePosition thePosition) {
    super (thePosition);
  }

  public Object visit(Visitor v, Object o) {
    return v.visitNothingCommand(this, o);
  }

}