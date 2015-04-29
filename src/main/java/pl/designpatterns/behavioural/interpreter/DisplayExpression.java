package pl.designpatterns.behavioural.interpreter;

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
