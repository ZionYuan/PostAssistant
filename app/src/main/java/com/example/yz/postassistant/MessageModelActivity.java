package com.example.yz.postassistant;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MessageModelActivity extends AppCompatActivity {

    private List<MessageModel> messagesList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_model);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        actionBar.setCustomView(R.layout.actionbar_message_model);

        initOrder();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        MessageModelAdapter adapter = new MessageModelAdapter(messagesList);
        recyclerView.setAdapter(adapter);
    }
    private void initOrder(){
            MessageModel a = new MessageModel("圆通","货架三");
            messagesList.add(a);

            MessageModel  b= new MessageModel("中通","货架二");
            messagesList.add(b);

    }
}
