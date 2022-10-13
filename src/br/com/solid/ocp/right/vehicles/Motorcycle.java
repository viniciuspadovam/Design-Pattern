package br.com.solid.ocp.right.vehicles;

public class Motorcycle extends Vehicle {
    public Motorcycle(String color, String year, double engine) {
        this.color = color;
        this.year = year;
        this.engine = engine;

        configureMotorcycle();
    }

    public void configureMotorcycle() {
        System.out.printf("Criando uma moto: %s %.1f cilindradas.\n", year, engine);
        startVehicle();
    }
}
