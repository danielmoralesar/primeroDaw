package IfExercises;

import java.util.Scanner;

public class Primero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pide un número
        System.out.println("Ingrese un número: ");
        int n1 = scanner.nextInt();
        scanner.nextLine();

        //Pide otro número
        System.out.println("Ingrese otro número: ");
        int n2 = scanner.nextInt();
        scanner.nextLine();

        //Los compara y da un resultado en base al primer número
        if (n1 > n2){
            System.out.println("Es mayor.");
        }
        else if(n1 < n2){
            System.out.println("Es menor");
        }
        else{
            System.out.println("Son iguales");
        }
    }
}