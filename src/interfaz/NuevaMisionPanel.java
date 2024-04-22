package interfaz;

import servicios.CrewMember;
import servicios.Mission;
import servicios.Ship;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Vector;

import static servicios.Main.*;

public class NuevaMisionPanel extends JPanel {
    Border border = BorderFactory.createLineBorder(Color.BLACK);
    Vector<String> data;
    Vector<String> dataTripulante;
    DefaultTableModel model;
    JTable miembrosTable;
    ArrayList<CrewMember> selectedMembers = new ArrayList<>();
    public NuevaMisionPanel() {
        data = getData();
        dataTripulante = getDataTripulante();
        model = new DefaultTableModel();


        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;

        JLabel nuevaMision = new JLabel("Nueva Mision");
        c.gridx = 0;
        c.gridy = 0;
        add(nuevaMision, c);
        //Nombre mision Y=1
        JLabel nombreMision = new JLabel("Nombre");

        c.gridx = 0;
        c.gridy = 1;
        add(nombreMision, c);

        JTextField nombreMisionText = new JTextField();
        nombreMisionText.setColumns(15);
        c.gridx = 1;
        c.gridy = 1;
        add(nombreMisionText, c);

        //Fecha inicio mision Y=2
        JLabel fechaInicioMision = new JLabel("Fecha de Inicio");
        c.gridx = 0;
        c.gridy = 2;
        add(fechaInicioMision, c);

        JLabel LocalDateNowLabel = new JLabel(LocalDate.now().toString());
        c.gridx = 1;
        c.gridy = 2;
        add(LocalDateNowLabel, c);

        //Objetivo Mision Y=3
        JLabel objetivoMisionLabel = new JLabel("Objetivo");
        c.gridx = 0;
        c.gridy = 3;
        add(objetivoMisionLabel, c);

        JTextArea objetivoMisionText = new JTextArea(5,15);
        objetivoMisionText.setEditable(true);
        objetivoMisionText.setBorder(border);
        c.gridx = 1;
        c.gridy = 3;
        add(objetivoMisionText, c);

        //Naves Y=4
        JLabel navesLabel = new JLabel("Nave para la Mision");
        c.gridx = 0;
        c.gridy = 4;
        add(navesLabel, c);
        //Combobox naves
        JComboBox navesComboBox = new JComboBox(data);
        c.gridx = 1;
        c.gridy = 4;
        add(navesComboBox, c);

        //Label crew
        JLabel elegirMiembrosMision = new JLabel("Elegir Miembros");
        c.gridx = 0;
        c.gridy = 5;
        add(elegirMiembrosMision, c);

        //Label elegidos
        JLabel miembrosElegidos = new JLabel("Miembros Elegidos");
        c.gridx = 1;
        c.gridy = 5;
        add(miembrosElegidos, c);

        //ComboBox
        JComboBox miembrosComboBox = new JComboBox(dataTripulante);
        c.gridx = 0;
        c.gridy = 6;
        add(miembrosComboBox, c);

        //Tabla miembros elegidos
        miembrosTable = new JTable(model);
        miembrosTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        c.gridx = 1;
        c.gridy = 6;
        add(miembrosTable, c);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(miembrosTable);
        add(scrollPane, c);

        setVisible(true);

        JButton addT = new JButton("Add");
        c.gridx = 0;
        c.gridy = 7;
        add(addT, c);

        c.gridx = 0;
        c.gridy = 8;
        add(Box.createVerticalStrut(20), c);

        JButton newMission = new JButton("Nueva Mission");
        c.gridx = 0;
        c.gridy = 9;
        c.gridwidth = 2;
        add(newMission, c);

        addT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = addSelectedMember(miembrosComboBox.getSelectedItem().toString());
                model = getDataTable(model, id);
                selectedMembers.add(crew.getCrew().get(id));
                miembrosTable.repaint();
                System.out.println("Nuevo Miembro");
                System.out.println(selectedMembers.size());
            }
        });
        //TODO : FUNCIONALIDAD BOTON
        newMission.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                missions.getMissions().add(new Mission(nombreMision.getText(), LocalDate.now(), objetivoMisionText.getText(),
                        getShip(navesComboBox.getName()),selectedMembers, LocalDate.now()));
                JOptionPane.showMessageDialog(null, "Nueva Mision");
            }
        });

    }
    public Vector<String> getData() {
        Vector<String> data = new Vector<>();
        for (int i = 0; i < ships.getShips().size(); i++) {
            data.add(ships.getShips().get(i).getShipName());
        }
        return data;
    }
    public Vector<String> getDataTripulante() {
        Vector<String> dataTripulante = new Vector<>();
        for (int i = 0; i < crew.getCrew().size(); i++) {
            dataTripulante.add(crew.getCrew().get(i).getName() + " " + crew.getCrew().get(i).getSurname());
        }
        return dataTripulante;
    }
    public Integer addSelectedMember(String nombreMiembro) {
        int index = 0;
        int comprobar = 0;
        for (int i = 0; i < crew.getCrew().size(); i++) {
            String nombre = crew.getCrew().get(i).getName()+" "+crew.getCrew().get(i).getSurname();
            if (nombreMiembro.equals(nombre)){
                index = i;
                comprobar ++;
            }
        }
        if (comprobar != 0){
            return index;
        }
        return null;
    }
    public DefaultTableModel getDataTable(DefaultTableModel model, int id) {
        model.addRow(new String[]{crew.getCrew().get(id).getName()});
        return model;
    }

    public Ship getShip(String nombreNave) {
        for (int i = 0; i < ships.getShips().size(); i++) {
            if (ships.getShips().get(i).getShipName().equals(nombreNave)){
                return ships.getShips().get(i);
            }
        }
        return null;
    }
}
