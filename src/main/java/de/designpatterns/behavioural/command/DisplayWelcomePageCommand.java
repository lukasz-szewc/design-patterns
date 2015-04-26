package de.designpatterns.behavioural.command;

public class DisplayWelcomePageCommand implements DisplayPageCommand {
    private final WebServer server;

    public DisplayWelcomePageCommand(WebServer webserver) {
        this.server = webserver;
    }

    @Override
    public void execute() {
        System.out.println("Displaying Welocme page");
        server.sendResponse("Sending welcome page");
    }

}
