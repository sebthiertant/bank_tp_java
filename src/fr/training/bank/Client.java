package fr.training.bank;

import java.util.ArrayList;

public class Client {
    private ArrayList<Account> account = new ArrayList<Account>();
    private String name;

    public Client(String name, Account account) {
        this.name = name;
        this.account.add(account);
    }

    public String getName() { // return the Client's name
        return name;
    }

    public int accountNumber() { // return the account's number
        return account.size();
    }

    public void addAccount(Account account) { // add an account to a Client
        this.account.add(account);
    }

    public float getAmount() { // return the amount
        for (Account account : this.account) {
            return account.getAmount();
        }
        return 0; // add by IDE not good imo
    }

    public void displayAmount() { // print the amount
        for (Account account : this.account) {
            System.out.println(account.getAmount());
        }

    }
}
