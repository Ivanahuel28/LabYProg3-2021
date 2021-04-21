package com.company.Ej3;

abstract class GeometricalFigure {

    private String color;

    public GeometricalFigure(){}

    public GeometricalFigure(String color)
    {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("[{Figura geometrica} color : %s]",this.color);
    }

    public abstract double getArea();

    public abstract double getPerim();
}
