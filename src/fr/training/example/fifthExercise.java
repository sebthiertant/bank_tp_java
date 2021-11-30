package fr.training.example;

import java.util.Random;
import java.util.Scanner;

public class fifthExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int maxValue = 101;
        int minInt = 101;
        int minIndex = 0;
        int maxInt = 0;
        int maxIndex = 0;

        for (int i = 1; i <= 10; i++) {
            int int_random = rand.nextInt(maxValue);
            System.out.println("Le nombre " + i + " vaut : " + int_random);

            if (int_random > maxInt) {
                maxInt = int_random;
                maxIndex = i;
            }

            if (int_random < minInt) {
                minInt = int_random;
                minIndex = i;
            }
        }
        System.out.println("le maximum vaut " + maxInt + " (numéro " + maxIndex + ") le minimum vaut " + minInt + " (numéro " + minIndex + ") .");
    }
}
