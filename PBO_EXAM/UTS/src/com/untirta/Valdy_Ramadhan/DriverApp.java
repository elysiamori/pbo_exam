package com.untirta.Valdy_Ramadhan;


public class DriverApp {
    public static void main(String[] args) throws Exception {
        Bike bike = new Bike("ZX 25","A 291 R","Bike");
        Bike bike2 = new Bike("Beat", "E 94 N", "Bike");
        Car car = new Car("Ferarri Z1", "V 41 DY", "Car");

        bike.descVehicle();
        bike2.descVehicle();
        car.descVehicle();

    }
}