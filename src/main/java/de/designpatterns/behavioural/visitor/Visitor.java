package de.designpatterns.behavioural.visitor;

public interface Visitor {

    public void visit(ComputerGame computerGame);

    public void visit(Book book);

}
