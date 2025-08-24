package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class array {
    public static void main(String[] args) {
        //question 13 : Find duplicate in String array
        String[] arr = {"kabir","kabir","raghav","raghav","aaditya"};
        System.out.println("The original array is : "+Arrays.toString(arr));
        for(int i = 0;i<arr.length-1;i++){
            for(int k = i+1;k<arr.length;k++){
                if((arr[i]==arr[k])){
                    System.out.println("Duplicate String in the array is : "+arr[k]);
                }
            }
        }
    }
}