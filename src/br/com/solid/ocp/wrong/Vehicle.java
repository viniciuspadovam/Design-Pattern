package br.com.solid.ocp.wrong;

public class Vehicle {
    private String color;
    private String year;
    private double engine;
    private int seats;

    public Vehicle(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
    }

    public void car() {
        System.out.printf("Criando um carro: %s %s %.1f com %d assentos.\n", color, year, engine, seats);
        startVehicle();
    }

    public void motorcycle() {
        System.out.printf("Criando uma moto: %s %.1f cilindradas.\n", year, engine);
    }

    public void startVehicle() {
        System.out.println("Ligando motores.");
    }
}
