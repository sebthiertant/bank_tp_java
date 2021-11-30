package fr.training.example;

import java.util.Scanner;

public class SortedNames {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Saisir 3 noms :");
            String lastname1 = scanner.next();
            String lastname2 = scanner.next();
            String lastname3 = scanner.next();

            if (lastname1.compareToIgnoreCase(lastname2) <= 0 && lastname2.compareToIgnoreCase(lastname3) <= 0) {
                System.out.println("Tri OK par ordre alphabetique");
            } else {
                System.out.println("Tri KO ordre alphabetique");
            }
            scanner.close();
        }
}
