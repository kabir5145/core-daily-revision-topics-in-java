package com.company;

public class pattern_problem {
    public static void main(String[] args) {
    //Question 2
        int a = 5;
        int b = 5;

        for(int i =0;i<a;i++){
            for(int k = 0;k<b;k++) {
                if(i==0 || k==0 || i == a-1 || k ==b-1){
                    System.out.print("*"+" ");
                }else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}
