package org.example;

public class ElectricCar extends ACar{

    int batteryCapacity;
    int maxRange;

    public ElectricCar(String _RegistrationNumber, String _make, String _model, int _amountOfDoor, int _batteryCapacity, int _maxRange){
        super(_RegistrationNumber, _make, _model, _amountOfDoor);
        batteryCapacity = _batteryCapacity;
        maxRange = _maxRange;
    }

    int getBatteryCapacity() {
        return batteryCapacity;
    }

    int getMaxRangeKm() {
        return maxRange;
    }

    int getWhPrKm(){
        return 0;
    }

    @Override
    public int getRegistrationFee(){
        return (int) ((getWhPrKm() / 91.25) /100);
    }
    @Override
    public String toString() {
        return super.toString() + "\n The car's max range is: " + getMaxRangeKm()
                + "\n The car's battery capacity is: " + getBatteryCapacity() +
                "\n The car's Wh/km is: " + getWhPrKm() + "\n";
    }
}
