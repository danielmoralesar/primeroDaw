package SwitchExcersises;

import java.util.Scanner;

public class sw01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la hora actual: ");
        int hora = scanner.nextInt();
        scanner.nextLine();

        switch (hora) {
            case 6, 7, 8, 9, 10, 11, 12:
                System.out.println("Buenos días");
                break;
            case 13, 14, 15, 16, 17, 18, 19, 20:
                System.out.println("Buenas tardes");
                break;
            case 0, 1, 2, 3, 4, 5, 21, 22, 23:
                System.out.println("Buenas noches");
                break;
            default:
                System.out.println("Hora inválida");
                break;
        }
    }
}
