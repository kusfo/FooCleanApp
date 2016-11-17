package com.jordimontornes.FooCleanCodeApp.view.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.jordimontornes.FooCleanCodeApp.R;
import com.jordimontornes.FooCleanCodeApp.data.dto.FilmDTO;
import com.jordimontornes.FooCleanCodeApp.Aplication.injection.FooCleanCodeApplication;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements FilmListView{

    @BindView(R.id.recycler_view_main)
    RecyclerView recyclerView;

    @BindView(R.id.error_view_main)
    TextView errorText;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Inject
    MainActivityPresenter mainActivityPresenter;
    private LinearLayoutManager linearLayoutManager;
    private FilmListAdapter filmListAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((FooCleanCodeApplication)getApplication()).getPresenterComponent().inject(this);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        mainActivityPresenter.onCreate(((FooCleanCodeApplication)getApplication()), this);

    }

    @Override
    protected void onResume(){
        super.onResume();
        mainActivityPresenter.onResume();
    }

    @Override
    public void showFilmList(List<FilmDTO> filmDTOList) {
        Log.i("FooCleanCodeApp","Returning to call Show FilmDTO list");
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        filmListAdapter = new FilmListAdapter(filmDTOList);
        recyclerView.setAdapter(filmListAdapter);
        errorText.setVisibility(View.GONE);
        recyclerView.setVisibility(View.VISIBLE);

    }

    @Override
    public void showFilmListError() {
        Log.i("FooCleanCodeApp","Returning to call Show FilmDTO list Error");
        errorText.setText(getText(R.string.error_list_message));
        errorText.setVisibility(View.VISIBLE);
        recyclerView.setVisibility(View.GONE);
    }
}
