package fr.training.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Random;

/**
 * Launcher is my main class
 *
 * @author Seb
 * @version 1.0
 */
public class Launcher {
    // Launch project
    public static void main(String[] args) {
        String user = "Seb";
        System.out.println("Hello " + user + " !");

        Random rand = new Random(); //instance of random class
        int upperbound = 250;
        //generate random values from 0-250
        int int_random = rand.nextInt(upperbound);

        System.out.println("Random integer value from 0 to " + (upperbound - 1) + " : " + int_random);

        System.out.println("Somme : " + addition(1, 2));
        hello("Sebastien");
        hello("Marion");
        String impress = verb("Camille");
        System.out.println(impress);

        Date today = new Date();
        System.out.println(today);

        Collection tab = new ArrayList();
        tab.add(1);
        tab.add(5);
        System.out.println(tab.size());
        System.out.println(tab);
        tab.remove(1);
        System.out.println(tab);
    }

    /**
     * addition function
     *
     * @param a
     * @param b
     */
    static int addition(int a, int b) {
        return a + b;
    }

    static void hello(String name) {
        System.out.println("Bonjour à toi " + name);
    }

    static String verb(String input) {
        return ("Salut à toi jeune entrepreneuse " + input + ".");
    }
}

