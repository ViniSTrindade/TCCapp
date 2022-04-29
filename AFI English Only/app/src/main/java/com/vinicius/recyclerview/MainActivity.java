package com.vinicius.recyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    AdapterDemo adapterDemo, adapterDemo2;
    int pos = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager2 viewPager2 = findViewById(R.id.viewpager);
        adapterDemo = new AdapterDemo(getSupportFragmentManager(), getLifecycle());
        viewPager2.setAdapter(adapterDemo);


        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> {
            switch(position) {
                case 0:
                    tab.setText("VOGAIS");
                    break;
                case 1:
                    tab.setText("CONSOANTES");
                    break;
                default:
                    // code block
            }
        }).attach();
    }

}
