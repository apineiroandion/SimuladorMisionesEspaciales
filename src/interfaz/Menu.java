package interfaz;

import javax.swing.*;
import java.awt.*;

public class Menu extends JPanel {
    public Menu() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        JButton newMission = new JButton("New Mission");
        newMission.setSize(200, 50);
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(newMission, gbc);
        JButton newCrewMember = new JButton("New CrewMember");
        newMission.setSize(200, 50);
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(newCrewMember, gbc);
        JButton newShip = new JButton("New Ship");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(newShip, gbc);
        JButton listMissions = new JButton("List Missions");
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(listMissions, gbc);
        JButton listCrewMember = new JButton("List CrewMember");
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(listCrewMember, gbc);
        JButton listShip = new JButton("List Ship");
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(listShip, gbc);
        JButton listCrewMembers = new JButton("List CrewMembers");

        setVisible(true);
    }
}
