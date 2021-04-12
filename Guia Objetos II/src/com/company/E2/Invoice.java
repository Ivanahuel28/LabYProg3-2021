package com.company.E2;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class Invoice {

    private final UUID id;
    private double totalAmount;
    private LocalDateTime date;
    private Client client;

    public Invoice(Client client, double totalAmount){
        this.id = UUID.randomUUID();
        this.totalAmount = totalAmount;
        this.client = client;
        this.date = LocalDateTime.now();
    }

    // retorna el total con el descuento del cliente aplicado
    public double getFinalAmount(){
        return (this.totalAmount*(1-(this.client.getDiscountPercentage()/100)));
    }

    @Override
    public String toString(){
        return (String.format("Factura[id= %s, fecha= %s, monto= %s, montoDesc= %s,  %s ]",
                this.id,this.date.toString(),this.totalAmount,this.getFinalAmount(),this.client.toString()));
    }
}
