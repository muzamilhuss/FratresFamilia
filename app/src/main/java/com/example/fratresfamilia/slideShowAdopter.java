package com.example.fratresfamilia;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.List;

public class slideShowAdopter extends SliderViewAdapter<SlideViewHolder> {
    Context context;
    List<ImageSliderModel> imageSliderModels;

    public slideShowAdopter(Context context, List<ImageSliderModel> imageSliderModels) {
        this.context = context;
        this.imageSliderModels = imageSliderModels;
    }

    @Override
    public SlideViewHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_slider_layout_item,parent,false);
        return new SlideViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SlideViewHolder viewHolder, int position) {
        viewHolder.imageView.setImageResource(imageSliderModels.get(position).getImage());

    }

    @Override
    public int getCount() {
        return imageSliderModels.size();
    }
}


 class SlideViewHolder extends SliderViewAdapter.ViewHolder {
    ImageView imageView;
     public SlideViewHolder(View itemView) {
         super(itemView);
         imageView =  itemView.findViewById(R.id.slideImage);
     }
 }
