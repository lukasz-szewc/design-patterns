package pl.designpatterns.behavioural.interpreter;

public class DisplayDetailExpression implements ExpressionInterpreter {

    public static final String LAST = "last";
    public static final String ALL = "all";

    private final String displayDetails;

    public DisplayDetailExpression(String displayDetails) {
        this.displayDetails = displayDetails;
    }

    @Override
    public void interpret(LibraryContext context) {
        if (ALL.equals(displayDetails)) {
            context.getAllBooks();
        } else if (LAST.equals(displayDetails)) {
            context.getLastAddedBook();
        }
    }

}
