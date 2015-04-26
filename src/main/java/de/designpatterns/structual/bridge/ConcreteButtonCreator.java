/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.structual.bridge;

/**
 *
 */
public class ConcreteButtonCreator implements UserInterfaceButtonCreator {
    private final ActionProcessor actionProcessor;

    public ConcreteButtonCreator(ActionProcessor actionProcessor) {
        this.actionProcessor = actionProcessor;
    }


    @Override
    public Button procudeAddObjectButton() {
        return new Button() {

            @Override
            public void processAction(Object processedObject) {
                actionProcessor.processAddAction(processedObject);
            }
        };
    }

    @Override
    public Button procudeEditObjectButton() {
        return new Button() {

            @Override
            public void processAction(Object processedObject) {
                actionProcessor.processEditAction(processedObject);
            }
        };
    }

    @Override
    public Button procudeDeleteObjectButton() {
        return new Button() {

            @Override
            public void processAction(Object processedObject) {
                actionProcessor.processRemoveAction(processedObject);
            }
        };
    }

}
