package br.com.solid.dip.right.model;

public class MySQLProduct implements IDbProduct {

    public String getProductById(String id) {
        return "MySQL: exibindo dados do produto: " + id;
    }

}
