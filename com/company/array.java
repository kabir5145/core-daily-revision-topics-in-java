package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class array {
    public static void main(String[] args) {
        //Question 30: Check if array excludes 0 and -1.
        int []arr = {13,33,21,45};

        System.out.println("The array is : "+Arrays.toString(arr));

        boolean excludes = true;

        for(int num : arr){
            if(num==0 || num==-1){
                excludes = false;
                break;
            }
        }
        if(excludes){
            System.out.println("The array excludes from 0 to -1.");
        }else {
            System.out.println("The array not excludes from 0 to -1.");
        }
    }
}