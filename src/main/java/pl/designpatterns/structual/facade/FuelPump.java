package pl.designpatterns.structual.facade;

public class FuelPump {


    void provideFuel(Engine engine, int i) {
        System.out.println("[FUEL PUMP] Providing fuel...");
        engine.pumpFuel(i);
    }

    void stopPumpingFuel() {
        System.out.println("[FUEL PUMP] Stop pumping fuel...");
    }
}
