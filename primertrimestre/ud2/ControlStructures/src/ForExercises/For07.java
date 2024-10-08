package ForExercises;

import java.util.Scanner;

public class For07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cúantos números desea ingresar? ");
        int howManyNumbers = scanner.nextInt();
        scanner.nextLine();

        int biggestNumber = Integer.MAX_VALUE;

        for (int i = 0; i < howManyNumbers; i++) {
            System.out.println("Escriba un número, le quedan " + (howManyNumbers - i) + " espacios");
            int number = scanner.nextInt();
            scanner.nextLine();
            if (number > biggestNumber) {
                biggestNumber = number;
            }
        }
        System.out.println("El número más grande es: " + biggestNumber);
    }
}
