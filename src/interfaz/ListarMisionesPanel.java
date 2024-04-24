package interfaz;

import servicios.Mission;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        JPanel botones = new JPanel();
        botones.setLayout(new FlowLayout());
        add(botones, BorderLayout.SOUTH);

        JButton ver = new JButton("Ver");
        botones.add(ver);

        JButton addCordinate = new JButton("Add Cordinate");
        botones.add(addCordinate);

        setVisible(true);

        //TODO : BOTON VER
        ver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VerMisionVentana verMisionVentana = new VerMisionVentana(getMission());
                verMisionVentana.setVisible(true);
            }
        });

        addCordinate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CoordenadasVentana coordenadasVentana = new CoordenadasVentana(getMission());
                coordenadasVentana.setVisible(true);
            }
        });
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
    //arreglar metodo
    public Integer getMission() {
        int selectedRowIndex = missionTable.getSelectedRow();
        if (selectedRowIndex == -1) {
            // No se ha seleccionado ninguna fila
            return null;
        }

        String selection = missionTable.getValueAt(selectedRowIndex, 0).toString(); // Se asume que el nombre de la misión está en la primera columna
        int id = -1; // El ID de la misión seleccionada
        for (int i = 0; i < missions.getMissions().size(); i++) {
            Mission mission = missions.getMissions().get(i);
            if (selection.equals(mission.getName())) {
                id = i;
                break;
            }
        }
        if (id != -1) {
            return id;
        }
        return null;
    }
}
