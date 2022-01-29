package com.example.hometaskandroid_03_07.acountfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.hometaskandroid_03_07.R;
import com.example.hometaskandroid_03_07.databinding.FragmentAccountBinding;
import com.example.hometaskandroid_03_07.fragmentsfortablayout.AdaptorForTabLayout;
import com.example.hometaskandroid_03_07.fragmentsfortablayout.FirstFragment;
import com.example.hometaskandroid_03_07.fragmentsfortablayout.SecondFragment;

import java.util.Objects;

public class AcountFragment extends Fragment {
    private FragmentAccountBinding binding;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentAccountBinding.inflate(LayoutInflater
                .from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        AdaptorForTabLayout adaptor = new AdaptorForTabLayout(getChildFragmentManager(), 1);
        adaptor.addFragments(new FirstFragment());
        adaptor.addFragments(new SecondFragment());
        binding.viewPager.setAdapter(adaptor);
        binding.tabLayout.setupWithViewPager(binding.viewPager);
        Objects.requireNonNull(binding.tabLayout.getTabAt(0)).setIcon(R.drawable.ic_grid_icon);
        Objects.requireNonNull(binding.tabLayout.getTabAt(1)).setIcon(R.drawable.ic_info_shape);

    }

}