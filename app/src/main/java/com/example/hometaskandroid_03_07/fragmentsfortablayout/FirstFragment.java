package com.example.hometaskandroid_03_07.fragmentsfortablayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import com.example.hometaskandroid_03_07.R;
import com.example.hometaskandroid_03_07.databinding.FragmentFirstBinding;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;
    private final ArrayList<Integer> list=new ArrayList<>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= FragmentFirstBinding.inflate(LayoutInflater
                .from(requireContext()), container, false);
        // Inflate the layout for this fragment
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        load();
        binding.recViewOf1Frag.setLayoutManager(new GridLayoutManager(requireContext(), 3));
        AdAdaptor adAdaptor = new AdAdaptor(list);
        binding.recViewOf1Frag.setAdapter(adAdaptor);
    }

    private void load() {
        list.add(R.drawable.rectangle);
        list.add(R.drawable.rectangle1);
        list.add(R.drawable.rectangle2);
        list.add(R.drawable.rectangle3);
        list.add(R.drawable.rectangle4);
        list.add(R.drawable.rectangle5);
        list.add(R.drawable.rectangle6);
        list.add(R.drawable.rectangle7);
        list.add(R.drawable.rectangle8);
        list.add(R.drawable.rectangle);
        list.add(R.drawable.rectangle1);
        list.add(R.drawable.rectangle2);
        list.add(R.drawable.rectangle3);
        list.add(R.drawable.rectangle4);
        list.add(R.drawable.rectangle5);
        list.add(R.drawable.rectangle6);
        list.add(R.drawable.rectangle7);
        list.add(R.drawable.rectangle8);

    }
}