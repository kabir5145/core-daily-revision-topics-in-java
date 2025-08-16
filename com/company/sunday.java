package com.company;

import java.util.Scanner;

public class sunday {
    public static void main(String[] args) {
        //question 1 : Throw and Catch Exception with Try-Catch
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert first number:");
        double a = sc.nextDouble();
        System.out.println("Insert second number:");
        double b = sc.nextDouble();
        try{
            double result = divideNumber(a,b);
            System.out.println(result);
        }catch (ArithmeticException e ){
            System.out.println("Error : "+e.getMessage());
        }
    }
    public static double divideNumber(double dividend, double divisor){
        if(divisor==0){
            throw new ArithmeticException("Cannot divide the given number by zero!");
        }
        return dividend/divisor;
    }
}
