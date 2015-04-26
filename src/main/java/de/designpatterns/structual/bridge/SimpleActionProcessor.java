/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.structual.bridge;

/**
 *
 */
public class SimpleActionProcessor implements ActionProcessor {

    @Override
    public void processAddAction(Object processedObject) {
        System.out.printf("I am processing very simple ADD action on object: %s ", processedObject.toString());
        System.out.println();
    }

    @Override
    public void processEditAction(Object processedObject) {
        System.out.printf("I am processing very simple EDIT action on object: %s ", processedObject.toString());
        System.out.println();
    }

    @Override
    public void processRemoveAction(Object processedObject) {
        System.out.printf("I am processing very simple REMOVE action on object: %s ", processedObject.toString());
        System.out.println();
    }

}
