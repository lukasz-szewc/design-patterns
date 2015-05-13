package pl.designpatterns.structual.bridge;

public class ConcreteButtonCreator implements UserInterfaceButtonCreator {
    private final ActionProcessor actionProcessor;

    public ConcreteButtonCreator(ActionProcessor actionProcessor) {
        this.actionProcessor = actionProcessor;
    }

    @Override
    public Button produceAddObjectButton() {
        return new Button() {

            @Override
            public void processAction(Object processedObject) {
                actionProcessor.processAddAction(processedObject);
            }
        };
    }

    @Override
    public Button produceEditObjectButton() {
        return new Button() {

            @Override
            public void processAction(Object processedObject) {
                actionProcessor.processEditAction(processedObject);
            }
        };
    }

    @Override
    public Button produceDeleteObjectButton() {
        return new Button() {

            @Override
            public void processAction(Object processedObject) {
                actionProcessor.processRemoveAction(processedObject);
            }
        };
    }

}
