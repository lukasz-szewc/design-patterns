package pl.designpatterns.creational.builder;

public interface PredatorBuilder {

    void createClaws();

    void createSharpTeeth();

    void createStrongMuscles();

    Predator getResultOfBuilding();

    void createLittlePredator();
}
