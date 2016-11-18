package com.jordimontornes.FooCleanCodeApp.view.ui;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jordimontornes.FooCleanCodeApp.data.rest.FilmDTO;
import com.jordimontornes.FooCleanCodeApp.R;
import com.jordimontornes.FooCleanCodeApp.domain.objects.Film;

import java.util.List;

public class FilmListAdapter extends RecyclerView.Adapter<FilmListAdapter.ViewHolder>{

    private final List<Film> filmList;

    public FilmListAdapter(List<Film> filmList) {
        this.filmList = filmList;
    }

    @Override
    public FilmListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView v = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_film, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(FilmListAdapter.ViewHolder holder, int position) {
        holder.title.setText(filmList.get(position).getTitle());
        holder.description.setText(filmList.get(position).getDescription());
        holder.year.setText(Integer.toString(filmList.get(position).getRelease_year()));
    }

    @Override
    public int getItemCount() {
        return filmList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public TextView description;
        public TextView year;

        public ViewHolder(CardView v) {
            super(v);
            title = (TextView) v.findViewById(R.id.title);
            description = (TextView) v.findViewById(R.id.description);
            year = (TextView) v.findViewById(R.id.year);
        }
    }
}
