package com.company.Ej2;

public class Person {

    // attributes
    private String dni;
    private String name;
    private String lastName;
    private String email;
    private String homeAddress;

    public Person(){

    }

    public Person(String dni, String name, String lastName, String email, String homeAddress) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.homeAddress = homeAddress;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                '}';
    }
}
