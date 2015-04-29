/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.behavioural.templatemethod;

/**
 *
 */
public abstract class LoseWeightPlan {

    public void executePlan() {

        prepareDiet();
        prepareExcercise();

    }

    protected abstract void prepareDiet();

    protected abstract void prepareExcercise();


}
