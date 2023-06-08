package com.bjit.polymorphism;

public class Rectangle extends Triangle {
    // Runtime polymorphism
    public void draw()
    {
        System.out.println("Area of Rectangle: ");
    }
    //  Compile-time Polymorphism
    public void area(int width, int height) {
        System.out.println(width*height);
    }

    public void area(double width, int height) {
        System.out.println(width*height);
    }

    public void area(double width, double height, int constant) {
        System.out.println(width*(height+constant));
    }
}
