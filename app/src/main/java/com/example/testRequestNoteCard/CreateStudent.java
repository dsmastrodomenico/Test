package com.example.testRequestNoteCard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.res.Resources;

import java.util.ArrayList;

public class CreateStudent extends AppCompatActivity {
    private EditText Name, LastName, Id, Note1, Note2, Note3;
    private Resources Resources;
    private ArrayList<Student> Students;

    @Override
    protected void onCreate(Bundle saveInstanceStated){
        super.onCreate(saveInstanceStated);
        setContentView(R.layout.create_student);

        Name=(EditText)findViewById(R.id.txtName);
        LastName=(EditText)findViewById(R.id.txtLastname);
        Id=(EditText)findViewById(R.id.txtId);
        Note1=(EditText)findViewById(R.id.txtN1);
        Note2=(EditText)findViewById(R.id.txtN2);
        Note3=(EditText)findViewById(R.id.txtN3);

        Resources =this.getResources();
        Students= Data.Get();

    }
    public void Saved (View view){
        String IDString, NameString, LastNameString;
        Double NotaFinal = 0.0;
        IDString = Id.getText().toString();
        NameString= Name.getText().toString();
        LastNameString = LastName.getText().toString();
        NotaFinal +=((Double.parseDouble(Note1.getText().toString()) + Double.parseDouble(Note2.getText().toString()) + Double.parseDouble(Note3.getText().toString()))/3);
        Student c = new Student(NameString, LastNameString, Integer.parseInt(IDString),Double.parseDouble(Note1.getText().toString()),Double.parseDouble(Note2.getText().toString()),Double.parseDouble(Note3.getText().toString()),NotaFinal);
        c.SaveStudent();
        Toast.makeText(this, R.string.done, Toast.LENGTH_LONG).show();
    }




}
