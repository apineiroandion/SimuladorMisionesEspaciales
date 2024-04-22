package interfaz;

import servicios.Crew;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;

import static servicios.Main.crew;

public class ListarCrewPanel extends JPanel {
    DefaultTableModel data = new DefaultTableModel();
    JTable crewTable;
    JScrollPane crewScroll;

    public ListarCrewPanel() {

        data = getData();

        crewTable = new JTable(data);

        crewScroll = new JScrollPane(crewTable);

        setLayout(new BorderLayout());
        add(crewScroll, BorderLayout.CENTER);
        setVisible(true);
    }
    public DefaultTableModel getData() {
        String[] columnNames = {"Nombre", "Apellido", "Edad", "Género"};
        DefaultTableModel data = new DefaultTableModel();
        data.addColumn(columnNames[0]);
        data.addColumn(columnNames[1]);
        data.addColumn(columnNames[2]);
        data.addColumn(columnNames[3]);
        for (int i = 0; i < crew.getCrew().size(); i++){
            data.addRow(new Object[]{crew.getCrew().get(i).getName(), crew.getCrew().get(i).getSurname()
                    , crew.getCrew().get(i).getAge(), crew.getCrew().get(i).getGender()});
        }
        return data;
    }
}
