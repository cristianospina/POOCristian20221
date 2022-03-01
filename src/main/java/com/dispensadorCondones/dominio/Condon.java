package com.dispensadorCondones.dominio;

public class Condon {
    public String marca;
    public double sabor;

    public Condon(String marca) {
        this.marca = marca;
    }

    public Condon(String marca, double sabor) {
        this.marca = marca;
        this.sabor = sabor;
    }
}
