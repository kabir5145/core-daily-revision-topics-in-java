package com.company;


import java.util.Objects;
import java.util.Scanner;

public class loops_conditional {
    public static void main(String[] args) {
        //question 1: Check positive or negative number
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the number -->");
        double c = sc.nextInt();
        if(c<0){
            System.out.println("The number is negative!");
        }else {
            System.out.println("The number is positive!");
        }
    }
}
