package br.com.solid.ocp;

import br.com.solid.ocp.right.vehicles.Car;
import br.com.solid.ocp.right.vehicles.Motorcycle;
import br.com.solid.ocp.wrong.TypeVehicle;
import br.com.solid.ocp.wrong.Vehicle;

public class Main {
    private static TypeVehicle typeVehicle;
    public static void main(String[] args) {
        typeVehicle = TypeVehicle.CAR;

        if(typeVehicle == TypeVehicle.CAR) {
            // - Wrong Way
            // Vehicle v = new Vehicle("Amarelo", "2021", 2.0, 4);
            // v.car();

            // - Right Way
            Car car = new Car("Amarelo", "2022", 1.6, 4);
        } else if(typeVehicle == TypeVehicle.MOTORCYCLE) {
            // - Wrong Way
            // Vehicle v = new Vehicle("", "2022", 250d, 1);
            // v.motorcycle();
            
            // - Right Way
            Motorcycle motorcycle = new Motorcycle("Branco", "2020", 250);
        }
    }
}
