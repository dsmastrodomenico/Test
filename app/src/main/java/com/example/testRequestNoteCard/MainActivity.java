package com.example.testRequestNoteCard;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.R.layout;

public class MainActivity extends AppCompatActivity {
    private String Opcion[];
    private ListView LV;
    private Resources Resourses;
    private Intent In;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LV=(ListView)findViewById(R.id.Options);
        Resourses = this.getResources();
        Opcion = Resourses.getStringArray(R.array.Menu);
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(this, layout.simple_list_item_1,Opcion);
        LV.setAdapter(Adapter);

        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        In = new Intent(MainActivity.this, CreateStudent.class);
                        startActivity(In);
                        break;
                    case 1:
                        In = new Intent(MainActivity.this, StudentList.class);
                        startActivity(In);
                }
            }
        });


    }



}
