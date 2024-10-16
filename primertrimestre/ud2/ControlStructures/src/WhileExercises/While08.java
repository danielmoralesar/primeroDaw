package WhileExercises;

import java.util.Scanner;

public class While08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positive = 0;
        int pCounter = 0;
        int negative = 0;
        int nCounter = 0;
        int zero = 0;
        int distribution = 0;

        while ((pCounter + nCounter + zero) < 10) {
            System.out.println("Ingrese un número: ");
            distribution = scanner.nextInt();

            if (distribution > 0) {
                positive = positive + distribution;
                pCounter++;
            } else if (distribution < 0) {
                negative = negative + distribution;
                nCounter++;
            } else {
                zero++;
            }
        }
        if (pCounter != 0) {
            System.out.println("Media de números positivos: " + positive / pCounter);
        } else if (nCounter != 0) {
            System.out.println("Media de números negativos: " + negative / nCounter);
        } else {
            System.out.println("Cantidad de ceros: " + zero);
        }
    }
}
