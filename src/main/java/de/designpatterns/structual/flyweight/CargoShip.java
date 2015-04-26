/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.structual.flyweight;

/**
 *
 */
public class CargoShip implements ShipFlyweight {
    private final int size;

    public CargoShip(int size) {
        this.size = size;
    }

    @Override
    public void placeShip(ShipMap shipMap) {
        shipMap.addShipToMap(this);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.size;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CargoShip other = (CargoShip) obj;
        if (this.size != other.size) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CargoShip{" + "size=" + size + '}';
    }

}
