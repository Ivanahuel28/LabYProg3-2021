package com.company.Ej3;

public class Square extends GeometricalFigure{

    private double width;

    public Square() {
    }

    public Square(String color, double width) {
        super(color);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString(){
        return String.format("{Cuadrado} [color : %s ; ancho : %.2f ; area : %.2f ; perimetro : %.2f]"
        ,super.getColor(),this.width,this.getArea(),this.getPerim());
    }

    @Override
    public double getArea() {
        return this.width*this.width;
    }

    @Override
    public double getPerim() {
        return 4*this.width;
    }
}
