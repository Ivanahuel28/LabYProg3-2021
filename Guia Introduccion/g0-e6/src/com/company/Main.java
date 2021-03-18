package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        Programa Java que declare una variable B de tipo entero y asignarle un valor. A
        continuación mostrar un mensaje indicando si el valor de B es positivo o negativo.
        * */

        int a = 0;
        String mensaje;

        if ( a >= 0 ){
            mensaje = "positivo";
        }
        else{
            mensaje = "negativo";
        }

        System.out.printf("El numero %d es %s",a,mensaje);
    }
}