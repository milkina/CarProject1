package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    public static void main(String[] args) {
        System.out.println("I'm driving!");
        for (String value : args) {
            System.out.println("Value: " + value);
        }
        Engine engine = new Engine();
        Driver driver = new Driver();
    }
}
