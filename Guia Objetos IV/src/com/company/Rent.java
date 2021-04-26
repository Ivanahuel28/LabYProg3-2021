package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Rent {

    // attributes
    private Client client;
    ArrayList<Film> films = new ArrayList<Film>();
    private LocalDate rentalStartDate;
    private LocalDate rentalEndDate;

    // constructors
    public Rent() {
    }

    public Rent(Client client, ArrayList<Film> films, LocalDate rentalStartDate, LocalDate rentalEndDate) {
        this.client = client;
        this.films = films;
        this.rentalStartDate = rentalStartDate;
        this.rentalEndDate = rentalEndDate;
    }

    // get & set
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ArrayList<Film> getFilms() {
        return films;
    }

    public void setFilms(ArrayList<Film> films) {
        this.films = films;
    }

    public LocalDate getRentalStartDate() {
        return rentalStartDate;
    }

    public void setRentalStartDate(LocalDate rentalStartDate) {
        this.rentalStartDate = rentalStartDate;
    }

    public LocalDate getRentalEndDate() {
        return rentalEndDate;
    }

    public void setRentalEndDate(LocalDate rentalEndDate) {
        this.rentalEndDate = rentalEndDate;
    }
}
