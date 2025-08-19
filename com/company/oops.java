package com.company;

import java.util.concurrent.Callable;

class  Cat{
    String name;
    int age;

    public Cat() {
        this.name = "kitten";
        this.age = 3;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class oops {
    public static void main(String[] args) {
        //question 1: Default Constructor
        Cat c = new Cat();
        System.out.println("Cat's name : "+c.getName());
        System.out.println("Cat's age : "+c.getAge());
        }
    }

