package com.company;

/**
 * Created by jack on 10/7/2014.
 */
public class Olympian {
    public String name;
    public Sex sex;
    public int age;

    public Olympian(String name, Sex gender, int age){
        this.name = name;
        this.sex = gender;
        this.age = age;
    }

    public String putOlympian(){
        return this.name + " " + this.sex + " " + this.age;
    }

}