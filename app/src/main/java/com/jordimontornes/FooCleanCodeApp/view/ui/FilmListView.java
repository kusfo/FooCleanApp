package com.jordimontornes.FooCleanCodeApp.view.ui;


import com.jordimontornes.FooCleanCodeApp.data.rest.FilmDTO;
import com.jordimontornes.FooCleanCodeApp.domain.objects.Film;

import java.util.List;

public interface FilmListView {
    void showFilmList(List<Film> filmList);

    void showFilmListError();
}
