package fr.training.bank;

public class Main {
    public static void main(String[] args) {

        Account firstAccount = new Account();
        Account secondAccount = new Account();

        Client firstClient = new Client("Sébastien", firstAccount);
        Client secondClient = new Client("Boris", secondAccount);

        BanqueInteractive firstBank = new BanqueInteractive();


        firstBank.addClient(firstClient);
        firstBank.addClient(secondClient);

//        firstBank.displayBilanAll();


        firstBank.interactionWithClient();
    }
}
