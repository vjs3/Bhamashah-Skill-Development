package com.progiants.bhamashahskilldevelopment.activities;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.progiants.bhamashahskilldevelopment.Adapter.PlacesAdapter;
import com.progiants.bhamashahskilldevelopment.R;
import com.progiants.bhamashahskilldevelopment.RecyclerViewListener;
import com.progiants.bhamashahskilldevelopment.models.Place;
import com.progiants.bhamashahskilldevelopment.rest.services.PlacesService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by harshita30 on 21/3/17.
 */
public class OneFragment extends Fragment {
    private RecyclerView recyclerView;
    private List<Place> placeList = new ArrayList<>();
    private PlacesAdapter mAdapter;

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        mAdapter = new PlacesAdapter(placeList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        new GetPlaces(getActivity()).execute();
        /*recyclerView.addOnItemTouchListener(
                new RecyclerViewListener(getActivity(), new RecyclerViewListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        // TODO Handle item click
                        Place place = placeList.get(position);

                        Intent i = new Intent(getActivity(), SearchActivity.class);
                        i.putExtra("name",place.getName());
                        i.putExtra("lat",place.getLatitude());
                        i.putExtra("longi",place.getLongitude());
                        startActivity(i);
                    }
                })
        );*/
        return view;
    }
    private class GetPlaces extends AsyncTask<Void, Void, ArrayList<Place>> {

        private ProgressDialog dialog;
        private Context context;
        private String places;

        public GetPlaces(Context context) {
            this.context = context;
        }
        @Override
        protected ArrayList<Place> doInBackground(Void... params) {
            PlacesService service = new PlacesService(
                    "AIzaSyCJwH4s3FH_Ke9Py4yMXEfb20EzCSoGWXc");
            ArrayList<Place> findPlaces = service.findPlaces("cookingschoolinjaipur"); // 77.218276

            for (int i = 0; i < findPlaces.size(); i++) {

                Place placeDetail = findPlaces.get(i);
                Log.e("MainActivity", "places : " + placeDetail.getName());
            }
            return findPlaces;
        }

        @Override
        protected void onPostExecute(ArrayList<Place> result) {
            super.onPostExecute(result);
            if (dialog.isShowing()) {
                dialog.dismiss();
            }
            mAdapter.updatePlaces(result);
        }
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            dialog = new ProgressDialog(context);
            dialog.setCancelable(false);
            dialog.setMessage("Loading..");
            dialog.isIndeterminate();
            dialog.show();
        }

    }


}
