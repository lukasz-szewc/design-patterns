package pl.designpatterns.behavioural.templatemethod;

public class AthleteLoseWeightPlan extends LoseWeightPlan {

    @Override
    protected void prepareDiet() {
        System.out.println("Preparing restrictive diet, lots of protein and supplements...");
    }

    @Override
    protected void prepareExercise() {
        System.out.println("Five times per week - intensive workout - lifting weights");
    }
}
