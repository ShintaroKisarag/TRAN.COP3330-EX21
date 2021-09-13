/*
 *  UCF COP3330 Fall 2021 Assignment 21 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class ex21 {
    public String getMonths(int month){ //switch case to return months according to number
        switch(month){
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
            default:
                return "error";
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of month: ");
        int month = input.nextInt();    //stores month
        ex21 switchcase = new ex21();
        String nameMonth = switchcase.getMonths(month); //gets the strings from switch cases
        if(month>0 && month<12) //if it is greater than 0 and less than 12
            System.out.print("The name of month is "+nameMonth);
        else
            System.out.print(nameMonth+" Enter correct month number");
    }
}
