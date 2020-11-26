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

public class ListHalalJob extends RecyclerView.Adapter<ListHalalJob.ListViewHolder> {

    private ArrayList<HalalJob> listPekerjaanHalal;

    public ListHalalJob(ArrayList<HalalJob> list) {
        this.listPekerjaanHalal = list;
    }

    @NonNull
    @Override
    public ListHalalJob.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_job, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListHalalJob.ListViewHolder holder, final int position) {
        HalalJob halalJob = listPekerjaanHalal.get(position);
        Glide.with(holder.itemView.getContext())
                .load(halalJob.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(halalJob.getName());
        holder.tvDetail.setText(halalJob.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmove = new Intent(view.getContext(),ActivityDetailPekerjaanHalal.class);
                intentmove.putExtra("objek",listPekerjaanHalal.get(position));
                view.getContext().startActivity(intentmove);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPekerjaanHalal.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgPhoto;
        public TextView tvName, tvDetail;

        public ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
