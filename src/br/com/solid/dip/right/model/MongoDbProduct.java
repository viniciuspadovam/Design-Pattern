package br.com.solid.dip.right.model;

public class MongoDbProduct implements IDbProduct {

    public String getProductById(String id) {
        return "MongoDB: exibindo dados do produto: " + id;
    }

}
