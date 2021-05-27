package org.techtown.challengesemestersystem;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class BoardAdapter extends BaseAdapter {

    private ArrayList<BoardItem> boardItems=new ArrayList<>();

    @Override
    public int getCount() { return boardItems.size(); }

    @Override
    public Object getItem(int position) { return boardItems.get(position); }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context=parent.getContext();


        if(convertView==null){
            LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.board_custom_listview,parent,false);
        }

        ImageView img_user=(ImageView)convertView.findViewById(R.id.img_board_user);
        TextView tv_board_userid=(TextView)convertView.findViewById(R.id.tv_board_userid);
        TextView tv_board_date=(TextView)convertView.findViewById(R.id.tv_board_date);
        TextView tv_board_content=(TextView)convertView.findViewById(R.id.tv_board_content);
        TextView tv_recommedations=(TextView)convertView.findViewById(R.id.tv_recommedations);
        TextView tv_comments=(TextView)convertView.findViewById(R.id.tv_comments);

        //각 리스트에 뿌려줄 아이템 받아오는데 boardItem 재활용
        BoardItem boardItem= (BoardItem) getItem(position);

        img_user.setImageDrawable(boardItem.getIcon());
        tv_board_userid.setText(boardItem.getId());
        tv_board_date.setText(boardItem.getDate());
        tv_board_content.setText(boardItem.getContent());
        tv_recommedations.setText("좋아요 "+boardItem.getRecommendations()+"개");
        tv_comments.setText("댓글 "+boardItem.getComments()+"개");



        return convertView;
    }

    //아이템 데이터 추가를 위한 함수
    public void addItem_board(Drawable img, String userid, String date, String content, int recommendation, int comment){
        BoardItem boardItem=new BoardItem();

        boardItem.setIcon(img);             boardItem.setComments(comment);
        boardItem.setId(userid);            boardItem.setRecommendations(recommendation);
        boardItem.setDate(date);            boardItem.setContent(content);

        boardItems.add(boardItem);

    }
}
