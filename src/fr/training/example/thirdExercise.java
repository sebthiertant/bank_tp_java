package fr.training.example;

import java.util.Scanner;

public class thirdExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir une première chaîne de caractère :");
        String firstString = scanner.nextLine();
        System.out.println("Saisir une seconde chaîne de caractère :");
        String secondString = scanner.nextLine();



        if (firstString.length() > secondString.length()) {
            System.out.println(firstString + " est la chaîne la plus longue.");
        } else if (secondString.length() > firstString.length()) {
            System.out.println(secondString + " est la chaîne la plus longue.");
        } else {
            System.out.println("Les deux chaînes sont de la même longueur.");
        }
        scanner.close();
    }
}
