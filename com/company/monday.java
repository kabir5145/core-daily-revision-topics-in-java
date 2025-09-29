package  com.company;

import java.util.Scanner;

public class monday {
    public static String middleNum(String str){
        int position;
        int length;
        if (str.length() % 2 == 0) {
            position = str.length() / 2 - 1;
            length = 2;
        }
        else {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }
    public static void main(String[] args) {
       //Question 3. Find Middle Character(s) of String
        Scanner sc = new Scanner(System.in);
        System.out.println(middleNum(sc.nextLine()));
    }
}
