package ForExercises;

import java.util.Scanner;

public class For02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int numberOne = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese otro número: ");
        int numberTwo = scanner.nextInt();
        scanner.nextLine();

        if (numberOne < numberTwo) {
            for (int i = numberOne; i <= numberTwo; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = numberTwo; i <= numberOne; i++) {
                System.out.println(i);
            }
        }
    }
}
