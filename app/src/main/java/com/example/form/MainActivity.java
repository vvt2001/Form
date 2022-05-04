package com.example.form;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button confirmButton;
    TextInputLayout mssv;
    TextInputLayout name;
    EditText cccd;
    EditText phoneNumber;
    EditText email;
    EditText homeTown;
    EditText address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        confirmButton = (Button) findViewById(R.id.confirmButton);
        mssv = (TextInputLayout) findViewById(R.id.mssv);
        name = (TextInputLayout) findViewById(R.id.name);
        cccd = (EditText) findViewById(R.id.cccd);
        phoneNumber = (EditText) findViewById(R.id.phoneNumber);
        email = (EditText) findViewById(R.id.email);
        homeTown = (EditText) findViewById(R.id.homeTown);
        address = (EditText) findViewById(R.id.address);

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(mssv.getEditText().getText().toString())){
                    Toast.makeText(MainActivity.this, "Required fields must be filled", Toast.LENGTH_SHORT ).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Submitted", Toast.LENGTH_SHORT ).show();
                }
            }
        });
    }

    private boolean confirmMssv(){
        String input = mssv.getEditText().getText().toString();
        if (input.isEmpty()){
            mssv.setError("Required");
            return false;
        } else{
            mssv.setError(null);
            return true;
        }
    }
}