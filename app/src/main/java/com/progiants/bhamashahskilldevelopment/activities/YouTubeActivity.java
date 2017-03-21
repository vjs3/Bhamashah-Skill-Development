package com.progiants.bhamashahskilldevelopment.activities;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.progiants.bhamashahskilldevelopment.R;
import com.progiants.bhamashahskilldevelopment.VideoItem;
import com.progiants.bhamashahskilldevelopment.YouTubeConnector;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Vishwajeet on 21/3/17.
 */

public class YouTubeActivity extends AppCompatActivity {
    private EditText searchInput;
    private ListView videosFound;
    private Handler handler;
    String id,title,thumbnail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_two);
//        searchInput = (EditText) findViewById(R.id.search_input);
//        videosFound = (ListView) findViewById(R.id.videos_found);
        handler = new Handler();
        searchOnYoutube("cooking");
        /*searchInput.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    searchOnYoutube(v.getText().toString());
                    return false;
                }
                return true;
            }
        });*/

    }

    private List<VideoItem> searchResults;

    private void searchOnYoutube(final String keywords){
        new Thread(){
            public void run(){
                YouTubeConnector yc = new YouTubeConnector(YouTubeActivity.this,keywords);
                searchResults = yc.getVideos();
                handler.post(new Runnable(){
                    public void run(){updateVideosFound();}
                });
            }
        }.start();
    }

    private void updateVideosFound(){
        ArrayAdapter<VideoItem> adapter = new ArrayAdapter<VideoItem>(getApplicationContext(), R.layout.video_item, searchResults) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                ViewHolder viewHolder;
                if (convertView == null) {
                    convertView = getLayoutInflater().inflate(R.layout.video_item, parent, false);

                    viewHolder = new ViewHolder();
                    viewHolder.thumbnail = (ImageView) convertView.findViewById(R.id.video_thumbnail);
                    viewHolder.title = (TextView) convertView.findViewById(R.id.video_title);
                    viewHolder.uploadedBy = (TextView) convertView.findViewById(R.id.video_uploadedBy);
                    viewHolder.duration = (TextView) convertView.findViewById(R.id.video_duration);

                    convertView.setTag(viewHolder);
                }
                viewHolder = (ViewHolder)convertView.getTag();
                VideoItem searchResult = searchResults.get(position);
                Picasso.with(getApplicationContext()).load(searchResult.getThumbnailURL()).placeholder(R.mipmap.ic_launcher).into(viewHolder.thumbnail);
                viewHolder.title.setText(searchResult.getTitle());
                viewHolder.uploadedBy.setText(searchResult.getUploadedBy());
                viewHolder.duration.setText(searchResult.getDuration());
                return convertView;
            }

        };


        videosFound.setAdapter(adapter);
    }
    public class ViewHolder{
        ImageView thumbnail;
        TextView title;
        TextView uploadedBy;
        TextView duration;

    }

}
