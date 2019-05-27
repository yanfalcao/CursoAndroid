package br.com.yanfalcao.boaviagem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login_activity extends AppCompatActivity {

    private EditText user;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        user = (EditText) findViewById(R.id.usuario);
        password = (EditText) findViewById(R.id.senha);
    }

    public void entrarOnClick(View v) {
        String userInformed = user.getText().toString();
        String passwordInformed = password.getText().toString();

        if(userInformed.equals("leitor") && passwordInformed.equals("123")){
            Intent intent = new Intent(this, dashboard_activity.class);
            startActivity(intent);
        }
        else{
            String mensageErro = getString(R.string.mensageErroUser);
            Toast toast = Toast.makeText(this, mensageErro, Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
