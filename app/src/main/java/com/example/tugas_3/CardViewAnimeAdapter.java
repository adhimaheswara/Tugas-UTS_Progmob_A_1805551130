package com.example.tugas_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewAnimeAdapter extends RecyclerView.Adapter<CardViewAnimeAdapter.CardViewViewHolder> {

    private ArrayList<Anime> listAnime;

    public CardViewAnimeAdapter(ArrayList<Anime>list){
        this.listAnime = list;
    }


    @NonNull
    @Override
    public CardViewAnimeAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_anime, parent, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewAnimeAdapter.CardViewViewHolder holder, int position) {

        Anime anime =listAnime.get(position);

        Glide.with((holder.itemView.getContext()))
                .load(anime.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

        holder.tvName.setText(anime.getName());
        holder.tvDetail.setText(anime.getDetail());

        holder.btnFavorite.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(holder.itemView.getContext(), "Favorite"+
                        listAnime.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.btnShare.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(holder.itemView.getContext(), "Share"+
                        listAnime.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(holder.itemView.getContext(), "Kamu Memilih "+
                        listAnime.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return listAnime.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        Button btnFavorite, btnShare;

        public CardViewViewHolder(View itemView){
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);

        }
    }


}
