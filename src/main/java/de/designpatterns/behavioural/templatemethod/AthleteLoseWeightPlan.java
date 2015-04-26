/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.behavioural.templatemethod;

/**
 */
public class AthleteLoseWeightPlan extends LoseWeightPlan {

    @Override
    protected void prepareDiet() {
        System.out.println("Preparing restrictive diet, lots of protein and supplements...");
    }

    @Override
    protected void prepareExcercise() {
        System.out.println("Five times per week - intensive workout - lifting weights");
    }

}
