package com.company;

public class BankAccount {

    /*
    Modele el objeto que representa la cuenta de un banco, con identificador, nombrey balance.

    */
    private String id;
    private String name;
    private double balance;

    public BankAccount(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /*
    a.El método crédito que representa un depósito de dinero en la cuenta.
        Estemétodo debe devolver el balance luego de la operación.
    b.El método débito que representa una sustracción de dinero de la cuenta.
        Este método debe devolver el balance luego de la operación.
        Si el dinero enla cuenta no es suficiente para cubrir la sustracción, se debe imprimir porpantalla un aviso.
    c.Un método que imprima por pantalla las características del objeto.
    */

    public void printAccountNBalance(){
        System.out.println("\nCuenta : [ "+this.id+" , "+this.name+" , $ "+this.balance+" ]");
    }

    public void applyCredit(double credit){
        this.balance += credit;
        this.printAccountNBalance();
    }

    public void applyDebit(double debit){
        if(this.balance < debit){
            System.out.println("\nEl deposito de la cuenta es demasiado bajo para realizar el debito");
        }
        else {
            this.balance -= debit;
            this.printAccountNBalance();
        }
    }
}
