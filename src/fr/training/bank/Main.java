package fr.training.bank;

public class Main {
    public static void main(String[] args) {

        Account firstAccount = new Account(111111, 100);
        Account secondAccount = new Account(22222, 300);


        Client firstClient = new Client("Sébastien", firstAccount);
        firstClient.addAccount(secondAccount);

        firstAccount.virer(50F, secondAccount);

        firstClient.displayAmount();
    }
}
