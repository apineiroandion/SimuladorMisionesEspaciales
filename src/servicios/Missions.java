package servicios;

import java.io.*;
import java.util.ArrayList;

public class Missions {
    ArrayList<Mission> missions = new ArrayList<>();
    public Missions() {}

    public void serializeMissions (Missions missionList){
        try {
            FileOutputStream fos = new FileOutputStream("Missions.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(missionList);
            oos.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public Missions deserializeMissions(Missions missionList){
        try {
            FileInputStream fis = new FileInputStream("Missions.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            missionList = (Missions) ois.readObject();
            ois.close();
            fis.close();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return missionList;
    }

    public ArrayList<Mission> getMissions() {
        return missions;
    }

    public void setMissions(ArrayList<Mission> missions) {
        this.missions = missions;
    }

}
