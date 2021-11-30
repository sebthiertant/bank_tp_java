package fr.training.bank;

import java.util.ArrayList;
import java.util.Scanner;
public class BanqueInteractive {
    private ArrayList<Client> clientsList = new ArrayList<Client>(); // list of
    private final Scanner scanner = new Scanner(System.in);

    void addClient(Client client) { // add client name to the client name list
        this.clientsList.add(client);
    }

    void bilanClient(Client client){ // display the amount of a client's accounts
        client.displayAmount();
    }

    void displayBilanAll() { // display the amount on account of every client in the bank
        for (Client client:clientsList) {
            System.out.println("Le client " + client.getName() + " dispose des montants suivants : ");
            client.displayAmount();
        }
    }

     void interactionWithClient() { // Interaction with a client
        System.out.println("Quelle opération voulez-vous effectuer ?");
        System.out.println("1) Ajouter un client");
        System.out.println("2) Effectuer une opération vers un client");
        System.out.println("3) Afficher un bilan général");
        System.out.println("4) Quitter le programme");

        int inputInt = Integer.parseInt(scanner.nextLine());

        switch (scanner.nextInt()) {
            case 1:
                break;
            case 2:
                interactionOperationOnClient();
                break;
            case 3:
                interactionBilan();
                break;
            case 4:
                break;
            default:
                interactionWithClient(); // callback for continue program if incorrect answer
                break;
        }
    }

    void interactionAddClient() { // Interaction for add a client
        System.out.println("Entrez le nom du client :");
        String clientName = scanner.nextLine();
        Client client = new Client(clientName, new Account());
        addClient(client);
        System.out.println("Le client " + client.getName() +" a été créé.");
        interactionWithClient();
    }

    void interactionOperationOnClient() {
        System.out.println("Vous avez voulu opérer avec un client");

    }

    void interactionBilan() { // bilan of all client of the bank from the interaction
        System.out.println("Vous avez voulu un bilan général");
        displayBilanAll();
        interactionWithClient();
    }
}
