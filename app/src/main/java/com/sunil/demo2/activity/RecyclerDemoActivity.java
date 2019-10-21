package com.sunil.demo2.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sunil.demo2.R;
import com.sunil.demo2.adapter.MyAdpter;
import com.sunil.demo2.model.ChatObject;

import java.util.ArrayList;
import java.util.List;

public class RecyclerDemoActivity extends AppCompatActivity implements MyAdpter.OnListItemClickListener {
    private List<ChatObject> chatList = new ArrayList<>();;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_demo);
        recyclerView = findViewById(R.id.chatRecycler);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        createData();

        String s1=new String("Good ");

        String s2=new String("morning");

        String s3=new String();
        s3=s1+s2;


        recyclerView.setAdapter(new MyAdpter(chatList,this));
    }

    private void createData(){
        chatList.add(new ChatObject("Hello","12 Pm", "Rohit"));
        chatList.add(new ChatObject("Hello1","13 Pm", "Rohit2"));
        chatList.add(new ChatObject("Hello2","14 Pm", "Rohit3"));
        chatList.add(new ChatObject("Hello3","16 Pm", "Rohit4"));
        chatList.add(new ChatObject("Hello4","17 Pm", "Rohit5"));
        chatList.add(new ChatObject("Hello5","18 Pm", "Rohit6"));
        chatList.add(new ChatObject("Hello6","19 Pm", "Rohit7"));
    }


    @Override
    public void onListItemClick(final ChatObject mChatObject) {
       Bundle bundle=new Bundle();
       bundle.putSerializable("CHAT_DATA_KEY",mChatObject);
        Intent mIntent=new Intent(this, DisplayActivity.class);
        mIntent.putExtras(bundle);
        startActivity(mIntent);
    }
}
