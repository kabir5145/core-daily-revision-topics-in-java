package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class array {
    public static void main(String[] args) {
        //question 21 : Convert Arraylist to array.

        //Create an Arraylist of strings and initialize it with the contents of the array.
        ArrayList<String> list = new ArrayList();
        list.add("Python");
        list.add("Java");
        list.add("HTML");
        list.add("CSS");
        list.add("Java script");
        System.out.println(list);

        String []s = new String[list.size()];
        list.toArray(s);

        for(String string : s){
            System.out.print(string+" ");
        }
    }
}