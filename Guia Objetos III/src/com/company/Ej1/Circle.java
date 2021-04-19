package com.company.Ej1;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius = 1;
        this.color = "Rojo";
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return (3.1416*this.radius*this.radius);
    }

    @Override
    public String toString(){
        return (String.format("Circulo [Radio: %.2f ;Color: %s ;Area: %.2f]",this.radius,this.color,getArea()));
    }
}
