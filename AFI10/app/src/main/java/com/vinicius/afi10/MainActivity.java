package com.vinicius.afi10;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Adapter.OnFonemaClickListener {
    //    private static final String TAG = "MyActivity";
    private RecyclerView mRecyclerview;
    private Adapter mAdapter;
    ArrayList<TrackModel> mFonemas = new ArrayList<>();
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerview = findViewById(R.id.recyclerview);

        estanciaRecyclerview();
        insereAfiObj();
    }

   /* @Override
    public boolean onContextItemSelected(MenuItem item) {
        int posicao = -1;
        posicao = ((Adapter) lista.getAdapter()).getPosicao();

        switch (item.getItemId()){
            case R.id.excluir:
                array.remove(posicao);
                estanciaAdapter();
                break;
            case R.id.cancelar:
                break;
        }
        return super.onContextItemSelected(item);
    }
    */

    private void insereAfiObj(){
//       Fonemas
        mFonemas.add(new TrackModel(R.raw.fonema_ɛ, "ɛ", false));
        mFonemas.add(new TrackModel(R.raw., "ɒ", false));
        mFonemas.add(new TrackModel(R.raw.fonema_ə, "ə", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(R.raw.fonema_ɑ, "ɑː", false));
        mFonemas.add(new TrackModel(R.raw.fonema_i, "iː", false));
        mFonemas.add(new TrackModel(R.raw.fonema_ʊ, "ʊ", false));
        mFonemas.add(new TrackModel(R.raw.fonema_ʌ, "ʌ", false));
        mFonemas.add(new TrackModel(R.raw.fonema_æ, "æ", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(R.raw.fonema_u, "uː", false));
        mFonemas.add(new TrackModel(R.raw., "ɜː", false));
        mFonemas.add(new TrackModel(R.raw.fonema_ɪ, "ɪ", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "ɔː", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(R.raw., "aɪ", false));
        mFonemas.add(new TrackModel(R.raw.fonema_eɪ, "eɪ", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "eə", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "p", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "t", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "əʊ", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "ɪə", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "aʊ", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "k", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "f", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "ɔɪ", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "ʊə", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "s", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "ʃ", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "tʃ", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "θ", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "h", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "b", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "d", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "g", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "v", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "z", false));
        mFonemas.add(new TrackModel(R.raw., "ʒ", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "dʒ", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "ð", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "m", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "n", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "ŋ", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "l", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "r", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "j", false));
        mFonemas.add(new TrackModel(R.raw.audio_vc7, "w", false));

        mAdapter.notifyDataSetChanged();
    }

    private void estanciaRecyclerview() {

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 6);
        mRecyclerview.setLayoutManager(layoutManager);
        mAdapter = new Adapter(mFonemas, this);
        mRecyclerview.setAdapter(mAdapter);
    }

    @Override
    public void onFonemaClick(int position) {

        TrackModel track = mFonemas.get(position);

        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.reset();
                track.setPlaying(false);
            }
        }
        try {
            mediaPlayer = MediaPlayer.create(this, track.getId());
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.reset();
                track.setPlaying(false);
            }
            else {
                mediaPlayer.start();
                track.setPlaying(false);
            }
        } catch (Exception e) {
            Log.e("Exception", e.getMessage());
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.reset();
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.reset();
            }
        }
    }

}
