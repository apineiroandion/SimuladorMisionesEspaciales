package interfaz;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class NuevaMisionPanel extends JPanel {
    Font fontTitle = new Font("Arial", Font.BOLD, 20);
    public NuevaMisionPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;

        JLabel nuevaMision = new JLabel("Nueva Mision");
        nuevaMision.setFont(fontTitle);
        c.gridx = 0;
        c.gridy = 0;
        add(nuevaMision, c);
        //Nombre mision Y=1
        JLabel nombreMision = new JLabel("Nombre");
        nombreMision.setFont(fontTitle);
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
        fechaInicioMision.setFont(fontTitle);
        c.gridx = 0;
        c.gridy = 2;
        add(fechaInicioMision, c);

        JLabel LocalDateNowLabel = new JLabel(LocalDate.now().toString());
        LocalDateNowLabel.setFont(fontTitle);
        c.gridx = 1;
        c.gridy = 2;
        add(LocalDateNowLabel, c);

        //Objetivo Mision Y=3
        JLabel objetivoMisionLabel = new JLabel("Objetivo");
        objetivoMisionLabel.setFont(fontTitle);
        c.gridx = 0;
        c.gridy = 3;
        add(objetivoMisionLabel, c);

        JTextArea objetivoMisionText = new JTextArea();
        objetivoMisionText.setEditable(true);
        c.gridx = 1;
        c.gridy = 3;
        add(objetivoMisionText, c);

        // TODO : Funcionalidad ComboBox naves
        //Naves Y=4
        JLabel navesLabel = new JLabel("Nave para la Mision");
        navesLabel.setFont(fontTitle);
        c.gridx = 0;
        c.gridy = 4;
        add(navesLabel, c);
        //Combobox naves
        JComboBox navesComboBox = new JComboBox();
        c.gridx = 0;
        c.gridy = 5;
        add(navesComboBox, c);

        // TODO : COMBOBOX Y TABLA DE CREW
        //Label crew
        JLabel elegirMiembrosMision = new JLabel("Elegir Miembros");
        elegirMiembrosMision.setFont(fontTitle);
        c.gridx = 0;
        c.gridy = 6;
        add(elegirMiembrosMision, c);

        //Label elegidos
        JLabel miembrosElegidos = new JLabel("Miembros Elegidos");
        miembrosElegidos.setFont(fontTitle);
        c.gridx = 1;
        c.gridy = 6;
        add(miembrosElegidos, c);

        //ComboBox
        JComboBox miembrosComboBox = new JComboBox();
        c.gridx = 0;
        c.gridy = 7;
        add(miembrosComboBox, c);

        //Tabla miembros elegidos
        JTable miembrosTable = new JTable();
        miembrosTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        miembrosTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        c.gridx = 1;
        c.gridy = 7;
        add(miembrosTable, c);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(miembrosTable);
        add(scrollPane, c);

        setVisible(true);
    }
}
