package pl.designpatterns.creational.builder;

public class Predator {

    private final PredatorName predatorName;
    private String clawsDescription;
    private String teethDescription;
    private String muscleDescription;

    Predator(PredatorName predatorName) {
        this.predatorName = predatorName;
    }

    void setClaws(String description) {
        this.clawsDescription = description;
    }

    void setSharpTeeth(String teethDescription) {
        this.teethDescription = teethDescription;
    }

    void setMuscleDescription(String muscleDescription) {
        this.muscleDescription = muscleDescription;
    }

    @Override
    public String toString() {
        return "Predator{" + "predatorName=" + predatorName + ", clawsDescription=" + clawsDescription +
                ", teethDescription=" + teethDescription + ", muscleDescription=" + muscleDescription + '}';
    }

    enum PredatorName {

        ALLIGATOR {
            @Override
            public String toString() {
                return "I am an alligator from river Nile";
            }
        }, TIGER {
            @Override
            public String toString() {
                return "I am The Tiger";
            }
        }
    }
}
