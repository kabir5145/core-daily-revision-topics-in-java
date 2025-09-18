package com.company;

import java.awt.*;
import java.util.Scanner;

public class string_question {
    public static void main(String[] args) {
        //Question 11: String from Character Array.
        char []arr_num = new char[]{'1','2','3','4'};

        String str = String.copyValueOf(arr_num,1,3);

        System.out.println("The book contains "+str+" pages.");
    }
}