package com.turkcell;

public class Oop {
    public static void main(String[] args) {
        // Her class aynı zamanda yeni bir veri türü.
        int a = 1;
        // Constructor - Yapıcı blok
        Car car1 = new Car(
                "Honda",
                "Civic",
                2025,
                100); // Instance
        car1.startRent();
        // new -> O classtan yeni bir "instance" üretir.

        Car car2 = new Car();
        car2.brand = "Toyota";
        car2.model = "Corolla";
        car2.startRent();

        // Encapsulation / Kapsülleme
        //car2.year = 10; // SET
        //System.out.println(car2.year); // GET
        car2.setYear(2025);
        car2.setYear(10); // SET
        System.out.println(car2.getYear()); // GET
    }
}
