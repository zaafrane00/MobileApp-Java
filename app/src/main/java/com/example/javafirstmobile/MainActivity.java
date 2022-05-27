package com.example.javafirstmobile;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edPoids,edTaille;
    RadioButton rbMetre,rbCent;
    TextView tvMessage,tvRes;
    CheckBox chMessage;
    Button btnCal,btRaz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edPoids=findViewById(R.id.editTextPoids);
        edTaille=findViewById(R.id.editTextTaille);
        rbMetre=findViewById(R.id.radioBtnMetre);
        rbCent=findViewById(R.id.radioBtnCenti);
        tvMessage=findViewById(R.id.tvMessage);
        chMessage=findViewById(R.id.checkBox);
        btRaz=findViewById(R.id.buttonRes);
        btnCal=findViewById(R.id.buttonCalcul);


    }

}