package br.com.solid.dip.right.factory;

import br.com.solid.dip.right.model.DbEnum;
import br.com.solid.dip.right.model.IDbProduct;
import br.com.solid.dip.right.model.MongoDbProduct;
import br.com.solid.dip.right.model.MySQLProduct;

public class DbProductFactory {

    public static IDbProduct create(DbEnum type) {
        if(type == DbEnum.MYSQL) return new MySQLProduct();
        else return new MongoDbProduct();
    }

}
