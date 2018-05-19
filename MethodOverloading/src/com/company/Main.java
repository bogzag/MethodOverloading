package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Bogza", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentrimeters(0, 3);
        calcFeetAndInchesToCentrimeters(100);
        System.out.println(getDurationString(  445,0));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " poins");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " poins");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name no player score ");
        return 0;
    }

    public static double calcFeetAndInchesToCentrimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet and inches parameters");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches =" + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentrimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + "feet and" + remainingInches + " inches");
        return calcFeetAndInchesToCentrimeters(feet, remainingInches);
    }

    public static String  getDurationString  (  long     minutes,  long      seconds) {
        if ((minutes < 0) || ((seconds < 0) || (seconds > 59))) {

            return "Invalid value";
        }
           long  hour =  minutes / 60;
           long  remainingMinutes=  seconds %60;
           return hour + " h " + remainingMinutes + "m " + seconds + "s";

    }
}












