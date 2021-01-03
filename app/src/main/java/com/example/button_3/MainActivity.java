package com.example.button_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int i = 0;
    public void click(View view) {
        Button sum_to_six = (Button)findViewById(R.id.btn);
        if (i>5){
            sum_to_six.setText("Enough to click. Go to new start!");
            i=0;
        }
        else{
            i=i+1;
            sum_to_six.setText("this is click number: "+i);

        }

    }
}