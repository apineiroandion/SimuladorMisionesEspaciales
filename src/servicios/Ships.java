package servicios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ships {
    ArrayList<Ship> ships = new ArrayList<>();
    public Ships() {}

    public void serializeShipList(Ships ships) {
        try {
            FileOutputStream fos = new FileOutputStream("ships.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ships);
            oos.close();
            fos.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    public Ships deserializeShipList(Ships ships) {
        try {
            FileInputStream fis = new FileInputStream("ships.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ships = (Ships) ois.readObject();
            ois.close();
            fis.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return ships;
    }

    public ArrayList<Ship> getShips() {
        return ships;
    }

    public void setShips(ArrayList<Ship> ships) {
        this.ships = ships;
    }
}
