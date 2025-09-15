package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class array {
    public static void main(String[] args) {
        //Question 29: Average excluding max and min.

        int []arr = {12,21,13,31,42};

        int max = arr[0];
        int min = arr[0];
        float sum = arr[0];

        System.out.println("The array is : "+Arrays.toString(arr));
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }else if(arr[i]<min){
                min = arr[i];
            }
          }
        float x = ( (sum-max-min)/(arr.length-2));

        System.out.printf("The avg without max and min value is : "+x);
        }
    }