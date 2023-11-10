package org.example;

import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> cars = new ArrayList<Car>();

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder();
        for (Car car: cars) {
            returnString.append(car.toString() + "\n");
        }

        return returnString.toString();
    }

    int getTotalRegistrationFeeForFleet(){
        int totalFee = 0;
        for (Car car: cars) {
            totalFee += car.getRegistrationFee();
        }
        return totalFee;
    }
}
