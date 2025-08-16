package com.turkcell;

public class Example {
    public static void main(String[] args) {
        Employee emp = new Employee("Halit","Kalaycı","123",50,"Yazılım");

        Employee emp1 = new Employee();
        emp1.setFirstName("S");
        System.out.println(emp1.getFirstName());
    }
}
