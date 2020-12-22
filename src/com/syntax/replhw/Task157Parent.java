package com.syntax.replhw;
/*
In Parent Class.
Create a no-argument constructor and include the logic to print "Parent Constructor without argument"
Create another constructor that takes one parameter of integer type called number.
include the logic to print the value of the number.
In Child class.
Create a Constructor without parameter and include the logic to print
"Child Constructor without argument"
Overload the constructor by adding one parameter of type integer
Inside the constructor call the parameterized parent class constructor.
In Main Class.
Create an object of Child without passing any argument.
And then another object of Child class by passing the value "10". run the application.
Expected Output:
Parent Constructor without argument
Child Constructor without argument
10

 */

public class Task157Parent {
    int number;
    Task157Parent(){
        System.out.println("Parent Constructor without argument");
    }
    Task157Parent(int number){
        this.number=number;

    }
}
class Ch extends Task157Parent {
    Ch(){
        super();
        System.out.println("Child Constructor without argument");
    }
    Ch(int num){
        super(num);
    }

    public static void main(String[] args) {
        Ch c=new Ch();
        Ch c1=new Ch(10);
        System.out.println(c1.number);
    }
}