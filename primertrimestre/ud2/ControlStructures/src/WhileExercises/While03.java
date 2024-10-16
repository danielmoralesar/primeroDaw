package WhileExercises;

import java.util.Scanner;

public class While03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String question = "s";
        double number = 0;

        while (question.equalsIgnoreCase("s")) {
            System.out.println("Introduce un número: ");
            number = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("¿Quiere seguir?");
            question = scanner.nextLine();
        }
    }
}
