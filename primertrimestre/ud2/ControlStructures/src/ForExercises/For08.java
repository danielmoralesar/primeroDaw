package ForExercises;

import java.util.Scanner;

public class For08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cúantos números desea ingresar? ");
        int howManyScores = scanner.nextInt();
        scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < howManyScores; i++) {
            System.out.println("Escriba un número, le quedan " + (howManyScores - i) + " espacios");
            int number = scanner.nextInt();
            scanner.nextLine();

            sum = sum + number;

        }
        System.out.println("La media de los números es: " + sum/howManyScores);
    }
}
