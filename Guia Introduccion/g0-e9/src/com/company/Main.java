package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Programa Java que lea un número entero por teclado
        y calcule el doble y el triple deese número y lo muestre por pantalla.
         */
        int a;

        Scanner entradaEscaner = new Scanner (System.in);

        System.out.printf("Ingrese un numero entero\n");

        a = entradaEscaner.nextInt();

        System.out.printf("\nEl numero ingresado fue : %d", a);

        System.out.printf("\nEl doble es : %d", (2*a));

        System.out.printf("\nEl triple es : %d", (3*a));

	// write your code here
    }
}
