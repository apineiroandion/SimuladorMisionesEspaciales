package servicios;

import java.util.ArrayList;

public class Ships {
    ArrayList<Ship> ships = new ArrayList<>();
    public Ships() {}

    public ArrayList<Ship> getShips() {
        return ships;
    }

    public void setShips(ArrayList<Ship> ships) {
        this.ships = ships;
    }
}
