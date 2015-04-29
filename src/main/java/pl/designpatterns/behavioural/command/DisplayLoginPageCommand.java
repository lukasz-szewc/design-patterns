
package pl.designpatterns.behavioural.command;

public class DisplayLoginPageCommand implements DisplayPageCommand {
    private final WebServer server;

    public DisplayLoginPageCommand(WebServer server) {
        this.server =  server;
    }

    @Override
    public void execute() {
        System.out.println("Displaying login page...");
        server.sendResponse("Login required - sending login page");
    }

}
