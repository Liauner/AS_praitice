package com.example.p2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import  static  com.example.p2.R.attr.maxNum;
import android.view.animation.AccelerateDecelerateInterpolator;

public class MainActivity extends AppCompatActivity {
    private RoundIndicatorView roundIndicatorView;
    private EditText editText;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        roundIndicatorView=(RoundIndicatorView) findViewById(R.id.my_view);
        editText=(EditText) findViewById(R.id.edit);
        button=(Button) findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.w("button", "onClick: ");
                int a=Integer.valueOf(editText.getText().toString());
                roundIndicatorView.setCurrentNumAnim(a);
            }
        });
    }
}
