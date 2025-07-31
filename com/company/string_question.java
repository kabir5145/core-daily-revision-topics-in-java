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
        String s = "google company";
        System.out.println(s);
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(9));
    }
}
