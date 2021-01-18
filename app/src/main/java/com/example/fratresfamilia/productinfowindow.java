package com.example.fratresfamilia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class productinfowindow extends AppCompatActivity {

    private SliderView slideView;
    private List<ImageSliderModel> imageSliderModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productinfowindow);
        slideView = findViewById(R.id.imageSliderdata);
        imageSliderModels =  new ArrayList<>();
        imageSliderModels.add(new ImageSliderModel(R.drawable.ddd));
        imageSliderModels.add(new ImageSliderModel(R.drawable.asd));
        imageSliderModels.add(new ImageSliderModel(R.drawable.asdsad));

        slideView.setSliderAdapter(new slideShowAdopter(productinfowindow.this, imageSliderModels));
        slideView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        slideView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        slideView.setAutoCycle(true);
        slideView.startAutoCycle();
    }



    public void bootomsheet(View v){

        Bottomsheetdialog bottomsheetdialog= new Bottomsheetdialog();
        bottomsheetdialog.show(getSupportFragmentManager(),"Bttomsheet");

    }
}