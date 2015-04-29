/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.creational;

import pl.designpatterns.creational.abstractfactory.ImperialToolboxFactory;
import pl.designpatterns.creational.abstractfactory.MetricToolboxFactory;
import pl.designpatterns.creational.abstractfactory.ToolboxFactory;
import pl.designpatterns.template.DesignPatternTestTemplate;
import java.util.Arrays;
import org.testng.annotations.Test;


public class AbstractFactoryExample extends DesignPatternTestTemplate {

    public AbstractFactoryExample() {
        super("Abstract Factory");
    }

    @Test(description= "Tests simple creation of 2 different factories and test whether these factories work.")
    public void testPhoneCreation() {

        for (ToolboxFactory factory : Arrays.asList(new ImperialToolboxFactory(), new MetricToolboxFactory())) {
            factory.createBolt();
            factory.createScale();
            factory.createWrench();
        }

    }

}
