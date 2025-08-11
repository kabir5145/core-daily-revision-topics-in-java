package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        // Question 1: Write a Java program to sort a numeric array and a string array
        /*
        int[] number = {1, 5, 7, 3, 4, 9, 10};

        System.out.println("The original array is: " + Arrays.toString(number));

        // Sort the array
        Arrays.sort(number);

        System.out.println("The sorted array is: " + Arrays.toString(number));

        String[] word = {"c","b","a"};
        System.out.println("The original array is : "+Arrays.toString(word));

        //Sort the array
        Arrays.sort(word);

        System.out.println("The sorted array is :"+Arrays.toString(word));
         */

        //question 2: sum all values in an array
        /*
        int [] num = {12,34,45};
        int sum = 0;
        for(int i :num)
            sum += i;
        System.out.println("The sum of an array is : "+sum);
         */

        //question 3: print 10*10 grid of dashes
/*
        int [][] matrix = new int[10][10];
        for(int i = 0;i< 10;i++){
            for(int k = 0;k<10;k++) {
                System.out.print("-");
            }
            System.out.println();
        }
 */

        //question 4: Calculate average of array elements
        /*
        int [] avg = {12,45,23};
        int average =0;
        for(int i = 0;i<avg.length;i++){
            average = average + avg[i];
        }
        double av = average/avg.length;
        System.out.println("The average of the numbers are : "+av );
         */

        //question 5: Check if an array contains a specific value
        /*
        Scanner sc = new Scanner(System.in);
        int [] numbers = {12,34,21,22,3};
        System.out.println("Insert a number -->");
        int find = sc.nextInt();
        boolean found = false;
        for (int i = 0;i<numbers.length;i++){
            if(numbers[i]==find){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Yes ! We have found the number.");
        }else {
            System.out.println("Oops ! That is a wrong number.");
        }
         */

        //question 6: Given a 2D integer array mat[][] and a number x,
        // find whether element x is present in the matrix or not.
        /*
        Scanner sc = new Scanner(System.in) ;
        int x=0;
        int n = 0;
        int m = 0;
        int  [][] mat = new int[n][m];
        boolean found = false;
      for(int i = 0;i<mat.length;i++){
          for(int k = 0;k<mat[i].length;k++) {
              if (mat[i][k] == x) {
                  found = true;
              }
          }
      }
      found= false;
         */

        //question 7: Remove specific element from array
        /*
        int [] number = {12,23,21,44,54,33};
        int remove = 1;
        for(int i = remove;i< number.length-1;i++){
            number[i] = number[i+1];
        }
        System.out.println("After removing the second element : "+Arrays.toString(number));
         */

        //question 8 : Copy array using iteration
        int [] num ={12,23,21,44,54,33};
        int []copy = Arrays.copyOf(num,num.length);
        for(int i = 1;i< copy.length;i++){
            System.out.println(copy[i]);
        }
        System.out.println("copied array is : "+Arrays.toString(copy));
    }
}