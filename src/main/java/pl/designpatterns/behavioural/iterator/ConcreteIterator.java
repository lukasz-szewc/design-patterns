package pl.designpatterns.behavioural.iterator;

public class ConcreteIterator<T> implements SimpleIterator<T> {
    private final Object[] array;
    private int position;
    private int initialSize;


    public ConcreteIterator(Object[] arrayOfObjects, int initialArraySize) {
        this.position = 0;
        this.array = arrayOfObjects;
        this.initialSize = initialArraySize;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T next() {
        return (T) array[position++];
    }

    @Override
    public boolean hasNext() {
        return position != initialSize;
    }

}
