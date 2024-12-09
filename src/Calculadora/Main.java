package Calculadora;

//Richard Padilla
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        Calculadora calculadora = new Calculadora(); // Instancia de Calculadora
        frame.setContentPane(calculadora.Calcu); // Establece el panel principal
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); // Tamaño de la ventana
        frame.setLocationRelativeTo(null); // Centra la ventana
        frame.setVisible(true);
    }
}
