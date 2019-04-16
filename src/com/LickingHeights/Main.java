package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Make a loop at some point
        Integer monthDays = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in your year of birth.");
        Integer year = scan.nextInt();
        System.out.println("Type your month of birth. (ex: 10 for October)");
        Integer month = scan.nextInt();
        String monthString = getMonth(month);

        System.out.println("Type the day of the month you were born on.");
        Integer day = scan.nextInt();
        System.out.println(dayOfTheWeek(month, day, year));
        System.out.println("You were born in " + monthString + ".");
        System.out.println(monthString + " has " + monthDays + " days in it.");
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
}
