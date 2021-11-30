package fr.training.example;

import java.util.Scanner;

public class Exo_05H {
    public static void main (String[] args) {
        // 05H et 05I
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez 20 valeurs :");
        int[] valuesArray = new int[20];
        int maxValue = 0;
        int maxIndex = 0;

        for(int i = 0; i < 20; i++ ){
            System.out.println("Valeur n°" + (i+1));
            valuesArray[i] = scanner.nextInt();
            if (valuesArray[i] > maxValue){
                maxValue = valuesArray[i];
                maxIndex =  i;
            }
        }
        System.out.println("La valeur maximale est de : " + maxValue + " à la position " + (maxIndex + 1));
        scanner.close();
    }
}
