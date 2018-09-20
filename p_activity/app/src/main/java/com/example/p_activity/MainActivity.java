package com.example.p_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    public static final String TAG="MainActivity";
    private Button first_btn;
    private  Button second_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"on Creat");
        setContentView(R.layout.activity_main);
        if (savedInstanceState!=null){
            String tempData=savedInstanceState.getString("data_key");
            Log.d(TAG, tempData);
        }

        first_btn=(Button) findViewById(R.id.first_btn);
        second_btn=(Button) findViewById(R.id.second_btn);
        first_btn.setOnClickListener((View.OnClickListener) this);
        second_btn.setOnClickListener((View.OnClickListener) this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.first_btn:
                Intent intent =new Intent(MainActivity.this,FirstActivity.class);
                startActivity(intent);
                break;
            case R.id.second_btn:
                Intent intent2=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent2);
                break;
                default:
                    break;

        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String tempData="Something you just typed";
        outState.putString("data_ket",tempData);
    }
}
