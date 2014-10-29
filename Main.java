/*
Jack Barry
Software development 1 Project 3
10-28-2014
*/

package com.company;

import java.io.BufferedReader;

public class Main {

    public static void InitializeAndWelcome(){
        /* Print welcome message */
        System.out.println("Welcome to the Annual Lawn Game Olympics, Please read the following instructions." +
                "\nEnter the letter e or the word events for a list of today's events.\nEnter the letter o or the word olympians for a list of the competing olympians." +
                "\nEnter the letter h or the word help to display some helpful tips if you are having trouble. ");

    }
    public static void main(String[] args) {
        /*call initialize and welcome method*/

        boolean Quit = false;
        while (Quit = false) {

            Main.InitializeAndWelcome();
        /*Create userInput variable based on the first position in the args array*/
            String userInput = args[0];


            if (userInput.equals("e") || userInput.equals("events")) {
            /*make a call to displayEvents method*/
                EventManager();
            } else if (userInput.equals("o") || userInput.equals("olympians")) {
            /*make a call to the displayOlympians method*/
                OlympianManager();
            } else if (userInput.equals("h") || userInput.equals("help")) {
                displayHelp();
            }
            else if (userInput.equals("t") || userInput.equals("teams")){

            }
            else if (userInput.equals("q") || userInput.equals("quit")) {
                    Quit = true;
                    System.out.println("Thank you for playing, goodbye");
            } else {
                System.out.println("Invalid input, entering the letters e, o, or h or the words events, olympians, or help as they appear before you.");
            }
        }
    }

    public static void EventManager(){
        EventManager Manage = new EventManager();
        Manage.displayEvents();
    }

    public static void OlympianManager()
    {
        OlympianManager OlympManage = new OlympianManager();
        OlympManage.displayOlympians();
    }

    public static void displayHelp(){
        System.out.println("Your input is case sensitive, make sure you are using lowercase letters and try again.\n" +
                "Remember, entering the letter e or the word events will display a list of today's events.\n" +
                "Entering the letter o or the word olympians will display a list of the olympians competing today.\n" +
                "Entering the letter h or the word help brings you to this message.\n" +
                "Entering anything other than the above arguments will not work.");
    }
}
