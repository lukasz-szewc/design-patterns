/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.behavioural.state;

/**
 *
 */
public interface EngineState {

    public void start(Engine engine);

    public void accelerate(Engine engine);

    public void stop(Engine engine);
}
