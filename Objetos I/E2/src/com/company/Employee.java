package com.company;

import java.awt.*;

public class Employee {

    /*
    Modele el objeto Empleado que posee las siguientes características, dni, nombre,apellido y salario.
    El mismo debe contar con la posibilidad de calcular el salarioanual.
    A su vez se requiere otro método que permita aumentar el salariodependiendo del porcentaje
    que se le pase por parámetro.
    Considere crear unmétodo que facilite imprimir por pantalla las características del objeto
    de lasiguiente forma:Empleado[dni=?, nombre=?, apellido=?, salario=?]
        a.Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de25000.
        b.Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de27500.
        c.Imprima ambos objetos por pantalla
        d.Aumente el salario del empleado Carlos en un 15% e imprima en pantalla elsalario anual del mismo.
    */

    //------------------------------------------------------------------------------------------------------------
    private String dni;
    private String name;
    private String lastName;
    private double wage; // wage = salario
    //------------------------------------------------------------------------------------------------------------

    public Employee(String dni, String name, String lastName, double wage){
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.wage = wage;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getAnualWage(){
        return (12 * getWage());
    }

    public void updateWageByPercentage(float percentage){

        //wage = wage * (1 + (double)percentage/100);
        this.setWage(this.wage * (1 + (double)percentage/100));
    }

    public void showEmployee(){
        System.out.println("\n\tEmpleado[dni= " + this.dni + ", nombre= " + this.name + " , apellido= " + this.lastName + ", salario= " + String.format("%.2f",(float)this.wage) + " ]");
    }
}
