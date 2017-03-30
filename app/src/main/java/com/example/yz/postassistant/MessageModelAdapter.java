package com.example.yz.postassistant;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import static com.example.yz.postassistant.R.id.isget;

/**
 * Created by yz on 2017/3/14.
 */

public class MessageModelAdapter extends RecyclerView.Adapter<MessageModelAdapter.ViewHolder> {
    private List<MessageModel> mMessageList;
    static  class ViewHolder extends RecyclerView.ViewHolder{

        TextView message_company;
        //TextView message_huojia;


        public ViewHolder(View view){
            super(view);
            message_company = (TextView) view.findViewById(R.id.message_company);
            //message_huojia = (TextView) view.findViewById(R.id.message_huojia);

        }
    }
    public MessageModelAdapter(List<MessageModel> messageList){
        mMessageList = messageList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.message_model,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position){

        MessageModel messageModel = mMessageList.get(position);
        holder.message_company.setText(messageModel.getMessage_company());
       // holder.message_huojia.setText(messageModel.getMessage_huojia());

    }
    @Override
    public int getItemCount(){
        return  mMessageList.size();
    }

}
