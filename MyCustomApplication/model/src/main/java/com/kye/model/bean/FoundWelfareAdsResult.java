package com.kye.model.bean;

import java.util.ArrayList;

public class FoundWelfareAdsResult{

    public FoundWelfareAdsResult(ArrayList<String> imageUrls,ArrayList<String> adNames,ArrayList<String> urls) {
        this.imageUrls = imageUrls;
        this.adNames = adNames;
        this.urls = urls;
    }

    private ArrayList<String> imageUrls = new ArrayList<String>();
    private ArrayList<String> adNames = new ArrayList<String>();
    private ArrayList<String> urls = new ArrayList<String>();

    public ArrayList<String> getAdNames() {
        return adNames;
    }

    public void setAdNames(ArrayList<String> adNames) {
        this.adNames = adNames;
    }

    public ArrayList<String> getUrls() {
        return urls;
    }

    public void setUrls(ArrayList<String> urls) {
        this.urls = urls;
    }

    public ArrayList<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(ArrayList<String> imageUrls) {
        this.imageUrls = imageUrls;
    }
}
