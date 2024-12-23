package br.com.designpatterns.abstractfactory.config;

import br.com.designpatterns.abstractfactory.aircraft.IAircraft;
import br.com.designpatterns.abstractfactory.factories.ITransportFactory;
import br.com.designpatterns.abstractfactory.landvehicles.ILandVehicle;

public class ConfigApplication {

    private ILandVehicle vehicle;
    private IAircraft aircraft;

    public ConfigApplication(ITransportFactory factory) {
        this.vehicle = factory.createVehicle();
        this.aircraft = factory.createAircraft();
    }

    public void startRoute() {
        this.vehicle.startRoute();
        this.aircraft.startRoute();
    }

}
