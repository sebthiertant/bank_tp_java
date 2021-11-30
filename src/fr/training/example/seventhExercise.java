package fr.training.example;

import java.util.Random;
import java.util.Scanner;

public class seventhExercise {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un nombre à trouver entre 0 et 100 : ");

        int guessingNumber = scanner.nextInt(); // first guess
        System.out.println("Guessing number : " + guessingNumber);

        int count = 1;
        int maxValue = 100;
        int randomInt = rand.nextInt(maxValue); // I set the number guessed by AI

        while (randomInt != guessingNumber) {

            if (randomInt > guessingNumber) {
                System.out.println("L'ordinateur tente : " + randomInt);
                System.out.println("C'est trop grand ! ");
            } else {
                System.out.println("L'ordinateur tente : " + randomInt);
                System.out.println("C'est trop petit !");
            }
            count++;
            randomInt = rand.nextInt(maxValue); // new value
        }

        System.out.println("Trouvé ! C'est " + guessingNumber + ". " + count + " tentative(s)");
    }
}
