package com.company;

import java.util.Scanner;

public class ConsoleTestMenu {

    /*
    Modele el objeto Rectángulo con sus propiedades, ancho y alto.
    Ambas con valor1,0 por defecto. Este objeto debe exponer los getters y setters necesarios.
    Tambiéndebe contar con un método para calcular el área y perímetro del mismo. Ejecute lassiguientes pruebas:
        a.Inicializar un objeto Rectángulo estableciendo ancho y alto.
        b.Imprimir por pantalla el alto y ancho.
        c.Imprimir por pantalla el área y perímetro.
        d.Modificar el alto y el ancho de la instancia.
        e.Imprimir por pantalla nuevamente el cálculo del área y perímetro.
        f.Inicializar un objeto Rectángulo con los valores por defecto y verificar.
     */

    Scanner scanner = new Scanner(System.in);

    Rectangulo object = new Rectangulo();

    public void menuCycle() {

        char option;

        do {

            showMenu();

            option = scanOption();

            switch (option){
                case 'a' :
                    askParameters();
                    break;

                case 'b':
                    showCurrentsParameters();
                    break;

                case 'c':
                    showAreaNPerimeter();
                    break;

                case 27 :
                    exitMessage();
                    break;

                default:
                    optionErrorMessage();
            }

        }while (option != 27);
    }

    private void showMenu(){

        System.out.println(
                "\nSeleccione opcion:" +
                "\n\t[a] - Ingresar Alto y Ancho" +
                "\n\t[b] - Mostrar Alto y Ancho" +
                "\n\t[c] - Mostrar Area y Perimetro" +
                "\n\t[Esc] - Salir"
        );
    }

    private char scanOption(){

        return (scanner.next().charAt(0));
    }

    private void askParameters(){
        System.out.println("\nIngrese Alto : ");
        object.setHeigth(scanner.nextFloat());
        System.out.println("\nIngrese Ancho : ");
        object.setLength(scanner.nextFloat());
    }

    private void showCurrentsParameters(){
        System.out.println("\nValores del Rectangulo actual");
        System.out.println("\n\tAlto : " + object.getHeigth());
        System.out.println("\n\tAncho : " + object.getLength());
    }

    private void showAreaNPerimeter(){
        System.out.println("\nValores del Rectangulo actual");
        System.out.println("\n\tArea : " + object.getArea());
        System.out.println("\n\tPerimetro : " + object.getPerimeter());
    }

    private void exitMessage(){
        System.out.println("\nPrograma finalizado !!!\n");
    }

    private void optionErrorMessage(){
        System.out.println("\nOpcion ingresada incorrecta :(\n");
    }

}
