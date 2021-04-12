package com.company.E1;

import javax.annotation.processing.SupportedSourceVersion;

public class Book {
    //titulo,precio, stock y Autor
    private String title;
    private double price;
    private int stock;
    private Author authors[] = new Author[9];
    private int authorCounter;

    public Book(String title, double price, int stock, Author author) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.authorCounter = 0;
        this.authors[0] = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void addAuthor(Author author){
        this.authorCounter++;
        this.authors[authorCounter] = author;
    }

    /*
    @Override
    public String toString(){
        return String.format("[ %s ; %s ; %s ; %s ]",this.title,this.price,this.stock,this.authors.getName()+" "+this.author.getLastname());
    }
    */

    /*
    g.Agregue un método a la clase Libro que posibilite imprimir en pantalla elsiguiente mensaje:
            “El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”
     */

    public void printInfo(){
        System.out.println("\nEl libro : "+this.title);
        System.out.println("\nAutores : ");
        for (int i=0;i<=authorCounter;i++){
            System.out.println("\n\t\t"+this.authors[i].getName()+" "+this.authors[i].getLastname());
        }
        System.out.println("\nPrecio : $ "+this.price+" - Stock : "+String.format("%d",this.stock));
    }
}
