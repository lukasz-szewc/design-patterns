package pl.designpatterns.behavioural;

import pl.designpatterns.behavioural.visitor.Book;
import pl.designpatterns.behavioural.visitor.ComputerGame;
import pl.designpatterns.behavioural.visitor.TaggingVisitor;
import pl.designpatterns.behavioural.visitor.VisitedObject;
import pl.designpatterns.behavioural.visitor.Visitor;
import pl.designpatterns.template.DesignPatternTestTemplate;
import java.util.Arrays;
import org.testng.annotations.Test;

public class VisitorExample extends DesignPatternTestTemplate {

    public VisitorExample() {
        super("Visitor");
    }

    @Test(description = "Simple example of acceptance of Visitor by objects able to be visited")
    public void testVisitor() {
        Visitor visitor = new TaggingVisitor();

        VisitedObject book = new Book("Meditations by Marcus Aurelius");
        VisitedObject computerGame = new ComputerGame("Diablo III");

        for (VisitedObject visitedObject : Arrays.asList(book, computerGame)) {
            visitedObject.accept(visitor);
        }
    }
}
