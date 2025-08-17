package com.turkcell;

// Superclass-> Kalıtım alınan class (Vehicle)
// Subclass -> Kalıtım yapan class (Car)
public class Car extends Vehicle // Vehicle classındaki tüm özellikleri al, üzerine buradaki özellikleri ekle.
{
    private int doorCount;

    public Car() {
    }

    public Car(String brand, String model, int year, float km, int doorCount) {
        super(brand, model, year, km);
        this.doorCount = doorCount;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}
