package com.vinicius.myapplication.afienglishonly.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.vinicius.myapplication.afienglishonly.fragments.VogaisFragment
import com.vinicius.myapplication.afienglishonly.fragments.ConsoantesFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return   when(position){
            0->{
                VogaisFragment()
            }
            1->{
                ConsoantesFragment()
            }

            else->{
                Fragment()
            }

        }
    }
}