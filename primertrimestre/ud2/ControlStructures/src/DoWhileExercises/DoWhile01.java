package DoWhileExercises;

import java.util.Scanner;

public class DoWhile01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println("Elije una operación a realizar: ");
            System.out.println("1. Saluda");
            System.out.println("2. Grita");
            System.out.println("3. Salir");
            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1){
                System.out.println("Dime tu nombre: ");
                String name = scanner.nextLine();
                System.out.println("Hola, " + name);
            } else if (option == 2){
                System.out.println("Dime tu nombre: ");
                String name = scanner.nextLine();
                System.out.println("Cuidado, "+ name + "!");
            } else {
                System.out.println("Opción inválida");
            }
        } while(option != 3);
        // test
    }
}
