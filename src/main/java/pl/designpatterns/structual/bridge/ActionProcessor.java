/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.structual.bridge;

/**
 *
 */
public interface ActionProcessor {

    public void processAddAction(Object processedObject);

    public void processEditAction(Object processedObject);

    public void processRemoveAction(Object processedObject);

}
