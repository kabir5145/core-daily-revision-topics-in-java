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
        /*
        int n = 5;
        for(int i = 0;i<=n;i++){
            for(int k = 0;k <=i;k++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
         */

        //4
//        int a = 5;
//        for(int i = a;i>1;i--){
//            for(int k = 1;k<i;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //question 2 : Get Unicode Code Point at index
        /*
        String s = "W3resource.com";
        System.out.println("Original String : "+s);
        int value_1 = s.codePointAt(1);
        int value_2 = s.codePointAt(9);
        System.out.println("Character(unicode point) = "+value_1);
        System.out.println("Character(unicode point) = "+value_2);
         */

        //question 3: Get Unicode Code Point Before Index
        String s = "W3resource.com";
        System.out.println("Original String : "+s);
        int value_1 = s.codePointBefore(1);
        int value_2 = s.codePointBefore(9);
        System.out.println("Character(unicode point) = "+value_1);
        System.out.println("Character(unicode point) = "+value_2);
    }
}
