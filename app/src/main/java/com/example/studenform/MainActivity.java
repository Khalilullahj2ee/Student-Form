package com.example.studenform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String tf_name, tf_email, tf_phone_number, tf_address;

    EditText name;
    EditText email;
    EditText phone;
    EditText address;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.tf_name);
        email = findViewById(R.id.tf_email);
        phone = findViewById(R.id.tf_phone_number);
        address = findViewById(R.id.tf_address);
        submit = findViewById(R.id.reg_btn);


        submit.setOnClickListener(
                view -> {
                    System.out.println(name.getText());
                    System.out.println(email.getText());
                    System.out.println(phone.getText());
                    System.out.println(address.getText());
                }
        );

    }
}