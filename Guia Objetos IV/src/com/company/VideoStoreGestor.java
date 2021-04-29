package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class VideoStoreGestor {

    ArrayList<Client> clients = new ArrayList<Client>();
    ArrayList<Film> films = new ArrayList<Film>();
    ArrayList<Rent> rents = new ArrayList<Rent>();

    public void newRent(Client client,ArrayList<Film> films){

        if (!this.clients.contains(client)) { // si no existe en el sistema lo agrego
            this.clients.add(client);
        }

        for (Film film :films) {
            if (film.getStock() == 0){ // si el stock es 0 se quita de la lista de peliculas a alquilar
                films.remove(film);
            }
        }

        // inicia la renta/alquiler cuando se convoca este metodo
        // como fecha de devolucion : la fecha actual mas 1 semana
        Rent newRent = new Rent(client,films, LocalDate.now(),LocalDate.now().plusDays(7));

        // agrego el alquiler a la lista
        this.rents.add(newRent);
    }

    public String listCurrentsRents(){

        String text = "Alquileres vigentes" ;

        if (this.rents.size()==0){
            text += "\nNO HAY ALQUILERES VIGENTES";
        }
        else{
            for (Rent rent :this.rents) {
                text += "\n" + rent.toString();
            }
        }

        return text;
    }

    public String expectedReturns(LocalDate day){

        String list = "Devoluciones para el dia "+day.toString();

        for (Rent rent : this.rents) {
            list += "\n"+rent.toString();
        }

        return list;
    }

    public String lastTenRentOfClient(Client client){

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



}
