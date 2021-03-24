package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            a.Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de25000.
            b.Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de27500.
            c.Imprima ambos objetos por pantalla
            d.Aumente el salario del empleado Carlos en un 15% e imprima en pantalla elsalario anual del mismo.
        */

	    Employee employee1 = new Employee("23456345","Carlos","Gutierrez",25000);
        Employee employee2 = new Employee("34234123","Ana","Sanchéz",27500);

        employee1.showEmployee();
        employee2.showEmployee();

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nIngrese porcentaje : ");

        employee1.updateWageByPercentage((float) scanner.nextFloat());

        employee1.showEmployee();

        System.out.println("El sueldo anual ahora es de " +  String.format("%.2f",(float)employee1.getAnualWage()));

    }
}
