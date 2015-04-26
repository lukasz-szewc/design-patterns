package de.designpatterns.creational;

import de.designpatterns.creational.factorymethod.MobilePhoneFactory;
import de.designpatterns.creational.factorymethod.PhoneFactory;
import de.designpatterns.creational.factorymethod.Product;
import de.designpatterns.template.DesignPatternTestTemplate;
import org.testng.annotations.Test;

/**
 *
 */
public class FactoryMethodExample extends DesignPatternTestTemplate {

    public FactoryMethodExample() {
        super("Factory Method");
    }

    @Test(description= "Tests simple creation of 2 different objects.")
    public void testPhoneCreation() {

        PhoneFactory phoneFactory = new PhoneFactory();
        Product createdPhone = phoneFactory.createPhone();
        System.out.println(createdPhone.presentYourself());

        PhoneFactory mobilePhoneFactory = new MobilePhoneFactory();
        Product phoneFromOtherFactory = mobilePhoneFactory.createPhone();
        System.out.println(phoneFromOtherFactory.presentYourself());

    }

}
