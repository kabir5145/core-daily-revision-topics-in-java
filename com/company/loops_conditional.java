package com.company;


import java.util.Objects;
import java.util.Scanner;

public class loops_conditional {
    public static void main(String[] args) {
        //Question 5: Weekday name from number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");

        String dayName = "";
        int day = sc.nextInt();

        switch (day){
            case 1: dayName = "Monday";break;
            case 2: dayName = "Tuesday";break;
            case 3: dayName = "Wednesday";break;
            case 4: dayName = "Thursday";break;
            case 5: dayName = "Friday";break;
            case 6: dayName = "Saturday";break;
            case 7: dayName = "Sunday";break;
            default:dayName="wrong!";
        }
        System.out.println("The day is : "+dayName);
    }
}
