/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.creational.builder;

/**
 *
 */
public class Predator {

    private final PredatorName predatorName;
    private String clawsDescription;
    private String teethDesciption;
    private String muscleDescription;

    Predator(PredatorName predatorName) {
        this.predatorName = predatorName;
    }

    void setClaws(String decription) {
        this.clawsDescription = decription;
    }

    void setSharpTeeth(String teethDescription) {
        this.teethDesciption = teethDescription;
    }

    void setMuscleDescription(String muscleDescription) {
        this.muscleDescription = muscleDescription;
    }

    @Override
    public String toString() {
        return "Predator{" + "predatorName=" + predatorName + ", clawsDescription=" + clawsDescription + ", teethDesciption=" + teethDesciption + ", muscleDescription=" + muscleDescription + '}';
    }

    enum PredatorName {

        ALIGATOR {
            @Override
            public String toString() {
                return "I am an aligathor from river Nile";
            }
        }, TIGER {
            @Override
            public String toString() {
                return "I am The Tiger";
            }
        }
    }
}
