package fr.training.bank;

public class Main {
    public static void main (String[] args) {

        Account firstAccount = new Account(111111, 100);
        Account secondAccount = new Account(22222, 300);

        firstAccount.virer(50, secondAccount);

    }
}
