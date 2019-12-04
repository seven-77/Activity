package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1=(Button) findViewById(R.id.Button_1) ;
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String data ="hello word";
                Intent intent=new Intent(MainActivity.this,otheractivity.class);
                intent.putExtra("extra_data",data);
                startActivityForResult(intent,1);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data) {
        switch (requestCode){
            case  1:
                if (resultCode == RESULT_OK){
                    String returnedData =data.getStringExtra("data_return");
                    Log.d("FirstActivity",returnedData);
                }
                break;
            default:
        }
    }

}
