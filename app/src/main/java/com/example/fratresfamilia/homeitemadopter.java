package com.example.fratresfamilia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.List;

public class homeitemadopter  extends RecyclerView.Adapter{

    private Context context;
    private List<Integer> integerList;

    public homeitemadopter(Context context, List<Integer> integerList) {
        this.context = context;
        this.integerList = integerList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.maincateogryitemlayout, parent, false);
        return new homeitemadopter.dataholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((homeitemadopter.dataholder) holder).bind();
    }

    @Override
    public int getItemCount() {
        return integerList.size();
    }
    class  dataholder extends RecyclerView.ViewHolder{

        public dataholder(@NonNull View itemView) {
            super(itemView);
        }

        void bind( ) {

        }
    }
}
