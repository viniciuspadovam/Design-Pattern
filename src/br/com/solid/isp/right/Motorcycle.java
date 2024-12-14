package br.com.solid.isp.right;

public class Motorcycle implements IVehicle, IVehicleMotorcycle {

    public Motorcycle(String color, String year, double engine) {
        configureMotorcycle(color, year, engine);
    }

    @Override
    public void configureMotorcycle(String color, String year, double engine) {
        System.out.println("Criando um carro " + color + " " + year + " " + engine);
        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("Ligando motores.");
    }

}
