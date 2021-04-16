package com.company.E3;

import java.util.UUID;

public class Account {

    //CONSTANT
    final private double ALLOWABLEDEBT = -2000;

    // ATTRIBUTES
    private UUID id;
    private Person client;
    private double balance;

    // CONSTRUCTORS
    public Account(){
        this.id = UUID.randomUUID();
    }

    public Account(Person client,double balance){
        this.id = UUID.randomUUID();
        this.client = client;
        this.balance = balance;
    }

    // GETTERS & SETTERS
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Person getClient() {
        return client;
    }

    public void setClient(Person client) {
        this.client = client;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // OTHERS METHODS

    public boolean possibleExtract(double amount){
        return ((this.balance-amount)>ALLOWABLEDEBT);
    }

    public void extract(double amount){

        if(possibleExtract(amount)){
            this.balance -= amount;
        }
        else {
            System.out.println("\nNo es posible realizar esa extraccion");
        }

        System.out.println(this.toString());
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println(this.toString());
    }

    @Override
    public String toString(){
        return (String.format("Cuenta [id= %s ;balance= %.2f ; %s ]",this.id,this.balance,this.client.toString()));
    }

}
