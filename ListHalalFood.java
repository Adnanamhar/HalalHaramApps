package com.example.halalharam;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListHalalFood extends RecyclerView.Adapter<ListHalalFood.ListViewHolder> {
    private ArrayList<HalalFood> listMakananHalal;

    public ListHalalFood(ArrayList<HalalFood> list) {
        this.listMakananHalal = list;
    }

    @NonNull
    @Override
    public ListHalalFood.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_makanan, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListHalalFood.ListViewHolder holder, final int position) {
        HalalFood halalFood = listMakananHalal.get(position);
        Glide.with(holder.itemView.getContext())
                .load(halalFood.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhotoHalal);
        holder.tvNameHalal.setText(halalFood.getName());
        holder.tvDetailHalal.setText(halalFood.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmove = new Intent(view.getContext(),ActivityDetailMakananHalal.class);
                intentmove.putExtra("objek",listMakananHalal.get(position));
                view.getContext().startActivity(intentmove);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMakananHalal.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgPhotoHalal;
        public TextView tvNameHalal, tvDetailHalal;

        public ListViewHolder(View itemView) {
            super(itemView);
            imgPhotoHalal = itemView.findViewById(R.id.img_item_photo);
            tvNameHalal = itemView.findViewById(R.id.tv_item_name);
            tvDetailHalal = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
