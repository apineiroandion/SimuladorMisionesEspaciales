package interfaz;

import servicios.Coordinate;
import servicios.Mission;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static servicios.Main.missions;

public class CoordenadasVentana extends JFrame {
    int id;
    Mission mision;
    public CoordenadasVentana(int id) {
        this.id = id;
        this.mision = missions.getMissions().get(id);

        setTitle("Coordenadas");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;

        JLabel xLabel = new JLabel("X");
        c.gridx = 0;
        c.gridy = 0;
        panel.add(xLabel, c);
        JLabel yLabel = new JLabel("Y");
        c.gridx = 0;
        c.gridy = 1;
        panel.add(yLabel, c);
        JLabel zLabel = new JLabel("Z");
        c.gridx = 0;
        c.gridy = 2;
        panel.add(zLabel, c);

        JTextField xField = new JTextField();
        c.gridx = 1;
        c.gridy = 0;
        panel.add(xField, c);
        JTextField yField = new JTextField();
        c.gridx = 1;
        c.gridy = 1;
        panel.add(yField, c);
        JTextField zField = new JTextField();
        c.gridx = 1;
        c.gridy = 2;
        panel.add(zField, c);

        JButton ok = new JButton("ok");
        c.gridx = 0;
        c.gridy = 3;
        panel.add(ok, c);
        JButton cancel = new JButton("cancel");
        c.gridx = 0;
        c.gridy = 4;
        panel.add(cancel, c);

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Coordinate coordinate = new Coordinate(Float.parseFloat(xField.getText())
                        , Float.parseFloat(yField.getText())
                        , Float.parseFloat(zField.getText()));
                mision.getPosition().add(coordinate);
                JOptionPane.showMessageDialog(CoordenadasVentana.this, "Coordenadas añadidas");
                dispose();
            }
        });
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        add(panel);
        setVisible(true);
    }
}
