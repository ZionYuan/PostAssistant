package com.example.yz.postassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class addMessageModelActivity extends AppCompatActivity {

    private EditText newMessageModel;
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_messagemodel);

        newMessageModel = (EditText)findViewById(R.id.new_message_model);
        next = (Button)findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String mm = newMessageModel.getText().toString();
                Intent intent = new Intent(addMessageModelActivity.this, MessageModelActivity.class);
                intent.putExtra("messageModel",mm);
                startActivity(intent);
            }
        });
    }
}
