package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

class Solution_2 {
    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }

        char[] arr_1=s1.toCharArray();
        char[] arr_2=s2.toCharArray();

        Arrays.sort(arr_1);
        Arrays.sort(arr_2);

        return Arrays.equals(arr_1,arr_2);
    }
}
public class string_question {
    public static void main(String[] args) {
        //gfg ques
        //Question 2 : same of two strings
        System.out.println(Solution_2.areAnagrams("listen", "silent"));
        System.out.println(Solution_2.areAnagrams("hello", "world"));
    }
}