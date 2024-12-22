package br.com.designpatterns.factory;

public class Main {

    private static Transport transport;

    public static void main(String[] args) {
        configure(args[0]);
        if(transport != null) startTransport();
    }

    private static void configure(String type) {
        switch (type) {
            case "car":
                transport = new CarTrnsport();
                break;
            case "motocycle":
                transport = new MotorcycleTransport();
                break;
            default:
                System.out.println("Selecione o tipo de entrega.");
                break;
        }
    }

    private static void startTransport() {
        transport.startTransport();
    }

}
