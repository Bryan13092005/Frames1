import javax.swing.*;

public class Acciones {

    public static void Calculadora() {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new PRACTICA1().getPanelMain());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void Encuesta() {
        JFrame frame = new JFrame("Encuesta");
        frame.setContentPane(new EJERCICIO2().getPanelMain());
        frame.pack();
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void Preferencias() {
        JFrame frame = new JFrame("Preferencias");
        frame.setContentPane(new EJERCICIO3().getPanel());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void Menu() {
        JFrame frame = new JFrame("Menú Principal");
        frame.setContentPane(new MENU().getPanelMain());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}