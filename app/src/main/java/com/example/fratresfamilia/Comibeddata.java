package com.example.fratresfamilia;

import java.util.ArrayList;

public class Comibeddata {
    private ArrayList<ImageSliderModel> imageSliderModels;
    private  ArrayList<firebaseitemdata> firebaseitemdata;


    public Comibeddata(){}
    public void setImageSliderModels(ArrayList<ImageSliderModel> imageSliderModels) {
        this.imageSliderModels = imageSliderModels;
    }

    public void setFirebaseitemdata(ArrayList<com.example.fratresfamilia.firebaseitemdata> firebaseitemdata) {
        this.firebaseitemdata = firebaseitemdata;
    }

    public ArrayList<ImageSliderModel> getImageSliderModels() {
        return imageSliderModels;
    }

    public ArrayList<com.example.fratresfamilia.firebaseitemdata> getFirebaseitemdata() {
        return firebaseitemdata;
    }

    public Comibeddata(ArrayList<ImageSliderModel> imageSliderModels, ArrayList<com.example.fratresfamilia.firebaseitemdata> firebaseitemdata) {
        this.imageSliderModels = imageSliderModels;
        this.firebaseitemdata = firebaseitemdata;
    }
}
