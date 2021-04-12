package com.company.E1;

public class Author {
    //nombre, apellido,email y genero
    private String name;
    private String lastname;
    private String email;
    private char gender;

    public Author(String name, String lastname, String email, char gender) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString(){
        return String.format("[ %s ; %s ; %s ; %s ]",this.name,this.lastname,this.email,(this.gender == 'M')?"masculino":"femenino");
    }
}
