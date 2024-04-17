package interfaz;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public Ventana() {
        setTitle("Misiones Espaciales");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 600));
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        //menu
        JPanel menu = new Menu();
        add(menu, BorderLayout.WEST);

        //panel

        setVisible(true);
    }
}
