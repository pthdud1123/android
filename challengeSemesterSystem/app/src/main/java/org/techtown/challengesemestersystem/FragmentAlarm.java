package org.techtown.challengesemestersystem;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

public class FragmentAlarm extends Fragment {

    private ListView listview;
    private AlarmAdapter alarmAdapter;

    public FragmentAlarm(){

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.alarm,container,false);

        listview=(ListView)view.findViewById(R.id.listview_alarm);
        alarmAdapter=new AlarmAdapter();

        alarmAdapter.addItem_alarm(ContextCompat.getDrawable(getActivity(),R.drawable.ic_baseline_person_24),"회원님의 게시글에 댓글이 달렸습니다.");
        alarmAdapter.addItem_alarm(ContextCompat.getDrawable(getActivity(),R.drawable.ic_baseline_person_24), "한윤정님이 회원님의 게시글에 좋아요를 눌렀습니다.");
        alarmAdapter.addItem_alarm(ContextCompat.getDrawable(getActivity(),R.drawable.logo_donga), "오늘의 HOT게시글으 확인해보세요!");
        alarmAdapter.addItem_alarm(ContextCompat.getDrawable(getActivity(),R.drawable.logo_donga), "총학생회의 게시글을 확인해보세요!");
        alarmAdapter.addItem_alarm(ContextCompat.getDrawable(getActivity(),R.drawable.ic_baseline_person_24), "새로운 메시지가 왔습니다!");

        for(int i=1; i<11; i++){
            alarmAdapter.addItem_alarm(ContextCompat.getDrawable(getActivity(),R.drawable.ic_baseline_person_24), "사용자" + i+"님이 회원님의 게시글에 좋아요를 눌렀습니다.");
        }
        listview.setAdapter(alarmAdapter);
        return view;
    }

}
