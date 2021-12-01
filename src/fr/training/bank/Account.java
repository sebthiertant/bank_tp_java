package fr.training.bank;

import java.util.UUID;

public class Account {
    private UUID number = UUID.randomUUID();
    private float amount;

    public Account() { // default constructor
        this.amount = 0;
    }

    void depot(float value) { // add amount
        this.amount += value;
    }

    void retrait(float value) { // pull amount
        this.amount -= value;
    }

    void virer(float value, Account destinataire) { // virement
        this.amount -= value;
        destinataire.depot(value);
        System.out.println("Virement effectué. Votre montant est de " + this.amount + ". Le montant du créditeur est de " + destinataire.getAmount() + ".");
    }

    UUID getAccountNumber(){
        return this.number;
    }

    void displayAmount() { // display the amount
        System.out.println(amount);
    }

    void displayNumberAccount() {
        System.out.println(this.number);
    }

    float getAmount() { // return the amount
        return amount;
    }
}


