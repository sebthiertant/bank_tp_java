package fr.training.example;


import java.util.Scanner;

public class Exo_03E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisissez l'âge : ");
        int age = scanner.nextInt();

        if(age < 6) {
            System.out.println("Il est trop jeune !");
        }
        else if ((age == 6) || (age == 7)) {
            System.out.println("C'est un poussin");
        }
        else if((age == 8) || (age == 9)) {
            System.out.println("C'est un pupille");
        }
        else if((age == 10) || (age == 11)) {
            System.out.println("C'est un minime");
        }
        else {
            System.out.println("Oula c'est un cadet ça, j'reconnais.");
        }

        scanner.close();
    }
}
