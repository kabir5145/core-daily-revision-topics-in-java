package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class array {
    public static void main(String[] args) {
        //question 15 : Common elements in two integer arrays.
        int[] a = {12,13,14,15,16};
        int[] b = {21,31,41,51,61,16};

        System.out.println("The first array is : "+Arrays.toString(a));
        System.out.println("The second array is : "+Arrays.toString(b));

        for(int i = 0;i<a.length;i++){
            for(int k = 0;k<b.length;k++){
                if(a[i]==b[k]){
                    System.out.println("The common number in the array is : "+a[i]);
                }
            }
        }
    }
}