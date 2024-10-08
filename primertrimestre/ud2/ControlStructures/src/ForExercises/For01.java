package ForExercises;

import java.util.Scanner;

public class For01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Se pide un número
        System.out.println("Ingrese un número");
        int n = scanner.nextInt();
        scanner.nextLine();

        //Se pide un mensaje
        System.out.println("Ingrese un mensaje");
        String message = scanner.nextLine();

        //Se imprime ese mensaje n veces
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}
