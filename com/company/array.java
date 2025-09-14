package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class array {
    public static void main(String[] args) {
        //Question 28 : Difference between max and min value.

        int []arr = {12,21,13,31,42};

        int max = arr[0];
        int min = arr[0];

        System.out.println("The array is : "+Arrays.toString(arr));
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }else if(arr[i]<min){
                min = arr[i];
            }
          }
        System.out.println("The maximum number in this array is : "+max);
        System.out.println("The minimum number in this array is : "+min);
        System.out.println("The difference between max and min value is : "+(max-min));
        }
    }