package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class string_question {
    public static void main(String[] args) {
        //gfg ques
        //Question 1 : Reverse String
        Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       char[]reverseString =s.toCharArray();
       for(int i = reverseString.length-1;i>=0;i--){
           System.out.print(reverseString[i]);
       }
    }
}