/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.creational.prototype;

/**
 *
 */
public interface Prototype<T> extends Cloneable {

    T clone();

}
