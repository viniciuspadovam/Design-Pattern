package br.com.solid.dip.right;

import br.com.solid.dip.right.factory.DbProductFactory;
import br.com.solid.dip.right.model.DbEnum;
import br.com.solid.dip.right.model.IDbProduct;

public class Payment {

    public void pay(String productId) {
        IDbProduct db = DbProductFactory.create(DbEnum.MONGODB);

        System.out.println(db.getProductById(productId));
    }

}
