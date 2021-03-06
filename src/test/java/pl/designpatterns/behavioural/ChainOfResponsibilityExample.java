package pl.designpatterns.behavioural;

import pl.designpatterns.behavioural.chainofresponsibility.Request;
import pl.designpatterns.behavioural.chainofresponsibility.RequestHandler;
import pl.designpatterns.behavioural.chainofresponsibility.RequestHandlerFactory;
import pl.designpatterns.template.DesignPatternTestTemplate;
import org.testng.annotations.Test;

public class ChainOfResponsibilityExample extends DesignPatternTestTemplate {

    public ChainOfResponsibilityExample() {
        super("Chain Of Responsibility");
    }

    @Test(description = "Tests basic RequestHandler chain.")
    public void testChainOfResponsibility() {
        Request emergencyRequest = new Request(true, 123l, "Content of emergency request");
        Request hugeSizeRequest = new Request(false, 98123l, "Content of big request");
        Request normalRequest = new Request(false, 123l, "Content of normal request");

        RequestHandler requestHandler = RequestHandlerFactory.createConfiguredRequestHandler();

        requestHandler.handleRequest(emergencyRequest);
        requestHandler.handleRequest(hugeSizeRequest);
        requestHandler.handleRequest(normalRequest);

    }
}
