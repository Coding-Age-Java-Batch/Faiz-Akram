package PolyMorOverriding;

class Vehicle {
    public void displayInfo() {
        System.out.println("Generic Vehicle");
    }
}

class Car extends Vehicle {
    @Override
    public void displayInfo() {
        System.out.println("Car: 4 wheels");
    }
}

// Bike.java
class Bike extends Vehicle {
    @Override
    public void displayInfo() {
        System.out.println("Bike: 2 wheels");
    }

    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.displayInfo();

        Car myCar = new Car();
        myCar.displayInfo();

        Bike myBike = new Bike();
        myBike.displayInfo();


        Vehicle anotherCar = new Car();
        anotherCar.displayInfo();
    }
}






