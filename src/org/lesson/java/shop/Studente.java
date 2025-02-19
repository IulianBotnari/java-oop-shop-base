package org.lesson.java.shop;

public class Studente {
    private String name;
    private String surName;
    private int age;

    public Studente(String name, String surName, int age){
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public String getStudentName(){
        return this.name;
    }

    public String getStudentInfo(){
        return "Nome: " + this.name + ", Cognome: " + this.surName + ", Età: " + this.age;
    }

}
