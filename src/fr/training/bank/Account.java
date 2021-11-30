package fr.training.bank;

public class Account {
    private int number;
    private float amount;

    public Account() { // default constructor
        this.number = 0;
        this.amount = 0;
    }

    public Account(int number, float amount) { // constructor
        this.number = number;
        this.amount = amount;
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

    public void displayAmount() { // display the amount
        System.out.println(amount);
    }

    public float getAmount() { // return the amount
        return amount;
    }
}
