package de.designpatterns.structural;

import de.designpatterns.structual.decorator.BothSideNumberPrinter;
import de.designpatterns.structual.decorator.SimpleNumberPrinter;
import de.designpatterns.template.DesignPatternTestTemplate;
import org.testng.annotations.Test;

public class DecoratorExample extends DesignPatternTestTemplate {

    public DecoratorExample() {
        super("Decorator");
    }

    @Test(description = "Tests decorator object that is able to print number both ascending and descending")
    public void testDecorator() {
        SimpleNumberPrinter simpleNumberPrinter = new SimpleNumberPrinter();

        simpleNumberPrinter.printNumbers(12);

        BothSideNumberPrinter bothSideNumberPrinter = new BothSideNumberPrinter(simpleNumberPrinter);
        bothSideNumberPrinter.printNumbers(12);
        bothSideNumberPrinter.printNumbersDescending(12);
    }

}
