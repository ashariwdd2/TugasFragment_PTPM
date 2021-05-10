package com.example.recycleview173;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DinasAdapter extends RecyclerView.Adapter<DinasAdapter.ListViewHolder> {
    private Context context;
    private ArrayList<Dinas> dinasModels;

    public DinasAdapter(ArrayList<Dinas> dinasModels, Context context) {
        this.context = context;
        this.dinasModels = dinasModels;
    }
    @NonNull
    @Override
    public DinasAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dinas, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Glide.with(holder.itemView.getContext())
                .load(getDinasModels().get(position).getLogodinas())
                .apply(new RequestOptions().override(75,75))
                .into(holder.logodinas);
        holder.namadinas.setText(getDinasModels().get(position).getNamadinas());
        holder.desdinas.setText(getDinasModels().get(position).getDesdinas());
        holder.details.setOnClickListener(v -> {
            Intent moveIntent = new Intent(context ,DetailDinas.class);
            moveIntent.putExtra("namadinas",getDinasModels().get(position).getNamadinas());
            moveIntent.putExtra("desdinas",getDinasModels().get(position).getDesdinas());
            moveIntent.putExtra("logodinas",getDinasModels().get(position).getLogodinas());
            context.startActivity(moveIntent);
        });
    }

    @Override
    public int getItemCount() {
        return getDinasModels().size();
    }

    public ArrayList<Dinas> getDinasModels() {return dinasModels;}

    public static class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView logodinas;
        TextView namadinas;
        TextView desdinas;
        Button details;

        ListViewHolder(View itemview) {
            super(itemview);
            logodinas = itemview.findViewById(R.id.logo);
            namadinas = itemview.findViewById(R.id.namadinas);
            desdinas = itemview.findViewById(R.id.desdinas);
            details = itemview.findViewById(R.id.btn_detail);
        }
    }
}
