package Calculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JPanel{
    public JPanel Calcu;
    public JTextArea Resultados;
    public JButton sumaButton;
    public JButton restaButton;
    public JButton multiplicacionButton;
    public JButton divisionButton;
    public JTextField numero1;
    public JTextField numero2;

    public Calculadora() {
        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numero1.getText());
                int num2 = Integer.parseInt(numero2.getText());
                int suma = num1 + num2;
                Resultados.setText(String.valueOf(suma));

            }
        });

        restaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numero1.getText());
                int num2 = Integer.parseInt(numero2.getText());
                int resta = num1 - num2;
                Resultados.setText(String.valueOf(resta));

            }
        });

        multiplicacionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numero1.getText());
                int num2 = Integer.parseInt(numero2.getText());
                int multiplicacion = num1 * num2;
                Resultados.setText(String.valueOf(multiplicacion));

            }
        });

        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numero1.getText());
                int num2 = Integer.parseInt(numero2.getText());
                if(num2!= 0){
                    double division = num1 / num2;
                    Resultados.setText(String.valueOf(division));
                }else{
                    JOptionPane.showMessageDialog(null, "No se puede dividir entre 0", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
