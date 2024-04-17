package servicios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Crew {
    ArrayList<Crew> crew = new ArrayList<>();
    public void serializeCrewMemberList(Crew crew) {
        try {
            FileOutputStream fos = new FileOutputStream("crew.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(crew);
            oos.close();
            fos.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    public Crew deserializeCrewMemberList(Crew crew) {
        try {
            FileInputStream fis = new FileInputStream("crew.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            crew = (Crew) ois.readObject();
            ois.close();
            fis.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return crew;
    }

    public Crew() {
    }

    public ArrayList<Crew> getCrew() {
        return crew;
    }

    public void setCrew(ArrayList<Crew> crew) {
        this.crew = crew;
    }
}
