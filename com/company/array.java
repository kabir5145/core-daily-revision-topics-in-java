package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class array {
    public static void main(String[] args) {
        //question 17 : Find the second-largest number.
        int []arr= {12,13,88,14,15,16,67};

        System.out.println("The array is : "+Arrays.toString(arr));

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("The second-largest element in the array is : " + secondLargest);
    }
}