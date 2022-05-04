package com.vinicius.afi10;

import android.content.Context;
import android.graphics.Color;
import android.icu.text.Transliterator;
import android.media.MediaPlayer;
import android.os.Handler;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
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
        holder.textView.setTextColor(Color.BLACK);

        (int i=0; i <=10; i++){
        }


        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.textView.setTextColor(Color.BLACK);
                view.isFocusableInTouchMode();
                if (mediaPlayer !=null) {
                    if (mediaPlayer.isPlaying()){
                        mediaPlayer.stop();
                        mediaPlayer.reset();
                        track.setPlaying(false);
                    }
                }
                try {
                    mediaPlayer = MediaPlayer.create(context, track.getId());
                    if (mediaPlayer.isPlaying()){
                        mediaPlayer.stop();
                        mediaPlayer.reset();
                        track.setPlaying(false);
                    }
                    else {
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
                }
                catch (Exception e){
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

