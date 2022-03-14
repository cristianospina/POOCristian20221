package com.agenda.app;

import com.agenda.dominio.Agenda;
import com.agenda.dominio.Contacto;

public class AppAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        //     Stack-------Heap

        agenda.agregar("Rebeca", "Tabares", 3113776458l);
        agenda.agregar("Rocio", "Durcal", 3219000174l);
        agenda.agregar("Lucia", "Reyes", 3002587496l);
        agenda.agregar("Julian", "Ospina", 3104698710l);

        agenda.imprimirAgenda();
        Contacto c = agenda.buscarConFilter(3104698710l);

        if (c != null) {
            System.out.println("Contacto buscado: " + c.getNombre());
        } else {
            System.out.println("Contacto no encontrado");
        }

        c.setCelular(3110008796l);
        agenda.editar(c);

        agenda.imprimirAgenda();
    }
}