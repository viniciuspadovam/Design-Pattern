package br.com.solid.isp.wrong;

public class Main {

    public static void main(String[] args) {
        String type = "Car";

        if(type == "Car") new Car("Azul", "2022", 1.6, 4);
        else if(type == "Motorcycle") new Motorcycle("Branca", "2023", 250);
    }

}
