package br.com.designpatterns.abstractfactory.landvehicles;

public class Car implements ILandVehicle {

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando entrega.");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos os passageiros.");
    }

}
