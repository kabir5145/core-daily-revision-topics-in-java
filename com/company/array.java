package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class array {
    public static void main(String[] args) {
        //question 22 : Find the pairs with a given sum.

        int []arr = {1,2,3,4,5,6,7,8};
        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt();

        System.out.println("Pairs with sum " + sum + " are:");

        for(int i = 0;i<arr.length;i++){
            for(int k = 0;k<arr.length;k++){
                if(arr[i]+arr[k] == sum){
                    System.out.println("(" + arr[i] + ", " + arr[k] + ")");
                }
            }
        }
    }
}