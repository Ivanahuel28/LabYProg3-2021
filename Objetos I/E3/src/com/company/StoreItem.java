package com.company;

public class StoreItem {

    /*
    Modele el objeto Ítem de Venta con las siguientes propiedades,
    identificador,descripción, cantidad y precio unitario. Cree los métodos para calcular el
    preciototal teniendo en cuenta el precio unitario y cantidad.
    Un método que permitaimprimir por pantalla los atributos del objeto de la siguiente forma:
    ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
        a.Inicialice el objeto con los atributos necesarios
        b.Imprima por pantalla el objeto inicializado.
     */

    private String id;
    private String description;
    private int amount;
    private float price;

    public StoreItem(String id, String description, int amount, float price) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getTotalPrice(){
        return (this.price*this.amount);
    }

    public void showItem(){
        System.out.println("ItemVenta [id= "+this.id+", descripción= "+this.description+", cantidad="+this.amount+", pUnitario= $ "+this.price+", pTotal= $ "+this.getTotalPrice()+"]");
    }
}
