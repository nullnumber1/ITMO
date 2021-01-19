package com.nullnumber1.lab4;

public class Vehicle {
    private final String name;
    private final Driver driver;

    public Vehicle(String name, Driver driver) {
        this.name = name;
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    public String drive(Location location) {
        System.out.print(name + " is making engine sound, ");
        return name + " got to " + location;
    }

    @Override
    public String toString() {
        return (this.name + " with " + this.driver.toString());
    }
}
