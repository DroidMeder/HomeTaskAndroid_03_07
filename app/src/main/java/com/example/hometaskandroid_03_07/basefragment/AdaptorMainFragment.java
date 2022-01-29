package com.example.hometaskandroid_03_07.basefragment;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.hometaskandroid_03_07.databinding.ItemForMainFragmentBinding;

import java.util.ArrayList;

public class AdaptorMainFragment extends RecyclerView.Adapter<AdaptorMainFragment.MainFragmentViewHolder> {
    ArrayList<Home> list;

    public AdaptorMainFragment(ArrayList<Home> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MainFragmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemForMainFragmentBinding binding =ItemForMainFragmentBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false);
        return new MainFragmentViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MainFragmentViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    protected static class MainFragmentViewHolder extends RecyclerView.ViewHolder{
        ItemForMainFragmentBinding binding;

        public MainFragmentViewHolder(@NonNull ItemForMainFragmentBinding itemView) {
            super(itemView.getRoot());
            binding=itemView;
        }

        public void bind(Home home) {
            binding.imageCity.setImageResource(home.getPath());
            binding.joshuaLTh.setText(home.getDescription());
            binding.september1.setText(home.getDate());
        }
    }
}
