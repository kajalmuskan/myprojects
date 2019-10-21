package com.sunil.demo2.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sunil.demo2.R;
import com.sunil.demo2.model.ChatObject;

import java.util.List;

public class MyAdpter extends RecyclerView.Adapter<MyAdpter.MyHolder>{
    private List<ChatObject> chatList;
    private OnListItemClickListener mOnListItemClickListener;
    
    public MyAdpter(final List<ChatObject> objectList,final OnListItemClickListener mOnListItemClickListener) {
        this.chatList = objectList;
        this.mOnListItemClickListener=mOnListItemClickListener;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.view_chat, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder holder, final int position) {
        final ChatObject mChatObject=chatList.get(position);
        holder.tvChat.setText(mChatObject.getChatMessage());
        holder.tvTime.setText(mChatObject.getTime());
        holder.tvSender.setText(mChatObject.getSenderName());
        holder.llMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                mOnListItemClickListener.onListItemClick(mChatObject);
            }
        });
    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }


    class MyHolder extends RecyclerView.ViewHolder{
        TextView tvChat, tvTime, tvSender;
        private LinearLayout llMain;
        public MyHolder(@NonNull final View itemView) {
            super(itemView);
            tvChat = itemView.findViewById(R.id.tvChat);
            tvTime = itemView.findViewById(R.id.tvTime);
            tvSender = itemView.findViewById(R.id.tvSenderName);
            llMain = itemView.findViewById(R.id.llMain);
        }
    }

    public interface OnListItemClickListener{
        void onListItemClick(ChatObject mChatObject);
    }
}