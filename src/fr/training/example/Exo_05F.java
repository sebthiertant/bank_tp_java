package fr.training.example;

import java.util.Arrays;
import java.util.Scanner;

public class Exo_05F {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = new int[]{2, 5, 8, 4};
        int[] secondArray = new int[]{6,7};
        int result = 0;

        for (int i =0; i < secondArray.length; i++) {
            for(int j = 0; j < firstArray.length; j++) {
                result += firstArray[j] * secondArray[i];
            }
        }
        System.out.println(result);
        scanner.close();
    }
}
