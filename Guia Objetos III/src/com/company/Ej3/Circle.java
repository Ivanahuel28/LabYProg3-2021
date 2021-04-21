package com.company.Ej3;

public class Circle extends GeometricalFigure {

    private double radius;

    public Circle() {
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("{Circulo} [color : %s; radio: %.2f ; area : %.2f ; perimetro : %.2f]"
                ,super.getColor(),this.radius,this.getArea(),this.getPerim());
    }

    @Override
    public double getArea() {
        return (3.1416*this.radius*this.radius);
    }

    @Override
    public double getPerim() {
        return (2*3.1416*this.radius);
    }
}
