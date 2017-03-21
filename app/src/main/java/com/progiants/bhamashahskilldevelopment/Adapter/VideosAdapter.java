package com.progiants.bhamashahskilldevelopment.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.progiants.bhamashahskilldevelopment.R;
import com.progiants.bhamashahskilldevelopment.VideoItem;
import com.progiants.bhamashahskilldevelopment.models.Place;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by harshita30 on 21/3/17.
 */

public class VideosAdapter extends RecyclerView.Adapter<VideosAdapter.MyViewHolder> {

    private List<VideoItem> searchResults;
    private Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView thumbnail;
        TextView title;
        TextView uploadedBy;
        TextView duration;


        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.video_title);
            thumbnail = (ImageView) view.findViewById(R.id.video_thumbnail);
            uploadedBy = (TextView) view.findViewById(R.id.video_uploadedBy);
            duration = (TextView) view.findViewById(R.id.video_duration);

        }
    }

    public VideosAdapter(List<VideoItem> videoItemList, Context context) {
        this.searchResults = videoItemList;
        this.context = context;

    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.video_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
//        super.onBindViewHolder(holder, position);
        VideoItem videoItem = searchResults.get(position);
        Picasso.with(context).load(videoItem.getThumbnailURL()).placeholder(R.mipmap.ic_launcher).into(holder.thumbnail);
        holder.title.setText(videoItem.getTitle());
        holder.uploadedBy.setText(videoItem.getUploadedBy());
        holder.duration.setText(videoItem.getDuration());

    }

    @Override
    public int getItemCount() {
        return searchResults.size();
    }

    public void updatevideos(List<VideoItem> videoItemList) {
        this.searchResults = videoItemList;
        notifyDataSetChanged();
    }
}
