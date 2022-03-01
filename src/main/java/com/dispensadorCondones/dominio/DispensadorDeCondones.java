package com.dispensadorCondones.dominio;

public class DispensadorDeCondones {
    public String marca;
    public int capacidad;
    public int cantidadActual;
    public Condon condon;

    public DispensadorDeCondones(String marca, double capacidad) {
        this.marca = marca;
        this.capacidad = (int) capacidad;
    }

    public boolean dispensar(double cantidadADispensar) {
        if (cantidadADispensar <= this.cantidadActual) {
            this.cantidadActual -= cantidadADispensar;
            System.out.println("Se dispensaron correctamente...");
            System.out.println("Quedan " + this.cantidadActual + " de condones " + this.condon.marca);
            return true;
        }

        System.out.println("No se pudo dispensar.");
        return false;
    }

    public void cambiarCondones(Condon nuevoCondon) {
        this.vaciar();
        this.condon = nuevoCondon;
        this.llenar();
    }

    public void llenar() {
        this.cantidadActual = this.capacidad;
        System.out.println("El dispensador se llenó con " + this.condon.marca);
    }

    public void vaciar() {
        this.cantidadActual = 0;
        System.out.println("El dispensador se vació con exito.");
    }
}
