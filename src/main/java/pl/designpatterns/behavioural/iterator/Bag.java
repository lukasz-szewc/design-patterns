package pl.designpatterns.behavioural.iterator;

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
