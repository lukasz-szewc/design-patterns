/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.structual.bridge;

/**
 *
 */
public class FancyButtonCreator implements UserInterfaceButtonCreator {
    private final ActionProcessor actionProcessor;

    public FancyButtonCreator(ActionProcessor actionProcessor) {
        this.actionProcessor = actionProcessor;
    }


    @Override
    public Button procudeAddObjectButton() {
        return new FancyButton() {

            @Override
            public void processAction(Object processedObject) {
                actionProcessor.processAddAction(processedObject);
            }

            @Override
            public String getFancyDescription() {
                return "Fancy Description for first button";
            }
        };
    }

    @Override
    public Button procudeEditObjectButton() {
        return new FancyButton() {

            @Override
            public void processAction(Object processedObject) {
                actionProcessor.processEditAction(processedObject);
            }

            @Override
            public String getFancyDescription() {
                return "Fancy Description for second button";
            }
        };
    }

    @Override
    public Button procudeDeleteObjectButton() {
        return new FancyButton() {

            @Override
            public void processAction(Object processedObject) {
                actionProcessor.processRemoveAction(processedObject);
            }

            @Override
            public String getFancyDescription() {
                return "Fancy Description for third button";
            }
        };
    }

}
