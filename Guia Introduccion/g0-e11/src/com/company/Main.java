package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Programa que lee por teclado el valor del radio de una circunferencia,
        calcula ymuestra por pantalla la longitud y el área de la circunferencia.
        */

        Scanner entradaEscaner = new Scanner (System.in);

        System.out.printf("\nIngrese valor del radio : \n");

        String entrada = entradaEscaner.nextLine();

        float valor = Float.parseFloat(entrada);

        // 2.pi.r y pi.r^2

        System.out.println("\nLongitud : "+ String.format("%.2f",2*3.14*valor) +" u" );

        System.out.println("\nArea : "+ String.format("%.2f",3.14*valor*valor) +" u^2" );
    }
}
