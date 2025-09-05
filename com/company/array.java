package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class array {
    public static void main(String[] args) {
        //question 20 : Convert array to Arraylist.

        //Create an array of strings.
        String[] s = {"Java","C++","Python","Web dev","PHP"};
        System.out.println(Arrays.toString(s));

        //Create an Arraylist of strings and initialize it with the contents of the array.
        ArrayList list = new ArrayList(Arrays.asList(s));

        //print the Arraylist to the console.
        System.out.println(list);
    }
}