package com.jordimontornes.FooCleanCodeApp.view.ui;


import com.jordimontornes.FooCleanCodeApp.data.dto.FilmDTO;

import java.util.List;

public interface FilmListView {
    void showFilmList(List<FilmDTO> filmDTOList);

    void showFilmListError();
}
