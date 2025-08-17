package com.turkcell.intro;

public class Calculator
{
    // Method Overloading

    // add(1.5, 2.3)
    public double add(double a, double b){
        return a+b;
    }
    // add(1,2)
    public int add(int a, int b){
        return a+b;
    }
    // add(1,2,3)
    public int add(int a, int b, int c){
        return a+b+c;
    }
}
