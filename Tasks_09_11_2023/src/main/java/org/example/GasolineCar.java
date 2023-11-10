package org.example;

public class GasolineCar extends AFuelCar{


    public GasolineCar(String _RegistrationNumber, String _make, String _model, int _amountOfDoor, int _newKmPerLitre) {
        super(_RegistrationNumber, _make, _model, _amountOfDoor, _newKmPerLitre);
        this.kmPerLitre = this.getRegistrationFee();
    }

    @Override
    String getFuelType() {
        return null;
    }

    @Override
    public int getRegistrationFee(){
        if (kmPerLitre < 5){
            return 10470;
        } else if (kmPerLitre < 10 && kmPerLitre > 5) {
            return 5500;
        } else if (kmPerLitre < 15 && kmPerLitre > 10){
            return 2340;
        } else if (kmPerLitre < 20 && kmPerLitre > 15){
            return 1050;
        } else if (kmPerLitre < 50 && kmPerLitre > 20) {
            return 330;
        } else return 0;
    }

    @Override
    int kmPrLitre() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\n";
    }
}
