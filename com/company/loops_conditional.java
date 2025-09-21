package com.company;


import java.util.Objects;
import java.util.Scanner;

public class loops_conditional {
    public static void main(String[] args) {
       //Question 7: Sum of N natural number.

        System.out.println("First 10 natural no. are : ");

        int n = 0;
        for(int i = 1;i<=10;i++){
            System.out.println(i+" ");

            n +=i;

        }
        System.out.println("The sum is : "+n);
    }
}
