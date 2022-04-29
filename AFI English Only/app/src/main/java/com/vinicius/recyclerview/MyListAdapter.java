package com.vinicius.recyclerview;

import android.media.MediaPlayer;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder> {
    private MyListData[] listdata;
    private MediaPlayer mediaPlayer;
    private static long DURACAO = 0;
    private static final String TAG = "MyActivity";


    // RecyclerView recyclerView;
    public MyListAdapter(MyListData[] listdata) {
        this.listdata = listdata;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.fragment_vini, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        FragmentManager fragmentManager = null;
        Lifecycle lifecycle = null;
        AdapterDemo adapterDemo = new AdapterDemo(fragmentManager, lifecycle);
        adapterDemo.createFragment(position);
        MyListData myListData = listdata[position];
        holder.textView.setText(listdata[position].getName());
        holder.imageView.setImageResource(listdata[position].getId());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+myListData.isPlaying(), Toast.LENGTH_LONG).show();
                MyListData track =  myListData;

                view.setEnabled(false);
               if (mediaPlayer !=null) {
                    if (mediaPlayer.isPlaying()){
                        mediaPlayer.stop();
                        mediaPlayer.reset();
                        track.setPlaying(false);
                    }
                }
                try {
                    mediaPlayer = MediaPlayer.create(view.getContext(), track.getId());
                    if (mediaPlayer.isPlaying()){
                        mediaPlayer.stop();
                        mediaPlayer.reset();
                        track.setPlaying(false);
                    }
                    else {
                        mediaPlayer.start();
                        DURACAO = mediaPlayer.getDuration();
                        track.setPlaying(true);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                view.setEnabled(true);
                            }
                        }, DURACAO);
                    }
                }
                catch (Exception e){
                    Log.e("Exception", e.getMessage());
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;
        public RelativeLayout relativeLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.imageView);
            this.textView = (TextView) itemView.findViewById(R.id.textView);
            relativeLayout = (RelativeLayout)itemView.findViewById(R.id.relativeLayout);
        }
    }
}