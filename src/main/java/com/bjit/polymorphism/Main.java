package com.bjit.polymorphism;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.draw();
        r.area(3,4);
        r.area(4.5,4);
        r.area(5.5, 6.5, 2);
    }
}
