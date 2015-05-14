package pl.designpatterns.behavioural;

import pl.designpatterns.behavioural.memento.Document;
import pl.designpatterns.behavioural.memento.DocumentCaretaker;
import pl.designpatterns.behavioural.memento.DocumentMemento;
import pl.designpatterns.template.DesignPatternTestTemplate;
import org.testng.annotations.Test;

public class MementoExample extends DesignPatternTestTemplate {

    public MementoExample() {
        super("Memento");
    }

    @Test(description = "Simple Store Memento")
    public void testBasicDoc() {
        DocumentCaretaker caretaker = new DocumentCaretaker();
        Document document = new Document();

        document.writeHeader("Declaration of Independence. ");

        caretaker.storeMemento(document.saveMemento());
        document.print();

        document.writeContent("We the people... ");

        caretaker.storeMemento(document.saveMemento());
        document.print();

        document.writeFooter("Thomas Jefferson, Philadelphia 1776. ");

        caretaker.storeMemento(document.saveMemento());
        document.print();

        document.writeContent("of the United States of America ... ");
        document.writeContent(" We want to be sovereign nation... ");

        caretaker.storeMemento(document.saveMemento());
        document.print();

        document.clearContent();

        document.writeContent("Hehe, april fools. :P");
        document.print();

        caretaker.storeMemento(document.saveMemento());
        document.restoreState(caretaker.retrieveMemento(3));
        document.print();

        for (int i = 0; i < caretaker.storedMementoCount(); i++) {
            System.out.println("__________________________________________");
            System.out.println("printing memento nr: " + i);
            DocumentMemento retrieveMemento = caretaker.retrieveMemento(i);
            document.restoreState(retrieveMemento);
            document.print();
            System.out.println("__________________________________________");
        }

    }
}
