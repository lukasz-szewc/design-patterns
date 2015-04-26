/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.creational.prototype;

/**
 *
 */
public class Device implements Prototype<Device> {

    private String name;
    private String processorType;
    private double processorSpeed;
    private String displayType;
    private double displaySize;
    private int memorySize;
    private String serialNumber;

    public Device() {
        name = "Prototype Device";
        processorType = "Intel 2086x86";
        processorSpeed = 3666d;
        displayType = "LCD";
        displaySize = 12.4d;
        memorySize = 8000;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 71 * hash + (this.processorType != null ? this.processorType.hashCode() : 0);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.processorSpeed) ^ (Double.doubleToLongBits(this.processorSpeed) >>> 32));
        hash = 71 * hash + (this.displayType != null ? this.displayType.hashCode() : 0);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.displaySize) ^ (Double.doubleToLongBits(this.displaySize) >>> 32));
        hash = 71 * hash + this.memorySize;
        hash = 71 * hash + (this.serialNumber != null ? this.serialNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Device other = (Device) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.processorType == null) ? (other.processorType != null) : !this.processorType.equals(other.processorType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.processorSpeed) != Double.doubleToLongBits(other.processorSpeed)) {
            return false;
        }
        if ((this.displayType == null) ? (other.displayType != null) : !this.displayType.equals(other.displayType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.displaySize) != Double.doubleToLongBits(other.displaySize)) {
            return false;
        }
        if (this.memorySize != other.memorySize) {
            return false;
        }
        if ((this.serialNumber == null) ? (other.serialNumber != null) : !this.serialNumber.equals(other.serialNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Device{" + "name=" + name + ", processorType=" + processorType + ", processorSpeed=" + processorSpeed + ", displayType=" + displayType + ", displaySize=" + displaySize + ", memorySize=" + memorySize + ", serialNumber=" + serialNumber + '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public void setProcessorSpeed(double processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    @Override
    public Device clone() {
        try {
            return (Device) super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new IllegalStateException(ex);
        }
    }
}
