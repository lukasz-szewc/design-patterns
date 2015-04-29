package pl.designpatterns.behavioural;

import pl.designpatterns.behavioural.command.Controller;
import pl.designpatterns.behavioural.command.DisplayLoginPageCommand;
import pl.designpatterns.behavioural.command.DisplayWelcomePageCommand;
import pl.designpatterns.behavioural.command.WebServer;
import pl.designpatterns.template.DesignPatternTestTemplate;
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
