package switchexcersises;

import java.util.Scanner;

public class sw03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra de 8 caracteres: ");
        String password = scanner.nextLine();

        int characters = password.length();

        switch (characters) {
            case 8:
                System.out.println("Es válido");
                break;
            default:
                System.out.print("No es válido");
                break;
        }

    }
}