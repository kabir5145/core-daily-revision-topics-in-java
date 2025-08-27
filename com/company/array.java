package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class array {
    public static void main(String[] args) {
        //question 17 : Find the second-largest number.
        int []arr= {12,13,14,15,16,67};

        System.out.println("The array is : "+Arrays.toString(arr));

        int max = arr[0];

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i-1];
            }
        }
        System.out.println("The max second-element in the array is : "+max);
    }
}