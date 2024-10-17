package WhileExercises;

import java.util.Scanner;

public class While08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double positive = 0;
        double pCounter = 0;
        double negative = 0;
        double nCounter = 0;
        int zero = 0;
        double distribution;

        while ((pCounter + nCounter + zero) < 10) {
            System.out.println("Ingrese un número: ");
            distribution = scanner.nextDouble();

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
        System.out.println("Media de números positivos: " + positive / pCounter);
        System.out.println("Media de números negativos: " + negative / nCounter);
        System.out.println("Cantidad de ceros: " + zero);
    }
}
