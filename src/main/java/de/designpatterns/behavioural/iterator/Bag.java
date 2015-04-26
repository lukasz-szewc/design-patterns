/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.behavioural.iterator;

/**
 *
 * @author Lukasz
 */
public class Bag<T> implements SimpleAggregate<T> {

    private Object[] arrayOfObjects;
    private int initialArraySize;

    public Bag(int size) {
        initialArraySize = 0;
        arrayOfObjects = new Object[size];
    }

    @Override
    public SimpleIterator<T> getIterator() {
        return new ConcreteIterator<T>(arrayOfObjects, initialArraySize);
    }

    public boolean add(T object) {
        if (arrayOfObjects.length == initialArraySize) {
            return false;
        }

        arrayOfObjects[initialArraySize++] = object;
        return true;
    }

}
