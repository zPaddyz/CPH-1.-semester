package org.example;

public abstract class AFuelCar extends ACar{
    int kmPerLitre;
    public AFuelCar(String _RegistrationNumber, String _make, String _model, int _amountOfDoor, int _newKmPerLitre) {
        super(_RegistrationNumber, _make, _model, _amountOfDoor);
        kmPerLitre = _newKmPerLitre;
    }
    abstract String getFuelType();
    abstract int kmPrLitre();
    @Override
    public int getRegistrationFee() {
        return super.getRegistrationFee();
    }

}
