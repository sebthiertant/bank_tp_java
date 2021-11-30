package fr.training.bank;

public class Account {
    private int number;
    private float amount;

    Account(int number, float amount){
        this.number = number;
        this.amount = amount;
    }

    void depot(float value) {
        this.amount += value;
    }

    void retrait(float value) {
        this.amount -= value;
    }

    void virer(float value, Account destinataire){
        this.amount -= value;
        destinataire.depot(value);
        System.out.println("Virement effectué. Votre montant est de " + this.amount + ". Le montant du créditeur est de " + destinataire.getAmount() + ".");
    }

    public void displayAmount() {
        System.out.println(amount);
    }

    public float getAmount() {
        return amount;
    }
}
