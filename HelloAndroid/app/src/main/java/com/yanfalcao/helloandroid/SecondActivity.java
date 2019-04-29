package com.yanfalcao.helloandroid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private String nameEditText;
    private TextView saudacaoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        nameEditText = getIntent().getStringExtra("nome");
        
        saudacaoTextView = (TextView) findViewById(R.id.saudacaoTextView);
        saudacaoTextView.setText("Saudação " + nameEditText + "!!!");

    }

}
