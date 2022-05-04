package com.example.form;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextInputLayout mssv;
    TextInputLayout name;
    TextInputLayout cccd;
    TextInputLayout phoneNumber;
    TextInputLayout email;
    EditText homeTown;
    EditText address;
    RadioGroup radioGroup;
    RadioButton radioButton;
    CheckBox ccpp;
    CheckBox java;
    CheckBox python;
    CheckBox agree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mssv = (TextInputLayout) findViewById(R.id.mssv);
        name = (TextInputLayout) findViewById(R.id.name);
        cccd = (TextInputLayout) findViewById(R.id.cccd);
        phoneNumber = (TextInputLayout) findViewById(R.id.phoneNumber);
        email = (TextInputLayout) findViewById(R.id.email);
        homeTown = (EditText) findViewById(R.id.homeTown);
        address = (EditText) findViewById(R.id.address);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        ccpp = (CheckBox) findViewById(R.id.ccpp);
        java = (CheckBox) findViewById(R.id.java);
        python = (CheckBox) findViewById(R.id.python);
        agree = (CheckBox) findViewById(R.id.agree);


//        confirmButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (TextUtils.isEmpty(mssv.getEditText().getText().toString())){
//                    Toast.makeText(MainActivity.this, "Required fields must be filled", Toast.LENGTH_SHORT ).show();
//                }
//                else{
//                    Toast.makeText(MainActivity.this, "Submitted", Toast.LENGTH_SHORT ).show();
//                }
//            }
//        });
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
    private boolean confirmName(){
        String input = name.getEditText().getText().toString();
        if (input.isEmpty()){
            name.setError("Required");
            return false;
        } else{
            name.setError(null);
            return true;
        }
    }
    private boolean confirmCccd(){
        String input = cccd.getEditText().getText().toString();
        if (input.isEmpty()){
            cccd.setError("Required");
            return false;
        } else{
            cccd.setError(null);
            return true;
        }
    }
    private boolean confirmPhoneNumber(){
        String input = phoneNumber.getEditText().getText().toString();
        if (input.isEmpty()){
            phoneNumber.setError("Required");
            return false;
        } else{
            phoneNumber.setError(null);
            return true;
        }
    }
    private boolean confirmEmail(){
        String input = email.getEditText().getText().toString();
        if (input.isEmpty()){
            email.setError("Required");
            return false;
        } else{
            email.setError(null);
            return true;
        }
    }
    public void confirmInput(View view){
        if (!confirmMssv() | !confirmName() | !confirmCccd() | !confirmPhoneNumber() | !confirmEmail() | !checked()){
            return;
        }
//        if (radioGroup.getCheckedRadioButtonId() == -1)
//        {
//            Toast.makeText(MainActivity.this, "Please select a field of study", Toast.LENGTH_SHORT ).show();
//        }
        Toast.makeText(MainActivity.this, "Submitted", Toast.LENGTH_SHORT ).show();
    }
    public void chosen(View view){
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);

    }
    boolean checked() {
        if(agree.isChecked()) {
            return true;
        }
        else {
            Toast.makeText(MainActivity.this, "Please agree terms & conditions", Toast.LENGTH_SHORT ).show();
            return false;
        }
    }
}