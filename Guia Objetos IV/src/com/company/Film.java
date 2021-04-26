package com.company;

import java.time.LocalDate;

public class Film {

    // attributes
    private String title;
    private LocalDate releaseDate;
    private  FilmGenre filmGenre;
    private int duration;
    private AudienceRating audienceRating;
    private String country;
    private String description;
    private int stock;

    // constructors
    public Film() {
    }

    public Film(String title, LocalDate releaseDate, FilmGenre filmGenre, int duration, AudienceRating audienceRating, String country, String description, int stock) {
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

    public FilmGenre getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(FilmGenre filmGenre) {
        this.filmGenre = filmGenre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public AudienceRating getAudienceRating() {
        return audienceRating;
    }

    public void setAudienceRating(AudienceRating audienceRating) {
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



}
