package com.company;

/**
 * Created by jack on 10/7/2014.
 */
public class OlympianManager {


        Olympian[] olympians = new Olympian[16];{
        this.olympians[0]= new Olympian("Jack", Sex.MALE, 19);
        this.olympians[1]= new Olympian("Kristen", Sex.FEMALE, 19);
        this.olympians[2]= new Olympian("Reid", Sex.MALE, 20);
        this.olympians[3]= new Olympian("Jess", Sex.MALE, 30);
        this.olympians[4]= new Olympian("Nicole", Sex.FEMALE, 27);
        this.olympians[5]= new Olympian("Yury", Sex.MALE, 22);
        this.olympians[6]= new Olympian("Claire", Sex.FEMALE, 25);
        this.olympians[7]= new Olympian("Joe", Sex.MALE, 26);
        this.olympians[8]= new Olympian("Katie", Sex.FEMALE, 21);
        this.olympians[9]= new Olympian("Denis", Sex.MALE, 26);
        this.olympians[10]= new Olympian("Arianna", Sex.FEMALE, 24);
        this.olympians[11]= new Olympian("John", Sex.MALE, 18);
        this.olympians[12]= new Olympian("Christine", Sex.FEMALE, 36);
        this.olympians[13]= new Olympian("Peter", Sex.MALE, 42);
        this.olympians[14]= new Olympian("Theresa", Sex.FEMALE, 57);
        this.olympians[15]= new Olympian("Virg", Sex.MALE, 60);}

        public void displayOlympians(){
            for(int i=0; i<olympians.length; i++){
                System.out.println(olympians[i].putOlympian());
            }
        }

    }
