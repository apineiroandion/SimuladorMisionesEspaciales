package servicios;

import java.util.ArrayList;

public class Crew {
    ArrayList<Crew> crew = new ArrayList<>();

    public Crew() {
    }

    public ArrayList<Crew> getCrew() {
        return crew;
    }

    public void setCrew(ArrayList<Crew> crew) {
        this.crew = crew;
    }
}
