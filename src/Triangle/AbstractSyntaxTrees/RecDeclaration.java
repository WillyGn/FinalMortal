/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 *
 * @author Jorge
 */
public class RecDeclaration extends Declaration {
    public RecDeclaration (Declaration dAST, SourcePosition thePosition) {
        super (thePosition);
        I = dAST;
      }

      public Object visit(Visitor v, Object o) {
        return v.visitRecDeclaration(this, o);
      }

      public Declaration I;
}
