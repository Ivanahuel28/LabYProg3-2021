package com.company;

import com.company.E1.Author;
import com.company.E1.Book;
import com.company.E2.Client;
import com.company.E2.Invoice;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        /* Ejercicio 1
        Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’.
        b.Imprima por pantalla al autor previamente instanciado.
        c.Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta
            450pesos con una cantidad de 150 copias.
        d.Imprima por pantalla el libro instanciado.
        e.Modifique el precio del libro “Effective Java” a 500 pesos y aumente lacantidad en 50 copias.
        f.Imprima por pantalla los atributos del Autor Joshua, accediendo desde elLibro “Effective Java”.
        g.Agregue un método a la clase Libro que posibilite imprimir en pantalla elsiguiente mensaje:
            “El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”
        h.Modificar la clase Libro, para que acepte más de 1 Autor. Y realizar loscambios necesarios en el
            método del punto g, para imprimir un nuevomensaje que liste los autores que contribuyeron a ese libro.
         */

        /*
        System.out.println("Ejercicio 1 ------------------------------------------------------------");

        Author author = new Author("Joshua","Bloch","joshua@email.com",'M');

        System.out.println(author.toString());

        Book book = new Book("Effective Java",450,150,author);

        book.printInfo();

        book.setPrice(500);

        book.setStock(book.getStock()+50);

        Author author1 = new Author("Ivan","Gomez","ivanahuel@gmail.com",'M');

        book.addAuthor(author1);

        book.printInfo();

         */

        System.out.println("Ejercicio 2 ------------------------------------------------------------");

        Client objClient = new Client("Ivan","ivan@gmail.com",15);

        System.out.println(objClient.toString());

        Invoice objInvoice = new Invoice( objClient , 2000 );

        System.out.println(objInvoice.toString());
    }
}
