/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.creational;

import de.designpatterns.creational.abstractfactory.ImperialToolboxFactory;
import de.designpatterns.creational.abstractfactory.MetricToolboxFactory;
import de.designpatterns.creational.abstractfactory.ToolboxFactory;
import de.designpatterns.template.DesignPatternTestTemplate;
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
