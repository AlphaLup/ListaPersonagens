package com.breno.listapersonagens;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter {
    MainActivity mainActivity;
    List<PersoItem> persos;

    public MainAdapter(MainActivity mainActivity, List<PersoItem> persos) {
        this.mainActivity = mainActivity;
        this.persos = persos;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mainActivity);
        View v = inflater.inflate(R.layout.perso_item, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        PersoItem item = persos.get(position);

        View v = holder.itemView;

        ImageView img = v.findViewById(R.id.imvCapaPersoItem);
        img.setImageResource(item.imgPersonagem);

        TextView nome = v.findViewById(R.id.tvNomeItem);
        nome.setText(item.nome);

        TextView temp = v.findViewById(R.id.tvTempItem);
        temp.setText(item.temporada);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity.navegarPersoInfo(item.id);
            }
        });
    }

    @Override
    public int getItemCount() {
        return persos.size();
    }
}
