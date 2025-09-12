package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class array {
    public static void main(String[] args) {
        //Question 25 : Common elements in three sorted arrays.
        int [] arr_1 = {32,12,34,31,11};
        Arrays.sort(arr_1);
        int [] arr_2 = {11,12,54,98,76,67};
        Arrays.sort(arr_2);
        int [] arr_3 = {100,12,11,364,383};
        Arrays.sort(arr_3);

        int i = 0;
        int j = 0;
        int k = 0;

        System.out.print("Common elements: ");

        while (i < arr_1.length && j < arr_2.length && k < arr_3.length) {
            if (arr_1[i] == arr_2[j] && arr_2[j] == arr_3[k]) {
                System.out.print(arr_1[i] + " ");
                i++;
                j++;
                k++;
            } else if (arr_1[i] < arr_2[j]) {
                i++;
            } else if (arr_2[j] < arr_3[k]) {
                j++;
            } else {
                k++;
            }
        }
    }
}