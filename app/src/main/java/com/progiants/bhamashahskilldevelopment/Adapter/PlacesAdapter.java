package com.progiants.bhamashahskilldevelopment.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.progiants.bhamashahskilldevelopment.R;
import com.progiants.bhamashahskilldevelopment.models.Place;

import java.util.List;

/**
 * Created by harshita30 on 21/3/17.
 */

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.MyViewHolder> {
    private List<Place> placesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.name);
            genre = (TextView) view.findViewById(R.id.address);
            year = (TextView) view.findViewById(R.id.year);
        }
    }


    public PlacesAdapter(List<Place> placesList) {
        this.placesList = placesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.skill_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Place place = placesList.get(position);
        holder.title.setText(place.getName());
//        holder.genre.setText(place.getLocation());
//        holder.year.setText(place.getId());
    }

    @Override
    public int getItemCount() {
        return placesList.size();
    }

    public void updatePlaces(List<Place> places) {
        this.placesList = places;
        notifyDataSetChanged();
    }
}
