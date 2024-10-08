package switchexcersises;

import java.util.Scanner;

public class sw02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué operación desea realizar? ");
        String operacion = scanner.nextLine();

        switch (operacion) {
            case "+":
                System.out.println("Ingrese un número con decimales: ");
                double a = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Ingrese otro número con decimales");
                double b = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("El resultado es " + (a + b));
                break;
            case "-":
                System.out.println("Ingrese un número decimal");
                int c = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingrese otro número ");
                int d = scanner.nextInt();
                scanner.nextLine();

                System.out.println("El resultado es " + (c - d));
                break;
            default:
                System.out.println("Operación no permitida");
                break;
        }
    }
}
