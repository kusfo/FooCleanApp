package com.jordimontornes.FooCleanCodeApp.data.localresource;

import com.jordimontornes.FooCleanCodeApp.data.rest.FilmDTO;
import com.jordimontornes.FooCleanCodeApp.data.rest.FilmResults;

import java.util.ArrayList;

import rx.Observable;

public class LocalDataClient {

    public Observable<FilmResults> getFilms() {
        FilmResults filmResults = new FilmResults();
        filmResults.results = new ArrayList<>();
        filmResults.results.add(createFilmDTO(1,"Dos tontos muy tontos", "Barry y Larry viajan por USA",1993));
        filmResults.results.add(createFilmDTO(2,"Algo Pasa con Mary", "Cameron Días, Ben Stiller y esperma",1998));
        filmResults.results.add(createFilmDTO(3,"Vaya par de Idiotas", "Un manco, una tia buena y bolos",1995));
        filmResults.results.add(createFilmDTO(4,"Amor Ciego", "Gwyneth Paltrow gorda",2001));
        filmResults.results.add(createFilmDTO(5,"Osmosis Jones", "Bill Murray en animación",2000));
        filmResults.results.add(createFilmDTO(6,"Yo, Yo mismo e Irene", "La Zellweger cuando estaba de buen ver",2002));
        return Observable.just(filmResults);
    }

    private FilmDTO createFilmDTO(int filmId, String title, String description, int releaseYear){
        FilmDTO filmDTO = new FilmDTO();
        filmDTO.setFilm_id(filmId);
        filmDTO.setTitle(title);
        filmDTO.setDescription(description);
        filmDTO.setRelease_year(releaseYear);
        return filmDTO;
    }
}
