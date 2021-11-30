package fr.training.example;

import java.util.Scanner;

public class Exo_05A {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        short[] shortArray = {10, 15, 20, 15, 14, 8};
        int total = 0;
        for (int i = 0; i < shortArray.length; i++) {
            total += shortArray[i];
            System.out.println("Etape " + i + ": résultat provisoire " + total + ".");
        }

        System.out.println(total);
        scanner.close();
    }
}
