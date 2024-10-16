package IfExercises;

import java.util.Scanner;

public class Sexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué operación desea realizar? ");
        String operacion = scanner.nextLine();

        if (operacion.equals("+")) {
            System.out.println("Ingrese un número con decimales: ");
            double a = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Ingrese otro número con decimales: ");
            double b = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("El resultado es: " + (a + b));
        } else if (operacion.equals("-")) {
            System.out.println("Ingrese un número decimal: ");
            int a = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingrese otro número decimal: ");
            int b = scanner.nextInt();
            scanner.nextLine();

            System.out.println("El resultado es: " + (a - b));
        } else {
            System.out.println("Operación no permitida.");
        }
    }
}
