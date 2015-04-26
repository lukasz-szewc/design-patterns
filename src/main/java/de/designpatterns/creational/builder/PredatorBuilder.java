/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.creational.builder;

/**
 *
 */
public interface PredatorBuilder {

    public void createClaws();

    public void createSharpTeeth();

    public void createStrongMuscles();

    public Predator getResultOfBuilding();

    public void createLittlePredator();
}
