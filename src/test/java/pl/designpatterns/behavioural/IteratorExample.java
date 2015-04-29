/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.behavioural;

import pl.designpatterns.behavioural.iterator.Bag;
import pl.designpatterns.behavioural.iterator.SimpleIterator;
import pl.designpatterns.template.DesignPatternTestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 */
public class IteratorExample extends DesignPatternTestTemplate {

    public IteratorExample() {
        super("Iterator");
    }

    @Test(description = "tests basic iterator.")
    public void testIterator() {
        Bag<String> bag = new Bag<String>(1);
        boolean add = bag.add("foo");
        Assert.assertTrue(add);
        boolean add1 = bag.add("bar");
        Assert.assertTrue(add1 == false);

        SimpleIterator<String> iterator = bag.getIterator();

        while(iterator.hasNext()) {
            String element = iterator.next();
            Assert.assertEquals(element, "foo");
            System.out.println(element);
        }
    }
    @Test(description = "tests more compilcated iterator.")
    public void testIteratorNr2() {
        Bag<String> bag = new Bag<String>(14);
        boolean add = bag.add("foo");
        Assert.assertTrue(add);
        boolean add1 = bag.add("bar");
        Assert.assertTrue(add1);
        boolean add2 = bag.add("foobar");
        Assert.assertTrue(add2);

        SimpleIterator<String> iterator = bag.getIterator();

        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
