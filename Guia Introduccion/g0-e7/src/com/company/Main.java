package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        Programa Java que declare una variable C de tipo entero y asignarle un valor.
        Acontinuación mostrar un mensaje indicando si el valor de C es positivo o
        negativo,si es par o impar, si es múltiplo de 5, si es múltiplo de 10
        y si es mayor o menor que100.
        */

        int a = -110;

        // resultado = (condicion)?valor1:valor2;

        System.out.printf("\nDatos del numero %d \n",a);

        System.out.printf("\nSigno : %s",( a >= 0 )?"POSITIVO":"NEGATIVO");

        System.out.printf("\nParidad : %s",( a%2 == 0 )?"PAR":"IMPAR");

        System.out.printf("\nMultiplo de 5 : %s",( a%5 == 0 )?"SI":"NO");

        System.out.printf("\nMultiplo de 10 : %s",( a%10 == 0 )?"SI":"NO");

        System.out.printf("\n%s que 100",( a >= 100 )?"MAYOR O IGUAL":"MENOR");

    }
}
