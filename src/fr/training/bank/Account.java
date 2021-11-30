package fr.training.bank;

public class Account {
    private int number;
    private float amount;


    void depot(float value)
    {
        this.amount += value;
    }

    void retrait(float value){
        this.amount -= value;
    }

    public void displayAmount() {
        System.out.println(amount);
    }

    public float getAmount() {
        return amount;
    }

}
