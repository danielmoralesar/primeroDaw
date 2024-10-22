package NestedExercises;

import java.util.Scanner;

public class Nested05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v1;
        int v2;
        int max;
        int sum = 0;

        do {
            System.out.println("Ingrese un número mayor a 0 ");
            v1 = scanner.nextInt();
            scanner.nextLine();
        } while (v1 <= 0);

        do {
            System.out.println("Ingrese un número mayor a 0 ");
            v2 = scanner.nextInt();
            scanner.nextLine();
        } while (v2 <= 0);

        if (v1 > v2) {
            max = v1;
        } else if (v2 > v1) {
            max = v2;
        }
    }
}
