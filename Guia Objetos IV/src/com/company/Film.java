package com.company;

import java.time.LocalDate;

public class Film {

    // attributes
    private String title;
    private LocalDate releaseDate;
    private  String filmGenre;
    private int duration;
    private String audienceRating;
    private String country;
    private String description;
    private int stock;

    // constructors

    public Film(String title, LocalDate releaseDate, String filmGenre, int duration, String audienceRating, String country, String description, int stock) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.filmGenre = filmGenre;
        this.duration = duration;
        this.audienceRating = audienceRating;
        this.country = country;
        this.description = description;
        this.stock = stock;
    }

    // getters & setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getAudienceRating() {
        return audienceRating;
    }

    public void setAudienceRating(String audienceRating) {
        this.audienceRating = audienceRating;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Titulo : '" + title + '\'' +
                "\n Lanzamiento :" + releaseDate +", Genero :" + filmGenre +", Duracion :" + duration +
                "\n Clasificacion :" + audienceRating +", País='" + country + '\'' +
                "\n Descripcion : " + description + '\'' +
                "\n Stock :" + stock ;
    }

}
