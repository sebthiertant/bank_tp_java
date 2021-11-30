package fr.training.example;

import java.util.Scanner;

public class secondExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your x");
        byte firstValue = scanner.nextByte();
        System.out.println("Enter your y");
        byte secondValue = scanner.nextByte();


        byte[] permuted = {firstValue, secondValue};
        byte x = permuted[1];
        byte y = permuted[0];
        System.out.println("Les valeurs sont permutées, x vaut " + x + " et y vaut " + y + ".");
        scanner.close();
    }
}
