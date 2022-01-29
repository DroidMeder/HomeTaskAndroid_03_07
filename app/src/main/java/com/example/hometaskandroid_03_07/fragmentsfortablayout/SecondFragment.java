package com.example.hometaskandroid_03_07.fragmentsfortablayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hometaskandroid_03_07.R;
import com.example.hometaskandroid_03_07.databinding.FragmentSecondBinding;
import com.example.hometaskandroid_03_07.databinding.ItemGridBinding;
import java.util.ArrayList;

public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;
    private final ArrayList<Integer> list = new ArrayList<>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(LayoutInflater
                .from(requireContext()), container, false);
        // Inflate the layout for this fragment
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        load();
        binding.recViewOf2Frag.setLayoutManager(new GridLayoutManager(requireContext(), 3));
        AdAdaptor adAdaptor = new AdAdaptor(list);
        binding.recViewOf2Frag.setAdapter(adAdaptor);
    }

    private void load() {
        list.add(R.drawable.rectangle8);
        list.add(R.drawable.rectangle7);
        list.add(R.drawable.rectangle6);
        list.add(R.drawable.rectangle5);
        list.add(R.drawable.rectangle4);
        list.add(R.drawable.rectangle3);
        list.add(R.drawable.rectangle2);
        list.add(R.drawable.rectangle1);
        list.add(R.drawable.rectangle);
        list.add(R.drawable.rectangle8);
        list.add(R.drawable.rectangle7);
        list.add(R.drawable.rectangle6);
        list.add(R.drawable.rectangle5);
        list.add(R.drawable.rectangle4);
        list.add(R.drawable.rectangle3);
        list.add(R.drawable.rectangle2);
        list.add(R.drawable.rectangle1);
        list.add(R.drawable.rectangle);

    }

    public static class AdAdaptor extends RecyclerView.Adapter<AdAdaptor.HoldView2> {
        ArrayList<Integer> list;

        public AdAdaptor(ArrayList<Integer> list) {
            this.list = list;
        }

        @NonNull
        @Override
        public HoldView2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            ItemGridBinding binding = ItemGridBinding.inflate(
                    LayoutInflater.from(parent.getContext()), parent, false);
            return new HoldView2(binding);
        }

        @Override
        public void onBindViewHolder(@NonNull HoldView2 holder, int position) {
            holder.bind(list.get(position));
        }

        @Override
        public int getItemCount() {
            return list.size();
        }


        protected static class HoldView2 extends RecyclerView.ViewHolder{
            ItemGridBinding binding;

            public HoldView2(@NonNull ItemGridBinding itemView) {
                super(itemView.getRoot());
                binding=itemView;
            }

            public void bind(Integer integer) {
                binding.imageGrid.setImageResource(integer);
            }
        }
    }

}