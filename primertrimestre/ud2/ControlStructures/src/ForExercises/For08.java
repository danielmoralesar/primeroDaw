package ForExercises;

import java.util.Scanner;

public class For08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cúantos números desea ingresar? ");
        int howManyScores = scanner.nextInt();
        scanner.nextLine();

        float sum = 0;

        for (int i = 0; i < howManyScores; i++) {
            System.out.println("Escriba un número, le quedan " + (howManyScores - i) + " espacios");
            float number = scanner.nextFloat();
            scanner.nextLine();

            sum = sum + number;

        }

        float divisor = (float)howManyScores;

        System.out.println("La media de los números es: " + sum/howManyScores);
    }
}
