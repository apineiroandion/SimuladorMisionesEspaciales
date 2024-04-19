package interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static servicios.Main.ventana;

public class Menu extends JPanel {
    Dimension buttonSize = new Dimension(150, 50);
    public Menu(JPanel contenedor) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JButton newMission = new JButton("New Mission");
        newMission.setPreferredSize(buttonSize);
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(newMission, gbc);

        JButton newCrewMember = new JButton("New CrewMember");
        newCrewMember.setPreferredSize(buttonSize);
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(newCrewMember, gbc);

        JButton newShip = new JButton("New Ship");
        newShip.setPreferredSize(buttonSize);
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(newShip, gbc);

        JButton listMissions = new JButton("List Missions");
        listMissions.setPreferredSize(buttonSize);
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(listMissions, gbc);

        JButton listCrewMember = new JButton("List CrewMember");
        listCrewMember.setPreferredSize(buttonSize);
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(listCrewMember, gbc);

        JButton listShip = new JButton("List Ship");
        listShip.setPreferredSize(buttonSize);
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(listShip, gbc);

        setVisible(true);

        newMission.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 ventana.mostrarVentanaNuevaMision();
            }
        });
    }
}
