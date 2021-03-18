package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Programa Java que lea un nombre y muestre por pantalla:“Buenos días, {NOMBRE}”.
         */

        String nombre;

        Scanner entradaEscaner = new Scanner (System.in);



        System.out.printf("Ingrese nombre : \n");

        nombre = entradaEscaner.nextLine ();

        System.out.printf("\nBuenos dias, %s",nombre);

        /*
        System.out.println ("Empezamos el programa");

        System.out.println ("Por favor introduzca una cadena por teclado:");

        String entradaTeclado = "";

        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner

        entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner

        System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");
         */
    }
}
