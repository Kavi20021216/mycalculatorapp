package com.example.my_calculator_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class mulActivity extends AppCompatActivity {
    TextView answer;
    EditText num1,num2;
    Button mul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mul);
        answer = (TextView) findViewById(R.id.mul_view);
        num1 = (EditText) findViewById(R.id.num_01);
        num2 = (EditText) findViewById(R.id.num_02);
        mul = (Button) findViewById(R.id.button_mul);


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num_one = Integer.parseInt(num1.getText().toString());
                int num_two = Integer.parseInt(num2.getText().toString());
                int ans = num_one * num_two;
                answer.setText(String.valueOf(ans));
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}