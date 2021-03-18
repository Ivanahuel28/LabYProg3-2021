package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
        */

        Scanner entradaEscaner = new Scanner (System.in);

        System.out.printf("\nIngrese velocidad : \n");

        String entrada = entradaEscaner.nextLine();

        float valor = Float.parseFloat(entrada);

        // v*1000/3600

        System.out.println(String.format("%.2f",valor) +" Km/h = " + String.format("%.2f",valor*1000/3600) + " m/s " );
    }
}
