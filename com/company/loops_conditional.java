package com.company;


import java.util.Objects;
import java.util.Scanner;

public class loops_conditional {
    public static void main(String[] args) {
        //question 2: Find greatest among three numbers
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
    }
}
