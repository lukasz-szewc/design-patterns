/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.creational.builder;

import de.designpatterns.creational.builder.Predator.PredatorName;

/**
 *
 */
public class AligatorBuilder implements PredatorBuilder {
    private Predator predator;

    @Override
    public void createClaws() {
        validateBuilderState();
        predator.setClaws("Small claws - not really used during hunting.");
    }

    @Override
    public void createSharpTeeth() {
        validateBuilderState();
        predator.setSharpTeeth("Many extremally sharp Teeth .");
    }

    @Override
    public void createStrongMuscles() {
        validateBuilderState();
        predator.setMuscleDescription("Extremally strong jaw, cannot say it is muscular animal.");
    }

    @Override
    public Predator getResultOfBuilding() {
        return predator;
    }

    @Override
    public void createLittlePredator() {
        this.predator = new Predator(PredatorName.ALIGATOR);
    }

    private void validateBuilderState() throws IllegalStateException {
        if (predator == null) {
            throw new IllegalStateException("Construct Little predator first");
        }
    }

}
