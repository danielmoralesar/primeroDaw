package NestedExercises;

import java.util.Scanner;

public class Nested03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            System.out.println("Ingrese un número mayor a 0 ");
            number = scanner.nextInt();
            scanner.nextLine();
        } while (number <= 0);

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < (i+1); j++) {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}
