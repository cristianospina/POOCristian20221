package com.EPS.dominio;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private long cedula;
    private String nombre;
    private List<Enfermedad> enfermedades;

    public Paciente(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.enfermedades = new ArrayList<>();
    }

    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(List<Enfermedad> enfermedades) {
        this.enfermedades = enfermedades;
    }
}