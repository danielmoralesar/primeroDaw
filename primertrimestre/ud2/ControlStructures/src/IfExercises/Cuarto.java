package IfExercises;

import java.util.Scanner;

public class Cuarto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Solicita un string
        System.out.println("Ingrese una frase mayor a ocho caracteres");
        String palabra = scanner.nextLine();

        //Calcula longitud del string
        int letras = palabra.length();

        //Da el resultado
        if (letras > 8){
            System.out.println("Demasiado grande");
        }
        else if (letras < 8) {
            System.out.println("Demasiado pequeño");
        }
        else {
            System.out.println("Válido");
        }
    }
}
