package interfaz;

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

        //TODO : AÑADIR COORDENADAS
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
    public Integer getMission (){
        String selection = String.valueOf(missionTable.getSelectedRow());
        int id = 0;
        int comprobar = 0;
        for (int i = 0; i < missions.getMissions().size(); i++){
            Object[] object = new Object[]{missions.getMissions().get(i).getName(), missions.getMissions().get(i).getStartDate()
                    , missions.getMissions().get(i).getObjectiveMission()};
            if (selection.equals(object[i])){
                id = i;
                comprobar ++;
            }
        }
        if (comprobar != 0){
            return id;
        }
        return id;
    }
}
