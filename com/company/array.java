package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class array {
    public static void main(String[] args) {
     //Question 26: Move all zeros to array end.
     int [] arr = {12,1,2,0,0,0,0,3,2,56,32};
     int c = 0;

     for(int i = 0;i<arr.length;i++){
         if(arr[i]!=0){
             arr[c++]= arr[i];
         }
     }
     while (c<arr.length){
         arr[c++]=0;
     }
     for(int num : arr)
         System.out.print( num+" ");
    }
}