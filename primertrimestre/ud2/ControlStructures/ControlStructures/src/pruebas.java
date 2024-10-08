import java.util.Scanner;

public class pruebas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe tu primer programa: ");
        String message = scanner.nextLine();

        if (message.equals("Hola Mundo")) {
            System.out.println("CORRECTO SINJI");
        } else {
            System.out.println("nanai");
        }
    }
}
