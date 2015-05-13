package pl.designpatterns.creational.abstractfactory;

public interface ToolboxFactory {

    Bolt createBolt();

    Scale createScale();

    Wrench createWrench();

}
