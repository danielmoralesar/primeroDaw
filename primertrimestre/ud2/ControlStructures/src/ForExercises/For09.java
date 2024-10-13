package ForExercises;

import java.util.Scanner;

public class For09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número a comprobar: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        boolean isPrime = true;

        for (int i = 2; i < number; i++){
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " es primo");
        } else {
            System.out.println(number + " no es primo");
        }
    }
}
