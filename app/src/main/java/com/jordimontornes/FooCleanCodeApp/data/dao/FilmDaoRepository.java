package com.jordimontornes.FooCleanCodeApp.data.dao;

import java.util.List;

import rx.Observable;

public interface FilmDaoRepository {
    Observable<List<FilmDAO>> getFilms();
}
