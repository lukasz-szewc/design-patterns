package pl.designpatterns.structual.facade;

public class Clutch {

    void connectEngineToShaft(Engine engine) {
        System.out.println("[CLUTCH] connecting engine to shaft.");
        engine.clutchConnected();
    }

    void disconnectShaft() {
        System.out.println("[CLUTCH] disconnecting clutch");
    }

}
