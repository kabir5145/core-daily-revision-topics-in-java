package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class array {
    public static void main(String[] args) {
        //question 12 : Find duplicate in integer array
        int[] arr = {12, 12, 45, 67, 78, 88,0,0,45,78};
        System.out.println("The original array is : "+Arrays.toString(arr));
        for(int i = 0;i<arr.length-1;i++){
            for(int k = i+1;k<arr.length;k++){
                if((arr[i]==arr[k])){
                    System.out.println("Duplicate Element in the array is : "+arr[k]);
                }
            }
        }
    }
}