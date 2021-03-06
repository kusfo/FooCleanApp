package com.jordimontornes.FooCleanCodeApp.view.ui;

import android.util.Log;

import com.jordimontornes.FooCleanCodeApp.data.provider.DataProvider;
import com.jordimontornes.FooCleanCodeApp.data.rest.FilmResults;
import com.jordimontornes.FooCleanCodeApp.Aplication.injection.FooCleanCodeApplication;
import com.jordimontornes.FooCleanCodeApp.domain.objects.Film;

import java.util.List;

import javax.inject.Inject;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivityPresenter {

    @Inject
    DataProvider dataProvider;

    FilmListView filmListView;

    void onCreate(FooCleanCodeApplication fooCleanCodeApplication, FilmListView filmListView) {
        this.filmListView = filmListView;
        fooCleanCodeApplication.getRestDataProviderComponent().inject(this);
    }

    void onResume() {
        Log.i("FooCleanCodeApp","Calling Show FilmDTO list");
        loadFilms();
    }

    private void loadFilms() {
        dataProvider.getFilms()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::handleFilmResults, this::handleGetFilmError, this::handleCompleted);

    }

    void handleCompleted() {
        Log.i("FooCleanCodeApp","Sync Completed");
    }

    void handleGetFilmError(Throwable e) {
        Log.e("FooCleanCodeApp","Error Calling Show FilmDTO list " + e.getMessage());
        filmListView.showFilmListError();
    }

    void handleFilmResults(List<Film> filmList) {
        filmListView.showFilmList(filmList);
    }

}
