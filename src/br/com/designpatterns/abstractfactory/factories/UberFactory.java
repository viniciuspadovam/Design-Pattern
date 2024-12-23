package br.com.designpatterns.abstractfactory.factories;

import br.com.designpatterns.abstractfactory.aircraft.Airplane;
import br.com.designpatterns.abstractfactory.aircraft.IAircraft;
import br.com.designpatterns.abstractfactory.landvehicles.Car;
import br.com.designpatterns.abstractfactory.landvehicles.ILandVehicle;

public class UberFactory implements ITransportFactory {

    @Override
    public ILandVehicle createVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createAircraft() {
        return new Airplane();
    }

}
