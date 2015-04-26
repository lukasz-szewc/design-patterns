/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.behavioural.state;

/**
 *
 */
class RunningEngineState implements EngineState {

    @Override
    public void start(Engine engine) {
        System.out.println("The engine is already started. Nothing changes...");
    }

    @Override
    public void accelerate(Engine engine) {
        System.out.println("I am accelerating ... !");
    }

    @Override
    public void stop(Engine engine) {
        System.out.println("I am stopping the engine...");
        engine.setIntoStoppedState();
        System.out.println("Engine stopped...");
    }

}
