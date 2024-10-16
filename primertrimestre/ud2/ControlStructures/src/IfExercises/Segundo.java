package IfExercises;

import java.util.Scanner;

public class Segundo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Pregunta por un número a consultar
        System.out.println("Ingrese un número: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        //Calcula y da resultado
        if (num % 2 == 0 && num >= 1){
            System.out.println("Es número par");
        }
        else if(num % 2 != 0 && num >= 1){
            System.out.println("Es número impar");
        }
        else if(num == 0){
            System.out.println("No es par ni impar");
        }
    }
}
