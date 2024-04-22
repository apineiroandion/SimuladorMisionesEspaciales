package interfaz;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

import static servicios.Main.missions;

public class ListarMisionesPanel extends JPanel {
    DefaultTableModel data = new DefaultTableModel();
    JTable missionTable;
    JScrollPane missionScroll;

    public ListarMisionesPanel() {
        data = getData();
        missionTable = new JTable(data);
        missionScroll = new JScrollPane(missionTable);

        setLayout(new BorderLayout());
        add(missionScroll, BorderLayout.CENTER);
        setVisible(true);
    }
    public DefaultTableModel getData() {
        String[] columnNames = {"Nombre", "FechaIncio", "objetivoMision"};
        DefaultTableModel data = new DefaultTableModel();
        data.addColumn(columnNames[0]);
        data.addColumn(columnNames[1]);
        data.addColumn(columnNames[2]);
        for (int i = 0; i < missions.getMissions().size(); i++){
            data.addRow(new Object[]{missions.getMissions().get(i).getName(), missions.getMissions().get(i).getStartDate()
                    , missions.getMissions().get(i).getObjectiveMission()});
        }
        return data;
    }
}
