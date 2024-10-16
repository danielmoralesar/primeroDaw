package IfExercises;

import java.util.Scanner;

public class Quinto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //solicita número A
        System.out.println("Ingrese número A: ");
        int A = scanner.nextInt();
        scanner.nextLine();

        //Solicita número B
        System.out.println("Ingrese número B");
        int B = scanner.nextInt();
        scanner.nextLine();

        //Dependiendo de la respuesta, se pueden presentar los siguientes casos:
        //En caso de que A sea mayor que B, se suman ambos valores
        if (A > B) {
            System.out.println("Resultado: " + (A + B));
        }
        //En caso de que A y B sean iguales, se restan.
        else if (A == B) {
            System.out.println("Resultado: " + (A - B));
        }
        //En otro caso, se solicita un nuevo número y se presentan nuevos casos:
        else {
            System.out.println("Ingrese número C: ");
            int C = scanner.nextInt();
            scanner.nextLine();

            //En caso de que C es mayor que A y B juntos.
            if (C > (A+B)) {
                System.out.println("c es mayor que a + b");
            }
            //En caso de que C es menor que A y B juntos.
            else if (C < (A+B)){
                System.out.println("c es menor que a + b");
            }
            //En caso de que C sea igual que A y B juntos.
            else {
                System.out.println("c es igual que a + b");
            }
        }
    }
}
