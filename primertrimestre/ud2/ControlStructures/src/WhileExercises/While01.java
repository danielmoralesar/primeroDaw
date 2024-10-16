package WhileExercises;

import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce un número mayor que " + num1);
        int num2 = scanner.nextInt();
        scanner.nextLine();
        while (num2 <= num1) {
            System.out.println("El número introducido no es mayor que " + num1);
            num2 = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Num1: " + num1 + ". Num2: " + num2);
    }
}
