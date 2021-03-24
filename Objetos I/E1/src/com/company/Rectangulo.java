package com.company;

public class Rectangulo {

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

    private float heigth;
    private float length;

    public Rectangulo(){
        this.heigth = (float)1;
        this.length = (float)1;
    }

    public void setHeigth(float heigth) {
        this.heigth = heigth;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getHeigth(){
        return heigth;
    }

    public float getLength() {
        return length;
    }

    public float getArea(){
        return (heigth*length);
    }

    public float getPerimeter(){
        return (2*(heigth+length));
    }
}
