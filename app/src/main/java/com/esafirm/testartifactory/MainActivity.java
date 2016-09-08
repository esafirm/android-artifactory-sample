package com.esafirm.testartifactory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.esafirm.mylibrary.Something;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = new Button(this);
        button.setLayoutParams(
                new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT)
        );
        button.setText("Click Me!");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Something().call(getApplication());
            }
        });

        setContentView(button);
    }
}
