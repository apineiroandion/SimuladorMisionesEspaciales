package servicios;

import interfaz.Ventana;

public class Main {

    public static Ventana ventana;
    public static Missions missions = new Missions();
    public static Ships ships = new Ships();
    public static Crew crew = new Crew();

    public static void main(String[] args) {

        crew = crew.deserializeCrewMemberList(crew);
        ships = ships.deserializeShipList(ships);
        missions = missions.deserializeMissions(missions);

        ventana = new Ventana();
        ventana.setVisible(true);
    }
}
