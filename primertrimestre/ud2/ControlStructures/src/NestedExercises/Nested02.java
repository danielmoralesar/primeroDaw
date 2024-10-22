package NestedExercises;

import java.util.Scanner;

public class Nested02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            System.out.println("Ingrese un número mayor a 0 ");
            number = scanner.nextInt();
            scanner.nextLine();
        } while (number <= 0);

        for (int i = 0; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
