package org.example;

public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();
        fleet.cars.add(new GasolineCar("fae3223f", "Ford", "Mustang", 4,13));
        fleet.cars.add(new DieselCar(10, "fapsirgrgjp323423", "Peugeot", "206", 2, true));
        fleet.cars.add(new ElectricCar("faorefheo3349","Tesla","Model S",4,100,300));

        System.out.println(fleet.toString());

        System.out.println("\n Total fee is: " + fleet.getTotalRegistrationFeeForFleet());
    }
}