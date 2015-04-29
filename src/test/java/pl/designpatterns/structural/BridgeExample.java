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
import org.testng.annotations.Test;

public class BridgeExample extends DesignPatternTestTemplate {

    public BridgeExample() {
        super("Bridge");
    }

    @Test(description = "Tests bidge example")
    public void testBridge() {
        SimpleActionProcessor simpleActionProcessor = new SimpleActionProcessor();
        VeryComplicatedActionProcessor veryComplicatedActionProcessor = new VeryComplicatedActionProcessor();

        for (ActionProcessor actionProcessor :
                Arrays.asList(simpleActionProcessor, veryComplicatedActionProcessor)) {

            ConcreteButtonCreator concreteButtonCreator = new ConcreteButtonCreator(actionProcessor);
            FancyButtonCreator fancyButtonCreator = new FancyButtonCreator(actionProcessor);

            for (UserInterfaceButtonCreator creator : Arrays.asList(concreteButtonCreator, fancyButtonCreator)) {
                creator.procudeAddObjectButton().processAction(Integer.valueOf(33));
                creator.procudeEditObjectButton().processAction("Some input string");
                creator.procudeDeleteObjectButton().processAction(new Object());

            }
            FancyButton button = (FancyButton) fancyButtonCreator.procudeAddObjectButton();
            System.out.println(button.getFancyDescription());

        }

    }

}
