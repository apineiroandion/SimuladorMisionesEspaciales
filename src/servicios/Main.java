package servicios;

import interfaz.Ventana;

public class Main {

    public static Ventana ventana;

    public static void main(String[] args) {
        ventana = new Ventana();
        ventana.setVisible(true);
    }
}
