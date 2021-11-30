package fr.training.bank;

public class Main {
    public static void main (String[] args) {

        Account testAccount = new Account();
        testAccount.depot(150);
        testAccount.displayAmount();
        testAccount.retrait(15);
        testAccount.displayAmount();
    }
}
