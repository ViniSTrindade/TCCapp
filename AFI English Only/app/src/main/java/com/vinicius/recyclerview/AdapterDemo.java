package com.vinicius.recyclerview;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdapterDemo extends FragmentStateAdapter {

    private static final String TAG = "MyActivity";

    public AdapterDemo(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = new DemoFragment();
        Fragment frag = new ViniFragment();
        Bundle args = new Bundle();
        args.putString(DemoFragment.TITLE, "TAB "+ (position+1));
        fragment.setArguments(args);

        if (position == 0){
        return fragment;
        }
        else {
           return frag;
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }

}
