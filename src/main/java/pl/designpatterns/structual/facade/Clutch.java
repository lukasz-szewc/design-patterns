/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.designpatterns.structual.facade;

/**
 *
 */
public class Clutch {

    void connectEngineToShaft(Engine engine) {
        System.out.println("[CLUTCH] connecting engine to shaft.");
    }

    void disconnectShaft() {
        System.out.println("[CLUTCH] disconnecting clutch");
    }

}
