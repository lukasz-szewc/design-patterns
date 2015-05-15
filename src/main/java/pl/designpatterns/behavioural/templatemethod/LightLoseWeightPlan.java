package pl.designpatterns.behavioural.templatemethod;


public class LightLoseWeightPlan extends LoseWeightPlan {

    @Override
    protected void prepareDiet() {
        System.out.println("Just remove unhealthy food");
    }

    @Override
    protected void prepareExercise() {
        System.out.println("Running 20 minutes - 2 times per week");
    }

}
