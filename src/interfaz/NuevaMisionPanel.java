package interfaz;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.time.LocalDate;

public class NuevaMisionPanel extends JPanel {
    Border border = BorderFactory.createLineBorder(Color.BLACK);
    public NuevaMisionPanel() {
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
        JComboBox navesComboBox = new JComboBox();
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
        JComboBox miembrosComboBox = new JComboBox();
        c.gridx = 0;
        c.gridy = 6;
        add(miembrosComboBox, c);

        //Tabla miembros elegidos
        JTable miembrosTable = new JTable();
        miembrosTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        miembrosTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        c.gridx = 1;
        c.gridy = 6;
        add(miembrosTable, c);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(miembrosTable);
        add(scrollPane, c);

        setVisible(true);

        c.gridx = 0;
        c.gridy = 7;
        add(Box.createVerticalStrut(20), c);

        JButton newMission = new JButton("Nueva Mission");
        c.gridx = 0;
        c.gridy = 8;
        c.gridwidth = 2;
        add(newMission, c);


        //TODO : FUNCIONALIDAD COMBO BOX NAVES
        //TODO : FUNCIONALIDAD COMBO BOX TRIPULACION
        //TODO : FUNCIONALIDAD TABLA
        //TODO : FUNCIONALIDAD BOTON

    }
}
