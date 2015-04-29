/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.behavioural;

import pl.designpatterns.behavioural.interpreter.AddBookExpressionInterpreter;
import pl.designpatterns.behavioural.interpreter.DisplayDetailExpression;
import pl.designpatterns.behavioural.interpreter.DisplayExpression;
import pl.designpatterns.behavioural.interpreter.LibraryContext;
import pl.designpatterns.template.DesignPatternTestTemplate;
import org.testng.annotations.Test;

/**
 *
 */
public class InterpreterExample extends DesignPatternTestTemplate {

    public InterpreterExample() {
        super("Interpreter");
    }

    @Test(description = "tests basic interpreter.")
    public void testInterpreter() {
        LibraryContext libraryContext = new LibraryContext();

        String expression = "add Meditations";
        AddBookExpressionInterpreter addBookExpressionInterpreter = new AddBookExpressionInterpreter(expression);
        addBookExpressionInterpreter.interpret(libraryContext);

        String expression2 = "add War and Peace";
        AddBookExpressionInterpreter addBookExpressionInterpreter2 = new AddBookExpressionInterpreter(expression2);
        addBookExpressionInterpreter2.interpret(libraryContext);

        DisplayDetailExpression displayDetailExpression = new DisplayDetailExpression(DisplayDetailExpression.LAST);
        DisplayExpression displayExpression = new DisplayExpression(displayDetailExpression);
        displayExpression.interpret(libraryContext);

        DisplayDetailExpression displayDetailExpression2 = new DisplayDetailExpression(DisplayDetailExpression.ALL);
        DisplayExpression displayExpression2 = new DisplayExpression(displayDetailExpression2);
        displayExpression2.interpret(libraryContext);

    }
}
