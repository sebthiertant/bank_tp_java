package fr.training.example;

import java.util.Scanner;

public class Exo_04A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer un chiffre entre 0 et 10");
        short shortInput = scanner.nextShort();

        while(shortInput <= 0 || shortInput >= 10) {
            System.out.println("Entrer un chiffre entre 0 et 10");
            shortInput = scanner.nextShort();
        }
        System.out.println("Voilà c'est bien reste tranquille.");
        scanner.close();
    }
}
