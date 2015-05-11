package pl.designpatterns.creational;

import pl.designpatterns.creational.builder.AlligatorBuilder;
import pl.designpatterns.creational.builder.Predator;
import pl.designpatterns.creational.builder.PredatorDirector;
import pl.designpatterns.creational.builder.TigerBuilder;
import pl.designpatterns.template.DesignPatternTestTemplate;
import org.testng.annotations.Test;

public class BuilderExample extends DesignPatternTestTemplate {

    public BuilderExample() {
        super("Builder");
    }

    @Test(description= "Tests simple creation of 2 different predators via different builders.")
    public void testBuilders() {

        PredatorDirector predatorDirector = new PredatorDirector(new AlligatorBuilder());
        predatorDirector.constructPredator();
        Predator predator = predatorDirector.getResults();

        System.out.println(predator);

        predatorDirector.setPredatorBuilder(new TigerBuilder());
        predatorDirector.constructPredator();
        Predator secondPredator = predatorDirector.getResults();

        System.out.println(secondPredator);
    }
}
