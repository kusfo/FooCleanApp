package com.jordimontornes.FooCleanCodeApp.data.dao;

import com.jordimontornes.FooCleanCodeApp.data.rest.FilmDTO;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;

public class FilmDAORepositoryImpl implements FilmDaoRepository {
    @Override
    public Observable<List<FilmDAO>> getFilms() {
        List<FilmDAO> films= new ArrayList<>();
        films.add(createFilmDAO(1,"Dos tontos muy tontos", "Barry y Larry viajan por USA",1993));
        films.add(createFilmDAO(2,"Algo Pasa con Mary", "Cameron Días, Ben Stiller y esperma",1998));
        films.add(createFilmDAO(3,"Vaya par de Idiotas", "Un manco, una tia buena y bolos",1995));
        films.add(createFilmDAO(4,"Amor Ciego", "Gwyneth Paltrow gorda",2001));
        films.add(createFilmDAO(5,"Osmosis Jones", "Bill Murray en animación",2000));
        films.add(createFilmDAO(6,"Yo, Yo mismo e Irene", "La Zellweger cuando estaba de buen ver",2002));
        return Observable.just(films);
    }

    private FilmDAO createFilmDAO(int filmId, String title, String description, int releaseYear){
        FilmDAO filmDAO = new FilmDAO();
        filmDAO.setFilm_id(filmId);
        filmDAO.setTitle(title);
        filmDAO.setDescription(description);
        filmDAO.setRelease_year(releaseYear);
        return filmDAO;
    }
}
