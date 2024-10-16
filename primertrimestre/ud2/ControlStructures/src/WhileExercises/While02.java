package WhileExercises;

import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba un número con decimales: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Escriba otro número con decimales: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();

        while(num2 >= num1) {
            System.out.println("El primer número introducido no es mayor al segundo, escriba otro: ");
            num2 = scanner.nextDouble();
            scanner.nextLine();
        }

        System.out.println("El primer número es " + num1 + ", el segundo número es " + num2);
    }
}
