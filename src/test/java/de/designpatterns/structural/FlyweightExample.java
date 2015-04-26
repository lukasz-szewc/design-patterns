/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.structural;

import de.designpatterns.structual.flyweight.ShipFactory;
import de.designpatterns.structual.flyweight.ShipMap;
import de.designpatterns.template.DesignPatternTestTemplate;
import java.util.Arrays;
import org.testng.annotations.Test;

/**
 *
 */
public class FlyweightExample extends DesignPatternTestTemplate {

    public FlyweightExample() {
        super("Flyweight");
    }

    @Test(description = "Tests basic flyweight")
    public void testFacade() {

        ShipMap shipMap = new ShipMap();

        ShipFactory shipFactory = new ShipFactory();

        for (int i = 1; i <= 4; i++) {
            for (Boolean warship : Arrays.asList(Boolean.TRUE, Boolean.FALSE)) {
                shipFactory.getShip(i, warship).placeShip(shipMap);

            }
        }

        shipMap.printMapStatus();

    }
}
