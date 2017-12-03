package com.wedddingapp.shankar.loginwelcome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity   implements View.OnClickListener{


    String regexStr = "^[0-9]*$";
    Button btnLogin;
    EditText etName;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button) findViewById(R.id.b1);
        etName = (EditText) findViewById(R.id.eInpName);

        btnLogin.setOnClickListener(this);

    }


    public void onClick(View view) {
        if ((!etName.getText().toString().isEmpty()) && ((!etName.getText().toString().trim().matches(regexStr)))) {
            Intent intent = new Intent(MainActivity.this, Welcome.class);
            Bundle bundle = new Bundle();
            bundle.putString("BundleName", etName.getText().toString().trim());
            intent.putExtras(bundle);
            startActivity(intent);
        }else{
            Toast.makeText(MainActivity.this, "Please Enter Your Name", Toast.LENGTH_SHORT).show();
            etName.requestFocus();

        }
    }
}



