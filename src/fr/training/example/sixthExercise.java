package fr.training.example;

import java.util.Random;
import java.util.Scanner;

public class sixthExercise {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int maxValue = 100;
        int randomInt = rand.nextInt(maxValue); // I set the number to guess
        int count = 1;

        System.out.println("Entrez un nombre : ");
        int guessingInput = scanner.nextInt();

        while (guessingInput != randomInt) {
            if (guessingInput - randomInt > 20 || randomInt - guessingInput > 20) {
                System.out.println("----> froid");
            } else if (guessingInput - randomInt >= 6 || randomInt - guessingInput >= 6) {
                System.out.println("----> tiède");
            } else {
                System.out.println("----> chaud");
            }

            count++;
            System.out.println("Entrez un nombre : ");
            guessingInput = scanner.nextInt();
        }

        System.out.println("Bravo, c'est gagné ! En " + count + " tentative(s) !"); // win return
    }
}
