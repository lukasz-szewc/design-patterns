package pl.designpatterns.structural;

import pl.designpatterns.structual.bridge.ActionProcessor;
import pl.designpatterns.structual.bridge.ConcreteButtonCreator;
import pl.designpatterns.structual.bridge.FancyButton;
import pl.designpatterns.structual.bridge.FancyButtonCreator;
import pl.designpatterns.structual.bridge.SimpleActionProcessor;
import pl.designpatterns.structual.bridge.UserInterfaceButtonCreator;
import pl.designpatterns.structual.bridge.VeryComplicatedActionProcessor;
import pl.designpatterns.template.DesignPatternTestTemplate;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class BridgeExample extends DesignPatternTestTemplate {

    public BridgeExample() {
        super("Bridge");
    }

    @Test(description = "Tests bridge example")
    public void testBridge() {
        for (ActionProcessor actionProcessor : processorsList()) {
            ConcreteButtonCreator concreteButtonCreator = new ConcreteButtonCreator(actionProcessor);
            FancyButtonCreator fancyButtonCreator = new FancyButtonCreator(actionProcessor);

            for (UserInterfaceButtonCreator creator : Arrays.asList(concreteButtonCreator, fancyButtonCreator)) {
                creator.produceAddObjectButton().processAction(33);
                creator.produceEditObjectButton().processAction("Some input string");
                creator.produceDeleteObjectButton().processAction(new Object());

            }
            FancyButton button = (FancyButton) fancyButtonCreator.produceAddObjectButton();
            System.out.println(button.getFancyDescription());
        }

    }

    private List<ActionProcessor> processorsList() {
        return Arrays.asList(new SimpleActionProcessor(), new VeryComplicatedActionProcessor());
    }

}
