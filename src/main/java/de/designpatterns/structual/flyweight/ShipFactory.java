/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.structual.flyweight;

import java.util.HashMap;

/**
 *
 */
public class ShipFactory {

    HashMap<ShipId, ShipFlyweight> shipMap = new HashMap<ShipId, ShipFlyweight>();

    public ShipFlyweight getShip(Integer size, boolean warShip) {

        ShipId shipId = new ShipId(size, warShip);
        if (shipMap.containsKey(shipId)) {
            return shipMap.get(shipId);
        } else {
            ShipFlyweight flyweight;
            if (warShip) {
                flyweight = new Submarine(size.intValue());
            } else {
                flyweight = new CargoShip(size.intValue());
            }
            shipMap.put(new ShipId(size, warShip), flyweight);
            return flyweight;
        }
    }

    private static class ShipId{
        private final int size;
        private final boolean warship;
        public ShipId(int size, boolean warship) {
            this.size = size;
            this.warship = warship;
        }

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 29 * hash + this.size;
            hash = 29 * hash + (this.warship ? 1 : 0);
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
            final ShipId other = (ShipId) obj;
            if (this.size != other.size) {
                return false;
            }
            if (this.warship != other.warship) {
                return false;
            }
            return true;
        }

    }
}
