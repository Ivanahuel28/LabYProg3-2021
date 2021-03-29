package com.company;

public class Main {

    public static void main(String[] args) {

    /*
    Realice las siguientes operaciones:
    1.Inicialice una cuenta con un monto inicial de 15000.
    2.Realice una operación de crédito de 2500.
    3.Realice una operación de compra de 1500.
    4.Realice una operación de compra de 30000.
    5.Imprima por pantalla los valores de la cuenta y verifique que el balance seacorrecto.
    */

        BankAccount account = new BankAccount("31ASD","Nahuel",15000);

        account.printAccountNBalance();

        account.applyCredit(2500);

        account.applyDebit(1500);

        account.applyDebit(30000);

        account.printAccountNBalance();
    }
}
