/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.creational.factorymethod;

/**
 *
 */
public class PhoneFactory {

    public Product createPhone() {
        return new Phone();
    }

}
