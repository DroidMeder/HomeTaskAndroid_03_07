package com.example.hometaskandroid_03_07.fragmentsfortablayout;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.hometaskandroid_03_07.databinding.ItemGridBinding;
import java.util.ArrayList;

public class AdAdaptor extends RecyclerView.Adapter<AdAdaptor.HoldView> {
    ArrayList<Integer> list;

    public AdAdaptor(ArrayList<Integer> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public HoldView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemGridBinding binding = ItemGridBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false);
        return new HoldView(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull HoldView holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    protected static class HoldView extends RecyclerView.ViewHolder{
        ItemGridBinding binding;
        public HoldView(@NonNull ItemGridBinding itemView) {
            super(itemView.getRoot());
            binding=itemView;
        }

        public void bind(Integer integer) {
            binding.imageGrid.setImageResource(integer);
        }
    }
}
