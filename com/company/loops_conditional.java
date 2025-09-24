package com.company;


import java.util.Objects;
import java.util.Scanner;

public class loops_conditional {
    public static void main(String[] args) {
        //Question 9 : Display Cubes of Numbers.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cube_1 = a*a*a;
        int cube_2 = b*b*b;
        int cube_3 = c*c*c;

        System.out.println("Cube of  a is : "+cube_1);
        System.out.println("Cube of  b is : "+cube_2);
        System.out.println("Cube of  c is : "+cube_3);
    }
}
