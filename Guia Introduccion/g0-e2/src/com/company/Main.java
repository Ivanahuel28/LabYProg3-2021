package com.company;

public class Main {

    public static void main(String[] args) {

	/*Programa java que realice lo siguiente: declarar dos variables X e Y de tipo int,
	 dosvariables N y M de tipo double y asigna a cada una un valor.
	 A continuación mostrarpor pantalla una serie de operaciones entre ellas.
	*/
        int x,y;
        double n,m;

        x = 2;
        y = 4;

        n = 2;
        m = 7;

        System.out.println("Suma y+m = " + (y+m));
        System.out.println("Resta n-x = " + (n-x));
        System.out.println("Multiplicacion y*m = " + (y*m));
        System.out.println("Division y/m = " + (y/m));
        System.out.println("Potencia y^x = " + Math.pow(y,(double)x));
    }
}