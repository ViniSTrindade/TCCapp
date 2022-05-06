package com.vinicius.afi10;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//    private static final String TAG = "MyActivity";
    RecyclerView lista;
    RecyclerView.Adapter adapter;
    ArrayList<TrackModel> array = new ArrayList<>();

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.recyclerview);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 6);
        lista.setEnabled(false);
        lista.setLayoutManager(layoutManager);
        loadAfiObj();
        estanciaAdapter();
    }



    @Override
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

    private void loadAfiObj(){
//       Fonemas
        array.add(new TrackModel(R.raw.audio_vc3, "e", false));
        array.add(new TrackModel(R.raw.audio_vc4, "ɒ", false));
        array.add(new TrackModel(R.raw.audio_vc5, "ə", false));
        array.add(new TrackModel(0, "", false));
        array.add(new TrackModel(R.raw.audio_vc6, "ɑː", false));
        array.add(new TrackModel(R.raw.audio_vc7, "iː", false));
        array.add(new TrackModel(R.raw.audio_vc7, "ʊ", false));
        array.add(new TrackModel(R.raw.audio_vc7, "ʌ", false));
        array.add(new TrackModel(R.raw.audio_vc7, "æ", false));
        array.add(new TrackModel(0, "", false));
        array.add(new TrackModel(R.raw.audio_vc7, "uː", false));
        array.add(new TrackModel(R.raw.audio_vc7, "ɜː", false));
        array.add(new TrackModel(R.raw.audio_vc7, "ɪ", false));
        array.add(new TrackModel(0, "", false));
        array.add(new TrackModel(0, "", false));
        array.add(new TrackModel(0, "", false));
        array.add(new TrackModel(0, "", false));
        array.add(new TrackModel(R.raw.audio_vc7, "ɔː", false));
        array.add(new TrackModel(0, "", false));
        array.add(new TrackModel(0, "", false));
        array.add(new TrackModel(0, "", false));
        array.add(new TrackModel(0, "", false));
        array.add(new TrackModel(0, "", false));
        array.add(new TrackModel(0, "", false));
        array.add(new TrackModel(R.raw.audio_vc7, "aɪ", false));
        array.add(new TrackModel(R.raw.audio_vc7, "eɪ", false));
        array.add(new TrackModel(R.raw.audio_vc7, "eə", false));
        array.add(new TrackModel(0, "", false));
        array.add(new TrackModel(R.raw.audio_vc7, "p", false));
        array.add(new TrackModel(R.raw.audio_vc7, "t", false));
        array.add(new TrackModel(R.raw.audio_vc7, "əʊ", false));
        array.add(new TrackModel(R.raw.audio_vc7, "ɪə", false));
        array.add(new TrackModel(R.raw.audio_vc7, "aʊ", false));
        array.add(new TrackModel(0, "", false));
        array.add(new TrackModel(R.raw.audio_vc7, "k", false));
        array.add(new TrackModel(R.raw.audio_vc7, "f", false));
        array.add(new TrackModel(R.raw.audio_vc7, "ɔɪ", false));
        array.add(new TrackModel(R.raw.audio_vc7, "ʊə", false));
        array.add(new TrackModel(0, "", false));
        array.add(new TrackModel(0, "", false));
        array.add(new TrackModel(R.raw.audio_vc7, "s", false));
        array.add(new TrackModel(R.raw.audio_vc7, "ʃ", false));
        array.add(new TrackModel(0, "", false));
        array.add(new TrackModel(0, "", false));
        array.add(new TrackModel(0, "", false));
        array.add(new TrackModel(R.raw.audio_vc7, "tʃ", false));
        array.add(new TrackModel(R.raw.audio_vc7, "θ", false));
        array.add(new TrackModel(R.raw.audio_vc7, "h", false));
        array.add(new TrackModel(R.raw.audio_vc7, "b", false));
        array.add(new TrackModel(R.raw.audio_vc7, "d", false));
        array.add(new TrackModel(0, "", false));
        array.add(new TrackModel(0, "", false));
        array.add(new TrackModel(0, "", false));
        array.add(new TrackModel(0, "", false));
        array.add(new TrackModel(R.raw.audio_vc7, "g", false));
        array.add(new TrackModel(R.raw.audio_vc7, "v", false));
        array.add(new TrackModel(R.raw.audio_vc7, "z", false));
        array.add(new TrackModel(R.raw.audio_vc7, "ʒ", false));
        array.add(new TrackModel(R.raw.audio_vc7, "dʒ", false));
        array.add(new TrackModel(R.raw.audio_vc7, "ð", false));
        array.add(new TrackModel(R.raw.audio_vc7, "m", false));
        array.add(new TrackModel(R.raw.audio_vc7, "n", false));
        array.add(new TrackModel(R.raw.audio_vc7, "ŋ", false));
        array.add(new TrackModel(R.raw.audio_vc7, "l", false));
        array.add(new TrackModel(R.raw.audio_vc7, "r", false));
        array.add(new TrackModel(R.raw.audio_vc7, "j", false));
        array.add(new TrackModel(R.raw.audio_vc7, "w", false));
    }

    private void estanciaAdapter() {
        adapter = new Adapter(
                getApplicationContext(),
                array);
        lista.setAdapter(adapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        array.remove(array);
    }

    @Override
    protected void onPause() {
        super.onPause();
        lista.setEnabled(false);
    }
}