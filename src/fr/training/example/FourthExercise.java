package fr.training.example;

import java.util.Scanner;

public class FourthExercise {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir une année :");
        short year = scanner.nextShort();

        if (java.time.Year.of(year).isLeap()) {
            System.out.println("L'année " + year + " est bissextile.");
        } else {
            System.out.println("L'année " + year + " n'est pas bissextile.");
        }
    }
}
