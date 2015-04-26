package de.designpatterns.creational;

import de.designpatterns.creational.prototype.Device;
import de.designpatterns.template.DesignPatternTestTemplate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PrototypeExample extends DesignPatternTestTemplate {

    public PrototypeExample() {
        super("Prototype");
    }

    public static final int AMOUNT_SIZE = 1000;

    @Test(description= "Tests simple 1000 prototypes and adds serial number to all of them")
    public void testDeviceCreation() {

        LinkedHashSet<Device> clonedDeviceSet = new LinkedHashSet<Device>();
        LinkedHashSet<Device> clonedAndChangedDeviceSet = new LinkedHashSet<Device>();
        ArrayList<Device> clonedDeviceList = new ArrayList<Device>();

        Device device = new Device();
        for (int i = 0; i < AMOUNT_SIZE; i++) {
            Device clonedDevice = device.clone();
            clonedDeviceSet.add(clonedDevice);
            clonedDeviceList.add(clonedDevice);

            Assert.assertEquals(device, clonedDevice);
            Assert.assertTrue(clonedDevice != device);

            Device secondClone = device.clone();
            secondClone.setSerialNumber("INS-12033-123-" + i);
            Assert.assertTrue(device.equals(secondClone) == false);

            clonedAndChangedDeviceSet.add(secondClone);

        }

        Assert.assertEquals(clonedDeviceSet.size(), 1);
        Assert.assertEquals(clonedDeviceList.size(), AMOUNT_SIZE);
        Assert.assertEquals(clonedAndChangedDeviceSet.size(), AMOUNT_SIZE);
    }

}
