package com.company;


import java.util.Objects;
import java.util.Scanner;

public class loops_conditional {
    public static void main(String[] args) {
        //question 2: Find greatest among three numbers
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("First number is : ");
        double a = sc.nextDouble();
        System.out.println("Second number is : ");
        double b = sc.nextDouble();
        System.out.println("Third number is : ");
        double c = sc.nextDouble();

        if(a >b)
            if(a>c)
                System.out.println("Greatest number is : "+a);
        if(b>a)
            if(b>c)
                System.out.println("Greatest number is : "+b);
        if(c>a)
            if(c>b)
                System.out.println("Greatest number is : "+c);
         */

        //question 3: Check Positive,Negative or Zero (with Range)
        Scanner in = new Scanner(System.in);
        System.out.print("Input value: ");
        double input = in.nextDouble();

        if (input > 0)
        {
            if (input < 1)
            {
                System.out.println("Positive small number");
            }
            else if (input > 1000000)
            {
                System.out.println("Positive large number");
            }
            else
            {
                System.out.println("Positive number");
            }
        }
        else if (input < 0)
        {
            if (Math.abs(input) < 1)
            {
                System.out.println("Negative small number");
            }
            else if (Math.abs(input) > 1000000)
            {
                System.out.println("Negative large number");
            }
            else
            {
                System.out.println("Negative number");
            }
        }
        else
        {
            System.out.println("Zero");
        }

    }
}
