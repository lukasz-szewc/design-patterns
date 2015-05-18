package pl.designpatterns.structual.flyweight;

public class Submarine implements ShipFlyweight {
    private final int size;

    public Submarine(int size) {
        this.size = size;
    }

    @Override
    public void placeShip(ShipMap shipMap) {
        shipMap.addShipToMap(this);
    }

    public int getSize() {
        return size;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.size;
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
        final Submarine other = (Submarine) obj;
        if (this.size != other.size) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Submarine{" + "size=" + size + '}';
    }

}
