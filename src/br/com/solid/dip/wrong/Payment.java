package br.com.solid.dip.wrong;

public class Payment {

    public void pay(String productId) {
        // MySQLProduct db = new MySQLProduct();
        MongoDbProduct db = new MongoDbProduct();

        System.out.println(db.getProductById(productId));
    }

}
