package WhileExercises;

import java.util.Scanner;

public class While07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 1;
        int sum = 0;

        while (number != 0) {
            System.out.println("Ingrese un número: ");
            number = scanner.nextInt();
            scanner.nextLine();
            sum = sum + number;
        }
        System.out.println("El resultado de sumar todos los números es: " + sum);
    }
}
