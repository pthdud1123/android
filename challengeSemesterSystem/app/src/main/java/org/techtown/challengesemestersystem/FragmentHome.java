package org.techtown.challengesemestersystem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FragmentHome extends Fragment {
    static final String[] ListMenu={"박소영","mini0u0","pthdud1123","알파카","도전학기제","여기의글을 채워넣어야해","리스트뷰내부 디자인은어떻게 할까","지금은 1시37분","내가 야하면 너는 예","피자","서버는 어떻게 할것인가요","식빵우유","동아대학교","컴퓨터공학과","도망가자"};

    public FragmentHome(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        //return inflater.inflate(R.layout.activity_fragment1,container,false);
        View view=inflater.inflate(R.layout.activity_fragment1,container,false);
        ArrayAdapter arrayAdapter=new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1,ListMenu);
        ListView listView=(ListView)view.findViewById(R.id.listview_1);
        listView.setAdapter(arrayAdapter);
        return view;
    }
}