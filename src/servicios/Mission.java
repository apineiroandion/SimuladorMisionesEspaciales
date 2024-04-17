package servicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Mission {
    private String name;
    private LocalDate creationDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private String objectiveMission;
    private Ship ship;
    private Crew crew;
    private HashMap<Integer, Coordinate> Position;

    public Mission(String name, LocalDate creationDate, String objectiveMission) {
        this.name = name;
        this.creationDate = creationDate;
        this.objectiveMission = objectiveMission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getObjectiveMission() {
        return objectiveMission;
    }

    public void setObjectiveMission(String objectiveMission) {
        this.objectiveMission = objectiveMission;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public Crew getCrew() {
        return crew;
    }

    public void setCrew(Crew crew) {
        this.crew = crew;
    }

    public HashMap<Integer, Coordinate> getPosition() {
        return Position;
    }

    public void setPosition(HashMap<Integer, Coordinate> position) {
        Position = position;
    }
}
