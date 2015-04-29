/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.creational.builder;

import pl.designpatterns.creational.builder.Predator.PredatorName;

/**
 *
 */
public class TigerBuilder implements PredatorBuilder {
    private Predator predator;

    @Override
    public void createClaws() {
        validateBuilderState();
        predator.setClaws("20 Sharp claws able to catch other animals");
    }

    @Override
    public void createSharpTeeth() {
        validateBuilderState();
        predator.setSharpTeeth("32 sharp teeth able to cut every piece of muscles and bones.");
    }

    @Override
    public void createStrongMuscles() {
        validateBuilderState();
        predator.setMuscleDescription("Strong muscles of jaw and paws, 250 kilograms of weight.");
    }

    @Override
    public Predator getResultOfBuilding() {
        return predator;
    }

    @Override
    public void createLittlePredator() {
        this.predator = new Predator(PredatorName.TIGER);
    }

    private void validateBuilderState() throws IllegalStateException {
        if (predator == null) {
            throw new IllegalStateException("Construct Little predator first");
        }
    }

}
