/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.behavioural.iterator;

/**
 *
 */
public interface SimpleAggregate<T> {

    SimpleIterator<T> getIterator();

}
