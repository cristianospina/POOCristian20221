package com.EPS.dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Eps {
    public static final byte CAPACIDAD = 100;
    private String nombre;
    private List<Paciente> pacientes;

    public Eps() {
        this.pacientes = new ArrayList<>();
    }

    public boolean afiliarPaciente(long cedula, String nombre) {
        if ((this.pacientes.size() + 1) <= CAPACIDAD) {
            Paciente paciente = this.buscarPaciente(cedula);

            if (paciente == null) {
                paciente = new Paciente(cedula, nombre);
                this.pacientes.add(paciente);

                return true;
            } else {
                System.out.println("El paciente " + paciente.getNombre() + " ya se encuentra afiliado.");
                return false;
            }
        } else {
            System.out.println("La EPS ya está llena.");
            return false;
        }
    }

    public void sacarPaciente(long cedula) {
        Paciente pacienteASacar = this.buscarPaciente(cedula);

        if (pacienteASacar != null) {
            this.pacientes.remove(pacienteASacar);
        } else {
            System.out.println("El paciente con cédula " + cedula + " no existe en la EPS.");
        }
    }

    public Paciente buscarPaciente(long cedula) {
        Paciente pacienteBuscado = this.pacientes.stream()
                .filter(pac -> pac.getCedula() == cedula)
                .findFirst().orElse(null);

        return pacienteBuscado;
    }

//    public List<Paciente> buscarPacientesPorEnfermedad(String enfermedad) {
//        List<Paciente> pacientesConEnfermedad = new ArrayList<>();
//
//        this.pacientes.forEach(pac -> {
//            pac.getEnfermedades().forEach(enfer -> {
//                if (enfer.getNombre().equalsIgnoreCase(enfermedad)) {
//                    pacientesConEnfermedad.add(pac);
//                }
//            });
//        });
//
//        return pacientesConEnfermedad;
//    }

    public List<Paciente> buscarPacientesPorEnfermedad(String enfermedad) {
        return this.pacientes.stream()
                .filter(paciente -> paciente.getEnfermedades()
                        .stream()
                        .anyMatch(enf -> enf.getNombre().equalsIgnoreCase(enfermedad)))
                .collect(Collectors.toList());
    }

    public List<Paciente> obtenerPacientesSinEnfermedades() {
        return this.pacientes.stream()
                .filter(paciente -> paciente.getEnfermedades().isEmpty())
                .collect(Collectors.toList());
    }

    public void ordenarPacientesPorNombre() {
        this.pacientes.sort(Comparator.comparing(Paciente::getNombre));
        this.imprimirPacientes();
    }

    private void imprimirPacientes() {
        this.pacientes.forEach(p -> System.out.println(p.getNombre() + " - " + p.getEnfermedades().size() + " enfermedades."));
    }
}