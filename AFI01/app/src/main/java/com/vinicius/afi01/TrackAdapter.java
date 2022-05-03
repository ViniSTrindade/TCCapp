package com.vinicius.afi01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TrackAdapter extends BaseAdapter {
    private Context context;
    private TrackModel[] tracks;

    public TrackAdapter(Context context, TrackModel[] tracks) {
        this.context = context;
        this.tracks = tracks;
    }

    @Override
    public int getCount() {
        return tracks.length;
    }

    @Override
    public Object getItem(int i) {
        return tracks[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
       TrackModel track = (TrackModel) getItem(i);

       ViewHolder holder = null;
       if (view == null) {
           view = LayoutInflater.from(context).inflate(R.layout.track_item, viewGroup, false);
           holder = new ViewHolder();
           holder.trackImage = view.findViewById(R.id.track_image);
           holder.titleText = view.findViewById(R.id.track_title);
           view.setTag(holder);
       }
       else {
            holder = (ViewHolder) view.getTag();
       }

       holder.titleText.setText(track.getName());
       if (track.isPlaying()){
           holder.trackImage.setImageResource(R.drawable.ic_pause_circle);
       }else {
           holder.trackImage.setImageResource(R.drawable.ic_play_circle);
       }
       return view;
    }

    static class ViewHolder {
        ImageView trackImage;
        TextView titleText;
    }
}



