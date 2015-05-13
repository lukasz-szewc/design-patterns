package pl.designpatterns.creational;

import pl.designpatterns.creational.abstractfactory.*;
import pl.designpatterns.template.DesignPatternTestTemplate;
import java.util.Arrays;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

public class AbstractFactoryExample extends DesignPatternTestTemplate {

    public AbstractFactoryExample() {
        super("Abstract Factory");
    }

    @Test(description= "Tests simple creation of 2 different factories and test whether these factories work.")
    public void testPhoneCreation() {
        for (ToolboxFactory factory : Arrays.asList(new ImperialToolboxFactory(), new MetricToolboxFactory())) {
            assertNotNull(factory.createBolt());
            assertNotNull(factory.createScale());
            assertNotNull(factory.createWrench());
        }
    }
}
