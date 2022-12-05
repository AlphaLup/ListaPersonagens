package com.breno.listapersonagens;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.xmlpull.v1.XmlPullParser;

import java.util.List;

public class InfoAdapter extends RecyclerView.Adapter {
    InfoActivity infoActivity;
    List<PersoInfo> persos;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(infoActivity);
        View v = inflater.inflate((XmlPullParser) infoActivity, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        PersoInfo perso = persos.get(position);
        View v = holder.itemView;

        ImageView img = v.findViewById(R.id.imvPersoFotoInfo);
        img.setImageResource(perso.imgPerso);

        TextView nome = v.findViewById(R.id.tvNomeInfo);
        nome.setText(perso.nome);

        TextView idade = v.findViewById(R.id.tvIdadeInfo);
        idade.setText(perso.idade);

        TextView classe = v.findViewById(R.id.tvClasseInfo);
        classe.setText(perso.classe);

        TextView ator = v.findViewById(R.id.tvAutorInfo);
        ator.setText(perso.ator);

        TextView temp = v.findViewById(R.id.tvTempInfo);
        temp.setText(perso.temp);
    }

    @Override
    public int getItemCount() {
        return persos.size();
    }
}
