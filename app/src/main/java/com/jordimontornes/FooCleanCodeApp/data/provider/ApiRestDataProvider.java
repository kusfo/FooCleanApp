package com.jordimontornes.FooCleanCodeApp.data.provider;

import com.jordimontornes.FooCleanCodeApp.data.localresource.LocalDataClient;
import com.jordimontornes.FooCleanCodeApp.data.rest.ApiRestClient;
import com.jordimontornes.FooCleanCodeApp.data.rest.FilmResults;

import javax.inject.Inject;

import rx.Observable;

public class ApiRestDataProvider {

    ApiRestClient apiRestClient;

    @Inject
    public ApiRestDataProvider(ApiRestClient apiRestClient) {
        this.apiRestClient = apiRestClient;
    }

    public Observable<FilmResults> getFilms() {
        //return apiRestClient.getEndPoints().getFilms();
        LocalDataClient localDataClient = new LocalDataClient();
        return localDataClient.getFilms();
    }
}
