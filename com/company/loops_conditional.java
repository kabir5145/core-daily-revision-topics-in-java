package com.company;


import java.util.Scanner;

public class loops_conditional {
    public static void main(String[] args) {
        //question 1
        /*
        int a = 10;
        if(a==11){
            System.out.println("I am 11");
        }else {
            System.out.println("I am not 11");
        }
         */

        //question 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks obtained in maths : ");
        double m = sc.nextDouble();
        System.out.println("Enter the marks obtained in physics :");
        double p = sc.nextDouble();
        System.out.println("Enter the marks obtained in chemistry :");
        double c = sc.nextDouble();
        double result = (m+p+c)/300 *100;

        boolean pass1 = m>=33;
        boolean pass2 = p>=33;
        boolean pass3 = c>=33;
        System.out.println("The result is:"+result);
        if(result >=40&& pass1 && pass2 && pass3){
            System.out.println("SORRY ,YOU  FAILED TO CLEAR THE EXAMS!");
        }else {
            System.out.println("YOU HAVE PASSED THE EXAM!");
        }
    }
}
