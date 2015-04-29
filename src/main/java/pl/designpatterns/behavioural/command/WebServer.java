package pl.designpatterns.behavioural.command;

//receiver
public class WebServer {

    public void receiveRequest(Object request) {
        System.out.println("[Web Server (Receiver) ] I have received Request");
    }

    public void sendResponse(Object response) {
        System.out.println("[Web Server (Receiver) ] I have sent Response: " + response);
    }

}
