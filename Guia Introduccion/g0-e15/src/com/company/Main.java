package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Programa que calcula el área de un triángulo a partir de la longitud de sus lados.
        */

        Scanner entradaEscaner = new Scanner (System.in);

        System.out.printf("\nIngrese lado a : \n");

        float ladoA = entradaEscaner.nextFloat();

        System.out.printf("\nIngrese lado b : \n");

        float ladoB = entradaEscaner.nextFloat();

        System.out.printf("\nIngrese lado c : \n");

        float ladoC = entradaEscaner.nextFloat();

        System.out.println("El area del triangulo es : " + areaTriangulo(ladoA,ladoB,ladoC));

        System.out.println("\nAltura : " + hipotenusa(ladoB,ladoC));
    }

    static float areaTriangulo(float a, float b, float c){

        return (a * (hipotenusa(b,c)) / 2) ;
    }

    static float hipotenusa(float x, float y){

        return (float) Math.sqrt(Math.pow(x,2)+Math.pow(y,2));

    }
}