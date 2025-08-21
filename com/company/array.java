package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class array {
    public static void main(String[] args) {
        //question 10 : Find max and min in an array
        int[] arr = {19, 87, 66, 54, 44, 56, 65};
        System.out.println("The original array is : " + Arrays.toString(arr));
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The max array is : " + max);
        System.out.println("The min array is : " + min);

    }
}