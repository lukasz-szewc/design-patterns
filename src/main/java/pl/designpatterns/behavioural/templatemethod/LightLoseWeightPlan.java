/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.behavioural.templatemethod;

/**
 *
 */
public class LightLoseWeightPlan extends LoseWeightPlan {

    @Override
    protected void prepareDiet() {
        System.out.println("Just remove unhealty food");
    }

    @Override
    protected void prepareExcercise() {
        System.out.println("Running 20 minutes - 2 times per week");
    }

}
