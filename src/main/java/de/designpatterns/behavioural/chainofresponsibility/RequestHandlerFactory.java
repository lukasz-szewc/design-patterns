package de.designpatterns.behavioural.chainofresponsibility;

public class RequestHandlerFactory {

    public static RequestHandler createConfiguredRequestHandler() {
        return new EmergencyRequestHandler(new HugeSizeRequestHandler(new OrdinaryRequestHandler(null)));
    }

}
