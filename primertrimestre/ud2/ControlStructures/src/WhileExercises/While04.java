package WhileExercises;

import java.util.Scanner;

public class While04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        double number = scanner.nextDouble();
        scanner.nextLine();

        int counter = 0;

        while(number >= 0){
            System.out.println("Ingrese otro número: ");
            number = scanner.nextDouble();
            scanner.nextLine();

            counter++;
        }

        System.out.println("Números introducidos: " + counter);
    }
}
