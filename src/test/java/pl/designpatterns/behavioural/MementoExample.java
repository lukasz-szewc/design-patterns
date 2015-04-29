/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.behavioural;

import pl.designpatterns.behavioural.memento.Document;
import pl.designpatterns.behavioural.memento.DocumentCaretaker;
import pl.designpatterns.behavioural.memento.DocumentMemento;
import pl.designpatterns.behavioural.memento.DocumentPart;
import pl.designpatterns.template.DesignPatternTestTemplate;
import org.testng.annotations.Test;

/**
 *
 */
public class MementoExample extends DesignPatternTestTemplate {

    public MementoExample() {
        super("Memento");
    }

    @Test(description = "Simple Store Memento")
    public void testBasicDoc() {

        DocumentCaretaker caretaker = new DocumentCaretaker();

        Document document = new Document();

        document.writeInto(DocumentPart.HEADER, "Declaration of Independence. ");

        caretaker.storeMemento(document.saveMemento());
        document.printContent();

        document.writeInto(DocumentPart.CONTENT, "We the people... ");

        caretaker.storeMemento(document.saveMemento());
        document.printContent();

        document.writeInto(DocumentPart.FOOTER, "Thomas Jefferson, Philadelphia 1776. ");

        caretaker.storeMemento(document.saveMemento());
        document.printContent();

        document.writeInto(DocumentPart.CONTENT, "of the United States of America ... ");
        document.writeInto(DocumentPart.CONTENT, " We want to be sovereign nation... ");

        caretaker.storeMemento(document.saveMemento());
        document.printContent();

        document.clear(DocumentPart.CONTENT);

        document.writeInto(DocumentPart.CONTENT, "Hehe, april fools. :P");
        document.printContent();

        caretaker.storeMemento(document.saveMemento());
        document.restoreState(caretaker.retrieveMemento(3));
        document.printContent();

        for (int i = 0; i < caretaker.storedMementoCount(); i++) {
            System.out.println("__________________________________________");
            System.out.println("printing memento nr: " + i);
            DocumentMemento retrieveMemento = caretaker.retrieveMemento(i);
            document.restoreState(retrieveMemento);
            document.printContent();
            System.out.println("__________________________________________");
        }

    }
}
