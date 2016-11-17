package com.jordimontornes.FooCleanCodeApp.data.rest;

import retrofit2.http.GET;
import rx.Observable;

public interface ApiEndPoints {
    @GET("actor")
    Observable<ActorResults> getActors();

    @GET("country")
    Observable<CountryResults> getCountries();

    @GET("film")
    Observable<FilmResults> getFilms();
}
