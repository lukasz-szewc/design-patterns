/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.creational;

import pl.designpatterns.creational.builder.AligatorBuilder;
import pl.designpatterns.creational.builder.Predator;
import pl.designpatterns.creational.builder.PredatorDirector;
import pl.designpatterns.creational.builder.TigerBuilder;
import pl.designpatterns.template.DesignPatternTestTemplate;
import org.testng.annotations.Test;

/**
 *
 */
public class BuilderExample extends DesignPatternTestTemplate {

    public BuilderExample() {
        super("Builder");
    }

    @Test(description= "Tests simple creation of 2 different predators via different builders.")
    public void testBuilders() {

        PredatorDirector predatorDirector = new PredatorDirector(new AligatorBuilder());
        predatorDirector.constructPredator();
        Predator predator = predatorDirector.getResults();

        System.out.println(predator);

        predatorDirector.setPredatorBuilder(new TigerBuilder());
        predatorDirector.constructPredator();
        Predator secondPredator = predatorDirector.getResults();

        System.out.println(secondPredator);
    }
}
