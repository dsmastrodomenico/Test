package com.example.testRequestNoteCard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

public class Student_detail extends AppCompatActivity  {
    private Intent In;
    private ArrayList<Student> Students;
    private TextView Id, Nota1, Nota2, Nota3,NotaFinal;
    private double Total =0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data);

        In = getIntent();
        Students = Data.Get();

        Id = (TextView)findViewById(R.id.id1);
        Nota1 = (TextView)findViewById(R.id.note1);
        Nota2 = (TextView)findViewById(R.id.note2);
        Nota3 = (TextView)findViewById(R.id.note3);
        NotaFinal = (TextView)findViewById(R.id.notef);

        Total = ((Double.parseDouble(Nota1.toString()) + Double.parseDouble(Nota2.toString()) + Double.parseDouble(Nota3.toString())) / 3);

    }

    private void loadData(Student student){

        Id.setText(student.getId());
        Nota1.setText(String.valueOf(student.getNota1()));
        Nota2.setText(String.valueOf(student.getNota3()));
        Nota3.setText(String.valueOf(student.getNota2()));
        NotaFinal.setText(String.valueOf(Total));
    }
}
