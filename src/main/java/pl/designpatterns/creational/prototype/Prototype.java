package pl.designpatterns.creational.prototype;

public interface Prototype<T> extends Cloneable {

    T clone();

}
