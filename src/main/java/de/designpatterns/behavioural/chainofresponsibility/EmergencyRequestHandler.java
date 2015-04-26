package de.designpatterns.behavioural.chainofresponsibility;


public class EmergencyRequestHandler implements RequestHandler {
    private final RequestHandler nextHandler;

    public EmergencyRequestHandler(RequestHandler nextHandlerInChain) {
        this.nextHandler = nextHandlerInChain;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.isEmergencyRequest()) {
            System.out.printf("I am %s instance, and I have just handled priority request: %s", getClass().getSimpleName(), request);
            System.out.println();
        } else {
            nextHandler.handleRequest(request);
        }

    }

}
