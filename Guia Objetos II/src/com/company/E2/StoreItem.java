package com.company.E2;

import java.util.UUID;

public class StoreItem {

    private UUID id;
    private String name;
    private String description;
    private double price;

    public StoreItem(String name, String description, double price) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static double getTotalAmount(StoreItem[] storeItems){
        double total = 0;

        for (int i=0;i<storeItems.length;i++){
            total += storeItems[i].price;
        }

        return total;
    }
}
