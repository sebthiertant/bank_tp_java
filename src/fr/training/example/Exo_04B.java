package fr.training.example;

import java.util.Scanner;

public class Exo_04B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un nombre");
        int inputInt = scanner.nextInt();

        int loop = 0;
        do {
            loop ++;
            System.out.println(loop);
        }
        while(loop < inputInt);
        scanner.close();
    }
}
