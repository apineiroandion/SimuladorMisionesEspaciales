package interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static servicios.Main.ventana;

public class Menu extends JPanel {
    Dimension buttonSize = new Dimension(150, 50);
    Font buttonFont = new Font("Arial", Font.BOLD, 15);
    Color backGroundColor = new Color(42, 113, 255);
    Color hoverButtonColor = new Color(147, 183, 255);
    public Menu(JPanel contenedor) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        setBackground(backGroundColor);


        JButton newMission = new JButton("New Mission");
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(newMission, gbc);

        JButton newCrewMember = new JButton("New CrewMember");
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

        setVisible(true);

        newMission.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 ventana.mostrarVentanaNuevaMision();
            }
        });

        newCrewMember.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.mostrarVentanaNuevoCrewMember();
            }
        });

        newShip.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.mostrarVentanaNuevaNave();
            }
        });









        /**
         * BUTTON STYLES
         */
        //NEW MISSION BUTTON
        newMission.setPreferredSize(buttonSize);
        newMission.setForeground(Color.WHITE);
        newMission.setFont(buttonFont);
        newMission.setBackground(backGroundColor);
        newMission.setBorder(null);
        newMission.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                newMission.setBackground(hoverButtonColor); // Color de hover personalizado
            }

            @Override
            public void mouseExited(MouseEvent e) {
                newMission.setBackground(UIManager.getColor(backGroundColor)); // Restaurar el color original cuando el mouse sale del botón
            }
        });
        //NEW CREW MEMBER BUTTON
        newCrewMember.setPreferredSize(buttonSize);
        newCrewMember.setForeground(Color.WHITE);
        newCrewMember.setFont(buttonFont);
        newCrewMember.setBackground(backGroundColor);
        newCrewMember.setBorder(null);
        newCrewMember.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                newCrewMember.setBackground(hoverButtonColor); // Color de hover personalizado
            }

            @Override
            public void mouseExited(MouseEvent e) {
                newCrewMember.setBackground(UIManager.getColor(backGroundColor)); // Restaurar el color original cuando el mouse sale del botón
            }
        });
        //NEW SHIP BUTTON
        newShip.setPreferredSize(buttonSize);
        newShip.setForeground(Color.WHITE);
        newShip.setFont(buttonFont);
        newShip.setBackground(backGroundColor);
        newShip.setBorder(null);
        newShip.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                newShip.setBackground(hoverButtonColor); // Color de hover personalizado
            }

            @Override
            public void mouseExited(MouseEvent e) {
                newShip.setBackground(UIManager.getColor(backGroundColor)); // Restaurar el color original cuando el mouse sale del botón
            }
        });
        //NEW LIST MISSION
        listMissions.setPreferredSize(buttonSize);
        listMissions.setForeground(Color.WHITE);
        listMissions.setFont(buttonFont);
        listMissions.setBackground(backGroundColor);
        listMissions.setBorder(null);
        listMissions.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                listMissions.setBackground(hoverButtonColor); // Color de hover personalizado
            }

            @Override
            public void mouseExited(MouseEvent e) {
                listMissions.setBackground(UIManager.getColor(backGroundColor)); // Restaurar el color original cuando el mouse sale del botón
            }
        });
        //LIST CREW MEMBER BUTTON
        listCrewMember.setPreferredSize(buttonSize);
        listCrewMember.setForeground(Color.WHITE);
        listCrewMember.setFont(buttonFont);
        listCrewMember.setBackground(backGroundColor);
        listCrewMember.setBorder(null);
        listCrewMember.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                listCrewMember.setBackground(hoverButtonColor); // Color de hover personalizado
            }

            @Override
            public void mouseExited(MouseEvent e) {
                listCrewMember.setBackground(UIManager.getColor(backGroundColor)); // Restaurar el color original cuando el mouse sale del botón
            }
        });
        //LIST SHIPS
        listShip.setPreferredSize(buttonSize);
        listShip.setForeground(Color.WHITE);
        listShip.setFont(buttonFont);
        listShip.setBackground(backGroundColor);
        listShip.setBorder(null);
        listShip.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                listShip.setBackground(hoverButtonColor); // Color de hover personalizado
            }

            @Override
            public void mouseExited(MouseEvent e) {
                listShip.setBackground(UIManager.getColor(backGroundColor)); // Restaurar el color original cuando el mouse sale del botón
            }
        });
    }
}
