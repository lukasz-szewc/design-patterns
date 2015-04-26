/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.structural;

import de.designpatterns.structual.facade.SimpleMachine;
import de.designpatterns.structual.facade.SimpleMachineFacade;
import de.designpatterns.template.DesignPatternTestTemplate;
import org.testng.annotations.Test;

/**
 *
 */
public class FacadeExample extends DesignPatternTestTemplate {

    public FacadeExample() {
        super("Facade");
    }

    @Test(description = "Tests Basic facade for system with engine, clutch and shaft")
    public void testFacade() {
        SimpleMachineFacade simpleMachine = new SimpleMachine();
        simpleMachine.turnOn();
        simpleMachine.turnOff();
    }

}
