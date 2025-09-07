package com.company;

class Book{
    String title;
    String author;
    int price;

   public Book(){
        this.title = "Ice and snow";
        this.author = "James Bond";
    }
   public Book(String title , String author){
        this.title = title;
        this.author = author;
    }
    public Book(String title , String author , int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
public class Object_oriented_programming {
    public static void main(String[] args) {
        //question 3 : Constructor Overloading.
        Book b_1 = new Book();
        System.out.println("The title is : "+b_1.title);
        System.out.println("The author name is : "+b_1.author);
        System.out.println("The price of the first book is : "+b_1.price);

        Book b_2 = new Book("a","b");
        System.out.println("Title : "+b_2.title);
        System.out.println("Author : "+b_2.author);
        System.out.println("Price : "+b_2.price);

        Book b_3 = new Book("A","B",100);
        System.out.println("Title : "+b_3.title);
        System.out.println("Author : "+b_3.author);
        System.out.println("Price : "+b_3.price);
    }
}
