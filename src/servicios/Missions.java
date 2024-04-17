package servicios;

import java.util.ArrayList;

public class Missions {
    ArrayList<Mission> missions = new ArrayList<>();
    public Missions() {}

    public ArrayList<Mission> getMissions() {
        return missions;
    }

    public void setMissions(ArrayList<Mission> missions) {
        this.missions = missions;
    }
}
