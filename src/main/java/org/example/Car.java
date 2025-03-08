package org.example;

public class Car {

    // instance data members
    String color;
    String brand;
    int airBagsCount;

    // constructor
    public Car(String color, String brand, int airBagsCount) {
        this.color = color;
        this.brand = brand;
        this.airBagsCount = airBagsCount;
    }

    // functionalities
    public void start(){
        System.out.println(brand+" car is Starting... ");
    }

    public void drive(){
        System.out.println(brand + " car is in Driving mode...");
    }

    public void stop(){
        System.out.println(brand+" car has Stopped. ");
    }
}

class Driver {
    public static void main(String[] args) {
        Car myCar = new Car("Black", "Maruti", 6);
        myCar.start();
        myCar.drive();
        myCar.stop();


        Car myNewCar = new Car("Red", "Skoda", 6);
        myNewCar.start();
        myNewCar.drive();
        myNewCar.stop();
    }
}
