package com.jordimontornes.FooCleanCodeApp.data.rest;

import retrofit2.http.GET;
import rx.Observable;

public interface ApiEndPoints {

    @GET("film")
    Observable<FilmResults> getFilms();
}
