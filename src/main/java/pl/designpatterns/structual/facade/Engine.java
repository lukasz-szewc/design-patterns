package pl.designpatterns.structual.facade;

public class Engine {
    private int shutdownRequest;

    void provideVoltage() {
        System.out.println("[ENGINE] Providing voltage to engine");
    }

    void provideAccessCode() {
        System.out.println("[ENGINE] Providing access code");
    }

    void increaseMovement() {
        System.out.println("[ENGINE] Increasing movement...");
    }

    void shutDown() {
        System.out.println("[ENGINE] Shutting down...");
    }

    boolean isMoving() {
        if (shutdownRequest > 2) {
            return false;
        } else {
            System.out.println("[ENGINE] Still rotating ...");
            return true;
        }
    }

    void pumpFuel(int i) {
        System.out.println("[ENGINE] Just received " + i + " liters of fuel from fuel pump");
    }

    void decreaseSpeed() {
        shutdownRequest++;
    }

    void clutchConnected() {
        System.out.println("[ENGINE] Clutch has been connected...");
    }
}
