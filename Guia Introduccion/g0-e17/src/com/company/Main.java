package com.company;

import java.util.Scanner;

public class Main {

    /*
    Programa que lee un número de 3 cifras y muestra sus cifras por separado.
     */

    public static void main(String[] args) {

        mostrar5Cifras(pedirNumero());

    }

    static int pedirNumero(){

        int num;

        Scanner entrada = new Scanner(System.in);

        do {

            System.out.println("Ingrese un numero de cinco cifras");

            num  = entrada.nextInt();

            System.out.flush();

            if ( num < 10000 || num > 99999 ){
                System.out.println("Tres cifras !!!!");
            }

        }while ( num < 10000 || num > 99999 );

        return num;
    }

    static void mostrar5Cifras(int num){

        char c[] = String.valueOf(num).toCharArray();

        System.out.println("\n La cifras impares son " + c[1] + " y " + c[3]);
    }
}
