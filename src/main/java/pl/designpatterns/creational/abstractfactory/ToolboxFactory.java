/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.creational.abstractfactory;


public interface ToolboxFactory {

    Bolt createBolt();

    Scale createScale();

    Wrench createWrench();

}
