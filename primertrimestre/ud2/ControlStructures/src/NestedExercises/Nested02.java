package NestedExercises;

import java.util.Scanner;

public class Nested02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int number = scanner.nextInt();
        scanner.nextLine();

        while (number <= 0){
            System.out.println("Número no válido, ingrese otro: ");
            number = scanner.nextInt();
            scanner.nextLine();
        }

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}