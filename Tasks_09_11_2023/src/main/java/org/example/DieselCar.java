package org.example;

public class DieselCar extends AFuelCar{

    private boolean hasParticleFilter;
    public DieselCar(int _newKmPerLitre, String _RegistrationNumber, String _make, String _model, int _amountOfDoor, boolean _hasParticleFilter) {
        super(_RegistrationNumber, _make, _model, _amountOfDoor,_newKmPerLitre);
        hasParticleFilter = _hasParticleFilter;
    }

    @Override
    String getFuelType() {
        return null;
    }

    @Override
    public int getRegistrationFee(){
        int fee = 0;
        if (kmPerLitre < 5){
            fee = 10470 + 15260;
        } else if (kmPerLitre < 10 && kmPerLitre > 5) {
            fee = 5500 + 2270;
        } else if (kmPerLitre < 15 && kmPerLitre > 10){
            fee = 2340 + 1850;
        } else if (kmPerLitre < 20 && kmPerLitre > 15){
            fee = 1050 + 1390;
        } else if (kmPerLitre < 50 && kmPerLitre > 20) {
            fee = 330 + 130;
        }
        if(getHasParticleFilter()) return fee;
        else return fee + 1000;

    }

    Boolean getHasParticleFilter(){
        return hasParticleFilter;
    }
    @Override
    int kmPrLitre() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\n The car's particle filter status is: " + getHasParticleFilter() + "\n";
    }
}
