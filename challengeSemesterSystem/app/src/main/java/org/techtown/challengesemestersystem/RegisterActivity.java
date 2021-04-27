package org.techtown.challengesemestersystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    private EditText edt_name, edt_id, edt_pw, edt_pw2, edt_email, edt_phone;
    private RadioButton radio_woman, radio_man, radio_s, radio_b, radio_g;
    private RadioGroup radioGroup_sex, radioGroup_campus;
    private Spinner spinner_coll, spinner_dep; //단과대, 학부(과)
    Button btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        btn_register=(Button)findViewById(R.id.btn_register);
        edt_name=(EditText)findViewById(R.id.edt_name);
        edt_id=(EditText)findViewById(R.id.edt_id);
        edt_pw=(EditText)findViewById(R.id.edt_pw);
        edt_pw2=(EditText)findViewById(R.id.edt_pw2);
        edt_email=(EditText)findViewById(R.id.edt_email);
        edt_phone=(EditText)findViewById(R.id.edt_phone);

        radioGroup_sex=(RadioGroup)findViewById(R.id.radioGroup_sex);
        radio_woman=(RadioButton)findViewById(R.id.radio_woman);
        radio_man=(RadioButton)findViewById(R.id.radio_man);
        radio_woman.setOnClickListener(radioButtonClickListener);
        radioGroup_sex.setOnCheckedChangeListener(radioGroupButtonChangeListener);

        radioGroup_campus=(RadioGroup)findViewById(R.id.radioGroup_campus);
        radio_s=(RadioButton)findViewById(R.id.radio_campus_s); //승학캠퍼스
        radio_b=(RadioButton)findViewById(R.id.radio_campus_b); //부민
        radio_g=(RadioButton)findViewById(R.id.radio_campus_g); //구덕
        radioGroup_campus.setOnCheckedChangeListener(radioGroupButtonChangeListener);

        spinner_coll=(Spinner)findViewById(R.id.spinner_college);
        spinner_dep=(Spinner)findViewById(R.id.spinner_department);

        spinner_coll.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btn_register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }

    RadioButton.OnClickListener radioButtonClickListener=new RadioButton.OnClickListener(){
        @Override
        public void onClick(View v) {

        }
    };

    RadioGroup.OnCheckedChangeListener radioGroupButtonChangeListener = new RadioGroup.OnCheckedChangeListener() {
        @Override public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
            if(i == R.id.radio_woman){

            }
            else if(i == R.id.radio_man){

            }
            if(i == R.id.radio_campus_b){

            }
            else if(i==R.id.radio_campus_g){

            }
            else if(i==R.id.radio_campus_s){

            }
        }
    };

}