package com.company;


public class inheritance {
    public static class Animal{
        public void makeSound(){
            System.out.println("The animal makes sound.");
        }
    }
    public static class cat extends Animal {
        public void makeSound(){
            System.out.println("The cat quarrels.");
        }
    }
    public static void main(String[] args) {
        /*
        question 1 : Write a java program to create a class called animal with a method called makeSound().
        Create a subclass called Cat that overrides the makeSound() method to bark.
         */
        Animal a = new Animal();
        cat c = new cat();
        a.makeSound();
        c.makeSound();
    }
}
