package com.company;


import java.util.Objects;
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
        /*
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
         */

        //question 3
        /*
        Scanner sc = new Scanner(System.in);
        char operator = sc.next().charAt(0);
        String result = "0" ;
        switch (operator){
            case '1':
                result = "mon";
                break;
            case '2':
                result = "tues";
                break;
            case '3':
                result = "wed";
                break;
            case '4':
                result = "thurs";
                break;
            case'5':
               result="fri";
                break;
            case '6':
                result = "sat";
                break;
            case '7':
               result = "sun";
                break;
            default:
                System.out.println("Enjoy your day");
        }
        System.out.println("The day of the week is :"+result);
         */

        //question 4
        /*
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 400==0){
            System.out.println("Its a leap year ");
        }else {
            System.out.println("It is not a leap year");
        }
         */

        //question 5
        /*
        Scanner sc = new Scanner(System.in);
        String  a = sc.nextLine();
        if(a.endsWith(".com")){
            System.out.println("It is a commercial website .");
        } else if (a.endsWith(".org")) {
            System.out.println("It is an organisation website");
        }else if (a.endsWith(".in")) {
            System.out.println("It is an indian website");
        }
         */

        //question 6
        int n = 3;
        int f = 1;
        int g = 0;
        for(int i = 0;i<=n;i++){
            for(int k = 0 ;k<=i;k++){
                System.out.print(g);
                g=f++;
            }
            System.out.println();
        }
    }
}
