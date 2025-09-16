package com.company;

import java.awt.*;
import java.util.Scanner;

public class string_question {
    public static void main(String[] args) {
        //Question 10 : Compare with StringBuffer.
        String str_1 = "hello how are you ",str_2 = "Hello How Are You";

        StringBuilder cs = new StringBuilder("hello how are you ");

        System.out.println(str_1.contentEquals(cs));
        System.out.println(str_2.contentEquals(cs));
    }
}