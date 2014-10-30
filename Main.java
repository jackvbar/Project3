/*
Jack Barry
Software development 1 Project 3
10-28-2014
*/

package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        /*call initialize and welcome method*/

       try{
           BufferedReader BuffRead= new BufferedReader(new FileReader(args[0]));
           String line;
           while((line=BuffRead.readLine())!=null)

           {
               if (line.equals("lgoo") || line.equals("LGOO")) {
                   System.out.println("File Accepted");
                   break;
               } else {
                   System.out.println("Error, File is incorrect");
                   break;
               }
           }
            }catch(IOException ioe){
                System.out.println("IO Exception");
           }
        Main.InitializeAndWelcome();

        /*Create userInput variable*/
        String userTyped;
        boolean escape = false;
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
               try{
                   userTyped= userInput.readLine();
               }catch(IOException ioe){
                   System.out.println("Error");
                   return;
               }
            while (!escape){
            if (userTyped.equals("e") || userTyped.equals("events")) {
            /*make a call to displayEvents method*/
                EventManager();
            } else if (userTyped.equals("o") || userTyped.equals("olympians")) {
            /*make a call to the displayOlympians method*/
                OlympianManager();
            } else if (userTyped.equals("h") || userTyped.equals("help")) {
                displayHelp();
            }
            else if (userTyped.equals("t") || userTyped.equals("teams")){
                displayTeams();
            }
            else if (userTyped.equals("q") || userTyped.equals("quit")) {
                    escape=true;
                    System.out.println("Thank you for playing, goodbye");
                    EndProgram();
            } else {
                System.out.println("Invalid input, entering the letters e, o, h, or q or the words events, olympians, help, or quit as they appear before you.");
                try{
                    userTyped = userInput.readLine();
            }catch(IOException ioe){
                    System.out.println("Error");
                    return;
                }
        }}
    }

    public static void InitializeAndWelcome(){
        /* Print welcome message */
               System.out.println("Welcome to the Annual Lawn Game Olympics, Please read the following instructions." +
                       "\nEnter the letter e or the word events for a list of today's events.\nEnter the letter o or the word olympians for a list of the competing olympians." +
                       "\nEnter the letter h or the word help to display some helpful tips if you are having trouble. ");

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

   public static void displayTeams(){
       TeamManager teams = new TeamManager();
       teams.displayTeams();
   }
    public static void displayHelp(){
        System.out.println("Your input is case sensitive, make sure you are using lowercase letters and try again.\n" +
                "Remember, entering the letter e or the word events will display a list of today's events.\n" +
                "Entering the letter o or the word olympians will display a list of the olympians competing today.\n" +
                "Entering the letter h or the word help brings you to this message.\n" +
                "Entering anything other than the above arguments will not work.");
    }
    public static void EndProgram(){
        System.exit(0);
    }

}

