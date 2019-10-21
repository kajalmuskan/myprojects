package com.sunil.demo2.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

import com.sunil.demo2.model.ChatObject;

public class DisplayActivity extends Activity {
    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ChatObject mChatObject=(ChatObject)getIntent().getExtras().getSerializable("CHAT_DATA_KEY");
        Log.e("DisplayActivity",mChatObject.getSenderName());
        Log.e("DisplayActivity",mChatObject.getChatMessage());
        Log.e("DisplayActivity",mChatObject.getTime());
    }
}
