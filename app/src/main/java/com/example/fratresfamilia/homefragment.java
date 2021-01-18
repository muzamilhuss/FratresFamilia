package com.example.fratresfamilia;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class homefragment extends Fragment implements RecyclerViewclickInterface{

    private RecyclerView recyclerView;
    private List<ImageSliderModel> imageSliderModels;
    private List<firebaseitemdata> firebaseitemdataList;
    private HomeRecycleViewAdopter homeRecycleViewAdopter;
    private List<Integer> integerList;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragmenthome, container, false);
        recyclerView = v.findViewById(R.id.recycle_view);
        imageSliderModels = new ArrayList<>();
        firebaseitemdataList = new ArrayList<>();
        integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);

        imageSliderModels.add(new ImageSliderModel(R.drawable.asdsad));
        imageSliderModels.add(new ImageSliderModel(R.drawable.asd));
        imageSliderModels.add(new ImageSliderModel(R.drawable.download));

        firebaseitemdataList.add(new firebaseitemdata());
        firebaseitemdataList.add(new firebaseitemdata());
        firebaseitemdataList.add(new firebaseitemdata());
        firebaseitemdataList.add(new firebaseitemdata());
        firebaseitemdataList.add(new firebaseitemdata());
        firebaseitemdataList.add(new firebaseitemdata());
        firebaseitemdataList.add(new firebaseitemdata());
        firebaseitemdataList.add(new firebaseitemdata());
        firebaseitemdataList.add(new firebaseitemdata());
        firebaseitemdataList.add(new firebaseitemdata());
        firebaseitemdataList.add(new firebaseitemdata());
        firebaseitemdataList.add(new firebaseitemdata());
        firebaseitemdataList.add(new firebaseitemdata());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                //define span size for this position
                //for example, if you have 2 column per row, you can implement something like that:
                if(position == 0 || position ==1) {
                    return 2; //item will take 2 column (full row size)
                } else {
                    return 1; //you will have 2 rolumn per row
                }
            }
        });
        recyclerView.setLayoutManager(gridLayoutManager);
        homeRecycleViewAdopter = new HomeRecycleViewAdopter(getContext(), imageSliderModels,integerList, firebaseitemdataList,this);
        recyclerView.setAdapter(homeRecycleViewAdopter);

        return v;

    }

    @Override
    public void onItemClick(int postion) {
        System.out.println("==========================="+postion);
        startActivity(new Intent(getContext(),productinfowindow.class));
    }

    @Override
    public void onItemLongClick(int postion) {

    }
}
