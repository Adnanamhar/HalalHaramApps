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

public class ListHaramFood extends RecyclerView.Adapter<ListHaramFood.ListViewHolder> {

    private ArrayList<HaramFood> listMakananHaram;

    public ListHaramFood(ArrayList<HaramFood> list) {
        this.listMakananHaram = list;
    }

    @NonNull
    @Override
    public ListHaramFood.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_makanan, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListHaramFood.ListViewHolder holder, final int position) {
        HaramFood haramFood = listMakananHaram.get(position);
        Glide.with(holder.itemView.getContext())
                .load(haramFood.getPhotoHaram())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhotoHaram);
        holder.tvNameHaram.setText(haramFood.getNameHaram());
        holder.tvDetailHaram.setText(haramFood.getDetailHaram());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmove = new Intent(view.getContext(),ActivityDetailMakananHaram.class);
                intentmove.putExtra("objek",listMakananHaram.get(position));
                view.getContext().startActivity(intentmove);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMakananHaram.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgPhotoHaram;
        public TextView tvNameHaram, tvDetailHaram;

        public ListViewHolder(View itemView) {
            super(itemView);
            imgPhotoHaram = itemView.findViewById(R.id.img_item_photo);
            tvNameHaram = itemView.findViewById(R.id.tv_item_name);
            tvDetailHaram= itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
