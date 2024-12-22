package br.com.designpatterns.factory;

import br.com.designpatterns.factory.vehicle.Car;
import br.com.designpatterns.factory.vehicle.IVehicle;

public class CarTrnsport extends Transport {

    @Override
    protected IVehicle createTransport() {
        return new Car();
    }

}
