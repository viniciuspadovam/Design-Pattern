package br.com.designpatterns.factory;

import br.com.designpatterns.factory.vehicle.IVehicle;
import br.com.designpatterns.factory.vehicle.Motorcycle;

public class MotorcycleTransport extends Transport {

    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }

}
