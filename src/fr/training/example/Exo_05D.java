package fr.training.example;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Exo_05D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Combien d'élèves voulez vous noter ?");
        int studentInt = scanner.nextInt();
        int[] notesArray = new int[studentInt];
        int bestStudentsInt = 0; // > 15
        int goodStudentsInt = 0; // > 10
        int badStudentsInt = 0; // < 8


        for (int i = 0; i < studentInt; i++) {
            System.out.println("Notez l'élève numéro : " + (i +1));
            notesArray[i] = scanner.nextInt();
            if(notesArray[i] < 8) {
                badStudentsInt++;
            }
            else if((notesArray[i] > 10) && (notesArray[i] <= 15)) {
                goodStudentsInt++;
            }
            else{
                bestStudentsInt++;
            }
        }

        OptionalDouble average = Arrays.stream(notesArray).average();
        double averageString  = average.getAsDouble();


        System.out.println("Vous avez saisi les notes : " + Arrays.toString(notesArray) +". " + goodStudentsInt + " élèves sont au dessus de la moyenne."
            + badStudentsInt + " élèves sont en dessous de 8. Et " + bestStudentsInt + " élèves ont plus de 15 ! GG à eux ! La moyenne est de " + averageString + ". " );
        scanner.close();
    }
}
