package com.example.exercise3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText id;
    ToggleButton accept;
    Button vote;
    Spinner candidate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name.findViewById(R.id.name);
        id.findViewById(R.id.id);
        vote.findViewById(R.id.vote);
        accept.findViewById(R.id.accept);
        candidate.findViewById(R.id.choosecandidate);


    }
}
