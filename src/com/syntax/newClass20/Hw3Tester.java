package com.syntax.newClass20;

public class Hw3Tester {
    public static void main(String[] args) {
//        Hw3 task1=new Hw3("name");
//        System.out.println(task1.name);  CE because the constructor is private
//        System.out.println(task1.age);
//        System.out.println(task1.salary);

        Hw3 task2=new Hw3(12);
        System.out.println(task2.name);
        System.out.println(task2.age);
        System.out.println(task2.salary);

        Hw3 task3=new Hw3(1000.00);
        System.out.println(task3.name);
        System.out.println(task3.age);
        System.out.println(task3.salary);
    }
}
