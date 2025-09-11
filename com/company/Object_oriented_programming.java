package com.company;

class Student {
    int studentId;
    String studentName;
    double grade;

    // Constructor 1
    public Student() {
        this(0, "Unknown", 0.0); // Calls Constructor 2
    }

    // Constructor 2
    public Student(int studentId, String studentName) {
        this(studentId, studentName, 0.0); // Calls Constructor 3
    }

    // Constructor 3 (main one)
    public Student(int studentId, String studentName, double grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;

        System.out.println("ID: " + this.studentId);
        System.out.println("Name: " + this.studentName);
        System.out.println("Grade: " + this.grade);
    }
}

public class Object_oriented_programming {
    public static void main(String[] args) {
        // Question 4: Demonstrating constructor chaining
        Student s1 = new Student();
        Student s2 = new Student(101, "Kabir");
        Student s3 = new Student(102, "Rohan", 99.0);
    }
}
