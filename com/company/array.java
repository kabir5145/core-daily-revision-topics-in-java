package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class array {
    public static void main(String[] args) {
        //question 16 : Remove duplicate from array.
        int[] a = {12,13,14,15,16,16};

        int n = a.length;

        //making a new array
        int [] temp = new int[n];
        int newLength =0;

        for(int i =0;i<n;i++){
            boolean isDuplicate = false;

            for(int k = 0;k<newLength;k++){
                if(a[i]==temp[k]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                temp[newLength]=a[i];
                newLength++;
            }
        }
        System.out.println("The sorted array is : ");
        for(int i = 0;i<newLength;i++){
            System.out.print(temp[i]+" ");
        }
    }
}