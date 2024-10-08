package ForExercises;

import java.util.Scanner;

public class For05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un año:");
        int yearOne = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese otro año:");
        int yearTwo = scanner.nextInt();
        scanner.nextLine();

        if (yearOne > yearTwo) {
            for (int i = yearTwo; i <= yearOne; i++) {
                if (i % 4 == 0 && i % 100 != 0) {
                    System.out.println(i);
                }
            }
        } else if (yearTwo > yearOne) {
            for (int i = yearOne; i <= yearTwo; i++) {
                if (i % 4 == 0 && i % 100 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Operación no válida");
        }
    }
}
