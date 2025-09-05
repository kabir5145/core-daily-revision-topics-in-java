package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class array {
    public static void main(String[] args) {
        //question 19 : Add two same-size matrices.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of columns you want to add in first matrix->");
        int m = sc.nextInt();
        System.out.println("Enter the number of rows you want to add in first matrix->");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns you want to add in second matrix->");
        int a = sc.nextInt();
        System.out.println("Enter the number of rows you want to add in second matrix->");
        int b = sc.nextInt();
        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[m][n];
        int[][] sum = new int[m][n];

        //first matrix

        //input
        System.out.println("Enter the numbers for your first matrix:");
        for (int i = 0; i < arr1.length; i++) {
            for (int k = 0; k < arr1.length; k++) {
                arr1[i][k] = sc.nextInt();
            }
        }

        //output
        for (int i = 0; i < arr1.length; i++) {
            for (int k = 0; k < arr1.length; k++) {
                System.out.print(arr1[i][k] + " ");
            }
            System.out.println();
        }


        //second matrix
        //input
        System.out.println("Enter the numbers for your second matrix:");
        for (int i = 0; i < arr2.length; i++) {
            for (int k = 0; k < arr2.length; k++) {
                arr2[i][k] = sc.nextInt();
            }
        }

        //output
        for (int i = 0; i < arr2.length; i++) {
            for (int k = 0; k < arr2.length; k++) {
                System.out.print(arr2[i][k]+" ");
            }
            System.out.println();
        }

        //Adding both the matrices.
        for(int i = 0;i<sum.length;i++){
            for(int k=0;k< sum.length;k++){
                sum[i][k]=arr1[i][k]+arr2[i][k];
            }
        }

        //Display the result
        System.out.println("The result is :-> ");
        for(int i = 0;i<sum.length;i++){
            for(int k=0;k< sum.length;k++){
                System.out.print(sum[i][k]+" ");
            }
            System.out.println();
        }
    }
}