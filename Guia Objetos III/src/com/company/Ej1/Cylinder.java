package com.company.Ej1;

public class Cylinder extends Circle{

    private double height;

    public Cylinder(){
        this.height = 1;
    }

    public Cylinder(double radius,double height,String color){
        this.height = height;
        this.setColor(color);
        this.setRadius(radius);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return (super.getArea()*height);
    }

    @Override
    public String toString(){
        return (String.format("Cilindro: subclase de  + %s + altura = %.2f",
                super.toString(),this.height));
    }

    @Override
    public double getArea(){
        return ((2*3.1416*this.getRadius()*this.height)+(2*super.getArea()));
    }
}
