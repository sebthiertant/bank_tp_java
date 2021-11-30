package fr.training.example;

public class Exo_06A {
    public static void main (String[] args){

        int[][] inputArray = {{0, 18}, {1, 45}, {45, 48}, {-3, 55}};
        int maxValue = 0;

        for (int i = 0; i < inputArray.length; i++){
            for (int j = 0; j < inputArray[i].length; j++) {
                if (inputArray[i][j] > maxValue){
                    maxValue = inputArray[i][j];
                }
            }
        }
        System.out.println("La valeur maximale est : " + maxValue);
    }
}
