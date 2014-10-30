package com.company;

/**
 * Created by jack on 10/7/2014.
 */
public class Olympian {
    public String name;
    public Sex sex;
    public int age;

    public Olympian(){
        this.name = "";
        this.sex = Sex.MALE;
        this.age = 0;
    }

    public void defineOlympian(String playerName, Sex playerSex, int playerAge){
        this.name = playerName;
        this.sex = playerSex;
        this.age = playerAge;
    }

    public String putOlympian(){
        return this.name + " " + this.sex + " " + this.age;
    }

}