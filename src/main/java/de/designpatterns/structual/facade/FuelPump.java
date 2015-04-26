/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.structual.facade;

/**
 *
 */
public class FuelPump {


    void provideFuel(Engine engine, int i) {
        System.out.println("[FUEL PUMP] Providing fuel...");
        engine.pumpFuel(i);
    }

    void stopPumingFuel() {
        System.out.println("[FUEL PUMP] Stop pumping fuel...");
    }
}
