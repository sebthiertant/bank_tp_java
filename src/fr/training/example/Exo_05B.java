package fr.training.example;

import java.util.Arrays;
import java.util.Scanner;

public class Exo_05B {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Combien d'élèves voulez vous noter ?");
        int studentInt = scanner.nextInt();
        int[] notesArray = new int[studentInt];
        int goodStudentsInt = 0;

        for (int i = 0; i < studentInt; i++) {
            System.out.println("Notez l'élève numéro : " + (i +1));
            notesArray[i] = scanner.nextInt();
            if(notesArray[i] > 10) {
                goodStudentsInt ++;
            }
        }
        // version en ajoutant le nombre au dessus de la moyenne (05C)
        System.out.println("Vous avez saisi les notes : " + Arrays.toString(notesArray) +". " + goodStudentsInt + " élèves sont au dessus de la moyenne.");
        scanner.close();
    }


}
