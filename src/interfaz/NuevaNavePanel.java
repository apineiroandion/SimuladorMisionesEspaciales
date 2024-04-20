package interfaz;

import servicios.Ship;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static servicios.Main.ships;

public class NuevaNavePanel extends JPanel {
    private JLabel newShipLabel;
    private JLabel shipIDLabel;
    private JTextField shipIDTextField;
    private JLabel shipNameLabel;
    private JTextField shipNameTextField;
    private JLabel shipTypeLabel;
    private JComboBox shipTypeComboBox;
    private String[] shipTypeOptions = {"Cohete", "X-Wing", "Destructor Imperial"};
    private JButton addShipButton;

    public NuevaNavePanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;

        newShipLabel = new JLabel("Nuevo Nave");
        c.gridx = 0;
        c.gridy = 0;
        add(newShipLabel, c);

        shipIDLabel = new JLabel("ID del nave");
        c.gridx = 0;
        c.gridy = 1;
        add(shipIDLabel, c);

        shipIDTextField = new JTextField(10);
        c.gridx = 1;
        c.gridy = 1;
        add(shipIDTextField, c);

        shipNameLabel = new JLabel("Nombre del nave");
        c.gridx = 0;
        c.gridy = 2;
        add(shipNameLabel, c);

        shipNameTextField = new JTextField(10);
        c.gridx = 1;
        c.gridy = 2;
        add(shipNameTextField, c);

        shipTypeLabel = new JLabel("Tipo del nave");
        c.gridx = 0;
        c.gridy = 3;
        add(shipTypeLabel, c);

        shipTypeComboBox = new JComboBox(shipTypeOptions);
        c.gridx = 1;
        c.gridy = 3;
        add(shipTypeComboBox, c);

        c.gridx = 0;
        c.gridy = 4;
        add(Box.createVerticalStrut(10), c);

        addShipButton = new JButton("Nuevo Nave");
        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 2;
        add(addShipButton, c);


        addShipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ships.getShips().add(new Ship(
                        Integer.parseInt(shipIDTextField.getText()), shipNameTextField.getText(), shipTypeComboBox.getSelectedItem().toString()
                ));
                shipIDTextField.setText("");
                shipNameTextField.setText("");

                JOptionPane.showMessageDialog( NuevaNavePanel.this, "Nave Creada");
                //TODO : HACER QUE SERIALIZE SHIPS
            }
        });

    }
}
