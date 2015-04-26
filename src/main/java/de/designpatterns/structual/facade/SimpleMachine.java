/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.structual.facade;

/**
 *
 */
public class SimpleMachine implements SimpleMachineFacade {

    private final Engine engine;
    private final Clutch clutch;
    private final FuelPump fuelPump;

    public SimpleMachine() {
        engine = new Engine();
        clutch = new Clutch();
        fuelPump = new FuelPump();
    }

    @Override
    public void turnOn() {
        System.out.println("------");
        engine.provideAccessCode();
        engine.provideVoltage();
        fuelPump.provideFuel(engine, 5);
        engine.increaseMovement();
        clutch.connectEngineToShaft(engine);
        engine.increaseMovement();
        fuelPump.provideFuel(engine, 10);
        engine.increaseMovement();

        System.out.println("[SYSTEM] all components are working...");

    }

    @Override
    public void turnOff() {
        System.out.println("------");

        engine.shutDown();
        while (engine.isMoving()) {
            engine.decreaseSpeed();
        }
        clutch.disconnectShaft();
        fuelPump.stopPumingFuel();

        System.out.println("[SYSTEM] all components stopped...");
    }
}
