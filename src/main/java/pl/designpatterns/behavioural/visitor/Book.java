package pl.designpatterns.behavioural.visitor;

public class Book implements VisitedObject {
    private final String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

}
