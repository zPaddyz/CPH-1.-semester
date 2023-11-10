package org.example;

public abstract class ACar implements Car {


    String RegistrationNumber;
    String make;
    String model;
    int amountOfDoor;

    public ACar(String _RegistrationNumber, String _make, String _model, int _amountOfDoor) {
        RegistrationNumber = _RegistrationNumber;
        make = _make;
        model = _model;
        amountOfDoor = _amountOfDoor;
    }

    @Override
    public String getRegistrationNumber() {
        return RegistrationNumber;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return amountOfDoor;
    }

    @Override
    public int getRegistrationFee() {
        return 0;
    }

    @Override
    public String toString() {
        return "The car's make is: " + getMake() + "\n The car's model is: " + getModel() +
                "\n The car's number of doors is: " + getNumberOfDoors() + "\n The car's registrations fee is: " + getRegistrationFee() +
                "\n The car's registration number is: " + getRegistrationNumber();
    }
}
