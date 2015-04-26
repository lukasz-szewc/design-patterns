/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.behavioural.memento;

/**
 *
 */
public interface DocumentOriginator {

    public DocumentMemento saveMemento();

    public void restoreState(DocumentMemento documentMemento);

}
