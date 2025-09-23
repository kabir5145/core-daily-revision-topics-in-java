package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class string_question {
    public static void main(String[] args) {
        //Question 13: String Length.
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("The original string is : "+s);
        System.out.println("The string length is : "+s.length());
    }
}