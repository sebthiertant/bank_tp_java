package fr.training.example;

import java.util.Scanner;
import java.util.Arrays;

public class Exo_05E {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez la longueur du tableau :");
        int arrayLength = scanner.nextInt();

        System.out.println("Entrez les valeurs du premier tableau");
        int[] firstArray = new int[arrayLength];

        for(int i = 0; i < arrayLength; i++) {
            int inputValue = scanner.nextInt();
            firstArray[i] = inputValue;
        }

        System.out.println("Entrez les valeurs du second tableau");
        int[] secondArray = new int[arrayLength];

        for(int j = 0; j < arrayLength; j++) {
            int inputValue = scanner.nextInt();
            secondArray[j] = inputValue;
        }

        int[] additionArray = new int[arrayLength];
        for (int k = 0; k < arrayLength; k++) {
            additionArray[k] = firstArray[k] + secondArray[k];
        }
        System.out.println(Arrays.toString(additionArray));
        scanner.close();
    }
}
