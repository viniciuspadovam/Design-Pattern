package br.com.designpatterns.abstractfactory.factories;

import br.com.designpatterns.abstractfactory.aircraft.IAircraft;
import br.com.designpatterns.abstractfactory.landvehicles.ILandVehicle;

public interface ITransportFactory {

    ILandVehicle createVehicle();
    IAircraft createAircraft();

}
