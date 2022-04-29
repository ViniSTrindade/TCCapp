package com.vinicius.recyclerview;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DemoFragment extends Fragment {
    public static final String TITLE = "title";
    MyListData[] myListData;

    public DemoFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_demo, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadTracks();
    }


    public void loadTracks() {

        myListData = new MyListData[]{
                new MyListData("ɔɪ", R.raw.audio_vc3, false),
                new MyListData("æ", R.raw.audio_vc4, false),
                new MyListData("ð", R.raw.audio_vc5, false),
                new MyListData("θ", R.raw.audio_vc6, false),
                new MyListData("ʃ", R.raw.audio_vc7, false),
                new MyListData("ŋ", R.raw.audio_vc3, false),
                new MyListData("ʒ", R.raw.audio_vc4, false),
                new MyListData("ð", R.raw.audio_vc5, false),
                new MyListData("ʊ", R.raw.audio_vc6, false),
                new MyListData("ɑː", R.raw.audio_vc7, false),
                new MyListData("ɔɪ", R.raw.audio_vc3, false),
                new MyListData("æ", R.raw.audio_vc4, false),
                new MyListData("ð", R.raw.audio_vc5, false),
                new MyListData("θ", R.raw.audio_vc6, false),
                new MyListData("ʃ", R.raw.audio_vc7, false),
                new MyListData("ŋ", R.raw.audio_vc3, false),
                new MyListData("ʒ", R.raw.audio_vc4, false),
                new MyListData("ð", R.raw.audio_vc5, false),
                new MyListData("ʊ", R.raw.audio_vc6, false),
                new MyListData("ɑː", R.raw.audio_vc7, false)
        };

        RecyclerView recyclerView = (RecyclerView) getView().findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 6);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

}