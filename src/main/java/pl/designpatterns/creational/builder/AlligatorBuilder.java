package pl.designpatterns.creational.builder;

import pl.designpatterns.creational.builder.Predator.PredatorName;

public class AlligatorBuilder implements PredatorBuilder {
    private Predator predator;

    @Override
    public void createClaws() {
        validateBuilderState();
        predator.setClaws("Small claws - not really used during hunting.");
    }

    @Override
    public void createSharpTeeth() {
        validateBuilderState();
        predator.setSharpTeeth("Many extremely sharp Teeth.");
    }

    @Override
    public void createStrongMuscles() {
        validateBuilderState();
        predator.setMuscleDescription("Extremely strong jaw, cannot say it is muscular animal.");
    }

    @Override
    public Predator getResultOfBuilding() {
        return predator;
    }

    @Override
    public void createLittlePredator() {
        this.predator = new Predator(PredatorName.ALLIGATOR);
    }

    private void validateBuilderState() throws IllegalStateException {
        if (predator == null) {
            throw new IllegalStateException("Construct Little predator first");
        }
    }

}
