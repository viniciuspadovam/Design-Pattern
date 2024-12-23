package br.com.designpatterns.abstractfactory.factories;

import br.com.designpatterns.abstractfactory.aircraft.Helicopter;
import br.com.designpatterns.abstractfactory.aircraft.IAircraft;
import br.com.designpatterns.abstractfactory.landvehicles.ILandVehicle;
import br.com.designpatterns.abstractfactory.landvehicles.Motorcycle;

public class NineNineFactory implements ITransportFactory {

    @Override
    public ILandVehicle createVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createAircraft() {
        return new Helicopter();
    }

}
