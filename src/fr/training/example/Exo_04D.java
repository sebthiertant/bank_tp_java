package fr.training.example;

import java.util.Scanner;

public class Exo_04D {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez un nombre de départ");
        int startInt = scanner.nextInt();
        int sumTotal = 0;
        for(int i = 1; i <= startInt; i++) {
            sumTotal += i;
        }
        System.out.println(sumTotal);
        scanner.close();
    }
}
