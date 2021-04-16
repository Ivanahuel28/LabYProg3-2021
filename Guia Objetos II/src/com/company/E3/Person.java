package com.company.E3;

import java.util.UUID;

public class Person {

    // ATTRIBUTES
    private UUID id;
    private String name;
    private char genre;


    // CONSTRUCTORS
    public Person(){
        this.id = UUID.randomUUID();
    }

    public Person(String name,char genre){
        this.id = UUID.randomUUID();
        this.name = name;
        this.genre = genre;
    }

    // GETTERS & SETTERS
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    // OTHERS METHODS
    @Override
    public String toString(){
        return (String.format("Cliente [id= %s ;nombre= %s ;Genero %c]",this.id,this.name,this.genre));
    }

}
