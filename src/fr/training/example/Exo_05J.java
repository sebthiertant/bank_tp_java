package fr.training.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exo_05J {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Saisissez une valeur : ");
        int inputValue = scanner.nextInt();
        ArrayList<Integer> resultArray = new ArrayList();
        resultArray.add(inputValue);

        do {
            System.out.println("Saisissez une nouvelle valeur : ");
            inputValue = scanner.nextInt();
            resultArray.add(inputValue);
        }while (inputValue != 0);


        Integer maxValue = Collections.max(resultArray);
        System.out.println("La valeur maximum est : " + maxValue);
        scanner.close();
    }
}
