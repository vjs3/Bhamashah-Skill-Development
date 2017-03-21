package com.progiants.bhamashahskilldevelopment.activities;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.progiants.bhamashahskilldevelopment.Adapter.PlacesAdapter;
import com.progiants.bhamashahskilldevelopment.Adapter.VideosAdapter;
import com.progiants.bhamashahskilldevelopment.R;
import com.progiants.bhamashahskilldevelopment.VideoItem;
import com.progiants.bhamashahskilldevelopment.YouTubeConnector;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by harshita30 on 21/3/17.
 */
public class TwoFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<VideoItem> videoItemList = new ArrayList<>();
    private VideosAdapter mAdapter;
    private Handler handler;


    public TwoFragment() {
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
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        mAdapter = new VideosAdapter(videoItemList,getActivity());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        handler = new Handler();
        searchOnYoutube("cooking");
        return view;
    }
    private void searchOnYoutube(final String keywords){
        new Thread(){
            public void run(){
                YouTubeConnector yc = new YouTubeConnector(getActivity(),keywords);
                videoItemList = yc.getVideos();
                handler.post(new Runnable(){
                    public void run(){
                        mAdapter.updatevideos(videoItemList);
                    }
                });
            }
        }.start();
    }

}
