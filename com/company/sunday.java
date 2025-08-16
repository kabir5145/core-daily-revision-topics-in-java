package com.company;

import java.util.Scanner;

public class sunday {
    public static void main(String[] args) {
        //question 2 : Throw and Catch Exception with Try-Catch
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert number:");
        double a = sc.nextDouble();
        tryNumber(a);
    }

    public static void tryNumber(double a){
        try{
            checkNumber(a);
            System.out.println(a+" is even.");
        }catch (IllegalArgumentException e ){
            System.out.println("Error : "+e.getMessage());
        }
    }
    public static void checkNumber(double num){
        if(num%2 !=0){
            throw  new IllegalArgumentException(num + " is odd.");
        }
    }
}
