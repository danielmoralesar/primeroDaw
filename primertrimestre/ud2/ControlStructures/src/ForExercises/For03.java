package ForExercises;

import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num > 0) {

            int result = 0;

            for (int i = 0; i <= num; i++) {
                result = result + i;
            }
            System.out.println("El resultado es: " + result);

        } else {
            System.out.println("Número no válido.");
        }
    }
}