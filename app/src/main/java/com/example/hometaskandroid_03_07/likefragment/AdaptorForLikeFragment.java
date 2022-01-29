package com.example.hometaskandroid_03_07.likefragment;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.hometaskandroid_03_07.databinding.ItemsForLikeFragmentBinding;

import java.util.ArrayList;

public class AdaptorForLikeFragment extends RecyclerView.Adapter<AdaptorForLikeFragment.LikeFragmentViewHolder> {
    ArrayList<NewLike> list;

    public AdaptorForLikeFragment(ArrayList<NewLike> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public LikeFragmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemsForLikeFragmentBinding binding =ItemsForLikeFragmentBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false);
        return new LikeFragmentViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull LikeFragmentViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    protected static class LikeFragmentViewHolder extends RecyclerView.ViewHolder{
        ItemsForLikeFragmentBinding binding;
        public LikeFragmentViewHolder(@NonNull ItemsForLikeFragmentBinding itemView) {
            super(itemView.getRoot());
            binding=itemView;
        }

        public void bind(NewLike newLike) {
            binding.imageOval.setImageResource(newLike.getFirstImage());
            binding.textKaren.setText(newLike.getFirstText());
            binding.textTime.setText(newLike.getSecondText());
            binding.image.setImageResource(newLike.getSecondImage());
        }
    }
}
