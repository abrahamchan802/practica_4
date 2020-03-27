package com.obedchan.practica_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText counterText = findViewById(R.id.editText);
        final EditText multiplierText = findViewById(R.id.editText2);

        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int counter = Integer.parseInt(counterText.getText().toString());
                int multiplier = Integer.parseInt(multiplierText.getText().toString());
                executeTask(counter,multiplier);
            }
        });
    }

    public void executeTask(int counter,int multiplier){
        MyTask mt = new MyTask(this);
        mt.execute(counter,multiplier);
    }
}
