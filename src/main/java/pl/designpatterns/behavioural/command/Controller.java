package pl.designpatterns.behavioural.command;

//invoker
public class Controller {
    private DisplayPageCommand command;

    public void setCommand(DisplayPageCommand command) {
        this.command = command;
    }

    public void sendPageToBrowser() {
        command.execute();
    }
}
