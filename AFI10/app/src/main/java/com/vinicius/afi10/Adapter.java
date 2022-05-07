package com.vinicius.afi10;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<TrackModel> mFonemas = new ArrayList<TrackModel>();
    private OnFonemaClickListener mOnFonemaClickListener;
    View view;
    ViewHolder viewHolder;
    private int position;
    int selectedPosition=-1;

//    private static final String TAG = "MyActivity";

    public Adapter(ArrayList<TrackModel> fonemas, OnFonemaClickListener onFonemaClickListener) {
        mFonemas = fonemas;
        this.mOnFonemaClickListener = onFonemaClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_itens_view, viewGroup,false);
        viewHolder = new ViewHolder(view, mOnFonemaClickListener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int position){
        int pos = position;
        holder.textView.setText(mFonemas.get(pos).getName());

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
            holder.textView.setBackgroundColor(Color.parseColor("#FCE4EC"));
        }
        else if (pos >=6 && pos <=8){
            holder.textView.setBackgroundColor(Color.parseColor("#FCE4EC"));
        }
        else if (pos == 12){
            holder.textView.setBackgroundColor(Color.parseColor("#FCE4EC"));
        }
        else if (pos >=4 && pos <=5){
            holder.textView.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else if (pos >=10 && pos <=11){
            holder.textView.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else if (pos ==17){
            holder.textView.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else if (pos >=24 && pos <=26){
            holder.textView.setBackgroundColor(Color.parseColor("#D7CCC8"));
        }
        else if (pos >=30 && pos <=32){
            holder.textView.setBackgroundColor(Color.parseColor("#D7CCC8"));
        }
        else if (pos >=36 && pos <=37){
            holder.textView.setBackgroundColor(Color.parseColor("#D7CCC8"));
        }
        else if (pos >=28 && pos <=29){
            holder.textView.setBackgroundColor(Color.parseColor("#4FC3F7"));
        }
        else if (pos >=34 && pos <=35){
            holder.textView.setBackgroundColor(Color.parseColor("#4FC3F7"));
        }
        else if (pos >=40 && pos <=41){
            holder.textView.setBackgroundColor(Color.parseColor("#4FC3F7"));
        }
        else if (pos >=45 && pos <=47){
            holder.textView.setBackgroundColor(Color.parseColor("#4FC3F7"));
        }
        else if (pos >=48 && pos <=49){
            holder.textView.setBackgroundColor(Color.parseColor("#FF8A65"));
        }
        else if (pos >=54 && pos <=66){
            holder.textView.setBackgroundColor(Color.parseColor("#FF8A65"));
        }
        else{}


       /* holder.textView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                setPosicao(holder.getAdapterPosition());
                return  false;
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return mFonemas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView textView;
        OnFonemaClickListener onFonemaClickListener;

        public ViewHolder(View itemView, OnFonemaClickListener onFonemaClickListener) {
            super(itemView);
            textView = itemView.findViewById(R.id.recycler_view_itens);
            this.onFonemaClickListener = onFonemaClickListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onFonemaClickListener.onFonemaClick(getAdapterPosition());

                this.textView.setBackgroundColor(this.textView.getHighlightColor());

            this.textView.postDelayed(new Runnable() {
                @Override
                public void run() {

                    if (getAdapterPosition() >=0 && getAdapterPosition() <=2){
                        textView.setBackgroundColor(Color.parseColor("#FCE4EC"));
                    }
                    else if (getAdapterPosition() >=6 && getAdapterPosition() <=8){
                        textView.setBackgroundColor(Color.parseColor("#FCE4EC"));
                    }
                    else if (getAdapterPosition() == 12){
                        textView.setBackgroundColor(Color.parseColor("#FCE4EC"));
                    }
                    else if (getAdapterPosition() >=4 && getAdapterPosition() <=5){
                        textView.setBackgroundColor(Color.parseColor("#A5D6A7"));
                    }
                    else if (getAdapterPosition() >=10 && getAdapterPosition() <=11){
                        textView.setBackgroundColor(Color.parseColor("#A5D6A7"));
                    }
                    else if (getAdapterPosition() ==17){
                        textView.setBackgroundColor(Color.parseColor("#A5D6A7"));
                    }
                    else if (getAdapterPosition() >=24 && getAdapterPosition() <=26){
                        textView.setBackgroundColor(Color.parseColor("#D7CCC8"));
                    }
                    else if (getAdapterPosition() >=30 && getAdapterPosition() <=32){
                        textView.setBackgroundColor(Color.parseColor("#D7CCC8"));
                    }
                    else if (getAdapterPosition() >=36 && getAdapterPosition() <=37){
                        textView.setBackgroundColor(Color.parseColor("#D7CCC8"));
                    }
                    else if (getAdapterPosition() >=28 && getAdapterPosition() <=29){
                        textView.setBackgroundColor(Color.parseColor("#4FC3F7"));
                    }
                    else if (getAdapterPosition() >=34 && getAdapterPosition() <=35){
                        textView.setBackgroundColor(Color.parseColor("#4FC3F7"));
                    }
                    else if (getAdapterPosition() >=40 && getAdapterPosition() <=41){
                        textView.setBackgroundColor(Color.parseColor("#4FC3F7"));
                    }
                    else if (getAdapterPosition() >=45 && getAdapterPosition() <=47){
                        textView.setBackgroundColor(Color.parseColor("#4FC3F7"));
                    }
                    else if (getAdapterPosition() >=48 && getAdapterPosition() <=49){
                        textView.setBackgroundColor(Color.parseColor("#FF8A65"));
                    }
                    else if (getAdapterPosition() >=54 && getAdapterPosition() <=66){
                        textView.setBackgroundColor(Color.parseColor("#FF8A65"));
                    }
                    else{}

                }
            }, 700);

        }

        /*@Override
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            //Função 1 = Excluir texto
            //Função 2 = Cancelar Menu
            contextMenu.add(Menu.NONE, R.id.excluir, Menu.NONE, "Excluir");
            contextMenu.add(Menu.NONE, R.id.cancelar, Menu.NONE, "Cancelar");
        }*/
    }



   /* private int posicao;
    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }*/

    public interface OnFonemaClickListener{
        void onFonemaClick(int position);
    }
}

