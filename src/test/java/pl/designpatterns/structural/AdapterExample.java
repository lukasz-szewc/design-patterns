package pl.designpatterns.structural;

import pl.designpatterns.structual.adapter.NumberGeneratorAdapter;
import pl.designpatterns.template.DesignPatternTestTemplate;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdapterExample extends DesignPatternTestTemplate {

    public AdapterExample() {
        super("Adapter");
    }

    @Test(description= "New adapter example")
    public void testAdapter() {
        System.out.println("Testing adapter and asserting it works");
        NumberGeneratorAdapter numberGeneratorAdapter = new NumberGeneratorAdapter();
        for (int loopCouner = 0; loopCouner < 5000; loopCouner++) {
            Integer generateNumber = numberGeneratorAdapter.generateNumber();
            Assert.assertTrue(generateNumber != null);

            List<Integer> generateNumbersList = numberGeneratorAdapter.generateNumbersList(loopCouner);
            Assert.assertTrue(generateNumbersList != null);
            Assert.assertEquals(generateNumbersList.size(), loopCouner);
        }
    }

}
