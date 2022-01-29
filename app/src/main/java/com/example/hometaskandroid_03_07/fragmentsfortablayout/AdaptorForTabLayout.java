package com.example.hometaskandroid_03_07.fragmentsfortablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;

public class AdaptorForTabLayout extends FragmentPagerAdapter {
    private final ArrayList<Fragment> fragments=new ArrayList<>();

    public AdaptorForTabLayout(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public void addFragments(Fragment fragment) {
        this.fragments.add(fragment);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

}
