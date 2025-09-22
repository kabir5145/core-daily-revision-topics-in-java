package com.company;


import java.util.Objects;
import java.util.Scanner;

public class loops_conditional {
    public static void main(String[] args) {
       //Question 8: Average of three number.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = (a+b+c)/3;
        System.out.println(avg);
    }
}
