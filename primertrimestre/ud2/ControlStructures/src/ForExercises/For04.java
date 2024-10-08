package ForExercises;

import java.util.Scanner;

public class For04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número positivo: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num > 0) {
            int result = 1;
            for (int i = 1; i <= num; i++) {
                result += i;
            }
            System.out.println("El resultado es: " + result);
        } else {
            System.out.println("Número no válido.");
        }
    }
}
