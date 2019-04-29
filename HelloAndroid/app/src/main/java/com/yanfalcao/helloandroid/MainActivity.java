package com.yanfalcao.helloandroid;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    EditText nameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        nameEditText = (EditText) findViewById(R.id.nomeEditText);
    }

    public void surpreenderUsuario(View v) {

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("nome", nameEditText.getText().toString());
        startActivity(intent);

    }
}
