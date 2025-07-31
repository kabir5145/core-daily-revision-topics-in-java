package com.company;

import java.util.Scanner;

public class string_question {
    public static void main(String[] args) {
        // question 1 :reversing a string
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println("The reverse of this string is : "+reversed);
    }
}
