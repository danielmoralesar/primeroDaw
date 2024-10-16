package WhileExercises;

import java.util.Scanner;

public class While06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cúantos números desea ingresar? ");
        int howManyScores = scanner.nextInt();
        scanner.nextLine();

        while (howManyScores <= 1) {
            System.out.println("Cantidad no válida, debe ingresar más de un número: ");
            howManyScores = scanner.nextInt();
            scanner.nextLine();
        }

        float sum = 0;

        for (int i = 0; i < howManyScores; i++) {
            System.out.println("Escriba un número, le quedan " + (howManyScores - i) + " espacios");
            float number = scanner.nextFloat();
            scanner.nextLine();

            while (number < 1) {
                System.out.println("Debe ingresar un número mayor o igual a 1, le quedan " + (howManyScores - i) + " espacios");
                number = scanner.nextFloat();
                scanner.nextLine();
            }
            sum += number;
        }
        System.out.println("La media de los números es: " + sum / howManyScores);
    }
}
