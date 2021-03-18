package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        Programa java que declare cuatro variables enteras A, B, C y D y asignarle un valor a
        cada una. A continuación realiza las instrucciones necesarias para que: B tome el
        valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.
         */

        int a = 89 , b = 8 , c = 65 , d = 10, temp;

        System.out.println("(a,b,c,d) = (" + a +" , "+ b +" , "+ c +" , "+ d + ")");

        temp = d;
        d = b;
        b = c;
        c = a;
        a = temp;

        System.out.println("(a,b,c,d) = (" + a +" , "+ b +" , "+ c +" , "+ d + ")");
    }
}
