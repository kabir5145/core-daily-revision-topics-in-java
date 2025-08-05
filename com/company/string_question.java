package com.company;

import java.util.Scanner;

public class string_question {
    public static void main(String[] args) {
        // question 1 :reversing a string
        /*
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println("The reverse of this string is : "+reversed);
         */

        //question 2: get character at index
        /*
        String s = "google company";
        System.out.println(s);
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(9));
         */

        //question 3: pattern questions
        //1
        /*int a = 5;
        for(int i = 0;i<=a;i++){
            for(int k = 0;k<=a;k++){
                System.out.print("*");
            }
            System.out.println();
        }
         */

        //2
        /*int n = 4;
        int m = 5;
        for(int i = 0;i<n;i++){
            for(int k = 0;k<m;k++){
               if(i ==0 ||i ==n-1 ||k ==0 || k==m-1){
                   System.out.print("*");
               }else {
                   System.out.print(" ");
               }
            }
            System.out.println();
        }
         */

        //3
        int n = 5;
        for(int i = 0;i<=n;i++){
            for(int k = 0;k <=i;k++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
