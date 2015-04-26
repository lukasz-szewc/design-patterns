package de.designpatterns.behavioural;

import de.designpatterns.behavioural.visitor.Book;
import de.designpatterns.behavioural.visitor.ComputerGame;
import de.designpatterns.behavioural.visitor.TaggingVisitor;
import de.designpatterns.behavioural.visitor.VisitedObject;
import de.designpatterns.behavioural.visitor.Visitor;
import de.designpatterns.template.DesignPatternTestTemplate;
import java.util.Arrays;
import org.testng.annotations.Test;

/**
 *
 */
public class VisitorExample extends DesignPatternTestTemplate {

    public VisitorExample() {
        super("Visitor");
    }

    @Test(description = "Simple example of acceptance of Visior by objects able to be visited")
    public void testVisior() {

        Visitor visitor = new TaggingVisitor();

        VisitedObject book = new Book("Meditations by Marcus Aurelius");
        VisitedObject computerGame = new ComputerGame("Diablo III");


        for (VisitedObject visitedObject : Arrays.asList(book, computerGame)) {
            visitedObject.accept(visitor);
        }
    }
}
