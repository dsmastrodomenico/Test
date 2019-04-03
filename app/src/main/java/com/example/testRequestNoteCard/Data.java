package com.example.testRequestNoteCard;

import java.util.ArrayList;

public class Data {
    private static ArrayList<Student> Students = new ArrayList<>();
    public static void Save(Student c){Students.add(c);}
    public static ArrayList<Student> Get(){return Students;}
}
