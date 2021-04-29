package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        VideoStoreGestor gestor = new VideoStoreGestor();

        Client objClient1 = new Client("Ivan","2235416798","Calle 1235");
        Client objClient2 = new Client("Marcelo","2341231123123","Avenida 1256");

        Film objFilm1 = new Film(
                "Titanic",
                LocalDate.of(1997,2,5),
                FilmGenre.DRAMA,
                210,
                AudienceRating.R,
                "EEUU",
                "Una joven de la alta sociedad abandona a su arrogante pretendiente por un artista humilde\n en el trasatlántico que se hundió durante su viaje inaugural.",
                10);
        Film objFilm2 = new Film(
                "Buscando a nemo",
                LocalDate.of(2003,7,3),
                FilmGenre.AVENTURA,
                100,
                AudienceRating.G,
                "EEUU",
                "Marlin, un pez payaso, siempre ha intentado proteger de todos los peligros a su hijo.\n Sin embargo, un buzo atrapa al pequeño, y ahora el padre deberá embarcarse en una increíble aventura por las aguas australianas para encontrarlo.",
                8);
    }
}
// 3 de julio de 2003