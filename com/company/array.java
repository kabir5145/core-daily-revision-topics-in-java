package com.company;

import java.util.Arrays; // Import required to use Arrays.toString

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
        int [] avg = {12,45,23};
        int average =0;
        for(int i = 0;i<avg.length;i++){
            average = average + avg[i];
        }
        double av = average/avg.length;
        System.out.println("The average of the numbers are : "+av );
    }
}

