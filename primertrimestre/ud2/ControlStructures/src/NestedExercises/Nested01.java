package NestedExercises;

import java.util.Scanner;

public class Nested01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            System.out.println("Ingrese un número: ");
            number = scanner.nextInt();
            scanner.nextLine();

            if(number < 1){
                System.out.println("Debe introducir un número mayor a 1 para continuar");
            }
        } while (number < 1);


        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= number; j++) {
                System.out.print(j + i + 1 +" ");
            }
            System.out.println();
        }
    }
}
