package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Programa que lea la longitud de los catetos de un triángulo rectángulo y calcule lalongitud
         de la hipotenusa según el teorema de Pitágoras.
        */

        Scanner entradaEscaner = new Scanner (System.in);

        System.out.printf("\nIngrese valor cateto A : \n");

        String entrada = entradaEscaner.nextLine();

        float catA = Float.parseFloat(entrada);

        System.out.printf("\nIngrese valor cateto B : \n");

        entrada = entradaEscaner.nextLine();

        float catB = Float.parseFloat(entrada);

        //System.out.println(String.format("%.2f",valor) +" Km/h = " + String.format("%.2f",valor*1000/3600) + " m/s " );

        System.out.println("\nCateto A : " + String.format("%.2f",catA));
        System.out.println("\nCateto B : " + String.format("%.2f",catB));

        System.out.println("\nHipotenusa : " + String.format("%.2f",(float)Math.sqrt((double)(catA*catA+catB*catB))));
    }
}

