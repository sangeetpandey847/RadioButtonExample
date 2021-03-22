package com.jsstech.radiobuttonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.jsstech.radiobuttonexample.R.id.*;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(radiogroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group,int checkedId) {
                radioButton = radioGroup.findViewById(checkedId);

                Toast.makeText(MainActivity.this,"" + radioButton.getText(),Toast.LENGTH_LONG).show();
            }
        });


    }

    public void submitButton(View view) {

        int selectedid = radioGroup.getCheckedRadioButtonId();

        if (selectedid == -1) {
            Toast.makeText(this,"You have not selected any Radio button",Toast.LENGTH_LONG).show();
        } else {

            Toast.makeText(this,"You have selected.." + radioButton.getText(),Toast.LENGTH_LONG).show();

        }
    }
}