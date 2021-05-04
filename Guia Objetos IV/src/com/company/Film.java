package com.company;

import java.time.LocalDate;
import java.util.Comparator;

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
    private int popularity;
    private int rents;

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
        this.popularity = 0;
        this.rents = 0;
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

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public int getRents() {
        return rents;
    }

    public void setRents(int rents) {
        this.rents = rents;
    }

    @Override
    public String toString() {
        return "Titulo : '" + title + '\'' +
                "\n Lanzamiento :" + releaseDate +", Genero :" + filmGenre +", Duracion :" + duration +
                "\n Clasificacion :" + audienceRating +", País='" + country + '\'' +
                "\n Descripcion : " + description + '\'' +
                "\n Stock :" + stock +
                "\n Popularidad : "+ this.popularity +
                "\n Veces Alquilada : "+ this.rents;
    }

    public void increasePopularity(){
        this.popularity++;
    }

    public static Comparator<Film> FilmPopularityComparator = new Comparator<Film>() {

        public int compare(Film film1, Film film2) {
            int film1Popularity = film1.getPopularity();
            int film2Popularity = film2.getPopularity();

            return film1Popularity-film2Popularity;

            //para orden ascendente
            //return film1Popularity-film2Popularity;
        }
    };

    public static Comparator<Film> FilmRentsComparator = new Comparator<Film>() {

        public int compare(Film film1, Film film2) {
            return film1.getRents()-film2.getRents();
        }
    };
}
