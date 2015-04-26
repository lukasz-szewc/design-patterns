/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.behavioural;

import de.designpatterns.behavioural.templatemethod.AthleteLoseWeightPlan;
import de.designpatterns.behavioural.templatemethod.LightLoseWeightPlan;
import de.designpatterns.behavioural.templatemethod.LoseWeightPlan;
import de.designpatterns.template.DesignPatternTestTemplate;
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
