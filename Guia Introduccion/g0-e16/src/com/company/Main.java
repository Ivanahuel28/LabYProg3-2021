package com.company;

import java.util.Scanner;

public class Main {

    /*
    Programa que lee un número de 3 cifras y muestra sus cifras por separado.
     */

    public static void main(String[] args) {

        mostrar3Cifras(pedirNumero());

    }

    static int pedirNumero(){

        int num;

        Scanner entrada = new Scanner(System.in);

        do {

            System.out.println("Ingrese un numero de tres cifras");

            num  = entrada.nextInt();

            System.out.flush();

            if ( num < 100 || num > 999 ){
                System.out.println("Tres cifras !!!!");
            }

        }while ( num < 100 || num > 999 );

        return num;
    }

    static void mostrar3Cifras(int num){

        char c[] = String.valueOf(num).toCharArray();

        System.out.println("\n La cifras son " + c[0] + ", " + c[1] + " y " + c[2]);
    }
}
