package com.line.krishna.sampletest;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    Button mClickMeButton;
    TextView mHelloWorldTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHelloWorldTextView = (TextView) findViewById(R.id.helloWorldTextView);
        mClickMeButton = (Button) findViewById(R.id.clickMeBtn);
        mClickMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mHelloWorldTextView.setText("HEY WORLD");
            }
        });
    }
}
