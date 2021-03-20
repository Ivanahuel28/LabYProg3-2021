package com.company;

import java.text.Format;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Programa que calcula el volumen de una esfera
        */

        Scanner entradaEscaner = new Scanner (System.in);

        System.out.printf("\nIngrese radio de la esfera : \n");

        float radio = entradaEscaner.nextFloat();

        float vol = (float) (((float) 4/3) * (3.1416) * (Math.pow(radio,3)));

        // (4/3)*pi*r^3

        System.out.println("\nCon radio " + String.format("%.2f",radio) + " el volumen es " + String.format("%.2f",vol));
    }
}

