package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class array {
    public static void main(String[] args) {
        //Question 31: Sum of an array .
        int []arr = {13,33,21,45};

        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum +=arr[i];
        }
        System.out.println(sum);
    }
}