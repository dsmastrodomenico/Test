package com.example.testRequestNoteCard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.R.layout;
import java.util.ArrayList;

public class StudentList extends AppCompatActivity {
    private ListView LV;
    private ArrayList<Student> Students;
    private ArrayList<String> ID;
    private TextView TxtNoResult;
    private Intent In;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_of_students);

        LV=(ListView)findViewById(R.id.lvlList);
        Students = Data.Get();
        ID = new ArrayList<>();
        TxtNoResult = (TextView)findViewById(R.id.noResoult);

        TxtNoResult.setVisibility(View.VISIBLE);
        LV.setVisibility(View.INVISIBLE);


        if (Students.size() > 0){
            TxtNoResult.setVisibility(View.INVISIBLE);
            LV.setVisibility(View.VISIBLE);

            for (int i = 0; i < Students.size() ; i++){
                ID.add(String.valueOf(Students.get(i).getId()));
            }
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, layout.simple_list_item_1, ID);
        LV.setAdapter(adapter);

        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                In = new Intent(StudentList.this, Student_detail.class);
                In.putExtra("position",position);
                startActivity(In);
            }
        });


    }

}
