package com.company.Ej3;

public class Main {

    public static void main(String[] args) {

        Rectangle objRectangle = new Rectangle("Rojo",2,5);

        Circle objCircle = new Circle("Azul",4);

        Square objSquare = new Square("Amarillo",5);


        System.out.println(objRectangle.toString());
        System.out.println(objCircle.toString());
        System.out.println(objSquare.toString());
    }
}
