/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.behavioural;

import de.designpatterns.behavioural.state.Engine;
import de.designpatterns.template.DesignPatternTestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 */
public class StateExample extends DesignPatternTestTemplate {

    public StateExample() {
        super("State");
    }

    @Test(description = "Tests whether stopped engine starts.")
    public void testEngineStarts() {
        Engine engine = new Engine();

        engine.start();
        engine.accelerate();
        engine.accelerate();
        engine.accelerate();
        engine.stop();
    }

    @Test(description = "Tests whether start stop is possible many times.")
    public void testEngineStartsManyTimes() {
        Engine engine = new Engine();

        engine.start();
        engine.accelerate();
        engine.stop();

        engine.start();
        engine.accelerate();
        engine.stop();

        engine.start();
        engine.accelerate();
        engine.stop();
    }

    @Test(description = "Tests whether is possible to start on turned off engine.")
    public void testItIsImpossibleToAccelerateOnStoppedEngine() {
        Engine engine = new Engine();
        try {
            engine.accelerate();
        } catch (IllegalStateException e) {
            Assert.assertTrue(true);
        }

    }
}
