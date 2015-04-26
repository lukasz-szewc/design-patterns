package de.designpatterns.structural;

import de.designpatterns.structual.bridge.ActionProcessor;
import de.designpatterns.structual.bridge.ConcreteButtonCreator;
import de.designpatterns.structual.bridge.FancyButton;
import de.designpatterns.structual.bridge.FancyButtonCreator;
import de.designpatterns.structual.bridge.SimpleActionProcessor;
import de.designpatterns.structual.bridge.UserInterfaceButtonCreator;
import de.designpatterns.structual.bridge.VeryComplicatedActionProcessor;
import de.designpatterns.template.DesignPatternTestTemplate;
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
