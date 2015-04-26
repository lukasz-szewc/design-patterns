/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.creational;

import de.designpatterns.creational.singleton.Singleton;
import de.designpatterns.template.DesignPatternTestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SingletonExample extends DesignPatternTestTemplate {

    public SingletonExample() {
        super("Singleton");
    }

    @Test(description= "Tests how singleton works.")
    public void testSingletonCreation() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        Assert.assertNotNull(instance1);
        Assert.assertNotNull(instance2);

        Assert.assertEquals(instance1, instance2);
        Assert.assertEquals(instance1.getContent(), instance2.getContent());

    }

}
