package com.turkcell;

public class Car extends Vehicle // Vehicle classındaki tüm özellikleri al, üzerine buradaki özellikleri ekle.
{
    private int doorCount;

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}
