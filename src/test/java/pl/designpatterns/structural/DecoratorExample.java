package pl.designpatterns.structural;

import pl.designpatterns.structual.decorator.BothSideNumberPrinter;
import pl.designpatterns.structual.decorator.SimpleNumberPrinter;
import pl.designpatterns.template.DesignPatternTestTemplate;
import org.testng.annotations.Test;

public class DecoratorExample extends DesignPatternTestTemplate {

    public DecoratorExample() {
        super("Decorator");
    }

    @Test(description = "Tests decorator object that is able to print number both ascending and descending order")
    public void testDecorator() {
        SimpleNumberPrinter simpleNumberPrinter = new SimpleNumberPrinter();

        simpleNumberPrinter.printNumbers(12);

        BothSideNumberPrinter bothSideNumberPrinter = new BothSideNumberPrinter(simpleNumberPrinter);
        bothSideNumberPrinter.printNumbers(12);
        bothSideNumberPrinter.printNumbersDescending(12);
    }

}
