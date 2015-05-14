package pl.designpatterns.behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class DocumentCaretaker {
    private final List<DocumentMemento> storedMementoList;

    public DocumentCaretaker() {
        storedMementoList = new ArrayList<DocumentMemento>();
    }

    public void storeMemento(DocumentMemento documentMemento) {
        storedMementoList.add(documentMemento);
    }

    public DocumentMemento retrieveMemento(int index) {
        return storedMementoList.get(index);
    }

    public int storedMementoCount() {
        return storedMementoList.size();
    }
}
