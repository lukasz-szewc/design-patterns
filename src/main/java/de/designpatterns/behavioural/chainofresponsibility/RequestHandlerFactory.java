/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.behavioural.chainofresponsibility;

/**
 *
 */
public class RequestHandlerFactory {

    public static RequestHandler createConfiguredRequestHandler() {
        return new EmergencyRequestHandler(new HugeSizeRequestHandler(new OrdinaryRequestHandler(null)));
    }

}
