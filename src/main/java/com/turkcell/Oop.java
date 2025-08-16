package com.turkcell;

public class Oop {
    public static void main(String[] args) {
        // Her class aynı zamanda yeni bir veri türü.
        int a = 1;
        // Constructor - Yapıcı blok
        Car car1 = new Car("Honda"); // Instance
        car1.brand = "Honda";
        car1.model = "Civic";
        car1.km = 100;
        car1.year = 2025;
        car1.startRent();
        // new -> O classtan yeni bir "instance" üretir.

        Car car2 = new Car();
        car2.brand = "Toyota";
        car2.model = "Corolla";
        car2.startRent();
    }
}
