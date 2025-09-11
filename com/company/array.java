package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class array {
    public static void main(String[] args) {
        //question 24 : Find missing number in array.

        int []arr = {12,34,5,32,2,35};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find in the array : ");

        int a = sc.nextInt();

        System.out.println("The array is : "+Arrays.toString(arr));

        boolean found = true;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=a){
                found = false;
            }else {
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("The number is founded !");
        }else {
            System.out.println("The number not found !");
        }
    }
}