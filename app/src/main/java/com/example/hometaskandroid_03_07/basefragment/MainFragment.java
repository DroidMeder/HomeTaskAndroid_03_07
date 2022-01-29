package com.example.hometaskandroid_03_07.basefragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.hometaskandroid_03_07.R;
import com.example.hometaskandroid_03_07.databinding.FragmentMainBinding;
import java.util.ArrayList;

public class MainFragment extends Fragment {
    FragmentMainBinding binding;
    ArrayList<Home> list;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding =FragmentMainBinding.inflate(LayoutInflater
                .from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        load();
        AdaptorMainFragment adaptorMainFragment = new AdaptorMainFragment(list);
        binding.recView.setAdapter(adaptorMainFragment);
    }

    private void load() {
        list=new ArrayList<>();
        list.add(new Home(R.drawable.rectangle_city, R.string.joshua_l_the_game_in_japan, R.string.september_19));
        list.add(new Home(R.drawable.rectangle_city, R.string.joshua_l_the_game_in_japan, R.string.september_19));
        list.add(new Home(R.drawable.rectangle_city, R.string.joshua_l_the_game_in_japan, R.string.september_19));
        list.add(new Home(R.drawable.rectangle_city, R.string.joshua_l_the_game_in_japan, R.string.september_19));
        list.add(new Home(R.drawable.rectangle_city, R.string.joshua_l_the_game_in_japan, R.string.september_19));
        list.add(new Home(R.drawable.rectangle_city, R.string.joshua_l_the_game_in_japan, R.string.september_19));
        list.add(new Home(R.drawable.rectangle_city, R.string.joshua_l_the_game_in_japan, R.string.september_19));
        list.add(new Home(R.drawable.rectangle_city, R.string.joshua_l_the_game_in_japan, R.string.september_19));
        list.add(new Home(R.drawable.rectangle_city, R.string.joshua_l_the_game_in_japan, R.string.september_19));
    }
}