package com.company;

public class pattern_problem {
    public static void main(String[] args) {
        //Question 3
        int a = 5;
        int b = 5;

        for (int i = 0; i < a; i++) {
            for (int k = 0; k < b-i; k++) {
                System.out.print(" ");
            }
            for(int j = 0;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
