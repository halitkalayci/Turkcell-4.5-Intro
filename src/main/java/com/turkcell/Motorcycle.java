package com.turkcell;

public class Motorcycle extends Vehicle
{
    private boolean hasBag;

    public boolean hasBag() {
        return hasBag;
    }

    public void setHasBag(boolean hasBag) {
        this.hasBag = hasBag;
    }

    // Method Overriding


    @Override
    public void startRent() {
        System.out.println("Motorcycle Rent");
        super.startRent();
    }
}
