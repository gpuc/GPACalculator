package com.example.gpacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText class1,class2,class3,class4,class5;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        class1=(EditText)findViewById(R.id.Class1);
        class2=(EditText)findViewById(R.id.Class2);
        class3=(EditText)findViewById(R.id.Class3);
        class4=(EditText)findViewById(R.id.class4);
        class5=(EditText)findViewById(R.id.Class5);
        button=(Button)findViewById(R.id.button);
        final TextView result=findViewById(R.id.GPA);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float Class1=Integer.parseInt(class1.getText().toString());
                float Class2=Integer.parseInt(class2.getText().toString());
                float Class3=Integer.parseInt(class3.getText().toString());
                float Class4=Integer.parseInt(class4.getText().toString());
                float Class5=Integer.parseInt(class5.getText().toString());
                LinearLayout main=(LinearLayout)findViewById(R.id.mainScreen);
                float sum=Class1+Class2+Class3+Class4+Class5;
                float res=sum/5;

                result.setText(String.valueOf(res));
                if(res<=60) {
                    main.setBackgroundColor(0xffff0000);
                }
                else if(res>=61&&res<=79){
                    main.setBackgroundColor(0xffffff00);
                }
                else if(res>=80&&res<=100){
                    main.setBackgroundColor(0xff00ff00);
                }
                button.setText("Clear");


            }});

        }
}
