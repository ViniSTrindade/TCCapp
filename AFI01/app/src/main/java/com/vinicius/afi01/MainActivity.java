package com.vinicius.afi01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private TrackModel[] trackList;
    private TrackAdapter adapter;
    private MediaPlayer mediaPlayer;

    private static long DURACAO = 0;
    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.track_list_view);
        loandTracks();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                loandTracks();
                TrackModel track = trackList[i];
                listView.setEnabled(false);

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
//                        listView.setEnabled(false);
                        mediaPlayer.start();
                        track.setPlaying(true);
                        DURACAO = mediaPlayer.getDuration();
                        Log.v(TAG, "Duracao: " + DURACAO);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                listView.setEnabled(true);
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

    private void loandTracks() {
        trackList = new TrackModel[] {
//                Obj Vogais Curtas
                new TrackModel(R.raw.audio_vc3, "ɪ", false),
                new TrackModel(R.raw.audio_vc4, "e", false),
                new TrackModel(R.raw.audio_vc5, "ʊ", false),
                new TrackModel(R.raw.audio_vc6, "ɒ", false),
                new TrackModel(R.raw.audio_vc7, "ʌ", false),
                new TrackModel(R.raw.audio_vc7, "æ", false),
                new TrackModel(R.raw.audio_vc7, "ə", false),
//                Obj Vogais Longas
                new TrackModel(R.raw.audio_vc7, "ɑː", false),
                new TrackModel(R.raw.audio_vc7, "iː", false),
                new TrackModel(R.raw.audio_vc7, "uː", false),
                new TrackModel(R.raw.audio_vc7, "ɜː", false),
                new TrackModel(R.raw.audio_vc7, "ɔː", false),
//                Obj Ditongos
                new TrackModel(R.raw.audio_vc7, "aɪ", false),
                new TrackModel(R.raw.audio_vc7, "eɪ", false),
                new TrackModel(R.raw.audio_vc7, "eə", false),
                new TrackModel(R.raw.audio_vc7, "əʊ", false),
                new TrackModel(R.raw.audio_vc7, "ɪə", false),
                new TrackModel(R.raw.audio_vc7, "aʊ", false),
                new TrackModel(R.raw.audio_vc7, "ɔɪ", false),
                new TrackModel(R.raw.audio_vc7, "ʊə", false),
//                Obj Consoantes Sonoras
                new TrackModel(R.raw.audio_vc7, "b", false),
                new TrackModel(R.raw.audio_vc7, "d", false),
                new TrackModel(R.raw.audio_vc7, "g", false),
                new TrackModel(R.raw.audio_vc7, "v", false),
                new TrackModel(R.raw.audio_vc7, "z", false),
                new TrackModel(R.raw.audio_vc7, "ʒ", false),
                new TrackModel(R.raw.audio_vc7, "dʒ", false),
                new TrackModel(R.raw.audio_vc7, "ð", false),
                new TrackModel(R.raw.audio_vc7, "m", false),
                new TrackModel(R.raw.audio_vc7, "n", false),
                new TrackModel(R.raw.audio_vc7, "ŋ", false),
                new TrackModel(R.raw.audio_vc7, "l", false),
                new TrackModel(R.raw.audio_vc7, "r", false),
                new TrackModel(R.raw.audio_vc7, "j", false),
//                Obj Consoantes Mudas
                new TrackModel(R.raw.audio_vc7, "p", false),
                new TrackModel(R.raw.audio_vc7, "t", false),
                new TrackModel(R.raw.audio_vc7, "k", false),
                new TrackModel(R.raw.audio_vc7, "f", false),
                new TrackModel(R.raw.audio_vc7, "s", false),
                new TrackModel(R.raw.audio_vc7, "ʃ", false),
                new TrackModel(R.raw.audio_vc7, "tʃ", false),
                new TrackModel(R.raw.audio_vc7, "θ", false),
                new TrackModel(R.raw.audio_vc7, "h", false),
        };
        adapter = new TrackAdapter(MainActivity.this, trackList);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer !=null){
            if (mediaPlayer.isPlaying()){
                mediaPlayer.stop();
                mediaPlayer.reset();
            }
        }
    }
}