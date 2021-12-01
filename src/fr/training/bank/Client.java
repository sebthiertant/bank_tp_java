package fr.training.bank;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private ArrayList<Account> accountList = new ArrayList<Account>();
    private String name;


    public Client(String name, Account account) { // constructor
        this.name = name;
        this.accountList.add(account);
    }

    public Client(String name) { // constructor
        this.name = name;
    }


    int accountNumber() { // return the account's number
        return accountList.size();
    }

    void addAccount(Account account) { // add an account to a Client
        this.accountList.add(account);
    }

    Client getClientByName(String clientName){
        if(this.name.equals(clientName)){
            return this;
        }
        else {
            System.out.println("Le nom " + clientName + " n'existe pas.");
            return null;
        }
    }

    String getName() { // return the Client's name
        return this.name;
    }

    ArrayList<Account> getAccountList() {
        return this.accountList;
    }

    float getAmount() { // return the amount
        for (Account account : this.accountList) {
            return account.getAmount();
        }
        return 0; // add by IDE not good imo
    }

    void displayAmount() { // print the amount
        for (Account account : this.accountList) {
            System.out.println(account.getAmount());
        }

    }
}
