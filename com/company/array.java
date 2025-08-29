package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class array {
    public static void main(String[] args) {
        //question 17 : Find the second-largest number.
        int []arr= {12,13,88,14,15,16,67};

        System.out.println("The array is : "+Arrays.toString(arr));

        Arrays.sort(arr);

        int index = arr.length-1;
        while (arr[index]==arr[arr.length-1]) {
            index--;
        }
        System.out.println("Second largest value : "+arr[index]);
    }
}