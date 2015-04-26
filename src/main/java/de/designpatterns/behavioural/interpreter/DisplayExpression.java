/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.behavioural.interpreter;

/**
 *
 * @author Lukasz
 */
public class DisplayExpression implements ExpressionInterpreter {
    private final ExpressionInterpreter expressionInterpreter;

    public DisplayExpression(ExpressionInterpreter expressionInterpreter) {
        this.expressionInterpreter = expressionInterpreter;
    }

    @Override
    public void interpret(LibraryContext context) {
        expressionInterpreter.interpret(context);
    }

}
