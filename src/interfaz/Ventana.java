package interfaz;

import javax.swing.*;
import java.awt.*;

import static servicios.Main.ventana;

public class Ventana extends JFrame {
    JPanel menu = new Menu(contenedor);
    static JPanel contenedor = new JPanel();//lo puse static para llamarlo desde menu
    public Ventana() {
        setTitle("Misiones Espaciales");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 600));
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        //menu
        add(menu, BorderLayout.WEST);
        //panel
        add(contenedor, BorderLayout.CENTER);
        setVisible(true);
    }
    public static JPanel nuevaMision(){
        JPanel contenedor = new NuevaMisionPanel();
        return contenedor;
    }
    public static void mostrarVentanaNuevaMision(){
        contenedor = nuevaMision();
        contenedor.setVisible(true);
        ventana.repaint();
    }
}
