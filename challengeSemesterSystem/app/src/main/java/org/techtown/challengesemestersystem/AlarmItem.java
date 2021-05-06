package org.techtown.challengesemestersystem;

import android.graphics.drawable.Drawable;

public class AlarmItem {

    private Drawable icon; //회원사진
    private String text; //알림내용

    public Drawable getIcon(){
        return icon;
    }

    public String getText(){
        return text;
    }

    public void setIcon(Drawable icon){
        this.icon=icon;
    }

    public void setText(String text){
        this.text=text;
    }

}
