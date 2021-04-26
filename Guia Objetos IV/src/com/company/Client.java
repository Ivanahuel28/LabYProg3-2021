package com.company;

public class Client {

    private String name;
    private String phoneNumber;
    private String homeAddress;

    public Client() {
    }

    public Client(String name, String phoneNumber, String homeAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.homeAddress = homeAddress;
    }

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

    /*
    -name : String
    -phoneNumber : String
    -homeAddress : String
     */
}
