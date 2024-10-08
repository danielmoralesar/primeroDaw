package ForExercises;

import java.util.Scanner;

public class For06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cúantos números desea ingresar? ");
        int howManyNumbers = scanner.nextInt();
        scanner.nextLine();

        int counter = 0;

        for (int i = 0; i < howManyNumbers; i++) {
            System.out.println("Escriba un número, le quedan " + (howManyNumbers - i) + " espacios");
            int number = scanner.nextInt();
            scanner.nextLine();
            if (number < 0) {
                counter++;
            }
        }
        System.out.println("Números negativos: " + counter);
    }
}
