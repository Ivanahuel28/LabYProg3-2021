package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        * Programa Java que declare una variable A de tipo entero, asignarle un valor. A
          continuación mostrar un mensaje indicando si A es par o impar.
        * */

        int a = 89;
        String mensaje = "e";

        if (a%2==0){
            mensaje = "par";
        }
        else{
            mensaje = "impar";
        }

        System.out.printf("El numero %d es %s",a,mensaje);
    }
}
