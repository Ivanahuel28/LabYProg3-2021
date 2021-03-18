package com.company;

import java.io.Console;

public class Main {
    /*
     * Programa java que realice lo siguiente: declarar una variable N de tipo int,
     * unavariable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
     * A continuación muestra por pantalla: El valor de cada variable, la suma de N + A, ladiferencia de A - N,
     * el valor numérico correspondiente al carácter que contiene lavariable C.
     */

    public static void main(String[] args) {
        int n;
        double a;
        char c;

        n = 5;
        a = 13.4;
        c = '8';

        System.out.println("Los valores son...	 n = " + n + "	a = " + a + "	c = " + c );
        System.out.println("Suma n+a = " + (n+a));
        System.out.println("Diferencia a-n = " + (a-n));
        System.out.println("El valor numerico de c es " + Character.getNumericValue(c)); // este retorna el valor en caso de que sea un numero
        System.out.println("El valor ASCII de c es " + (int)c);	// estorna el valor ascii
    }
}