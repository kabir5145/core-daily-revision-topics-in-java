package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        //question 9 : Insert element at specific position
        Scanner sc = new Scanner(System.in);
        int [] a= {13,14,15,16,17};
        System.out.println("Position of the number where you want to insert : ");
        int insertPosition = sc.nextInt();
        System.out.println("The new number is : ");
        int newValue = sc.nextInt();
        System.out.println("The new number to insert is : "+newValue);
        System.out.println("The original array is : "+Arrays.toString(a));

        for(int i= a.length-1;i>insertPosition;i--){
            a[i]= a[i-1];
        }
        a[insertPosition]= newValue;
        System.out.println("New array is : "+Arrays.toString(a));
    }
}