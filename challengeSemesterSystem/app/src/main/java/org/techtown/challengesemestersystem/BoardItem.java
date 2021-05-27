package org.techtown.challengesemestersystem;

import android.graphics.drawable.Drawable;

public class BoardItem {

    private Drawable icon; //회원사진
    private String id, date, content;
    private int recommendations, comments;


    public Drawable getIcon(){
        return icon;
    }

    public String getId(){
        return id;
    }

    public String getDate(){
        return date;
    }

    public String getContent(){
        return content;
    }

    public int getRecommendations(){
        return recommendations;
    }

    public int getComments(){
        return comments;
    }

    public void setId(String id){
        this.id=id;
    }

    public void setDate(String date){
        this.date=date;
    }

    public void setContent(String content){
        this.content=content;
    }

    public void setRecommendations(int recommendations){
        this.recommendations=recommendations;
    }

    public void setComments(int Comments){
        this.comments=comments;
    }

    public void setIcon(Drawable icon){
        this.icon=icon;
    }
}
