package org.techtown.challengesemestersystem;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AlarmAdapter extends BaseAdapter {

    private ArrayList<AlarmItem> alarmItems=new ArrayList<>();

    @Override
    public int getCount() {
         return alarmItems.size();
    }

    @Override
    public AlarmItem getItem(int position) {
        return alarmItems.get(position);
    }

    @Override
    public long getItemId(int position) {
         return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context=parent.getContext();


        if(convertView==null){
            LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.alarm_custom_listview,parent,false);

        }

        ImageView img_member=(ImageView)convertView.findViewById(R.id.img_alarm_member);
        TextView textview=(TextView)convertView.findViewById(R.id.tv_alarm_text);

        //각 리스트에 뿌려줄 아이템 받아오는데 alarmItem 재활용
        AlarmItem alarmItem=getItem(position);

        img_member.setImageDrawable(alarmItem.getIcon());
        textview.setText(alarmItem.getText());


        return convertView;
    }

    //아이템 데이터 추가를 위한 함수
    public void addItem(Drawable img, String text){
        AlarmItem alarmItem=new AlarmItem();

        alarmItem.setIcon(img);
        alarmItem.setText(text);

        alarmItems.add(alarmItem);
    }
}
