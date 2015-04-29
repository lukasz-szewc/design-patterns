/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.structual.bridge;

/**
 *
 */
public interface UserInterfaceButtonCreator {

    Button procudeAddObjectButton();

    Button procudeEditObjectButton();

    Button procudeDeleteObjectButton();
}
