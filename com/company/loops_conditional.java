package com.company;


import java.util.Objects;
import java.util.Scanner;

public class loops_conditional {
    public static void main(String[] args) {
        //Question 10 : Multiplication Table of a number
        int a = 10;
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println("Table to be calculated : "+b);
       for(int i =1;i<=a;i++){
           System.out.println(i+" * "+b+" = "+i*2);
       }
    }
}
