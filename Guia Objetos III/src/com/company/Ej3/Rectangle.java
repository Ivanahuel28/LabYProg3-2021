package com.company.Ej3;

public class Rectangle extends Square {

    private double height;

    public Rectangle() {
    }

    public Rectangle(String color, double width, double height) {
        super(color,width);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("{Rectangulo} [color : %s; ancho: %.2f ; alto : %.2f ; area : %.2f ; perimetro : %.2f]"
                ,super.getColor(),
                super.getWidth(),
                this.height,
                this.getArea(),
                this.getPerim());
    }

    @Override
    public double getArea() {
        return (super.getWidth()*this.height);
    }

    @Override
    public double getPerim() {
        return (2*(super.getWidth()+this.height));
    }
}
