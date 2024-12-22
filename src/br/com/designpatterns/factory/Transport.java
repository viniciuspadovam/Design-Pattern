package br.com.designpatterns.factory;

import br.com.designpatterns.factory.vehicle.IVehicle;

public abstract class Transport {

    public void startTransport() {
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();

}
