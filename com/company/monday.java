package  com.company;

import java.util.Scanner;

public class monday {
    public static void main(String[] args) {
        //Question 1: Find Smallest Number Among Three.
        Scanner sc = new Scanner(System.in);
        System.out.println("The first number : ");
        double x = sc.nextDouble();
        System.out.println("The second number : ");
        double y = sc.nextDouble();
        System.out.println("The third number : ");
        double z = sc.nextDouble();
        System.out.println("The smallest value is "+smallest(x,y,z)+"\n");
    }
    public static double smallest(double x, double y , double z){
        return Math.min(Math.min(x,y),z);
    }
}
