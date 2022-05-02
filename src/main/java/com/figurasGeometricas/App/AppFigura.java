package com.figurasGeometricas.App;

import com.figurasGeometricas.Dominio.*;

import java.util.ArrayList;
import java.util.List;

public class AppFigura {
    public static void main(String[] args) {

        List<Figura> figuras = new ArrayList<>();

        Figura figura = new TrianguloRectangulo(50, 87);
        Circulo circulo = new Circulo(80);
        Figura figura1 = new Rectangulo(5, 6);

        figuras.add(figura);
        figuras.add(circulo);
        figuras.add(figura1);

        figuras.forEach(f -> {
            System.out.println("Se calculará el área y perímetro de " + f);
            System.out.println("Area " + f.calcularArea());
            System.out.println("Perímetro " + f.calcularPerimetro() + "\n");
        });

    }
}