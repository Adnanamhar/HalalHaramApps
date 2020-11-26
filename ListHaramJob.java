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

public class ListHaramJob extends RecyclerView.Adapter<ListHaramJob.ListViewHolder> {

    private ArrayList<HaramJob> listPekerjaanHaram;

    public ListHaramJob(ArrayList<HaramJob> list) {
        this.listPekerjaanHaram = list;
    }

    @NonNull
    @Override
    public ListHaramJob.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_job, parent, false);
        return new ListHaramJob.ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListHaramJob.ListViewHolder holder, final int position) {
        HaramJob haramJob = listPekerjaanHaram.get(position);
        Glide.with(holder.itemView.getContext())
                .load(haramJob.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(haramJob.getName());
        holder.tvDetail.setText(haramJob.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmove = new Intent(view.getContext(),ActivityDetailPekerjaanharam.class);
                intentmove.putExtra("objek",listPekerjaanHaram.get(position));
                view.getContext().startActivity(intentmove);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPekerjaanHaram.size();
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
