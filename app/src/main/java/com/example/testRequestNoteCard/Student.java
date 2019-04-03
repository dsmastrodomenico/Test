package com.example.testRequestNoteCard;

public class Student {

    private String name;
    private String lastName;
    private int id;
    private double nota1;
    private double nota2;
    private double nota3;
    private double Fn;


    public Student(String name, String lastName, int id, double nota1, double nota2, double nota3, double Fn) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.Fn = Fn;
    }

    public double getFn() {
        return Fn;
    }

    public void setFn(double fn) {
        Fn = fn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public void SaveStudent(){Data.Save(this);}
}
