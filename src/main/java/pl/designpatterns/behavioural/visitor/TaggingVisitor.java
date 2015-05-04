package pl.designpatterns.behavioural.visitor;

public class TaggingVisitor implements Visitor {

    @Override
    public void visit(ComputerGame computerGame) {
        System.out.printf("I am %s instance, and i have received %s instance",
                getClass().getSimpleName(), computerGame.getClass().getSimpleName());
        System.out.println();
    }

    @Override
    public void visit(Book book) {
        System.out.printf("I am %s instance, and i have received %s instance, name: %s",
                getClass().getSimpleName(), book.getClass().getSimpleName(), book.getName());
        System.out.println();
    }

}
