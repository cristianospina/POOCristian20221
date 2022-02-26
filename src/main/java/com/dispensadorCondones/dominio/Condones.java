package com.dispensadorCondones.dominio;

public class Condones {
    public String marca;
    public double sabor;

    public Condones(String marca) {
        this.marca = marca;
    }

    public Condones(String marca, double sabor) {
        this.marca = marca;
        this.sabor = sabor;
    }
}
