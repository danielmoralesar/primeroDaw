package ifexercises;

import java.util.Scanner;

public class Tercero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicita un número
        System.out.println("Ingrese un número: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        //Comprueba el tipo de número
        if (num < 0) {
            System.out.println("Es negativo");
        } else if (num > 0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("No es ni positivo ni negativo");
        }
    }
}
