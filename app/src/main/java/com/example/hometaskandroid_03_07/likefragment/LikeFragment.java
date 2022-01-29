package com.example.hometaskandroid_03_07.likefragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hometaskandroid_03_07.R;
import com.example.hometaskandroid_03_07.basefragment.AdaptorMainFragment;
import com.example.hometaskandroid_03_07.basefragment.Home;
import com.example.hometaskandroid_03_07.databinding.FragmentLikeBinding;
import com.example.hometaskandroid_03_07.databinding.FragmentMainBinding;

import java.util.ArrayList;

public class LikeFragment extends Fragment {
    FragmentLikeBinding binding;
    ArrayList<NewLike> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding =FragmentLikeBinding.inflate(LayoutInflater
                .from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        load();
        AdaptorForLikeFragment adaptor = new AdaptorForLikeFragment(list);
        binding.recViewOfLike.setAdapter(adaptor);
    }

    private void load() {
        list=new ArrayList<>();
        list.add(new NewLike(R.drawable.ic_oval, R.string.karennne_liked_your_photo,
                R.string._1h, R.drawable.panaram));
        list.add(new NewLike(R.drawable.ic_oval, R.string.karennne_liked_your_photo,
                R.string._1h, R.drawable.panaram));
        list.add(new NewLike(R.drawable.ic_oval, R.string.karennne_liked_your_photo,
                R.string._1h, R.drawable.panaram));
        list.add(new NewLike(R.drawable.ic_oval, R.string.karennne_liked_your_photo,
                R.string._1h, R.drawable.panaram));
        list.add(new NewLike(R.drawable.ic_oval, R.string.karennne_liked_your_photo,
                R.string._1h, R.drawable.panaram));
        list.add(new NewLike(R.drawable.ic_oval, R.string.karennne_liked_your_photo,
                R.string._1h, R.drawable.panaram));
        list.add(new NewLike(R.drawable.ic_oval, R.string.karennne_liked_your_photo,
                R.string._1h, R.drawable.panaram));
        list.add(new NewLike(R.drawable.ic_oval, R.string.karennne_liked_your_photo,
                R.string._1h, R.drawable.panaram));
        list.add(new NewLike(R.drawable.ic_oval, R.string.karennne_liked_your_photo,
                R.string._1h, R.drawable.panaram));
        list.add(new NewLike(R.drawable.ic_oval, R.string.karennne_liked_your_photo,
                R.string._1h, R.drawable.panaram));
        list.add(new NewLike(R.drawable.ic_oval, R.string.karennne_liked_your_photo,
                R.string._1h, R.drawable.panaram));
        list.add(new NewLike(R.drawable.ic_oval, R.string.karennne_liked_your_photo,
                R.string._1h, R.drawable.panaram));
        list.add(new NewLike(R.drawable.ic_oval, R.string.karennne_liked_your_photo,
                R.string._1h, R.drawable.panaram));
        list.add(new NewLike(R.drawable.ic_oval, R.string.karennne_liked_your_photo,
                R.string._1h, R.drawable.panaram));
        list.add(new NewLike(R.drawable.ic_oval, R.string.karennne_liked_your_photo,
                R.string._1h, R.drawable.panaram));

    }
}