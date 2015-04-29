/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.behavioural;

import pl.designpatterns.behavioural.templatemethod.AthleteLoseWeightPlan;
import pl.designpatterns.behavioural.templatemethod.LightLoseWeightPlan;
import pl.designpatterns.behavioural.templatemethod.LoseWeightPlan;
import pl.designpatterns.template.DesignPatternTestTemplate;
import java.util.Arrays;
import java.util.List;
import org.testng.annotations.Test;

/**
 *
 */
public class TemplateMethodExample extends DesignPatternTestTemplate {

    public TemplateMethodExample() {
        super("Template Method");
    }

    @Test(description = "Tests whether template method.")
    public void testEngineStarts() {

        List<LoseWeightPlan> plans = Arrays.asList(new AthleteLoseWeightPlan(), new LightLoseWeightPlan());

        for (LoseWeightPlan loseWeightPlan : plans) {

            loseWeightPlan.executePlan();

        }

    }

}
