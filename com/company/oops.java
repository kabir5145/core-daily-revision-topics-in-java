package com.company;

class question_1{
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class oops {
    public static void main(String[] args) {
        question_1 s = new question_1();
        s.setAge(23);
        s.setName("kabir");
        System.out.println("the first name of the person is "+s.getName() +" and age is "+s.getAge());
        s.setName("raghav");
        System.out.println(s.getName());

        }
    }

