package com.figurasGeometricas.Dominio;

public class TrianguloRectangulo extends Triangulo {
    private double base;
    private double altura;

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (this.base * this.altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return this.base + this.altura + getHipotenusa();
    }

    private double getHipotenusa() {
        return Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.altura, 2));
    }

    @Override
    public String toString() {
        return "Triangulo Rectangulo";
    }
}