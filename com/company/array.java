package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class array {
    public static void main(String[] args) {
    //Question 27 : Count even and odd numbers in array.
        int []arr = {12,21,13,31,42};

        int n = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2==0)
                n++;
            }
            System.out.println("Number of even numbers are : "+n);
            System.out.println("Number of odd numbers are : "+(arr.length - n) );
        }
    }