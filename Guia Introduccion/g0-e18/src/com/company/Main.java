package com.company;

import java.lang.invoke.VarHandle;
import java.util.Scanner;

public class Main {

    /*
    Programa que lee un número de 3 cifras y muestra sus cifras por separado.
     */

    public static void main(String[] args) {

        int h, m ,s;

        String horaValida = "INVALIDA";

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese hora :");

        h  = entrada.nextInt();

        System.out.println("Ingrese minutos:");

        m  = entrada.nextInt();

        System.out.println("Ingrese segundos :");

        s  = entrada.nextInt();

        System.out.flush();

        System.out.println("Hora ingresada : " + h + " : " + m + " : " + s);

        if( h>=0 || h<=24 ){
            if( m>=0 || m<=60 ){
                if( h>=0 || h<=60 ){
                    horaValida = "VALIDA";
                }
            }
        }

        System.out.println("La hora ingresada es " + horaValida);
    }
}