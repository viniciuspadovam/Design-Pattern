package br.com.solid.isp.wrong;

public class Motorcycle implements IVehicle {

    public Motorcycle(String color, String year, double engine) {
        configureMotorcycle(color, year, engine);
    }

    @Override
    public void configureCar(String color, String year, double engine, int seats) {}

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
