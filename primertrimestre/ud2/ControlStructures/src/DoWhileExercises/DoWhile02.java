package DoWhileExercises;

import java.util.Scanner;

public class DoWhile02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Esto es una calculadora, elija una operación: ");

        int option;

        do {
            System.out.println("1. Sumar.");
            System.out.println("2. Restar.");
            System.out.println("3. Multiplicar");
            System.out.println("4. Salir del programa");
            option = scanner.nextInt();
            scanner.nextLine();

            double num1;
            double num2;

            if (option == 1) {
                System.out.println("Ingrese un número: ");
                num1 = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Ingrese otro número: ");
                num2 = scanner.nextDouble();
                System.out.println("El resultado de la suma es: " + (num1 + num2));
            } else if (option == 2) {
                System.out.println("Ingrese un número:");
                num1 = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Ingrese otro número: ");
                num2 = scanner.nextDouble();
                System.out.println("El resultado de la resta es: " + (num1 - num2));
            } else if (option == 3) {
                System.out.println("Ingrese un número:");
                num1 = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Ingrese otro número: ");
                num2 = scanner.nextDouble();
                System.out.println("El resultado de la multiplicación es: "+ (num1 * num2));
            } else if (option == 4){
                System.out.println("¡Hasta luego!");
            } else {
                System.out.println("Operación no válida, ingrese el número que la operación que desea realizar ");
            }
        } while (option != 4);
    }
}
