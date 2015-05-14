package pl.designpatterns.behavioural.memento;

public interface DocumentOriginator {

    public DocumentMemento saveMemento();

    public void restoreState(DocumentMemento documentMemento);

}
