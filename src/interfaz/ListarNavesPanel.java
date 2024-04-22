package interfaz;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

import static servicios.Main.crew;
import static servicios.Main.ships;

public class ListarNavesPanel extends JPanel {
    DefaultTableModel data = new DefaultTableModel();
    JTable shipTable;
    JScrollPane shipScroll;
    public ListarNavesPanel() {
        data = getData();
        shipTable = new JTable(data);
        shipScroll = new JScrollPane(shipTable);

        setLayout(new BorderLayout());
        add(shipScroll, BorderLayout.CENTER);
        setVisible(true);
    }
    public DefaultTableModel getData() {
        String[] columnNames = {"ID", "Nombre", "Tipo"};
        DefaultTableModel data = new DefaultTableModel();
        data.addColumn(columnNames[0]);
        data.addColumn(columnNames[1]);
        data.addColumn(columnNames[2]);
        for (int i = 0; i < ships.getShips().size(); i++){
            data.addRow(new Object[]{ships.getShips().get(i).getId(), ships.getShips().get(i).getShipName()
                    , ships.getShips().get(i).getShipType()});
        }
        return data;
    }
}
