package com.jordimontornes.FooCleanCodeApp.data.provider;

import com.jordimontornes.FooCleanCodeApp.data.dao.FilmDAORepositoryImpl;
import com.jordimontornes.FooCleanCodeApp.data.dao.FilmDaoRepository;
import com.jordimontornes.FooCleanCodeApp.data.dao.FilmDaoToFilmConverter;
import com.jordimontornes.FooCleanCodeApp.data.localresource.LocalDataClient;
import com.jordimontornes.FooCleanCodeApp.data.rest.ApiRestClient;
import com.jordimontornes.FooCleanCodeApp.data.rest.FilmResults;
import com.jordimontornes.FooCleanCodeApp.domain.objects.Film;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;

public class DataProvider {

    ApiRestClient apiRestClient;
    //FilmDaoRepository filmDaoRepository;

    @Inject
    public DataProvider(ApiRestClient apiRestClient) {
        this.apiRestClient = apiRestClient;
    }

    public Observable<List<Film>> getFilms() {
        //return apiRestClient.getEndPoints().getFilms();
        FilmDaoRepository filmDaoRepository = new FilmDAORepositoryImpl();
        return filmDaoRepository.getFilms()
                .flatMapIterable(filmDAOs -> filmDAOs)
                .map(FilmDaoToFilmConverter::getFilmFromDao)
                .toList();
    }
}
