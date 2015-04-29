package pl.designpatterns.behavioural.chainofresponsibility;


public class HugeSizeRequestHandler implements RequestHandler {

    private static final long HUGE_SIZE_VALUE = 1000l;
    private final RequestHandler nextHandler;

    public HugeSizeRequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {

        if (request.getSize() >= HUGE_SIZE_VALUE) {
            System.out.printf("I am %s instance, and I have just handled huge size request: %s", getClass().getSimpleName(), request);
            System.out.println();
        } else {
            nextHandler.handleRequest(request);
        }
    }

}
