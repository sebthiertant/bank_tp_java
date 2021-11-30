package fr.training.bank;

import java.util.ArrayList;

public class Client {
    private ArrayList<Account> accountList = new ArrayList<Account>();
    private String name;

    public Client(String name, Account account) {
        this.name = name;
        this.accountList.add(account);
    }

    String getName() { // return the Client's name
        return name;
    }

    int accountNumber() { // return the account's number
        return accountList.size();
    }

    void addAccount(Account account) { // add an account to a Client
        this.accountList.add(account);
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
