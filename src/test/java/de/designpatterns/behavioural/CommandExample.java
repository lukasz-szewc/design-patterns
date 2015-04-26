package de.designpatterns.behavioural;

import de.designpatterns.behavioural.command.Controller;
import de.designpatterns.behavioural.command.DisplayLoginPageCommand;
import de.designpatterns.behavioural.command.DisplayWelcomePageCommand;
import de.designpatterns.behavioural.command.WebServer;
import de.designpatterns.template.DesignPatternTestTemplate;
import org.testng.annotations.Test;

/**
 *
 */
public class CommandExample extends DesignPatternTestTemplate {

    public CommandExample() {
        super("Command");
    }
    
    @Test
    public void testCommand() {
        
        // Receiver
        WebServer webServer = new WebServer();
        
        // invoker
        Controller controller = new Controller();

        // setting new command into invoker - command utilizes receiver
        controller.setCommand(new DisplayLoginPageCommand(webServer));
        
        //executing controller
        controller.sendPageToBrowser();

        // another command
        controller.setCommand(new DisplayWelcomePageCommand(webServer));
        
        // executing controller (invoker)
        controller.sendPageToBrowser();
        
    }
    
}
