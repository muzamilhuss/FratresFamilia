package com.example.fratresfamilia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class HomeRecycleViewAdopter extends RecyclerView.Adapter {
    private Context context;
    private List<ImageSliderModel> imageSliderModels;
    private List<Integer> integerList;
    private List<firebaseitemdata> firebaseitemdataList;
    private  RecyclerViewclickInterface recyclerViewclickInterface;


    public HomeRecycleViewAdopter(Context context, List<ImageSliderModel> imageSliderModels, List<Integer> integerList, List<firebaseitemdata> firebaseitemdataList,RecyclerViewclickInterface ok) {
        this.context = context;
        this.imageSliderModels = imageSliderModels;
        this.integerList = integerList;
        this.firebaseitemdataList = firebaseitemdataList;
        this.recyclerViewclickInterface = ok;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if (viewType == 0) {
            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.imagesliderlayout, parent, false);
            return new HomeRecycleViewAdopter.sliderdataholder(view);
        }else if(viewType ==1){
            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.categoryrecycleview, parent, false);
            return new HomeRecycleViewAdopter.category(view);
        }
        else {
            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.itemdatabox, parent, false);
            return new HomeRecycleViewAdopter.Item(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof sliderdataholder) {
            ((HomeRecycleViewAdopter.sliderdataholder) holder).bind(imageSliderModels);

        }
        if (holder instanceof category){
            ((HomeRecycleViewAdopter.category) holder).bind(integerList);

        }
        if (holder instanceof Item) {

            ((HomeRecycleViewAdopter.Item) holder).bind();

        }

    }

    @Override
    public int getItemViewType(int position) {

        return position;
    }

    @Override
    public int getItemCount() {
        return firebaseitemdataList.size() + 1+1;

    }

    class Item extends RecyclerView.ViewHolder {
        private LinearLayout linearLayout;
        public Item(@NonNull View itemView) {
            super(itemView);
            linearLayout = itemView.findViewById(R.id.datanode);
            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    recyclerViewclickInterface.onItemClick(getAdapterPosition());
                }
            });
        }


        void bind() {

        }
    }

    class sliderdataholder extends RecyclerView.ViewHolder {
        SliderView slideView;

        public sliderdataholder(@NonNull View itemView) {
            super(itemView);

            slideView = itemView.findViewById(R.id.imageSlider);


        }


        void bind(List<ImageSliderModel> imageSliderModels1) {
            slideView.setSliderAdapter(new slideShowAdopter(context, imageSliderModels1));

            slideView.setIndicatorAnimation(IndicatorAnimationType.WORM);
            slideView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
            slideView.setAutoCycle(true);
            slideView.startAutoCycle();
        }
    }

    class category extends RecyclerView.ViewHolder {
        RecyclerView recyclerView;
        homeitemadopter ok;

        public category(@NonNull View itemView) {
            super(itemView);

            recyclerView = itemView.findViewById(R.id.recycle_view23);

        }


        void bind(List<Integer> list) {
            ok = new homeitemadopter(context, list);
            recyclerView.setLayoutManager(new GridLayoutManager(context, 6));
            recyclerView.setAdapter(ok);

        }
    }
}
