package com.vinicius.afi10;

import android.content.Context;
import android.graphics.Color;
import android.icu.text.Transliterator;
import android.media.MediaPlayer;
import android.opengl.Visibility;
import android.os.Handler;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    ArrayList<TrackModel> array = new ArrayList<TrackModel>();
    View view;
    ViewHolder viewHolder;
    Context context;
    private int position;
    int selectedPosition=-1;
    MediaPlayer mediaPlayer;

    private static long DURACAO = 0;
    private static final String TAG = "MyActivity";

    public Adapter(Context contextRecebido, ArrayList<TrackModel> lista) {
        context = contextRecebido;
        array = lista;
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener {
        public TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.recycler_view_itens);
            itemView.setOnCreateContextMenuListener(this);
        }

        @Override
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            //Função 1 = Excluir texto
            //Função 2 = Cancelar Menu
            contextMenu.add(Menu.NONE, R.id.excluir, Menu.NONE, "Excluir");
            contextMenu.add(Menu.NONE, R.id.cancelar, Menu.NONE, "Cancelar");
        }
    }

    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(context).inflate(R.layout.recycler_itens_view, parent,false);
        viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int position){

        int pos = position;
        TrackModel track = array.get(pos);
        holder.textView.setText(array.get(pos).getName());
//        holder.textView.setTextColor(Color.BLACK);

        switch (pos) {
            case 3: {
                view.setVisibility(view.INVISIBLE);
            }
            case 9: {
                view.setVisibility(view.INVISIBLE);
            }
            case 27: {
                view.setVisibility(view.INVISIBLE);
            }
            case 33: {
                view.setVisibility(view.INVISIBLE);
            }
            case 38: {
                view.setVisibility(view.INVISIBLE);
            }
            case 39: {
                view.setVisibility(view.INVISIBLE);
            }
        }

        if (pos >= 13 && pos <= 16) {
            view.setVisibility(view.INVISIBLE);
        }
        else if (pos >= 18 && pos <= 23) {
            view.setVisibility(view.INVISIBLE);
        }
        else if (pos >= 42 && pos <= 44) {
            view.setVisibility(view.INVISIBLE);
        }
        else if (pos >= 50 && pos <= 53) {
            view.setVisibility(view.INVISIBLE);
        }
        else { }

        if (pos >=0 && pos <=2){
            holder.textView.setBackgroundColor(Color.YELLOW);
        }
        else if (pos >=6 && pos <=8){
            holder.textView.setBackgroundColor(Color.YELLOW);
        }
        else if (pos == 12){
            holder.textView.setBackgroundColor(Color.YELLOW);
        }
        else if (pos >=4 && pos <=5){
            holder.textView.setBackgroundColor(Color.GREEN);
        }
        else if (pos >=10 && pos <=11){
            holder.textView.setBackgroundColor(Color.GREEN);
        }
        else if (pos ==17){
            holder.textView.setBackgroundColor(Color.GREEN);
        }
        else if (pos >=24 && pos <=26){
            holder.textView.setBackgroundColor(Color.LTGRAY);
        }
        else if (pos >=30 && pos <=32){
            holder.textView.setBackgroundColor(Color.LTGRAY);
        }
        else if (pos >=36 && pos <=37){
            holder.textView.setBackgroundColor(Color.LTGRAY);
        }
        else if (pos >=28 && pos <=29){
            holder.textView.setBackgroundColor(Color.BLUE);
        }
        else if (pos >=34 && pos <=35){
            holder.textView.setBackgroundColor(Color.BLUE);
        }
        else if (pos >=40 && pos <=41){
            holder.textView.setBackgroundColor(Color.BLUE);
        }
        else if (pos >=45 && pos <=47){
            holder.textView.setBackgroundColor(Color.BLUE);
        }
        else if (pos >=48 && pos <=49){
            holder.textView.setBackgroundColor(Color.RED);
        }
        else if (pos >=54 && pos <=66){
            holder.textView.setBackgroundColor(Color.RED);
        }
        else{}

        holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
//                        holder.textView.setTextColor(Color.BLACK);
                        if (mediaPlayer != null) {
                            if (mediaPlayer.isPlaying()) {
                                mediaPlayer.stop();
                                mediaPlayer.reset();
                                track.setPlaying(false);
                            }
                        }
                        try {
                            mediaPlayer = MediaPlayer.create(context, track.getId());
                            if (mediaPlayer.isPlaying()) {
                                mediaPlayer.stop();
                                mediaPlayer.reset();
                                track.setPlaying(false);
                            } else {
                                mediaPlayer.start();
                                DURACAO = mediaPlayer.getDuration();

                                view.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        view.setEnabled(true);
                                    }
                                }, DURACAO);
                                view.setEnabled(false);
                                holder.textView.setTextColor(Color.BLACK);
                            }
                        } catch (Exception e) {
                            Log.e("Exception", e.getMessage());
                        }
                    }
                });

        holder.textView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                setPosicao(holder.getAdapterPosition());
                return  false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return array.size();
    }

    private int posicao;
    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

}

