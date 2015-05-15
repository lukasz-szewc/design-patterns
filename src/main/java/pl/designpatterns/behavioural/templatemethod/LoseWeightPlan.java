package pl.designpatterns.behavioural.templatemethod;

public abstract class LoseWeightPlan {

    public void executePlan() {
        prepareDiet();
        prepareExercise();
    }

    protected abstract void prepareDiet();

    protected abstract void prepareExercise();

}
