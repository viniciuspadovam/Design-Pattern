package br.com.solid.isp.wrong;

public class Car implements IVehicle {

    public Car(String color, String year, double engine, int seats) {
        configureCar(color, year, engine, seats);
    }

    @Override
    public void configureCar(String color, String year, double engine, int seats) {
        System.out.println("Criando um carro " + color + " " + year + " " + engine + " com " + seats + " assentos");
        startVehicle();
    }

    @Override
    public void configureMotorcycle(String color, String year, double engine) {}

    @Override
    public void startVehicle() {
        System.out.println("Ligando motores.");
    }

}
