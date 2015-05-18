package pl.designpatterns.creational.factorymethod;

public class PhoneFactory {

    public Product createPhone() {
        return new Phone();
    }

}
