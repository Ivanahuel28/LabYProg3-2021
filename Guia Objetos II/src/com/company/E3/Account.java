package com.company.E3;

import java.util.UUID;

public class Account {

    //CONSTANT
    final private double ALLOWABLEDEBT = -2000;

    // ATTRIBUTES
    private UUID id;
    private Person client;
    private double balance;
    private AccountLog log;

    // CONSTRUCTORS
    public Account(){
        this.id = UUID.randomUUID();
        this.log = new AccountLog();
    }

    public Account(Person client,double balance){
        this.id = UUID.randomUUID();
        this.client = client;
        this.balance = balance;
        this.log = new AccountLog("El cliente "+this.client.getName()+" inicio la cuenta con "+this.balance);
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

    public void extract(double amount){

        if((this.balance-amount)>ALLOWABLEDEBT){
            this.balance -= amount;
            this.log.add(makeExtractLogMessage(amount));
        }
        else {
            System.out.println("\nNo es posible realizar esa extraccion");
        }

        System.out.println(this.toString());
    }

    public void deposit(double amount){
        this.balance += amount;
        this.log.add(makeDepositLogMessage(amount));
        System.out.println(this.toString());
    }

    @Override
    public String toString(){
        return (String.format("Cuenta [id= %s ;balance= %.2f ; %s ]",this.id,this.balance,this.client.toString()));
    }

    private String makeDepositLogMessage(double depositAmount){
        return ("El cliente "+this.client.getName()+" deposito $"+String.format("%.2f",depositAmount));
    }

    private String makeExtractLogMessage(double extractAmount){
        return ("El cliente "+this.client.getName()+" extrajo $"+String.format("%.2f",extractAmount));
    }

    public void printAccountLogs(){
        System.out.println("Registros de la "+this.toString());
        this.log.printAllLogs();
    }

}
