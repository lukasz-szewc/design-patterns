package pl.designpatterns.structual.bridge;

public interface UserInterfaceButtonCreator {

    Button produceAddObjectButton();

    Button produceEditObjectButton();

    Button produceDeleteObjectButton();
}
