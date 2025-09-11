package com.company;

import java.awt.*;
import java.util.Scanner;

public class string_question {
    public static void main(String[] args) {
        //question 8 : Contains Specific Sequence.

        System.out.println("Enter the String : ");

        String s = "My name is kabir";

        Scanner sc = new Scanner(System.in);
        String g = sc.nextLine();

        System.out.println("Original String is : "+s);
        System.out.println("And the specific word wanted is : "+g);

        System.out.println(s.contains(g));
    }
}
