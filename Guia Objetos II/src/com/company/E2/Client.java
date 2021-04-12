package com.company.E2;

import java.util.UUID;

public class Client {

    private UUID id;
    private String name;
    private String email;
    private double discountPercentage;

    public Client(String name, String email, double discountPercentage) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    @Override
    public String toString(){
        return (String.format("Cliente [id= %s ;nombre= %s ;email= %s ;descuento %.2f]",this.id,this.name,this.email,this.discountPercentage));
    }

    /*
    public void printInfo(){
        System.out.println(
                "Datos del Cliente : -----------------" +
                "\n\tID : " + this.id.toString() +
                "\n\tNombre : " + this.name +
                "\n\tEmail : " + this.email +
                "\n\tPorcentaje de descuento" + String.format("%.2f",this.discountPercentage) +
                "\n--------------------------------------"
        );
    }
    */


}
