/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 *
 * @author Will
 */
public class ElsifCommand extends Command{
    public Expression E;
    public Command C1,C2;

    public ElsifCommand(Expression E, Command C1, Command C2, SourcePosition thePosition) {
        super(thePosition);
        this.E = E;
        this.C1 = C1;
        this.C2 = C2;
    }  
    
    public Object visit(Visitor v, Object o) {
        return v.visitElsifCommand(this, o);
    }
    
}
