package NestedExercises;

import java.util.Scanner;

public class Nested01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        while (number <= 0) {
            System.out.println("Número no válido, ingrese otro: ");
            number = scanner.nextInt();
            scanner.nextLine();
        }

        for (int i = 0; i < number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print(j + i + " ");
            }
            System.out.println();
        }
    }
}
