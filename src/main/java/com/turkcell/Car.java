package com.turkcell;

// OOP 'de temsil edeceğimiz nesnenin kalıbı.
public class Car
{
    // Her nesnenin içinde ctor oto. oluşturulur.
    // Ama istersek manuel kendi ctor'ımızı yazabiliriz.

    // All-Args-Ctor
    public Car(String brand) {
        System.out.println("1. Ctor bloğu.");
    }
    // No-Args-Ctor
    public Car()  {
        System.out.println("2. ctor bloğu");
    }
    // Method Overloading


    public String brand;
    public String model;
    public int year;
    public float km;

    public void startRent(){
        System.out.println("Kiralama başlatılıyor.");
    }
    public void endRent() {
        System.out.println("Kiralama bitiriliyor.");
    }
}
// Erişim Belirleyiciler
// public => Bu class diğer tüm classlardan erişilebilsin.
// protected => Bu class alt sınıflardan, aynı paketlerden erişilebilsin.
// private => Yalnızca o sınıfın içinden erişilebilsin.
// default => Bu class aynı sınıf ve aynı paket dışında erişilebilir olmasın.