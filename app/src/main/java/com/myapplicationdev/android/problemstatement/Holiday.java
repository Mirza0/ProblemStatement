package com.myapplicationdev.android.problemstatement;

public class Holiday {

    private String holName;
    private boolean holImage;

    public Holiday(String holName, boolean holImage) {
        this.holName = holName;
        this.holImage = holImage;
    }

    public String getName() {return holName;}

    public boolean getImage() {return holImage;}
}
