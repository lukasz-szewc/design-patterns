package pl.designpatterns.behavioural.iterator;

public interface SimpleAggregate<T> {

    SimpleIterator<T> getIterator();

}
