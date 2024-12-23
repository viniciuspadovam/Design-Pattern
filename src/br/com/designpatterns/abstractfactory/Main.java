package br.com.designpatterns.abstractfactory;

import br.com.designpatterns.abstractfactory.config.ConfigApplication;
import br.com.designpatterns.abstractfactory.enums.TransportEnum;
import br.com.designpatterns.abstractfactory.factories.ITransportFactory;
import br.com.designpatterns.abstractfactory.factories.NineNineFactory;
import br.com.designpatterns.abstractfactory.factories.UberFactory;

public class Main {

    public static void main(String[] args) {
        configureApplication().startRoute();
    }

    public static ConfigApplication configureApplication(){
        ITransportFactory factory = null;

        TransportEnum company = TransportEnum.NINE_NINE;

        if(company == TransportEnum.UBER){
            factory = new UberFactory();
        }else if(company == TransportEnum.NINE_NINE){
            factory = new NineNineFactory();
        }

        return new ConfigApplication(factory);
    }

}
