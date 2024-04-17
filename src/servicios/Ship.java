package servicios;

public class Ship {
    private int id;
    private String shipName;
    private String shipType;

    public Ship(int id, String shipName, String shipType) {
        this.id = id;
        this.shipName = shipName;
        this.shipType = shipType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }
}
