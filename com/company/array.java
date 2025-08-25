package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class array {
    public static void main(String[] args) {
        //question 14 : Common elements in two string arrays.
        String []a = {"kabir","raghav","AAditya"};
        String [] b = {"Hello","kabir","AAditya"};

        System.out.println("The first string is : "+Arrays.toString(a));
        System.out.println("The second string is : "+Arrays.toString(b));
        for(int i = 0;i<a.length;i++){
            for(int k = 0;k<b.length;k++){
                if(a[i]==b[k]){
                    System.out.println("The common element is : "+a[i]);
                }
            }
        }
    }
}