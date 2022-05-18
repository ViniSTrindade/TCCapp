package com.vinicius.afi10;

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
        mFonemas.add(new TrackModel(R.raw.fonema_e, "e", false));
        mFonemas.add(new TrackModel(R.raw.fonema_adepontacabeca, "ɒ", false));
        mFonemas.add(new TrackModel(R.raw.fonema_edepontacabeca, "ə", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(R.raw.fonema_adoispt, "ɑː", false));
        mFonemas.add(new TrackModel(R.raw.fonema_idoispt, "iː", false));
        mFonemas.add(new TrackModel(R.raw.fonema_uferradura, "ʊ", false));
        mFonemas.add(new TrackModel(R.raw.fonema_vinvertido, "ʌ", false));
        mFonemas.add(new TrackModel(R.raw.fonema_shwa, "æ", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(R.raw.fonema_udoispt, "uː", false));
        mFonemas.add(new TrackModel(R.raw.fonema_tresdoispts, "ɜː", false));
        mFonemas.add(new TrackModel(R.raw.fonema_imaiuscula, "ɪ", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(R.raw.fonema_cdepontacabecadoispt, "ɔː", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(R.raw.fonema_aimaiuscula, "aɪ", false));
        mFonemas.add(new TrackModel(R.raw.fonema_eiditongo, "eɪ", false));
        mFonemas.add(new TrackModel(R.raw.fonema_meianove, "eə", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(R.raw.fonema_p, "p", false));
        mFonemas.add(new TrackModel(R.raw.fonema_t, "t", false));
        mFonemas.add(new TrackModel(R.raw.fonema_edepontacabecaferradura, "əʊ", false));
        mFonemas.add(new TrackModel(R.raw.fonema_iedepontacabeca, "ɪə", false));
        mFonemas.add(new TrackModel(R.raw.fonema_aferradura, "aʊ", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(R.raw.fonema_k, "k", false));
        mFonemas.add(new TrackModel(R.raw.fonema_f, "f", false));
        mFonemas.add(new TrackModel(R.raw.fonema_cdepontacabecai, "ɔɪ", false));
        mFonemas.add(new TrackModel(R.raw.fonema_ferraduraedepontacabeca, "ʊə", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(R.raw.fonema_s, "s", false));
        mFonemas.add(new TrackModel(R.raw.fonema_sesticado, "ʃ", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(R.raw.fonema_tsesticado, "tʃ", false));
        mFonemas.add(new TrackModel(R.raw.fonema_omega, "θ", false));
        mFonemas.add(new TrackModel(R.raw.fonema_h, "h", false));
        mFonemas.add(new TrackModel(R.raw.fonema_b, "b", false));
        mFonemas.add(new TrackModel(R.raw.fonema_d, "d", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(0, "", false));
        mFonemas.add(new TrackModel(R.raw.fonema_g, "g", false));
        mFonemas.add(new TrackModel(R.raw.fonema_v, "v", false));
        mFonemas.add(new TrackModel(R.raw.fonema_z, "z", false));
        mFonemas.add(new TrackModel(R.raw.fonema_tresgrande, "ʒ", false));
        mFonemas.add(new TrackModel(R.raw.fonema_dje, "dʒ", false));
        mFonemas.add(new TrackModel(R.raw.fonema_eth, "ð", false));
        mFonemas.add(new TrackModel(R.raw.fonema_m, "m", false));
        mFonemas.add(new TrackModel(R.raw.fonema_n, "n", false));
        mFonemas.add(new TrackModel(R.raw.fonema_nperninha, "ŋ", false));
        mFonemas.add(new TrackModel(R.raw.fonema_l, "l", false));
        mFonemas.add(new TrackModel(R.raw.fonema_r, "r", false));
        mFonemas.add(new TrackModel(R.raw.fonema_j, "j", false));
        mFonemas.add(new TrackModel(R.raw.fonema_w, "w", false));

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
                mediaPlayer.reset();
                track.setPlaying(false);
            }
        }
        try {
            mediaPlayer = MediaPlayer.create(this, track.getId());
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.reset();
                track.setPlaying(false);
            }
            else {
                mediaPlayer.start();
                track.setPlaying(true);
            }
        } catch (Exception e) {
            Log.e("Exception", e.getMessage());
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
               mediaPlayer.reset();
            }
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
               mediaPlayer.release();
            }
        }
    }

}
