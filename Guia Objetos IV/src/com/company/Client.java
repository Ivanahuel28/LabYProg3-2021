package com.company;

public class Client {

    // ATTRIBUTES
    private String name;
    private String phoneNumber;
    private String homeAddress;

    // CONSTRUCTORS
    /*
    public Client() {
    }
    */

    public Client(String name, String phoneNumber, String homeAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.homeAddress = homeAddress;
    }

    // GETTERS & SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "\n Datos del Cliente "
                + "\n Nombre :" + name
                + "\n Telefono :" + phoneNumber+", Direccion :" + homeAddress ;
    }
}
