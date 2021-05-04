package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class VideoStoreGestor {

    ArrayList<Client> clients = new ArrayList<Client>();
    ArrayList<Film> films = new ArrayList<Film>();
    ArrayList<Rent> rents = new ArrayList<Rent>();

    public void newRent(Client client,ArrayList<Film> films){

        if (!this.clients.contains(client)) { // si no existe en el sistema lo agrego
            this.clients.add(client);
        }

        for (Film film :films) {
            film.increasePopularity(); // aumenta la popularidad
            if (film.getStock() == 0){ // si el stock es 0 se quita de la lista de peliculas a alquilar
                films.remove(film);
            } else {
                film.setStock(film.getStock()-1);
            }
        }

        // inicia la renta/alquiler cuando se convoca este metodo
        // como fecha de devolucion : la fecha actual mas 1 semana
        Rent newRent = new Rent(client,films, LocalDate.now(),LocalDate.now().plusDays(7));

        // agrego el alquiler a la lista
        this.rents.add(newRent);
    }

    public void addClient(Client client){
        this.clients.add(client);
    }

    public void listCurrentsRents(){

        System.out.println("Alquileres vigentes....");

        for (Rent rent : this.rents) {
            /*
            System.out.println(String.format("Cliente : %s \n\tPeliculas : ",rent.getClient().getName()));

            for (Film film : rent.getFilms()) {
                System.out.println(film.getTitle());
            }*/
            System.out.println(rent.toString());
        }
    }

    public String expectedReturns(LocalDate day){

        String list = "Devoluciones para el dia "+day.toString();

        for (Rent rent : this.rents) {
            list += "\n"+rent.toString();
        }

        return list;
    }

    public String lastTenRentsOfClient(Client client){

        ArrayList<String> filmsNames = new ArrayList<String>();
        int pos = this.rents.size()-1;

        while (filmsNames.size()<10 && pos>0){
            if (this.rents.get(pos).getClient()==client){
                for (Film film : this.rents.get(pos).getFilms()){
                    filmsNames.add(film.getTitle());
                }
            }
            pos--;
        }

        String list = "Listado de ultimas 10 peliculas alquiladas por "+client.getName();

        for(String title : filmsNames){
            list += "\n"+title;
        }

        return list;
    }

    public void listMostRentedFilms(){
        ArrayList<Film>  filmsCopy = this.films;// realizo una copia

        Collections.sort(filmsCopy,Film.FilmRentsComparator);

        System.out.println("\nLista de peliculas segun cantidad de alquileres (Descendente) : ");

        for (Film film : filmsCopy) {
            System.out.println(String.format("\n %s veces alquilado %d",film.getTitle(),film.getRents()));
        }
    }

    public void popularityByGenre(String filmGenre){
        ArrayList<Film> filmsOfSameGenre = new ArrayList<Film>();

        for (Film film : this.films) {
            if (film.getFilmGenre()==filmGenre){
                filmsOfSameGenre.add(film);
            }
        }

        Collections.sort(filmsOfSameGenre,Film.FilmPopularityComparator);

        System.out.println("Lista de peliculas de "+filmGenre+" segun popularidad");

        for (Film film : filmsOfSameGenre ) {
            System.out.println(String.format("\n %s ; Popularidad : %d",film.getTitle(),film.getPopularity()));
        }
    }
}
