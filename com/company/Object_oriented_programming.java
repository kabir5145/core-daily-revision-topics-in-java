package com.company;

class Dog{
    String name;
    String color;

    Dog(String name,String color){
        System.out.println(this.name = name);
        System.out.println(this.color = color);
    }
}
public class Object_oriented_programming {
    public static void main(String[] args) {
        //question 2 : Parameterized Constructor.
       Dog d = new Dog("Po","Black");
    }
}
