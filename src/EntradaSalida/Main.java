package EntradaSalida;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float numero ;

        System.out.println("Digite un numero:");
        numero = entrada.nextFloat();

        System.out.println("El numero es: " + numero);
    }
}