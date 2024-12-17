package joption;

import javax.swing.*;

public class joption {

    public static void main(String[] args) {

        String cadena;
        int entero;
        char letra;
        double decimal;

        cadena = JOptionPane.showInputDialog("Digite un texto :");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero:"));
        letra = JOptionPane.showInputDialog("Digite un texto pero se tomara encuenta la posicion 1:").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero decimal:"));

        JOptionPane.showMessageDialog(null,"El string es => " + cadena);
        JOptionPane.showMessageDialog(null,"El numero entero es =>"+ entero);
        JOptionPane.showMessageDialog(null,"La letra  es =>"+ letra);
        JOptionPane.showMessageDialog(null,"El numero decimal es =>"+ decimal);

    }
}
