/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.creational.builder;

/**
 *
 */
public class PredatorDirector {

    private PredatorBuilder predatorBuilder;

    public PredatorDirector(PredatorBuilder predatorBuilder) {
        this.predatorBuilder = predatorBuilder;
    }

    public void constructPredator() {
        predatorBuilder.createLittlePredator();
        predatorBuilder.createClaws();
        predatorBuilder.createSharpTeeth();
        predatorBuilder.createStrongMuscles();

    }

    public Predator getResults() {
        return predatorBuilder.getResultOfBuilding();
    }

    public void setPredatorBuilder(PredatorBuilder predatorBuilder) {
        this.predatorBuilder = predatorBuilder;
    }

}
