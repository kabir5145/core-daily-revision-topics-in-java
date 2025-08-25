package com.company;

import java.util.Scanner;

public class string_question {
    public static void main(String[] args) {
        //question 5 : Lexicographical String Comparison

        String a = "hello how are you ?";
        String b = "hello how are you ?";

        int result = a.compareTo(b);

        if (result == 0) {
            System.out.println("yes");
        }
    }
}
