package fr.training.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BanqueInteractive {

    private ArrayList<Client> clientsList = new ArrayList<Client>(); // list of
    private final Scanner scanner = new Scanner(System.in);

    void addClient(Client client) { // add client name to the client name list
        this.clientsList.add(client);
    }

    void bilanClient(Client client) { // display the amount of a client's accounts
        client.displayAmount();
    }

    void displayBilanAll() { // display the amount on account of every client in the bank
        for (Client client : clientsList) {
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

        switch (inputInt) {
            case 1:
                interactionAddClient();
                break;
            case 2:
                interactionOperationOnClient();
                break;
            case 3:
                interactionBilan();
                break;
            case 4:
                System.out.println("Merci de votre visite et à bientôt !");
                break;
            default:
                interactionWithClient(); // callback for continue program if incorrect answer
                break;
        }
    }

    Client getClientFromName(String clientName) {
        for (Client c : clientsList) {
            if (c.getName().equals(clientName)) {
                return c;
            }
        }
        return null;
    }

    void interactionAddClient() { // Interaction for add a client
        System.out.println("Entrez le nom du client :");
        String clientName = scanner.nextLine();
        Client client = new Client(clientName, new Account());
        addClient(client);
        System.out.println("Le client " + client.getName() + " a été créé.");
        interactionWithClient();
    }

    void interactionOperationOnClient() {
        System.out.println("Quel client ?");
        String clientName = scanner.nextLine();
        Client matchClient = this.getClientFromName(clientName);
        System.out.println("Quelle opération voulez-vous effectuer avec le client " + clientName + " ?");
        System.out.println("1) Afficher un bilan");
        System.out.println("2) Faire un retrait");
        System.out.println("3) Faire un dépôt");
        System.out.println("4) Faire un virement");
        System.out.println("5) Retour");
        System.out.println("6) Quitter le programme");

        int inputIntOperation = Integer.parseInt(scanner.nextLine());

        switch (inputIntOperation) {
            case 1:
                bilanClient(matchClient);
                break;
            case 2:
                System.out.println("Quel montant souhaitez vous retirer ?");
                int inputRetraitValue = Integer.parseInt(scanner.nextLine());
                clientMakeRetrait(matchClient, inputRetraitValue);
                break;
            case 3:
                //depot
                break;
            case 4:
                //virement
                break;
            case 5:
                //retour
                break;
            case 6:
                break;
            default:
                interactionOperationOnClient(); // callback for continue program if incorrect answer
                break;
        }
    }

    void clientMakeRetrait(Client client, int value) {
        System.out.println("Sur quel compte souhaitez vous effectuer le retrait ?");
        for (Account a : client.getAccountList()) {
            System.out.println(a.getAccountNumber());
        }
    }

    void interactionBilan() { // bilan of all client of the bank from the interaction
        System.out.println("Vous avez voulu un bilan général");
        displayBilanAll();
        interactionWithClient();
    }
}
