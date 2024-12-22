package br.com.designpatterns.factory.vehicle;

public class Motorcycle implements IVehicle {
    
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando entrega.");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos a encomenda.");
    }

}
