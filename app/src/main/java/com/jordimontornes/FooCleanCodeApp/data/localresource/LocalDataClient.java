package com.jordimontornes.FooCleanCodeApp.data.localresource;

import com.jordimontornes.FooCleanCodeApp.data.dto.FilmDTO;
import com.jordimontornes.FooCleanCodeApp.data.rest.FilmResults;

import java.util.ArrayList;

import rx.Observable;

public class LocalDataClient {

    public Observable<FilmResults> getFilms() {
        FilmResults filmResults = new FilmResults();
        filmResults.results = new ArrayList<>();
        filmResults.results.add(createFilmDTO());
        return Observable.just(filmResults);
    }

    private FilmDTO createFilmDTO(){
        FilmDTO filmDTO = new FilmDTO();
        filmDTO.setFilm_id(1);
        filmDTO.setTitle("Dos tontos muy tontos");
        filmDTO.setDescription("La comedia del año 1993 ha vuelto entre nosotros");
        filmDTO.setRelease_year(1993);
        return filmDTO;
    }
}
