package WhileExercises;

import java.util.Random;
import java.util.Scanner;

public class While05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int theNumber = random.nextInt(100);

        System.out.println("Ingresa un número: ");
        int guess = scanner.nextInt();
        scanner.nextLine();

        while (guess != theNumber) {
            if (theNumber > guess) {
                System.out.println("El número a adivinar es mayor al que introduciste, ingresa uno más grande: ");
                guess = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("El número a adivinar es menor al que introduciste, ingresa uno más pequeño: ");
                guess = scanner.nextInt();
                scanner.nextLine();
            }
        }
        System.out.println("Exacto!");
    }
}
