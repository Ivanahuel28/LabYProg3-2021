package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Programa que lea una cantidad de grados Fahrenheit y lo convierta a gradoscentígrados.
         */

        Scanner entradaEscaner = new Scanner (System.in);

        System.out.printf("\nIngrese una temperatura en Fahrenheit : \n");

        String dato = entradaEscaner.nextLine();

        float valor = Float.parseFloat(dato);

        System.out.printf("\nEl numero ingresado fue : %.2f ºF\n",valor);

        // (°F − 32) × 5/9 = 0 °C

        System.out.println("\nSu equivalente en grados centrigrados es : "+ String.format("%.2f",(float)((valor-32)*((float)5/9))) +" ºC\n");
    }
}
