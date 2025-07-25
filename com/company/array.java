package com.company;

import java.util.Arrays; // Import required to use Arrays.toString

public class array {
    public static void main(String[] args) {
        // Question 1: Write a Java program to sort a numeric array and a string array
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
    }
}

