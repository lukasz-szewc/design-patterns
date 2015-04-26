/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.structual.flyweight;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 */
public class ShipMap {

    LinkedHashMap<Integer, ShipFlyweight> linkedHashMap = new LinkedHashMap<Integer, ShipFlyweight>();

    public void addShipToMap(ShipFlyweight shipFlyweight) {

        int index = linkedHashMap.size() + 1;
        linkedHashMap.put(index, shipFlyweight);

    }

    public void printMapStatus() {
        for (Map.Entry<Integer, ShipFlyweight> entry : linkedHashMap.entrySet()) {
            System.out.printf("Ship index %d, ship %s", entry.getKey(), entry.getValue());
            System.out.println();
        }
    }
}
