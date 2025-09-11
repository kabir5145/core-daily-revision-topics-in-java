package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class array {
    public static void main(String[] args) {
        //question 23 : Check if two arrays are equal.

        int[] arr_1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr_2 = {1, 2, 3, 4, 5, 6, 7, 8};

        boolean isEqual = true;

        if(arr_1.length != arr_2.length) {
            isEqual = false;
        }else {
            for(int i = 0;i<arr_1.length;i++){
                if(arr_1[i] != arr_2[i]){
                    isEqual = false;
                    break;
                }
            }
        }
        if(isEqual){
            System.out.println("Both the arrays are equal !");
        }else {
            System.out.println("Two arrays are not equal !");
        }
    }
}