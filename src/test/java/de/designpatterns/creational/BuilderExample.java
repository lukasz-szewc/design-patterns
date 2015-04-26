/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.creational;

import de.designpatterns.creational.builder.AligatorBuilder;
import de.designpatterns.creational.builder.Predator;
import de.designpatterns.creational.builder.PredatorDirector;
import de.designpatterns.creational.builder.TigerBuilder;
import de.designpatterns.template.DesignPatternTestTemplate;
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
