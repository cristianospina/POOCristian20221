package com.agenda.dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Agenda {
    private List<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public void agregar(String nombre, String apellido, long celular) {
        Contacto contactoAAgregar = new Contacto(nombre, apellido, celular);
        this.contactos.add(contactoAAgregar);
    }

    public void eliminar(long celular) {
        Contacto contactoAEliminar = this.buscarPorCelularConFilter(celular);

        if (contactoAEliminar != null) {
            this.contactos.remove(contactoAEliminar);
            System.out.println("Se eliminó el contacto " + contactoAEliminar.getNombre());
        } else {
            System.out.println("No se eliminó nada. Porque el contacto " + contactoAEliminar.getNombre() + " no existe.");
        }
    }

    public Contacto buscarPorCelularConFilter(long celular) {
        Contacto contactoBuscado = this.contactos.stream()
                .filter(contacto -> contacto.getCelular() == celular)
                .findFirst().orElse(null);
        return contactoBuscado;
    }

    public List<Contacto> buscarPorNombre(String nombre) {
        Contacto contactoBuscado = this.contactos.stream()
                .filter(contacto -> contacto.getNombre() == nombre)
                .findFirst().orElse(null);
        return (List<Contacto>) contactoBuscado;
    }

    public List<Contacto> buscarPorApellido(String apellido) {
        Contacto contactoBuscado = this.contactos.stream()
                .filter(contacto -> contacto.getApellido() == apellido)
                .findFirst().orElse(null);
        return (List<Contacto>) contactoBuscado;
    }

    public void editar(long celularViejo, long celularNuevo) {
        Contacto c = buscarPorCelularConFilter(celularViejo);

        if(c != null) {
            int posicionAReemplazar = this.contactos.indexOf(c);
            c.setCelular(celularNuevo);
            this.contactos.set(posicionAReemplazar, c);
        } else {
            System.out.println("El contacto a editar no existe.");
        }
    }

    public void ordenarAlfabeticamente() {
        this.contactos.sort(Comparator.comparing(Contacto::getNombre).thenComparing(Contacto::getApellido));
        this.imprimirAgenda();
    }

    public Contacto buscarConForEach(long celular) {
        AtomicReference<Contacto> contactoBuscado = new AtomicReference<>();

        this.contactos.forEach(contacto -> {
            if (contacto.getCelular() == celular) {
                contactoBuscado.set(contacto);
            }
        });
        return contactoBuscado.get();
    }

    private void imprimirAgenda() {
        this.contactos.forEach(c -> System.out.println(c.getNombre() + " " + c.getApellido() + " - " + c.getCelular()));
    }

    public List<Contacto> getContactos() {
        return contactos;
    }
}