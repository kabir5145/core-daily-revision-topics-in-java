package com.company;


import java.util.Objects;
import java.util.Scanner;

public class loops_conditional {
    public static void main(String[] args) {
        //question 2: Find greatest among three numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert first number:");
        double a = sc.nextDouble();
        System.out.println("Insert second number:");
        double b = sc.nextDouble();
        System.out.println("Insert third number:");
        double c = sc.nextDouble();

        if(a>b)
            if(a>c)
                System.out.println("The greatest number is : "+a);

        if(b>a)
            if(b>c)
                System.out.println("The greatest number is : "+b);

        if(c>a)
            if(c>b)
                System.out.println("The greatest number is : "+c);

        if(a==b||b==c||a==c){
            System.out.println("Cannot found the greatest number!");
        }
        System.out.println("Hence proved !");
    }
}
