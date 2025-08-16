package com.turkcell;

// OOP 'de temsil edeceğimiz nesnenin kalıbı.
public class Car
{
    public String brand;
    public String model;
    // Direkt erişime kapatmak.
    private int year;
    public float km;
    // Her nesnenin içinde ctor oto. oluşturulur.
    // Ama istersek manuel kendi ctor'ımızı yazabiliriz.

    // All-Args-Ctor
    public Car(String brand, String model, int year, float km) {
        this.brand = brand; // this -> Classın kendisini ifade eder.
        this.model = model;
        this.year = year;
        this.km = km;
    }
    // No-Args-Ctor
    public Car() {
        System.out.println("2. ctor bloğu");
    }
    // Method Overloading


    public void startRent(){
        System.out.println("Kiralama başlatılıyor: " + this.brand);
    }
    public void endRent() {
        System.out.println("Kiralama bitiriliyor.");
    }


    // getter-setter methods
    //setter
    public void setYear(int year){
        if (year < 2000)
        {
            System.out.println("Yıl 2000'den küçük olamaz");
            return;
        }
        this.year = year;
    }
    public int getYear(){
        return this.year;
    }
    //


}
// Erişim Belirleyiciler
// public => Bu class diğer tüm classlardan erişilebilsin.
// protected => Bu class alt sınıflardan, aynı paketlerden erişilebilsin.
// private => Yalnızca o sınıfın içinden erişilebilsin.
// default => Bu class aynı sınıf ve aynı paket dışında erişilebilir olmasın.