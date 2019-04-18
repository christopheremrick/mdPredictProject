package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String again = "y";
        do{
            //Make a loop at some point
            System.out.println("Welcome to the day of the week calculator.");
            Scanner scan = new Scanner(System.in);
            System.out.println("Type in your year of birth.");
            Integer year = scan.nextInt();
            System.out.println("Type your month of birth. (ex: 10 for October)");
            Integer month = scan.nextInt();
            String monthString = getMonth(month);

            System.out.println("Type the day of the month you were born on.");
            Integer day = scan.nextInt();
            System.out.println("You were born on a " + dayOfTheWeek(month, day, year) + ".");
            System.out.println("You were born in " + monthString + ".");
            System.out.println(monthString + " has " + getNumberOfDays(month) + " days in it.");
            getRhyme(dayOfTheWeek(month, day, year));
            System.out.println("Type y if you want to try again and type n if you don't.");
            scan.nextLine();
            again = scan.nextLine();
        } while(again.equals("y"));
    }

    private static String dayOfTheWeek(int month, int day, int year) {
        // Break up year
        int yearOfCentury;
        int century;
        int numberDay;
        if(month == 1 || month == 2) {
            month = month + 12;
            year--;
        }
        yearOfCentury =  year % 100;
        century = year / 100;

        numberDay = (day+((13*(month+1))/5)+yearOfCentury+(yearOfCentury/4)+(century/4)+(5*century))%7;


        switch(numberDay) {
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday" ;
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 0:
                return "Saturday";
            case 1:
                return "Sunday";
        }
        return "Invalid date " + numberDay;
    }
    private static String getMonth(int month) {
        switch(month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return "Invalid month";

    }
    private static int getNumberOfDays(Integer month) {
        switch(month) {
            case 1:
                return 31;
            case 2:
                return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
        }
        return 0;
    }
    private static void getRhyme(String day) {
        System.out.println("Your rhyme is:");

        switch(day) {
            case "Monday":
                System.out.println("Child is of fair face.");
                return;
            case "Tuesday":
                System.out.println("Child is full of grace.");
                return;
            case "Wednesday":
                System.out.println("Child is full of woe.");
                return;
            case "Thursday":
                System.out.println("Child has far to go.");
                return;
            case "Friday":
                System.out.println("Child is loving and giving.");
                return;
            case "Saturday":
                System.out.println("Child works hard for a living.");
                return;
            case "Sunday":
                System.out.println("Child is fair and wise and good in every way.");
                return;
        }
    }
}
