package pl.designpatterns.behavioural.command;

public class DisplayWelcomePageCommand implements DisplayPageCommand {
    private final WebServer server;

    public DisplayWelcomePageCommand(WebServer webserver) {
        this.server = webserver;
    }

    @Override
    public void execute() {
        System.out.println("Displaying Welcome page");
        server.sendResponse("Sending welcome page");
    }

}
