package br.com.solid.ocp.right.vehicles;

public class Vehicle {
    protected String color;
    protected String year;
    protected double engine;

    public void startVehicle() {
        System.out.println("Ligando motores.");
    }
}
