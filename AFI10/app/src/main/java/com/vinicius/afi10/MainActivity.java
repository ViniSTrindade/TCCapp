package com.vinicius.afi10;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyActivity";
    RecyclerView lista;
    RecyclerView.Adapter adapter;
    ArrayList<TrackModel> array = new ArrayList<TrackModel>();

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

        array.add((new TrackModel(R.raw.audio_vc3, "a", false)));
        array.add((new TrackModel(R.raw.audio_vc4, "b", false)));
        array.add((new TrackModel(R.raw.audio_vc5, "c", false)));
    }

    private void estanciaAdapter() {
        adapter = new Adapter(
                getApplicationContext(),
                array);
        lista.setAdapter(adapter);
    }


}