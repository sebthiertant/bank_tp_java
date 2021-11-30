package fr.training.example;

import java.util.Arrays;
import java.util.Scanner;

public class Exo_05G {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez le nombre de valeur à rentrer :");
        int numberValues = scanner.nextInt();
        int[] numbersArray = new int[numberValues];

        for(int i = 0; i < numberValues; i++){
            System.out.println("Choisissez la valeur n°" + (i+1));
            numbersArray[i] = scanner.nextInt() + 1;
        }
        System.out.println("Résultat :" + Arrays.toString(numbersArray));
        scanner.close();
    }
}
