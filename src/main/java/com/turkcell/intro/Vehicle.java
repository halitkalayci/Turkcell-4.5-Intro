package com.turkcell.intro;

public class Vehicle
{
    private String brand;
    private String model;
    private int year;
    private float km;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, int year, float km) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.km = km;
    }

    public void startRent() {
        System.out.println("Renting Vehicle");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }
}
