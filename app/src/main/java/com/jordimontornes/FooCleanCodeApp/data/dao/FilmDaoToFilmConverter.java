package com.jordimontornes.FooCleanCodeApp.data.dao;

import com.jordimontornes.FooCleanCodeApp.domain.objects.Film;

public class FilmDaoToFilmConverter {
    public static Film getFilmFromDao(FilmDAO filmDAO) {
        Film film = new Film();
        film.setFilm_id(filmDAO.getFilm_id());
        film.setTitle(filmDAO.getTitle());
        film.setDescription(filmDAO.getDescription());
        film.setRelease_year(filmDAO.getRelease_year());
        return film;
    }
}
