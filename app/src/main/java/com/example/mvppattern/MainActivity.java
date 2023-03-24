package com.example.mvppattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Constract.IView {
    private  TextView tvforgotpass;
    private EditText edtemail;
    private EditText edtpass;
    private  Button btnsubmit;
    private Constract.IPresenter mPresenter;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initGUI();
    }
    private void initGUI(){
        tvforgotpass = (TextView) findViewById(R.id.tvforgotpass);
        edtemail = (EditText) findViewById(R.id.edtemail);
        edtpass = (EditText) findViewById(R.id.edtpass);
        btnsubmit = (Button) findViewById(R.id.btnsubmit);
        mPresenter = new Presenter(this);
        btnsubmit.setOnClickListener(view -> {
            String user = edtemail.getText().toString();
            String pass = edtpass.getText().toString();
        mPresenter.doLogin(user,pass);
        });
        tvforgotpass.setOnClickListener(view -> {
            mPresenter.forgotPassword();
        });
    }
    public void showLoginSuccess() {
        Toast.makeText(MainActivity.this, "Logic Success", Toast.LENGTH_SHORT).show();
    }
    public void showLoginFailed(){
        Toast.makeText(MainActivity.this,"Login Failed", Toast.LENGTH_SHORT).show();
    }
}