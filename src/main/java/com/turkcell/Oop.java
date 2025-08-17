package com.turkcell;

public class Oop {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(2025);
        System.out.println(car1.getYear());
        car1.startRent();


        Motorcycle m1 = new Motorcycle();
        m1.setKm(10000);
        m1.startRent();

        System.out.println("*****");
        // Polymorphism
        Vehicle v1 = new Car();
        Vehicle v2 = new Motorcycle();

        v1.startRent(); // 1.
        v2.startRent(); // 2.

        //Car c1 = new Vehicle();
    }
}
