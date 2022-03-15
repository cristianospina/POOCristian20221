package com.agenda.app;

import com.agenda.dominio.Agenda;
import com.agenda.dominio.Contacto;

public class AppAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        //     Stack-------Heap

        agenda.agregar("Georgina", "Ronaldo", 3113776458l);
        agenda.agregar("Ana", "Bedoya", 3219000174l);
        agenda.agregar("Berenice", "Zuluaga", 3219316174l);
        agenda.agregar("Carlos", "Mattos", 3002587496l);
        agenda.agregar("Carlos", "Maderos", 3022587496l);
        agenda.agregar("Alejandro", "Ramirez", 3104698710l);

        Contacto c = agenda.buscarPorCelularConFilter(3104698710l);
        Contacto d = (Contacto) agenda.buscarPorNombre("Alejandro");
        Contacto a = (Contacto) agenda.buscarPorApellido("Ramirez");

        if (c != null) {
            System.out.println("Contacto buscado: " + c.getNombre());
        } else {
            System.out.println("Contacto no encontrado");
        }

        if (d != null) {
            System.out.println("Contacto buscado: " + d.getNombre());
        } else {
            System.out.println("Contacto no encontrado");
        }

        if (a != null) {
            System.out.println("Contacto buscado: " + a.getNombre());
        } else {
            System.out.println("Contacto no encontrado");
        }

        agenda.editar(3104698710l, 3110008796l);

        System.out.println("----- CONTACTOS ORDENADOS ----- ");
        agenda.ordenarAlfabeticamente();
    }
}