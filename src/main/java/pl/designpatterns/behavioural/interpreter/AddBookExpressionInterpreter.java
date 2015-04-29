package pl.designpatterns.behavioural.interpreter;

public class AddBookExpressionInterpreter implements ExpressionInterpreter {
    private final String bookTitle;

    public AddBookExpressionInterpreter(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public void interpret(LibraryContext context) {
        context.addBookTitle(bookTitle.substring(4));
    }

}
